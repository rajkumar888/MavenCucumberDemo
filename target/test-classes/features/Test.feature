@Login
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
  Given The web browser is opened
    Given url is opened

  @validlogin @12345
  Scenario: Login verfication with valid test data
    
    When user has entered user name as "xyzabc"
    And user has enetered password as "abcxyz@111"
    And user has clicked on login button
    Then user is allowed to navigate to hompe page
    And verify the title and logo of the home page
    When user has closed the application

  @invalidlogin @hello
  Scenario: Login verfication with invalid test data
    When user has entered user name as "xyzabc122"
    And user has enetered password as "abcxyz@333"
    And user has clicked on login button

  @MulitpleData @12346 @test
  Scenario Outline: Example of Scenario Ouline
    When user has entered user name as "<username>"
    And user has enetered password as "<password>"

    Examples: 
      | username | password  |
      | test1    | password1 |
      | test2    | password2 |
      | test3    | password3 |
      | test4    | password4 |
      | test5    | password5 |

  @datatabledemo
  Scenario: New User Registration example
    Given I am on a new user registration page
    When I enter valid data on the page
      | Fields        | Values              |
      | First Name    | Tom                 |
      | Last Name     | Kenny               |
      | Email Address | someone@someone.com |
      | test1         | password1           |
      | test2         | password2           |
      | test3         | password3           |
      | test4         | password4           |
      | test5         | password5           |
    Then the user registration should be successful.
    Then the given message should be displayed
    """ 
    the quick brown fox jumps over the lazy dog.
    the quick brown fox jumps over the lazy dog. 
    the quick brown fox jumps over the lazy dog.
    the quick brown fox jumps over the lazy dog.
    """
