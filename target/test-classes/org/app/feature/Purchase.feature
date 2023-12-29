#Feature: Purchase page validation

#  @Round_trip
#  Scenario: Validate with adult valid name ,date of birth and gender
#  	Given enter the adult details "1"
#    When enter the first name "KABILAN"
#    And enter the last name "S"
#    And dropdown the gender
#    And dropdown the day of date of birth "25"
#    And enter the month of date of birth "09"
#    And enter the year of date of birth "2002"
#    Then I validate the adult details
    
#  @Round_trip
#  Scenario: Validate with seniors valid name ,date of birth and gender
#  	Given enter the seniors details "2"
#    When enter the first name "KABIL"
#    And enter the last name "S"
#    And dropdown the gender
#    And dropdown the day of date of birth "25"
#    And enter the month of date of birth "09"
#    And enter the year of date of birth "2015"
#    Then I validate the seniors details

#	@Round_trip
#  Scenario: Validate with children valid name ,date of birth and gender
#  	Given enter the children details "3"
#    When enter the first name "kABI"
#    And enter the last name "S"
#    And dropdown the gender
#    And dropdown the day of date of birth "25"
#    And enter the month of date of birth "09"
#    And enter the year of date of birth "1998"
#    Then I validate the children details
    
#  @Round_trip
#  Scenario: Validate with infants in lap valid name ,date of birth and gender
#  	Given enter the infants in lap details "4"
#    When enter the first name "Kavi"
#    And enter the last name "S"
#    And dropdown the gender
#    And dropdown the day of date of birth "25"
#    And enter the month of date of birth "09"
#    And enter the year of date of birth "2000"
#    Then I validate the infants in lap details
    
#  @Round_trip
#  Scenario: Validate credit card payment details
#  	When click the credit card button
#  	And enter the credit card number
#  	And dropdown expired month
#  	And dropdown expired year
#  	And enter the CVV number
#  	And enter the card holder name
#  	And dropdown country
#  	And enter the billing address
#  	And enter the city
#  	And enter the billing phone number
#  	And enter the contact mail id
#  	And enter create password
#  	And enter confirm password
#  	And selecting the agree ratio button
#  	And click the purchase button
#  	Then validate the purchase  
	
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
     | name2 |     7 | Fail    |
