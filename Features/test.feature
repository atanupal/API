Feature: API Testing



@EndtoEnd @Fetch
#TC1
Scenario: Create Order -> Fetch Order -> ASSIGNING
Given Order is created for Fetch Order "Inputs\\TC1.json"
When user fetched the order once created	
Then Status should be ASSIGNING



@EndtoEnd @Fetch
#TC2
Scenario: Create Order ->Take Order ->  Fetch Order -> ONGOING
Given Order is created for ongoing order "Inputs\\TC2.json"
And Order is taken by the driver
When user fetched the order once taken	
Then Status should be ONGOING



@EndtoEnd @Fetch
#TC3
Scenario: Create Order ->Take Order ->  Complete Order -> Fetch Order -> COMPLETED
Given Order is created for completed order "Inputs\\TC3.json"
And Order is taken by the driver for complete
And Order is completed by the driver
When user fetched the order once completed
Then Status should be COMPLETED


@EndtoEnd @Fetch
#TC4
Scenario: Create Order ->Cancel Order ->  Fetch Order -> CANCELLED
Given Order is created for CANCELLED order "Inputs\\TC4.json"
And Order is cancelled by the user
When user fetched the order once taken for cancel
Then Status should be CANCELLED

@EndtoEnd @Fetch
#TC5
Scenario: Create Order ->Take order ->Cancel Order ->  Fetch Order -> CANCELLED
Given Order is created for take order CANCELLED order "Inputs\\TC5.json"
And driver takes the order
And Order is cancelled by the user after take
When user fetched the order for cancel after take
Then Status should be CANCELLED after take

@EndtoEnd @Fetch
#TC6
Scenario: Create Order -> Fetch Order -> Fetch Order again
Given Order is created for Fetch Order again "Inputs\\TC6.json"
And user fetches the order once created
When user fetched the order again once created	
Then Status for fetch again should be ASSIGNING

@EndtoEnd @Fetch
#TC7	
Scenario Outline: Test cases for Fetch Order - Incorrect values
When user hits it with incorrect order IDs <ID>
Then user should get following errors <Output>

Examples:
| ID  | Output  | 
| 100000 | 404 | 
| 500000 | 404 |




@EndtoEnd @Post
#TC8
Scenario: Placing order - one stop - Invalid
When user creates an order with one stop "Inputs\\TC8.json"	
Then Order should not be created for one stop

@EndtoEnd @Post
#TC9
Scenario: Placing order - two valid stops
When user creates an order with two stops "Inputs\\TC9.json"	
Then Order should be created for two stops
And Amount is correct for two stops

@EndtoEnd @Post
#TC10
Scenario: Placing order - three valid stops
When user creates an order with three stops "Inputs\\TC10.json"	
Then Order should be created for three stops
And Amount is correct for three stops

@EndtoEnd @Post
#TC11
Scenario: Placing order - four valid stops
When user creates an order with four stops "Inputs\\TC11.json"	
Then Order should be created for four stops
And Amount is correct for four stops

@EndtoEnd @Post
#TC12
Scenario: Placing order - five valid stops
When user creates an order with five stops "Inputs\\TC12.json"	
Then Order should be created for five stops
And Amount is correct for five stops

@EndtoEnd @Post
#TC13
Scenario: Placing order - Duplicate stops  
When user creates an order with duplicate stops "Inputs\\TC13.json"	
Then Order should be created for duplicate stops
And Amount is correct for duplicate stops

@EndtoEnd @Post
#TC14
Scenario: Placing order - invalid
When customer is placing an invalid json in body "Inputs\\TC14.json"	
Then Order should not be created

@EndtoEnd @Post
#TC15
Scenario: Placing order - Future
When customer is placing a valid json in body with automatic future timestamp "Inputs\\TC50.json"	
Then Order should be created with future timestamp

@EndtoEnd @Post
#TC16
Scenario: Placing order - Past
When customer is placing a valid json in body with automatic past timestamp "Inputs\\TC50.json"	
Then Order should not be created with past timestamp



@EndtoEnd @Take
#TC17
Scenario: Take order - Valid
Given User creates an order for take "Inputs\\TC17.json"
When Driver takes the order for the scenario 	
Then Take should be successful


@EndtoEnd @Take
#TC18
Scenario: Take already taken order
Given User creates an order for already taken scenario "Inputs\\TC18.json"
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
Given User creates an order for already completed scenario "Inputs\\TC20.json"
And driver takes the order for scenario completed
And driver completes the order for scenario completed
When Driver takes the order again for completed order
Then Take should not be successful for completed order

@EndtoEnd @Take
#TC21
Scenario: Take cancelled after create order
Given User creates an order for cancelled order after create scenario "Inputs\\TC21.json"
And driver cancels the order for cancelled order after create
When Driver takes the order again for cancelled order after create
Then Take should not be successful for cancelled order after create

@EndtoEnd @Take
#TC22
Scenario: Take cancelled after take order
Given User creates an order for cancelled order after take scenario "Inputs\\TC22.json"
And driver takes the order for scenario cancellation after take
And driver cancels the order for cancelled order after take
When Driver takes the order againn for cancelled order after take
Then Take should not be successful for cancelled order after take





@EndtoEnd @Complete
#TC23
Scenario: Complete order - Valid
Given User creates an order for complete "Inputs\\TC23.json"
And Driver takes the order for the scenario complete
When Driver completes the order for valid scenario
Then complete should be successful for valid scenario

@EndtoEnd @Complete
#TC24
Scenario: Complete order - before take
Given User creates an order for complete before take "Inputs\\TC24.json"
When Driver completes the order before take
Then complete should be not be successful before take

@EndtoEnd @Complete
#TC25
Scenario: Complete order - after create-> cancel
Given User creates an order for completing after create -> cancel "Inputs\\TC25.json"
And driver cancels the order for the scenario create -> complete
When Driver completes the order after create -> cancel
Then complete should be not be successful after create -> cancel

@EndtoEnd @Complete
#TC26
Scenario: Complete order - after create-> Take -> cancel
Given User creates an order for completing after create -> take ->  cancel "Inputs\\TC26.json"
And driver takes the order for scenario create -> take -> complete
And driver cancels the order for the scenario create -> take -> complete
When Driver completes the order after create -> take -> cancel
Then complete should be not be successful after create -> take -> cancel

@EndtoEnd @Complete
#TC27
Scenario: Complete order - already completed one
Given User creates an order for completing for scenario already completed "Inputs\\TC27.json"
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
Given User creates an order for cancellation "Inputs\\TC29.json"
When user cancels the order after create
Then cancellation should be successful after order creation

 @EndtoEnd @Cancel
#TC30
Scenario: Cancel order after creation -> Take
Given User creates an order for cancellation after take "Inputs\\TC30.json"
And Driver takes the order for cancellation for scenario create -> take
When user cancels the order after take
Then cancellation should be successful after take

@EndtoEnd @Cancel
#TC31
Scenario: Cancel order after completion
Given User creates an order for cancellation after complete "Inputs\\TC31.json"
And driver takes the order for cancellation after complete
And driver completes the order for cancellation after complete
When user cancels the order after completion
Then cancellation should not be successful after order completion

@EndtoEnd @Cancel
#TC32
Scenario: Cancel already cancelled order
Given User creates an order for cancellation after cancel "Inputs\\TC32.json"
And Driver takes the order for cancellation after cancel -> take
And driver cancels the order for the first time 
When user cancels the order again
Then cancellation should not be successful for already cancelled order

@EndtoEnd @Cancel
#TC33
Scenario: Cancel order - incorrect order
When user cancels incorrect order with order ID 100000
Then cancel order should not be successful
