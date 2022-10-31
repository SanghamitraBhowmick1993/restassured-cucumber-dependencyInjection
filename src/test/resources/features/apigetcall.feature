@test
Feature: Search Functionality

Scenario: Test API - GET CALL
Given i have an api
When i hit api with apipath "/api/users/2"
Then status code is 200
And response has id as 2
And firstname is "Janet"
And support text message is "To keep ReqRes free, contributions towards server costs are appreciated!"