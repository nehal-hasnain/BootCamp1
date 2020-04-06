Feature: Fedex Application Login

Scenario: Login Sign Up
Given User is on Fedex login page
When User fills up the registration page with following information
| Nehal | Hasnain | abc@ymail.ca | abc@ymail.ca | White Oaks | Whitby | 1000 | 5877008080 | nehal1234 | password1234 | password1234 | answer |
When User selects Province, Country, Secret quesion
When User checks the check boxes
Then Fdex user account is created succesfully
