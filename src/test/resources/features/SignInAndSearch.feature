@SearchSignIn
Feature: Search and Signin Features verification
  I want to use this template for my Search and Signin

  Scenario: verfify the search functionality
    Given user has opened the search page
    When user has entered the "Shrit" for search and click on search button
    Then the seach page should be displayed with result

	@mulitple
  Scenario Outline: verfify the signin functionality
    Given user has opened the singin page
    When user has entered the userid "<emailid>" and password as "<password>" and cliked on signin button
    Then the home page is displayed

    Examples: 
      | emailid          | password     |
      | abc121@gmail.com | password@123 |
      | abc122@gmail.com | password@123 |
      | abc123@gmail.com | password@123 |
      | abc124@gmail.com | password@123 |
      | abc125@gmail.com | password@123 |
