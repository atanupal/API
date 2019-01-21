$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/test.feature");
formatter.feature({
  "name": "API Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create Order -\u003e Fetch Order -\u003e ASSIGNING",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for Fetch Order \"Inputs\\\\TC1.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_Fetch_Order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order once created",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_once_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status should be ASSIGNING",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_should_be_ASSIGNING()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order -\u003eTake Order -\u003e  Fetch Order -\u003e ONGOING",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for ongoing order \"Inputs\\\\TC2.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_ongoing_order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order is taken by the driver",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_taken_by_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order once taken",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_once_taken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status should be ONGOING",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_should_be_ONGOING()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order -\u003eTake Order -\u003e  Complete Order -\u003e Fetch Order -\u003e COMPLETED",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for completed order \"Inputs\\\\TC3.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_completed_order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order is taken by the driver for complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_taken_by_the_driver_for_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order is completed by the driver",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_completed_by_the_driver()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order once completed",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_once_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status should be COMPLETED",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_should_be_COMPLETED()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order -\u003eCancel Order -\u003e  Fetch Order -\u003e CANCELLED",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for CANCELLED order \"Inputs\\\\TC4.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_CANCELLED_order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order is cancelled by the user",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_cancelled_by_the_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order once taken for cancel",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_once_taken_for_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status should be CANCELLED",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_should_be_CANCELLED()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order -\u003eTake order -\u003eCancel Order -\u003e  Fetch Order -\u003e CANCELLED",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for take order CANCELLED order \"Inputs\\\\TC5.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_take_order_CANCELLED_order(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order is cancelled by the user after take",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.order_is_cancelled_by_the_user_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order for cancel after take",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_for_cancel_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status should be CANCELLED after take",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_should_be_CANCELLED_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Order -\u003e Fetch Order -\u003e Fetch Order again",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "Order is created for Fetch Order again \"Inputs\\\\TC6.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.order_is_created_for_Fetch_Order_again(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetches the order once created",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_fetches_the_order_once_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fetched the order again once created",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_fetched_the_order_again_once_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Status for fetch again should be ASSIGNING",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.status_for_fetch_again_should_be_ASSIGNING()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Test cases for Fetch Order - Incorrect values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "user hits it with incorrect order IDs \u003cID\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user should get following errors \u003cOutput\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "ID",
        "Output"
      ]
    },
    {
      "cells": [
        "100000",
        "404"
      ]
    },
    {
      "cells": [
        "500000",
        "404"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test cases for Fetch Order - Incorrect values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "user hits it with incorrect order IDs 100000",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_hits_it_with_incorrect_order_IDs(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get following errors 404",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_get_following_errors(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test cases for Fetch Order - Incorrect values",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Fetch"
    }
  ]
});
formatter.step({
  "name": "user hits it with incorrect order IDs 500000",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_hits_it_with_incorrect_order_IDs(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get following errors 404",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_should_get_following_errors(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - one stop - Invalid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with one stop \"Inputs\\\\TC8.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_one_stop(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should not be created for one stop",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_not_be_created_for_one_stop()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - two valid stops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with two stops \"Inputs\\\\TC9.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_two_stops(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created for two stops",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_for_two_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount is correct for two stops",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.amount_is_correct_for_two_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - three valid stops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with three stops \"Inputs\\\\TC10.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_three_stops(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created for three stops",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_for_three_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount is correct for three stops",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.amount_is_correct_for_three_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - four valid stops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with four stops \"Inputs\\\\TC11.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_four_stops(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created for four stops",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_for_four_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount is correct for four stops",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.amount_is_correct_for_four_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - five valid stops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with five stops \"Inputs\\\\TC12.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_five_stops(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created for five stops",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_for_five_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount is correct for five stops",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.amount_is_correct_for_five_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - Duplicate stops",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "user creates an order with duplicate stops \"Inputs\\\\TC13.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_creates_an_order_with_duplicate_stops(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created for duplicate stops",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_for_duplicate_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Amount is correct for duplicate stops",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.amount_is_correct_for_duplicate_stops()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - invalid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "customer is placing an invalid json in body \"Inputs\\\\TC14.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.customer_is_placing_an_invalid_json_in_body(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should not be created",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_not_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - Future",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "customer is placing a valid json in body with automatic future timestamp \"Inputs\\\\TC50.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.customer_is_placing_a_valid_json_in_body_with_automatic_future_timestamp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should be created with future timestamp",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_be_created_with_future_timestamp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order - Past",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Post"
    }
  ]
});
formatter.step({
  "name": "customer is placing a valid json in body with automatic past timestamp \"Inputs\\\\TC50.json\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.customer_is_placing_a_valid_json_in_body_with_automatic_past_timestamp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Order should not be created with past timestamp",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.order_should_not_be_created_with_past_timestamp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Take order - Valid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "User creates an order for take \"Inputs\\\\TC17.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_take(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order for the scenario",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_the_scenario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.take_should_be_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Take already taken order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "User creates an order for already taken scenario \"Inputs\\\\TC18.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_already_taken_scenario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order first",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_first()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order for the second time",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_the_second_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take should not be successful for second time",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.take_should_not_be_successful_for_second_time()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test cases for Take Order- Incorrect",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "driver takes order with incorrect ID 100000",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_order_with_incorrect_ID(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver should get error for Incorrect Take",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.driver_should_get_error_for_Incorrect_Take()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Take completed order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "User creates an order for already completed scenario \"Inputs\\\\TC20.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_already_completed_scenario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order for scenario completed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_scenario_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver completes the order for scenario completed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_for_scenario_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order again for completed order",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_again_for_completed_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take should not be successful for completed order",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.take_should_not_be_successful_for_completed_order()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Take cancelled after create order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancelled order after create scenario \"Inputs\\\\TC21.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancelled_order_after_create_scenario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver cancels the order for cancelled order after create",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_cancels_the_order_for_cancelled_order_after_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order again for cancelled order after create",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_again_for_cancelled_order_after_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take should not be successful for cancelled order after create",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.take_should_not_be_successful_for_cancelled_order_after_create()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Take cancelled after take order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Take"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancelled order after take scenario \"Inputs\\\\TC22.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancelled_order_after_take_scenario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order for scenario cancellation after take",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_scenario_cancellation_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver cancels the order for cancelled order after take",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_cancels_the_order_for_cancelled_order_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order againn for cancelled order after take",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_againn_for_cancelled_order_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take should not be successful for cancelled order after take",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.take_should_not_be_successful_for_cancelled_order_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - Valid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "User creates an order for complete \"Inputs\\\\TC23.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_complete(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order for the scenario complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_the_scenario_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver completes the order for valid scenario",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_for_valid_scenario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete should be successful for valid scenario",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_should_be_successful_for_valid_scenario()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - before take",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "User creates an order for complete before take \"Inputs\\\\TC24.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_complete_before_take(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver completes the order before take",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_before_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete should be not be successful before take",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_should_be_not_be_successful_before_take()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - after create-\u003e cancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "User creates an order for completing after create -\u003e cancel \"Inputs\\\\TC25.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_completing_after_create_cancel(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver cancels the order for the scenario create -\u003e complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_cancels_the_order_for_the_scenario_create_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver completes the order after create -\u003e cancel",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_after_create_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete should be not be successful after create -\u003e cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_should_be_not_be_successful_after_create_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - after create-\u003e Take -\u003e cancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "User creates an order for completing after create -\u003e take -\u003e  cancel \"Inputs\\\\TC26.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_completing_after_create_take_cancel(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order for scenario create -\u003e take -\u003e complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_scenario_create_take_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver cancels the order for the scenario create -\u003e take -\u003e complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_cancels_the_order_for_the_scenario_create_take_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver completes the order after create -\u003e take -\u003e cancel",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_after_create_take_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete should be not be successful after create -\u003e take -\u003e cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_should_be_not_be_successful_after_create_take_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - already completed one",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "User creates an order for completing for scenario already completed \"Inputs\\\\TC27.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_completing_for_scenario_already_completed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order for scenario already completed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_scenario_already_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver completes the order for the first time for scenario already completed",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_for_the_first_time_for_scenario_already_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver completes the order for the second time",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_for_the_second_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete should be not be successful for already completed order",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_should_be_not_be_successful_for_already_completed_order()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Complete order - incorrect order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Complete"
    }
  ]
});
formatter.step({
  "name": "user completes incorrect order with order ID 100000",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_completes_incorrect_order_with_order_ID(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete order should not be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.complete_order_should_not_be_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel order after creation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Cancel"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancellation \"Inputs\\\\TC29.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancellation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cancels the order after create",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cancels_the_order_after_create()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancellation should be successful after order creation",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.cancellation_should_be_successful_after_order_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel order after creation -\u003e Take",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Cancel"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancellation after take \"Inputs\\\\TC30.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancellation_after_take(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order for cancellation for scenario create -\u003e take",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_cancellation_for_scenario_create_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cancels the order after take",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cancels_the_order_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancellation should be successful after take",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.cancellation_should_be_successful_after_take()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel order after completion",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Cancel"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancellation after complete \"Inputs\\\\TC31.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancellation_after_complete(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver takes the order for cancellation after complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_cancellation_after_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver completes the order for cancellation after complete",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_completes_the_order_for_cancellation_after_complete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cancels the order after completion",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cancels_the_order_after_completion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancellation should not be successful after order completion",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.cancellation_should_not_be_successful_after_order_completion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Cancel already cancelled order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Cancel"
    }
  ]
});
formatter.step({
  "name": "User creates an order for cancellation after cancel \"Inputs\\\\TC32.json\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_creates_an_order_for_cancellation_after_cancel(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Driver takes the order for cancellation after cancel -\u003e take",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_takes_the_order_for_cancellation_after_cancel_take()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "driver cancels the order for the first time",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.driver_cancels_the_order_for_the_first_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user cancels the order again",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cancels_the_order_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancellation should not be successful for already cancelled order",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.cancellation_should_not_be_successful_for_already_cancelled_order()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Expected Result: Status 422  Actual Result : 200\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat StepDefinition.Steps.cancellation_should_not_be_successful_for_already_cancelled_order(Steps.java:1154)\r\n\tat ✽.cancellation should not be successful for already cancelled order(Features/test.feature:268)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Cancel order - incorrect order",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoEnd"
    },
    {
      "name": "@Cancel"
    }
  ]
});
formatter.step({
  "name": "user cancels incorrect order with order ID 100000",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_cancels_incorrect_order_with_order_ID(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cancel order should not be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.cancel_order_should_not_be_successful()"
});
formatter.result({
  "status": "passed"
});
});