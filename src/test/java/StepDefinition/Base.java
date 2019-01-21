package StepDefinition;

import static org.junit.Assert.fail;

import java.io.BufferedReader;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;

import org.json.simple.parser.JSONParser;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

import java.io.FileReader;

import org.json.simple.JSONObject;

import org.json.simple.parser.ParseException;

import java.util.*;

public class Base {
	// Initializing the variables
	String body = null;
	String url = null;
	int status = 0;
	String fetchStatus = null;
	static Logger logger;
	String orderID;
	String id = null;

	public String read(String str) {
		StringBuilder sb = new StringBuilder();
		try {
			FileReader reader = new FileReader(str);
			BufferedReader buff = new BufferedReader(reader);
			while (true) {
				String inputText = buff.readLine();
				if (inputText == null)
					break;
				sb.append(' ').append(inputText);
			}
			buff.close();
		} catch (IOException ex) {
			logger.info("Can't read file.");
		}
		String allFile = sb.toString();

		return allFile;
	}

	// To be called by every test case at the begining
	public void initialise() {
		logger = Logger.getLogger(Steps.class.getName());
		body = null;
		url = null;
		status = 0;
		fetchStatus = null;
		orderID = null;
	}

	// to read value from config.properties
	public String getval(String s) {
		Properties configFile = new Properties();
		try {
			configFile.load(this.getClass().getClassLoader().getResourceAsStream("config.properties"));
			String str = configFile.getProperty(s);
			return str;

		} catch (IOException e) {
			
			return null;
		}
		// return null;
	}

	public void prerequisite() {
		//prerequisite for Create order, take, complete, cancel and Fetch order
		id = null;
		url = getval("host");
		logger.info(url);
		RestAssured.baseURI = url;

	}

	// Creates order from json file input
	public String createOrder(String s) throws ParseException {
		//Create order

		prerequisite();
		File file = new File(s);
		RequestSpecification httpRequest = RestAssured.given();
		logger.info("Create order - valid");
		httpRequest.body(file);
		// req.body(requestparams.toJSONString());
		Response response = httpRequest.post(url + getval("endpoint_place"));

		body = response.getBody().asString();

		logger.info(body);

		// FileReader reader = new FileReader(s);

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

		// get a String from the JSON object
		id = String.valueOf(jsonObject.get("id"));

		// Retrieving Status Code of response
		status = response.getStatusCode();

		logger.info(status);
		// System.out.println(body);
		return id;

	}

	// Creates order from json file and timestamp
	public String createOrder(String s, Date t) throws ParseException, IOException {
		//Create Oder with time
		prerequisite();

		body = read(s);

		JSONParser parser = new JSONParser();

		Object obj2 = parser.parse(new FileReader("Inputs\\TC1.json"));

		JSONObject jsonObject1 = (JSONObject) obj2;

		Date tempdate = t;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-ddhh:mm:ss.mmm");

		String date_Final = simpleDateFormat.format(tempdate);

		date_Final = date_Final.substring(0, 10) + "T" + date_Final.substring(10, date_Final.length()) + "Z";

		((HashMap) obj2).put("orderAt", date_Final);

		String str_Final = obj2.toString();

		RequestSpecification req = RestAssured.given();

		req.body(str_Final);
		// req.body(requestparams.toJSONString());
		Response response = req.post(url + getval("endpoint_place"));

		// Retrieving Status Code of response
		status = response.getStatusCode();
		// id = String.valueOf(jsonObject.get("id"));
		body = response.getBody().asString();
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

		// get a String from the JSON object
		id = String.valueOf(jsonObject.get("id"));

		logger.info(body);
		logger.info(id);
		// System.out.println(id);
		return id;

	}

	public String fetchOrderStatus(String orderID) throws IOException, ParseException {
		//Fetch Order
		prerequisite();
		RequestSpecification httpRequest = RestAssured.given();
		String endpoint_fetch = getval("endpoint_fetch");
		logger.info(endpoint_fetch);
		endpoint_fetch = endpoint_fetch.replace("{orderID}", orderID);

		logger.info("endpoint_fetch:" + endpoint_fetch);

		Response response = httpRequest.get(endpoint_fetch);

		// logger.info("When - I hit with correct Data " + string);
		logger.info("Fetch Order " + orderID);
		body = response.getBody().asString();

		// logger.info(body);
		logger.info(body);

		String path = "Outputs/Fetch" + orderID + ".txt";
		logger.info(path);
		logger.info(body);
		

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

		// get a String from the JSON object
		fetchStatus = String.valueOf(jsonObject.get("status"));

		status = response.getStatusCode();

		logger.info(status);
		return fetchStatus;

	}

	public void takeOrder(String orderID) throws IOException {
		//Take order
		prerequisite();

		RequestSpecification httpRequest = RestAssured.given();
		String endpoint_take = getval("endpoint_take");
		logger.info(endpoint_take);
		endpoint_take = endpoint_take.replace("{orderID}", orderID);

		logger.info("endpoint_take:" + endpoint_take);

		Response response = httpRequest.put(endpoint_take);

		// String replacedString = someString.replace("{orderID}", orderID);
		logger.info("endpoint_take:" + endpoint_take);

		// Response response = httpRequest.post();

		// Retrieving Body of response
		body = response.getBody().asString();

		logger.info("When - Driver take the order " + orderID);

		logger.info(body);

		// Retrieving Status Code of response
		status = response.getStatusCode();

	}

	public void completeOrder(String orderID) throws IOException {
		// Complete order
		prerequisite();

		RequestSpecification httpRequest = RestAssured.given();
		String endpoint_complete = getval("endpoint_complete");
		logger.info(endpoint_complete);
		endpoint_complete = endpoint_complete.replace("{orderID}", orderID);

		logger.info("endpoint_take:" + endpoint_complete);

		Response response = httpRequest.put(endpoint_complete);

		// getval("complete"));
		logger.info(endpoint_complete);

		// Response response = httpRequest.post();

		// Retrieving Body of response
		body = response.getBody().asString();

		logger.info("When - Driver completes the order " + orderID);

		logger.info(body);

		logger.info(body);
		// Retrieving Status Code of response
		status = response.getStatusCode();

	}

	public void cancelOrder(String orderID) throws IOException {
		// Cancel Order

		prerequisite();

		RequestSpecification httpRequest = RestAssured.given();
		String endpoint_cancel = getval("endpoint_cancel");
		logger.info(endpoint_cancel);
		endpoint_cancel = endpoint_cancel.replace("{orderID}", orderID);

		logger.info("endpoint_take:" + endpoint_cancel);

		Response response = httpRequest.put(endpoint_cancel);

		body = response.getBody().asString();

		logger.info("When - Driver cancels the order " + orderID);

		logger.info(body);

		logger.info(body);

		status = response.getStatusCode();

	}

	public String Distance_Amount_comparison(String distances, String fare) {
		// Initializing variables
		String text = null;
		int hr = LocalDateTime.now().getHour();
		double Total = 0;
		double amount = 0;
		double calcdistance = 0;
		// if order created
		if (status == 201) {

			// Extracting amount

			String[] amount2 = fare.split("\"amount\":\"");
			String[] amount3 = amount2[1].split("\",\"");
			amount = Double.valueOf(amount3[0]);
			logger.info(amount);

			// Extracting distance

			String[] Distances2 = distances.split("]");
			// logger.info(Distances2[0]);
			String Distances3 = Distances2[0].substring(1, Distances2[0].length());
			// logger.info(Distances3);

			logger.info(Distances3);

			String[] dis = Distances3.split(",");

			// Calculating total distance
			for (int i = 0; i < dis.length; i++) {

				Total = Total + Double.valueOf(dis[i]);
				// logger.info(dis[i] + " " + Total);

			}

			// logger.info(Total);
			if (hr >= 21 || hr < 5) {
				if (amount <= 30) {
					// Minimum fare for >=21 and <5
					fail("Fare Amount can't be less than 30.");
					text = "Fare Amount can't be less than 30.";

				} else {
					double tempamount = amount - 30;
					calcdistance = tempamount * 2000 / 80 + 2000;
					logger.info(calcdistance);

				}
			} else {
				if (amount <= 20) {
					// Minimum fare for >=5 and <21
					fail("Fare Amount can't be less than 20.");
					text = "Fare Amount can't be less than 20.";
				} else {
					double tempamount = amount - 20;
					calcdistance = tempamount * 40 + 2000;
					logger.info(calcdistance);
				}
			}
			if (Total > 2000) {
				logger.info("Expected distance : " + calcdistance + " Actual distance : " + Total);
				if (Math.abs(Total - calcdistance) > 1) {
					fail("Difference in Distances is greater than 1 m.");
					text = "Difference in Distances is greater than 1 m.";
				} else {
					logger.info("TC Passed");
					text = "TC Passed";
				}

			} else {
				if (hr >= 21 || hr < 5) {
					if (amount != 30) {
						fail("Fare is incorrect, should be 30.");
						text = "Fare is incorrect, should be 30.";
					}
				} else if (amount != 20) {
					fail("Fare is incorrect, should be 20.");
					text = "Fare is incorrect, should be 20.";
				}
			}

		}

		return text;

	}

}