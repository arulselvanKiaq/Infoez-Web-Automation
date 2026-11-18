@register
Feature: Registration Function

  Background:
    Given user launches the Register page Application URL
    Given user click the sigin button
    Given user click the create one link
  
 
  Scenario Outline: validate register an account with valid and invalid multiple user details
    When user enters Full name "<full name>"
    And user enters Email "<email>"
    And user enters Phone "<phone>"
    And user enters Password "<password>"
    And user click the create account button
    Then user should see "<result>"

    Examples:
      | full name  | email                   | phone      | password     | result                       |
      |            | lalith23@gmail.com      | 9882876541 | lalith$456   | Failure                      |
      | Vicky      |                         | 9782874234 | v@123        | Failure                      |
      | keerthi    | keerth456gmail.com      | 9623477235 | karthi@123   | Failure                      |
      | karthi     | karthi456@.com          | 9834874432 | karthi@123   | Failure                      |
      | karthi     | karthi456@gmail.        | 9836287234 | karthi@123   | Failure                      |
      | Sathish    | sathish@gmail.com       | 6433287484 | sathish@123  | Failure                      |
      | kavish     | kavish47652@gmail.com   | 8762376435 | kavishm@123  | Success                      |
