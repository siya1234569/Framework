Feature: Login into application


Scenario Outline: positive test to validate login
Given Initialise browser with chrome
And Navigate to "https://eagercrow.com/Home" site
And Click on Signin link on homepage to land on secure sign in page
And Click on signIn with Email
When User enters username and password and signin button
Then User signIn succsesfuly
 