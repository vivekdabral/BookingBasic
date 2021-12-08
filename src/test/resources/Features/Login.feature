Feature: Login Scenarios

  Scenario Outline: Login with correct username and password
    Given User navigates to Bookings HomePage
    And User clicks on Register
    Then User enters "<UserName>" and "<Password>"

    Examples:
      | UserName             | Password |
      | dabs1234@hotmail.com | Test1234 |

  Scenario Outline: Login with correct username and password
    Given User navigates to Bookings HomePage
    And User clicks on Register
    Then User enters "<UserName>" and "<Password>"
    Then Check against the "<validationMessage>"

    Examples:
      | UserName               | Password | validationMessage                                         |
      | dabral_vivek@yahoo.com | Fake12   | The email and password combination entered doesn't match. |