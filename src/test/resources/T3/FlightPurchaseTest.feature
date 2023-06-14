Feature: Purchase Ticket Functionality

  Scenario Outline: Verify a User is able purchase a Ticket
    Given User navigates to Purchase Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<fullName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters Zipcode "<zipcode>"
    And User selects Card Type "<cardType>"
    And User enters Card Number "<cardNumber>"
    And User enters Card month "<cardMonth>"
    And User enters Card Year "<cardYear>"
    And User enters Name on the Card "<nameOnCard>"
    And User clicks on Remember Me button
    And User clicks on Purchase Flight button
    Then User verifies success message "<message>"

    Examples: 
      | fullName    | address    | city        | state | zipcode | cardType         | cardNumber          | cardMonth | cardYear | nameOnCard | message                            |
      | Noor Jasim  | 6799 str   | Springfield | VA    |   33876 | Visa             | 2200 0099 4466 8855 | June      |     2025 | Noor Jasim | Thank you for your purchase today! |
      | Meer Jasim  | 7855 ave   | Ashburn     | VA    |   22678 | Diner's Club     | 3388 2200 7766 4455 | July      |     2026 | Meroo      | Thank you for your purchase today! |
      | Yuliya Pero | 3345 court | Alexandria  | VA    |   44567 | American Express | 0077 0055 7755 6644 | Feb       |     2028 | Yuliya     | Thank you for your purchase today! |
      | Hamza Sdq   | 6655 lane  | Sterling    | TX    |   77654 | Diner's Club     | 2200 0099 4466 8855 | June      |     2025 | Hamzawi    | Thank you for your purchase today! |
      | Zubaidi Mo  | 9988 str   | Crofton     | MD    |   66554 | American Express | 3388 2200 7766 4455 | July      |     2026 | Zubaidi    | Thank you!                         |
