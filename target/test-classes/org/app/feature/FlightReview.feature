Feature: Fligth review page validation

#  @Round_trip
#  Scenario: verify your round trip fligth and price
#    When click the continue button
#    Then validate the fligth review page

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
