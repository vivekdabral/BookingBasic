Feature: Booking the cars


  Scenario Outline: Check page display
    Given User navigates to Bookings HomePage
    And User clicks on Register
    Then User enters "<UserName>" and "<Password>"
    And User clicks on Car Rentals tab

    Examples:
    | UserName | Password |
    | dabral_vivek@yahoo.com | Fake12password |
