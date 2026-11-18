@HomePage
Feature: Search Functionality

Background:
Given user is on the landing page and click sigin for verify the Search Functions
Given  User click the customer login credentials and click the sign in button

Scenario Outline: Verify the search Fields with valid and Invalid name 

When User enters the valid "<Name>" on the search field
And User click the search button 
Then user should see the name "<Results>"

  Examples:

                | Name    | Results               |
                | Coffee  | Related results shown |
                | Hotel   | Related results shown |
                | HOTEL   | Related results shown |
                | yfcgvjn | No business found     |
                | 2345678 | No business found     |
                |         | No actions Made       |
                | @#$%^&* | No business found     |

Scenario Outline: Verify the search Fields with valid and Invalid city name
When User enter the valid "<city>" name on the search field
And User click the city search button 
Then user should see the city "<Results>"

Examples:
                | city       | Results                          |
                | Hyderabad  | Related results shown            |
                | HYDERABAD  | Related results shown            |
                | Bengaluru  | Related results shown            |
                | 3456787    | No business found                |
                |            | No actions Made                  | 
                | @#$%^&*    | No business found                |
               