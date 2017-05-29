Feature: English Championship Betting

  Scenario Outline: Place a bet on an English Championship event
    Given I have logged in
    When I select the English Championship
    And I select the home team to win
    When I place a bet for "<amount>"
    Then the returns should be "<returns>"
    And the odds should be "<odds>"

    Examples:
      | amount  | odds  | returns |
      | 0.05    | 13/10 | 0.11    |
      | 0.06    | 13/10 | 0.13    |
      | 0.07    | 13/10 | 0.16    |
      | 0.08    | 13/10 | 0.18    |
      | 0.09    | 13/10 | 0.20    |
      | 0.10    | 13/10 | 0.23    |