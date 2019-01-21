Project Name : API

By Atanu Pal

Created using BDD Framework and Rest Assured in Java using Maven.



Steps for Maven:

In the project folder API

1. Mvn clean install
2. Mvn test


Steps for Eclipse:

1. Open project in Eclipse
2. Get all packages as per POM File

Feature File:

Feature: API Testing



@EndtoEnd @Fetch

#TC1

Scenario: Create Order -\&gt; Fetch Order -\&gt; ASSIGNING

Given Order is created for Fetch Order &quot;Inputs\\TC1.json&quot;

When user fetched the order once created

Then Status should be ASSIGNING



@EndtoEnd @Fetch

#TC2

Scenario: Create Order -\&gt;Take Order -\&gt;  Fetch Order -\&gt; ONGOING

Given Order is created for ongoing order &quot;Inputs\\TC2.json&quot;

And Order is taken by the driver

When user fetched the order once taken

Then Status should be ONGOING



@EndtoEnd @Fetch

#TC3

Scenario: Create Order -\&gt;Take Order -\&gt;  Complete Order -\&gt; Fetch Order -\&gt; COMPLETED

Given Order is created for completed order &quot;Inputs\\TC3.json&quot;

And Order is taken by the driver for complete

And Order is completed by the driver

When user fetched the order once completed

Then Status should be COMPLETED



@EndtoEnd @Fetch

#TC4

Scenario: Create Order -\&gt;Cancel Order -\&gt;  Fetch Order -\&gt; CANCELLED

Given Order is created for CANCELLED order &quot;Inputs\\TC4.json&quot;

And Order is cancelled by the user

When user fetched the order once taken for cancel

Then Status should be CANCELLED

@EndtoEnd @Fetch

#TC5

Scenario: Create Order -\&gt;Take order -\&gt;Cancel Order -\&gt;  Fetch Order -\&gt; CANCELLED

Given Order is created for take order CANCELLED order &quot;Inputs\\TC5.json&quot;

And driver takes the order

And Order is cancelled by the user after take

When user fetched the order for cancel after take

Then Status should be CANCELLED after take

@EndtoEnd @Fetch

#TC6

Scenario: Create Order -\&gt; Fetch Order -\&gt; Fetch Order again

Given Order is created for Fetch Order again &quot;Inputs\\TC6.json&quot;

And user fetches the order once created

When user fetched the order again once created

Then Status for fetch again should be ASSIGNING

@EndtoEnd @Fetch

#TC7

Scenario Outline: Test cases for Fetch Order - Incorrect values

When user hits it with incorrect order IDs \&lt;ID\&gt;

Then user should get following errors \&lt;Output\&gt;

Examples:

| ID  | Output  |

| 100000 | 404 |

| 500000 | 404 |





@EndtoEnd @Post

#TC8

Scenario: Placing order - one stop - Invalid

When user creates an order with one stop &quot;Inputs\\TC8.json&quot;

Then Order should not be created for one stop

@EndtoEnd @Post

#TC9

Scenario: Placing order - two valid stops

When user creates an order with two stops &quot;Inputs\\TC9.json&quot;

Then Order should be created for two stops

And Amount is correct for two stops

@EndtoEnd @Post

#TC10

Scenario: Placing order - three valid stops

When user creates an order with three stops &quot;Inputs\\TC10.json&quot;

Then Order should be created for three stops

And Amount is correct for three stops

@EndtoEnd @Post

#TC11

Scenario: Placing order - four valid stops

When user creates an order with four stops &quot;Inputs\\TC11.json&quot;

Then Order should be created for four stops

And Amount is correct for four stops

@EndtoEnd @Post

#TC12

Scenario: Placing order - five valid stops

When user creates an order with five stops &quot;Inputs\\TC12.json&quot;

Then Order should be created for five stops

And Amount is correct for five stops

@EndtoEnd @Post

#TC13

Scenario: Placing order - Duplicate stops

When user creates an order with duplicate stops &quot;Inputs\\TC13.json&quot;

Then Order should be created for duplicate stops

And Amount is correct for duplicate stops

@EndtoEnd @Post

#TC14

Scenario: Placing order - invalid

When customer is placing an invalid json in body &quot;Inputs\\TC14.json&quot;

Then Order should not be created

@EndtoEnd @Post

#TC15

Scenario: Placing order - Future

When customer is placing a valid json in body with automatic future timestamp &quot;Inputs\\TC50.json&quot;

Then Order should be created with future timestamp

@EndtoEnd @Post

#TC16

Scenario: Placing order - Past

When customer is placing a valid json in body with automatic past timestamp &quot;Inputs\\TC50.json&quot;

Then Order should not be created with past timestamp



@EndtoEnd @Take

#TC17

Scenario: Take order - Valid

Given User creates an order for take &quot;Inputs\\TC17.json&quot;

When Driver takes the order for the scenario

Then Take should be successful



@EndtoEnd @Take

#TC18

Scenario: Take already taken order

Given User creates an order for already taken scenario &quot;Inputs\\TC18.json&quot;

And driver takes the order first

When Driver takes the order for the second time

Then Take should not be successful for second time

@EndtoEnd @Take

#TC19

Scenario: Test cases for Take Order- Incorrect

When driver takes order with incorrect ID 100000

Then driver should get error for Incorrect Take

@EndtoEnd @Take

#TC20

Scenario: Take completed order

Given User creates an order for already completed scenario &quot;Inputs\\TC20.json&quot;

And driver takes the order for scenario completed

And driver completes the order for scenario completed

When Driver takes the order again for completed order

Then Take should not be successful for completed order

@EndtoEnd @Take

#TC21

Scenario: Take cancelled after create order

Given User creates an order for cancelled order after create scenario &quot;Inputs\\TC21.json&quot;

And driver cancels the order for cancelled order after create

When Driver takes the order again for cancelled order after create

Then Take should not be successful for cancelled order after create

@EndtoEnd @Take

#TC22

Scenario: Take cancelled after take order

Given User creates an order for cancelled order after take scenario &quot;Inputs\\TC22.json&quot;

And driver takes the order for scenario cancellation after take

And driver cancels the order for cancelled order after take

When Driver takes the order againn for cancelled order after take

Then Take should not be successful for cancelled order after take





@EndtoEnd @Complete

#TC23

Scenario: Complete order - Valid

Given User creates an order for complete &quot;Inputs\\TC23.json&quot;

And Driver takes the order for the scenario complete

When Driver completes the order for valid scenario

Then complete should be successful for valid scenario

@EndtoEnd @Complete

#TC24

Scenario: Complete order - before take

Given User creates an order for complete before take &quot;Inputs\\TC24.json&quot;

When Driver completes the order before take

Then complete should be not be successful before take

@EndtoEnd @Complete

#TC25

Scenario: Complete order - after create-\&gt; cancel

Given User creates an order for completing after create -\&gt; cancel &quot;Inputs\\TC25.json&quot;

And driver cancels the order for the scenario create -\&gt; complete

When Driver completes the order after create -\&gt; cancel

Then complete should be not be successful after create -\&gt; cancel

@EndtoEnd @Complete

#TC26

Scenario: Complete order - after create-\&gt; Take -\&gt; cancel

Given User creates an order for completing after create -\&gt; take -\&gt;  cancel &quot;Inputs\\TC26.json&quot;

And driver takes the order for scenario create -\&gt; take -\&gt; complete

And driver cancels the order for the scenario create -\&gt; take -\&gt; complete

When Driver completes the order after create -\&gt; take -\&gt; cancel

Then complete should be not be successful after create -\&gt; take -\&gt; cancel

@EndtoEnd @Complete

#TC27

Scenario: Complete order - already completed one

Given User creates an order for completing for scenario already completed &quot;Inputs\\TC27.json&quot;

And driver takes the order for scenario already completed

And driver completes the order for the first time for scenario already completed

When Driver completes the order for the second time

Then complete should be not be successful for already completed order

@EndtoEnd @Complete

#TC28

Scenario: Complete order - incorrect order

When user completes incorrect order with order ID 100000

Then complete order should not be successful





@EndtoEnd @Cancel

#TC29

Scenario: Cancel order after creation

Given User creates an order for cancellation &quot;Inputs\\TC29.json&quot;

When user cancels the order after create

Then cancellation should be successful after order creation

 @EndtoEnd @Cancel

#TC30

Scenario: Cancel order after creation -\&gt; Take

Given User creates an order for cancellation after take &quot;Inputs\\TC30.json&quot;

And Driver takes the order for cancellation for scenario create -\&gt; take

When user cancels the order after take

Then cancellation should be successful after take

@EndtoEnd @Cancel

#TC31

Scenario: Cancel order after completion

Given User creates an order for cancellation after complete &quot;Inputs\\TC31.json&quot;

And driver takes the order for cancellation after complete

And driver completes the order for cancellation after complete

When user cancels the order after completion

Then cancellation should not be successful after order completion

@EndtoEnd @Cancel

#TC32

Scenario: Cancel already cancelled order

Given User creates an order for cancellation after cancel &quot;Inputs\\TC32.json&quot;

And Driver takes the order for cancellation after cancel -\&gt; take

And driver cancels the order for the first time

When user cancels the order again

Then cancellation should not be successful for already cancelled order

@EndtoEnd @Cancel

#TC33

Scenario: Cancel order - incorrect order

When user cancels incorrect order with order ID 100000

Then cancel order should not be successful



How to Run:

Feature file is categorized into

@EndtoEnd – All test cases

@Fetch – Fetch test cases

@Take – Take test cases

@Complete – Complete test cases

@Cancel – Cancel test cases

@Post – Post test cases

In runner Set Tags to appropriate one to run selective or set it to EndtoEnd to run all test cases

Right Click on Runner and click \&gt; Run as \&gt; Junit Test



 


Config.file

#Values

IP\_Port = http://10.127.129.178:51544

endpoint = /v1/orders

take = take

complete = complete

cancel = cancel

#HTTP Status

error = 400

success = 200

created = 201

flow\_violated = 422

notfound = 404

These can be changed/configured from here
