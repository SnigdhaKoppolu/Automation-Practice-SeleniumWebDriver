Feature: User can login the web application

Background:
Given open the browser
Given  user navigate the url "https://practice.expandtesting.com/login"

Scenario: Verify user can login with valid credentials
When user enter valid username "practice"
When user enter valid password "SuperSecretPassword!"
And user clicks on login
Then user will be redirected to logout page "Secure Page page for Automation Testing Practice"
Then user closes the  chrome browser


Scenario: Verify user can login with valid credentials
When user enter valid username "practice"
When user enter valid password "SuperSecretPassword!"
And user clicks on login
Then user will be redirected to logout page "Secure Page page for Automation Testing Practice"
Then user closes the  chrome browser


Scenario: Verify user can login with valid credentials
When user enter valid username "practice"
When user enter valid password "SuperSecretPassword!"
And user clicks on login
Then user will be redirected to logout page "Secure Page page for Automation Testing Practice"
Then user closes the  chrome browser


