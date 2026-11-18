@ExploreFavorites
Feature: Favorites functionality

Scenario: verify the favorites 
When user is on the landing page and click sigin for verify the Favorites
When User click the customer login credentials and click sign in
And  User click the Explore module
When  user select the Favorites
Then user should see the Added to favorites Toast message
When user unselect the Favorites
Then user should see the removed from favorites Toast message
When user again select the favorites
And  user click the Profile menu and click favorites
Then user should see the selected favorites result


