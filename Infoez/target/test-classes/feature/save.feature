@Save
Feature: Save and Unsave functions
Scenario: validate save and unsave the business  

When User logged into the application for save and unsave the business
Then User should be logged in successfully for verify the save and unsave the business 
When User opens the explore page and user clicks on a business image 
Then Business details page should be displayed 
When User click the save icon  
Then Business should be saved successfully
When User clicks the save icon again 
Then Business should be removed from saved items 