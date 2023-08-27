Feature: Simple searhing example
  Scenario: A user search a fly from istanbul to Los Angeles
    Given User on the home page
    And User types istanbul to From field and clicks
    And User tries to type istanbul to From field and clicks
    When User types Los Angeles to To field and clicks
    Then User should see the results and verify the results


