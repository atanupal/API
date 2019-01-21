package StepDefinition;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Base {

	@Given("Order is created for Fetch Order {string}")
	public void order_is_created_for_Fetch_Order(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for Fetch Order ");
	}

	@When("user fetched the order once created")
	public void user_fetched_the_order_once_created() throws IOException, ParseException {

		fetchStatus = fetchOrderStatus(orderID);
	}

	@Then("Status should be ASSIGNING")
	public void status_should_be_ASSIGNING() {
		if (fetchStatus.contentEquals("ASSIGNING")) {
			logger.info("TC Passed");
			logger.info("Expected Result : ASSIGNING , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : ASSIGNING , Actual Result : " + fetchStatus));
			fail("Expected Result : ASSIGNING , Actual Result : " + fetchStatus);
		}

	}

	@Given("Order is created for ongoing order {string}")
	public void order_is_created_for_ongoing_order(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for ongoing order");
	}

	@Given("Order is taken by the driver")
	public void order_is_taken_by_the_driver() throws IOException {
		takeOrder(orderID);
		logger.info("Order is taken by the driver");
	}

	@When("user fetched the order once taken")
	public void user_fetched_the_order_once_taken() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetched the order once taken");
	}

	@Then("Status should be ONGOING")
	public void status_should_be_ONGOING() {
		if (fetchStatus.equals("ONGOING")) {
			logger.info("TC Passed");
			logger.info("Expected Result : ONGOING , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : ONGOING , Actual Result : " + fetchStatus));
			fail("Expected Result : ONGOING , Actual Result : " + fetchStatus);
		}
	}

	@Given("Order is created for completed order {string}")
	public void order_is_created_for_completed_order(String string) throws IOException, ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for completed order");
	}

	@Given("Order is taken by the driver for complete")
	public void order_is_taken_by_the_driver_for_complete() throws IOException {

		takeOrder(orderID);

		logger.info("Order is taken by the driver for complete");
	}

	@Given("Order is completed by the driver")
	public void order_is_completed_by_the_driver() throws IOException {

		completeOrder(orderID);
		logger.info("Order is completed by the driver");
	}

	@When("user fetched the order once completed")
	public void user_fetched_the_order_once_completed() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetched the order once completed");
	}

	@Then("Status should be COMPLETED")
	public void status_should_be_COMPLETED() {
		if (fetchStatus.equals("COMPLETED")) {
			logger.info("TC Passed");
			logger.info("Expected Result : COMPLETED , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : COMPLETED , Actual Result : " + fetchStatus));
			fail("Expected Result : COMPLETED , Actual Result : " + fetchStatus);
		}
	}

	@Given("Order is created for CANCELLED order {string}")
	public void order_is_created_for_CANCELLED_order(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for CANCELLED order");
	}

	@Given("Order is cancelled by the user")
	public void order_is_cancelled_by_the_user() throws IOException {
		cancelOrder(orderID);
		logger.info("Order is cancelled by the user");
	}

	@When("user fetched the order once taken for cancel")
	public void user_fetched_the_order_once_taken_for_cancel() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetched the order once taken for cancel");
	}

	@Then("Status should be CANCELLED")
	public void status_should_be_CANCELLED() {
		if (fetchStatus.equals("CANCELLED")) {
			logger.info("TC Passed");
			logger.info("Expected Result : CANCELLED , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : CANCELLED , Actual Result : " + fetchStatus));
			fail("Expected Result : CANCELLED , Actual Result : " + fetchStatus);
		}
	}

	@Given("Order is created for take order CANCELLED order {string}")
	public void order_is_created_for_take_order_CANCELLED_order(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for take order CANCELLED order");
	}

	@Given("driver takes the order")
	public void driver_takes_the_order() throws IOException {

		takeOrder(orderID);
		logger.info("driver takes the order");
	}

	@Given("Order is cancelled by the user after take")
	public void order_is_cancelled_by_the_user_after_take() throws IOException {

		cancelOrder(orderID);
		logger.info("Order is cancelled by the user after take");
	}

	@When("user fetched the order for cancel after take")
	public void user_fetched_the_order_for_cancel_after_take() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetched the order for cancel after take");
	}

	@Then("Status should be CANCELLED after take")
	public void status_should_be_CANCELLED_after_take() {
		if (fetchStatus.equals("CANCELLED")) {
			logger.info("TC Passed");
			logger.info("Expected Result : CANCELLED , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : CANCELLED , Actual Result : " + fetchStatus));
			fail("Expected Result : CANCELLED , Actual Result : " + fetchStatus);
		}
	}

	@Given("Order is created for Fetch Order again {string}")
	public void order_is_created_for_Fetch_Order_again(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("Order is created for Fetch Order again");
	}

	@Given("user fetches the order once created")
	public void user_fetches_the_order_once_created() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetches the order once created");
	}

	@When("user fetched the order again once created")
	public void user_fetched_the_order_again_once_created() throws IOException, ParseException {
		fetchStatus = fetchOrderStatus(orderID);
		logger.info("user fetched the order again once created");
	}

	@Then("Status for fetch again should be ASSIGNING")
	public void status_for_fetch_again_should_be_ASSIGNING() {
		if (fetchStatus.contentEquals("ASSIGNING")) {
			logger.info("TC Passed");
			logger.info("Expected Result : ASSIGNING , Actual Result : " + fetchStatus);
		} else {
			logger.info("TC failed");
			logger.info(("Expected Result : ASSIGNING , Actual Result : " + fetchStatus));
			fail("Expected Result : ASSIGNING , Actual Result : " + fetchStatus);
		}

	}

	@When("user hits it with incorrect order IDs {int}")
	public void user_hits_it_with_incorrect_order_IDs(Integer int1) throws IOException, ParseException {
		String fet = fetchOrderStatus(String.valueOf(int1));
		logger.info(fet);
		logger.info("user hits it with incorrect order IDs ");
	}

	@Then("user should get following errors {int}")
	public void user_should_get_following_errors(Integer int1) {

		// Write code here that turns the phrase above into concrete actions
		logger.info("Then : Expected Outcome : Error");
		if (status == int1) // eg 404
		{
			logger.info("Not Found");
			logger.info("TC Passed");

		} else if (status == Integer.valueOf(getval("success"))) // eg 200
		{
			logger.info("Success");
			logger.info("status mismatch : TC Failed");
			fail("status mismatch : TC Failed");

		} else {
			logger.info("Not Sure");
			logger.info("status mismatch : TC Failed");
			fail("status mismatch: TC Failed");

		}

	}

	@When("user creates an order with one stop {string}")
	public void user_creates_an_order_with_one_stop(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with one stop ");
	}

	@Then("Order should not be created for one stop")
	public void order_should_not_be_created_for_one_stop() {
		if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("TC Passed");
			logger.info("Bad Request");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("error") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("error") + " Actual Result : " + status);
	}

	@When("user creates an order with two stops {string}")
	public void user_creates_an_order_with_two_stops(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with two stops");
	}

	@Then("Order should be created for two stops")
	public void order_should_be_created_for_two_stops() {
		logger.info("Order should be created for two stops");
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);

	}

	@Then("Amount is correct for two stops")
	public void amount_is_correct_for_two_stops() throws ParseException {

		if (status == Integer.valueOf(getval("created"))) // eg 201
		{

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

			// get a String from the JSON object
			orderID = String.valueOf(jsonObject.get("id"));

			String drivingDistancesInMeters = String.valueOf(jsonObject.get("drivingDistancesInMeters"));

			String fare = String.valueOf(jsonObject.get("fare"));

			logger.info(Distance_Amount_comparison(drivingDistancesInMeters, fare));

		}

	}

	@When("user creates an order with three stops {string}")
	public void user_creates_an_order_with_three_stops(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with three stops");
	}

	@Then("Order should be created for three stops")
	public void order_should_be_created_for_three_stops() {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);
	}

	@Then("Amount is correct for three stops")
	public void amount_is_correct_for_three_stops() throws ParseException {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

			// get a String from the JSON object
			orderID = String.valueOf(jsonObject.get("id"));

			String drivingDistancesInMeters = String.valueOf(jsonObject.get("drivingDistancesInMeters"));

			String fare = String.valueOf(jsonObject.get("fare"));

			logger.info(Distance_Amount_comparison(drivingDistancesInMeters, fare));
		}

	}

	@When("user creates an order with four stops {string}")
	public void user_creates_an_order_with_four_stops(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with four stops");
	}

	@Then("Order should be created for four stops")
	public void order_should_be_created_for_four_stops() {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);
	}

	@Then("Amount is correct for four stops")
	public void amount_is_correct_for_four_stops() throws ParseException {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

			// get a String from the JSON object
			orderID = String.valueOf(jsonObject.get("id"));

			String drivingDistancesInMeters = String.valueOf(jsonObject.get("drivingDistancesInMeters"));

			String fare = String.valueOf(jsonObject.get("fare"));

			logger.info(Distance_Amount_comparison(drivingDistancesInMeters, fare));
		}

	}

	@When("user creates an order with five stops {string}")
	public void user_creates_an_order_with_five_stops(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with five stops");
	}

	@Then("Order should be created for five stops")
	public void order_should_be_created_for_five_stops() {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);
	}

	@Then("Amount is correct for five stops")
	public void amount_is_correct_for_five_stops() throws ParseException {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

			// get a String from the JSON object
			orderID = String.valueOf(jsonObject.get("id"));

			String drivingDistancesInMeters = String.valueOf(jsonObject.get("drivingDistancesInMeters"));

			String fare = String.valueOf(jsonObject.get("fare"));

			logger.info(Distance_Amount_comparison(drivingDistancesInMeters, fare));
		}
	}

	@When("user creates an order with duplicate stops {string}")
	public void user_creates_an_order_with_duplicate_stops(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("user creates an order with duplicate stops");
	}

	@Then("Order should be created for duplicate stops")
	public void order_should_be_created_for_duplicate_stops() {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);
	}

	@Then("Amount is correct for duplicate stops")
	public void amount_is_correct_for_duplicate_stops() throws ParseException {
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{

			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(body);

			// get a String from the JSON object
			orderID = String.valueOf(jsonObject.get("id"));

			String drivingDistancesInMeters = String.valueOf(jsonObject.get("drivingDistancesInMeters"));

			String fare = String.valueOf(jsonObject.get("fare"));

			logger.info(Distance_Amount_comparison(drivingDistancesInMeters, fare));
		}
	}

	@When("customer is placing an invalid json in body {string}")
	public void customer_is_placing_an_invalid_json_in_body(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("customer is placing an invalid json in body ");
	}

	@Then("Order should not be created")
	public void order_should_not_be_created() {
		if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("Bad Request");
		} else

		{
			fail("Expected Result: Status " + getval("error") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("error") + " Actual Result : " + status);
	}

	@When("customer is placing a valid json in body with automatic future timestamp {string}")
	public void customer_is_placing_a_valid_json_in_body_with_automatic_future_timestamp(String string)
			throws ParseException, IOException {
		initialise();

		Calendar calendar = Calendar.getInstance();

		// get a date to represent "today"
		Date today = calendar.getTime();
		logger.info("today:    " + today);

		Random rand = new Random();

		// Generate random integers in range 1 to 100
		int rand_int = rand.nextInt(100) + 1;

		// add random day from 1 to 100 to current date
		calendar.add(Calendar.DAY_OF_YEAR, rand_int);

		Date future = calendar.getTime();
		orderID = createOrder(string, future);
	}

	@Then("Order should be created with future timestamp")
	public void order_should_be_created_with_future_timestamp() {
		logger.info("Order should be created with future timestamp");
		if (status == Integer.valueOf(getval("created"))) // eg 201
		{
			logger.info("Created");
			logger.info("TC Passed");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("created") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("created") + " Actual Result : " + status);
	}

	@When("customer is placing a valid json in body with automatic past timestamp {string}")
	public void customer_is_placing_a_valid_json_in_body_with_automatic_past_timestamp(String string)
			throws ParseException, IOException, java.text.ParseException {
		initialise();

		// Calendar calendar = Calendar.getInstance();

		java.util.Date temp = new SimpleDateFormat("yyyy-mm-ddHH:mm:ss.SSSSSS").parse("2012-07-10 14:58:00.000000");

		orderID = createOrder(string, temp);
	}

	@Then("Order should not be created with past timestamp")
	public void order_should_not_be_created_with_past_timestamp() {
		logger.info("Order should not be created with past timestamp");
		if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("TC Passed");
			logger.info("Bad Request");
		} else {
			logger.info("TC Failed");
			fail("Expected Result: Status " + getval("error") + " Actual Result : " + status);
			logger.info("Expected Result: Status " + getval("error") + " Actual Result : " + status);
		}

		logger.info("Expected Result: Status " + getval("error") + " Actual Result : " + status);
	}

	@Given("User creates an order for take {string}")
	public void user_creates_an_order_for_take(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for take");
	}

	@When("Driver takes the order for the scenario")
	public void driver_takes_the_order_for_the_scenario() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order for the scenario");
	}

	@Then("Take should be successful")
	public void take_should_be_successful() {
		logger.info("Then : Expected Outcome : Successful");
		if (status == Integer.valueOf(getval("success"))) // eg 200
		{
			logger.info("Success");
			logger.info("TC Passed");

		} else if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("Error");
			logger.info("Success - TC Failed");
			fail("status mismatch" + status);
			logger.info("status mismatch" + status);

		} else {
			logger.info("Not Sure");
			logger.info("Not Sure  - TC Failed" + status);
			fail("Not Sure  - TC Failed" + status);
			logger.info("Not Sure  - TC Failed" + status);

		}
	}

	@Given("User creates an order for already taken scenario {string}")
	public void user_creates_an_order_for_already_taken_scenario(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for already taken scenario");
	}

	@Given("driver takes the order first")
	public void driver_takes_the_order_first() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order first");
	}

	@When("Driver takes the order for the second time")
	public void driver_takes_the_order_for_the_second_time() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order for the second time");
	}

	@Then("Take should not be successful for second time")
	public void take_should_not_be_successful_for_second_time() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@When("driver takes order with incorrect ID {int}")
	public void driver_takes_order_with_incorrect_ID(Integer int1) throws IOException {
		takeOrder(String.valueOf(int1));
	}

	@Then("driver should get error for Incorrect Take")
	public void driver_should_get_error_for_Incorrect_Take() {
		if (status == Integer.valueOf(getval("notfound"))) // eg 404
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status Not Found , Actual Result : " + status);
		}

		logger.info("Expected Result: Status Not Found , Actual Result : " + status);
	}

	@Given("User creates an order for already completed scenario {string}")
	public void user_creates_an_order_for_already_completed_scenario(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for already completed scenario");
	}

	@Given("driver takes the order for scenario completed")
	public void driver_takes_the_order_for_scenario_completed() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order for scenario completed");
	}

	@Given("driver completes the order for scenario completed")
	public void driver_completes_the_order_for_scenario_completed() throws IOException {
		completeOrder(orderID);
		logger.info("driver completes the order for scenario completed");
	}

	@When("Driver takes the order again for completed order")
	public void driver_takes_the_order_again_for_completed_order() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order again for completed order");
	}

	@Then("Take should not be successful for completed order")
	public void take_should_not_be_successful_for_completed_order() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for cancelled order after create scenario {string}")
	public void user_creates_an_order_for_cancelled_order_after_create_scenario(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancelled order after create scenario");
	}

	@Given("driver cancels the order for cancelled order after create")
	public void driver_cancels_the_order_for_cancelled_order_after_create() throws IOException {
		cancelOrder(orderID);
		logger.info("driver cancels the order for cancelled order after create");
	}

	@When("Driver takes the order again for cancelled order after create")
	public void driver_takes_the_order_again_for_cancelled_order_after_create() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order again for cancelled order after create");
	}

	@Then("Take should not be successful for cancelled order after create")
	public void take_should_not_be_successful_for_cancelled_order_after_create() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for cancelled order after take scenario {string}")
	public void user_creates_an_order_for_cancelled_order_after_take_scenario(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancelled order after take scenario {string}");
	}

	@Given("driver takes the order for scenario cancellation after take")
	public void driver_takes_the_order_for_scenario_cancellation_after_take() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order for scenario cancellation after take");

	}

	@Given("driver cancels the order for cancelled order after take")
	public void driver_cancels_the_order_for_cancelled_order_after_take() throws IOException {
		cancelOrder(orderID);
		logger.info("driver cancels the order for cancelled order after take");

	}

	@When("Driver takes the order againn for cancelled order after take")
	public void driver_takes_the_order_againn_for_cancelled_order_after_take() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order againn for cancelled order after take");
	}

	@Then("Take should not be successful for cancelled order after take")
	public void take_should_not_be_successful_for_cancelled_order_after_take() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for complete {string}")
	public void user_creates_an_order_for_complete(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for complete {string}");
	}

	@Given("Driver takes the order for the scenario complete")
	public void driver_takes_the_order_for_the_scenario_complete() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order for the scenario complete");

	}

	@When("Driver completes the order for valid scenario")
	public void driver_completes_the_order_for_valid_scenario() throws IOException {
		completeOrder(orderID);
		logger.info("Driver completes the order for valid scenario");

	}

	@Then("complete should be successful for valid scenario")
	public void complete_should_be_successful_for_valid_scenario() {
		logger.info("Then : Expected Outcome : Successful");
		if (status == Integer.valueOf(getval("success"))) // eg 200
		{
			logger.info("Success");
			logger.info("TC Passed");

		} else if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("Error");
			logger.info("Success - TC Failed");
			fail("status mismatch" + status);
			logger.info("status mismatch" + status);

		} else {
			logger.info("Not Sure");
			logger.info("Not Sure  - TC Failed" + status);
			fail("Not Sure  - TC Failed" + status);

		}
	}

	@Given("User creates an order for complete before take {string}")
	public void user_creates_an_order_for_complete_before_take(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for complete before take {string}");

	}

	@When("Driver completes the order before take")
	public void driver_completes_the_order_before_take() throws IOException {
		completeOrder(orderID);
		logger.info("Driver completes the order before take");
	}

	@Then("complete should be not be successful before take")
	public void complete_should_be_not_be_successful_before_take() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for completing after create -> cancel {string}")
	public void user_creates_an_order_for_completing_after_create_cancel(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for completing after create -> cancel {string}");
	}

	@Given("driver cancels the order for the scenario create -> complete")
	public void driver_cancels_the_order_for_the_scenario_create_complete() throws IOException {
		cancelOrder(orderID);
		logger.info("driver cancels the order for the scenario create -> complete");

	}

	@When("Driver completes the order after create -> cancel")
	public void driver_completes_the_order_after_create_cancel() throws IOException {
		completeOrder(orderID);
		logger.info("Driver completes the order after create -> cancel");

	}

	@Then("complete should be not be successful after create -> cancel")
	public void complete_should_be_not_be_successful_after_create_cancel() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for completing after create -> take ->  cancel {string}")
	public void user_creates_an_order_for_completing_after_create_take_cancel(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for completing after create -> take ->  cancel {string}");
	}

	@Given("driver takes the order for scenario create -> take -> complete")
	public void driver_takes_the_order_for_scenario_create_take_complete() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order for scenario create -> take -> complete");

	}

	@Given("driver cancels the order for the scenario create -> take -> complete")
	public void driver_cancels_the_order_for_the_scenario_create_take_complete() throws IOException {
		cancelOrder(orderID);
		logger.info("driver cancels the order for the scenario create -> take -> complete");

	}

	@When("Driver completes the order after create -> take -> cancel")
	public void driver_completes_the_order_after_create_take_cancel() throws IOException {
		completeOrder(orderID);
		logger.info("Driver completes the order after create -> take -> cancel");

	}

	@Then("complete should be not be successful after create -> take -> cancel")
	public void complete_should_be_not_be_successful_after_create_take_cancel() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for completing for scenario already completed {string}")
	public void user_creates_an_order_for_completing_for_scenario_already_completed(String string)
			throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for completing for scenario already completed {string}");
	}

	@Given("driver takes the order for scenario already completed")
	public void driver_takes_the_order_for_scenario_already_completed() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order for scenario already completed");

	}

	@Given("driver completes the order for the first time for scenario already completed")
	public void driver_completes_the_order_for_the_first_time_for_scenario_already_completed() throws IOException {
		completeOrder(orderID);
		logger.info("driver completes the order for the first time for scenario already completed");

	}

	@When("Driver completes the order for the second time")
	public void driver_completes_the_order_for_the_second_time() throws IOException {
		completeOrder(orderID);
		logger.info("Driver completes the order for the second time");
	}

	@Then("complete should be not be successful for already completed order")
	public void complete_should_be_not_be_successful_for_already_completed_order() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@When("user completes incorrect order with order ID {int}")
	public void user_completes_incorrect_order_with_order_ID(Integer int1) throws IOException {
		completeOrder(String.valueOf(int1));
		logger.info("user completes incorrect order with order ID {int}");
	}

	@Then("complete order should not be successful")
	public void complete_order_should_not_be_successful() {
		if (status == Integer.valueOf(getval("notfound"))) // eg 404
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status Not Found , Actual Result : " + status);
		}

		logger.info("Expected Result: Status Not Found , Actual Result : " + status);
	}

	@Given("User creates an order for cancellation {string}")
	public void user_creates_an_order_for_cancellation(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancellation {string}");

	}

	@When("user cancels the order after create")
	public void user_cancels_the_order_after_create() throws IOException {
		cancelOrder(orderID);
		logger.info("user cancels the order after create");
	}

	@Then("cancellation should be successful after order creation")
	public void cancellation_should_be_successful_after_order_creation() {
		logger.info("Then : Expected Outcome : Successful");
		if (status == Integer.valueOf(getval("success"))) // eg 200
		{
			logger.info("Success");
			logger.info("TC Passed");

		} else if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("Error");
			logger.info("Success - TC Failed");
			fail("status mismatch" + status);
			logger.info("status mismatch" + status);

		} else {
			logger.info("Not Sure");
			logger.info("Not Sure  - TC Failed" + status);
			fail("Not Sure  - TC Failed" + status);

		}
	}

	@Given("User creates an order for cancellation after take {string}")
	public void user_creates_an_order_for_cancellation_after_take(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancellation after take {string}");

	}

	@Given("Driver takes the order for cancellation for scenario create -> take")
	public void driver_takes_the_order_for_cancellation_for_scenario_create_take() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order for cancellation for scenario create -> take");
	}

	@When("user cancels the order after take")
	public void user_cancels_the_order_after_take() throws IOException {
		cancelOrder(orderID);
		logger.info("user cancels the order after take");
	}

	@Then("cancellation should be successful after take")
	public void cancellation_should_be_successful_after_take() {
		logger.info("Then : Expected Outcome : Successful");
		if (status == Integer.valueOf(getval("success"))) // eg 200
		{
			logger.info("Success");
			logger.info("TC Passed");

		} else if (status == Integer.valueOf(getval("error"))) // eg 400
		{
			logger.info("Error");
			logger.info("Success - TC Failed");
			fail("status mismatch" + status);
			logger.info("status mismatch" + status);

		} else {
			logger.info("Not Sure");
			logger.info("Not Sure  - TC Failed" + status);
			fail("Not Sure  - TC Failed" + status);

		}
	}

	@Given("User creates an order for cancellation after complete {string}")
	public void user_creates_an_order_for_cancellation_after_complete(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancellation after complete {string}");
	}

	@Given("driver takes the order for cancellation after complete")
	public void driver_takes_the_order_for_cancellation_after_complete() throws IOException {
		takeOrder(orderID);
		logger.info("driver takes the order for cancellation after complete");

	}

	@Given("driver completes the order for cancellation after complete")
	public void driver_completes_the_order_for_cancellation_after_complete() throws IOException {
		completeOrder(orderID);
		logger.info("driver completes the order for cancellation after complete");
	}

	@When("user cancels the order after completion")
	public void user_cancels_the_order_after_completion() throws IOException {
		cancelOrder(orderID);
		logger.info("user cancels the order after completion");
	}

	@Then("cancellation should not be successful after order completion")
	public void cancellation_should_not_be_successful_after_order_completion() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@Given("User creates an order for cancellation after cancel {string}")
	public void user_creates_an_order_for_cancellation_after_cancel(String string) throws ParseException {
		initialise();
		orderID = createOrder(string);
		logger.info("User creates an order for cancellation after cancel {string}");

	}

	@Given("Driver takes the order for cancellation after cancel -> take")
	public void driver_takes_the_order_for_cancellation_after_cancel_take() throws IOException {
		takeOrder(orderID);
		logger.info("Driver takes the order for cancellation after cancel -> take");

	}

	@Given("driver cancels the order for the first time")
	public void driver_cancels_the_order_for_the_first_time() throws IOException {
		cancelOrder(orderID);
		logger.info("driver cancels the order for the first time");
	}

	@When("user cancels the order again")
	public void user_cancels_the_order_again() throws IOException {
		cancelOrder(orderID);
		logger.info("user cancels the order again");

	}

	@Then("cancellation should not be successful for already cancelled order")
	public void cancellation_should_not_be_successful_for_already_cancelled_order() {
		if (status == Integer.valueOf(getval("flow_violated"))) // eg 422
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
					+ status);
		}

		logger.info("Expected Result: Status " + Integer.valueOf(getval("flow_violated")) + " " + " Actual Result : "
				+ status);
	}

	@When("user cancels incorrect order with order ID {int}")
	public void user_cancels_incorrect_order_with_order_ID(Integer int1) throws IOException {
		cancelOrder(String.valueOf(int1));
		logger.info("user cancels incorrect order with order ID {int}");

	}

	@Then("cancel order should not be successful")
	public void cancel_order_should_not_be_successful() {
		if (status == Integer.valueOf(getval("notfound"))) // eg 404
		{
			logger.info("Error - TC Passed");
		} else

		{
			fail("Expected Result: Status Not Found , Actual Result : " + status);
		}

		logger.info("Expected Result: Status Not Found , Actual Result : " + status);

	}
}