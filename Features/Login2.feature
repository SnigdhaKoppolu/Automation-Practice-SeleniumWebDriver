@all
Feature: login2 feature
 
@smoke @wip
Scenario Outline: Verify user can login with invalid credentials
Given open firefox
Given  user navigate the url "https://practice.expandtesting.com/login"
When user enter valid username "<username>"
When user enter valid password "<password>"
And user clicks on login

Examples:
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|








