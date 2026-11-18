Feature: Login feature
 
Scenario Outline: Verify login with valid and invalid credentials
When User is on the login page
When User enters the valid "<Email>"
Then Email should be entered on Email field 
When User enter the valid "<Password>"
Then Password should be entered on Password field
When User clicks the sign in button 
Then user should see the "<Result>"


Examples:
| Email                | Password     | Result  |
| customer@infoez.com  | Customer@123 | Success |
| customer@infoez.com  | cust@343452  | Failure |
| gbhdbsg@gmail.com    | uugytfgvgbhd | Failure |
| 987565@gmail.com     | 56745fgtyhn  | Failure |
| cus96788@infoez.com  | Customer@123 | Failure |