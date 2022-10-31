@test
Feature: Search Functionality

Scenario: Test API - POST CALL
Given i have an api
When i hit api with create path "/api/users"
Then status code is 201
Then validate response has name as "testuser"