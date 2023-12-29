Feature: Flight result page validation

#  @Round_trip
#  Scenario: search the flight under the round trip mode
#    When handle the pop up
#    And select the departing fligth
#    Then validate the flight result page

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
