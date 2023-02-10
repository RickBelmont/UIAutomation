@books
Feature: Test Loggin Book Page functionality

    Background: Log in Pag
        Given I go to book page

    Scenario: I click on sign in bottom with no username or password inserted

        And I click on sign in bottom
        Then I receive a warning message that information is missing

    Scenario Outline: I enter a valid usermane
        When I enter a <usernameBook>
        And I enter  this <password>
        And I click on sign in bottom
        Then I logged in to bookpage succesfully https://qa-library-dev.herokuapp.com/qa-dashboard

        Examples:
            | usernameBook                | password   |
            | rickbelmont_222@hotmail.com | RBelmont01 |

    Scenario Outline: I enter an invalid username
        When I enter a <usernameBook>
        And I enter  this <password>
        And I click on sign in bottom
        Then I receive an error message

        Examples:
            | usernameBook      | password   |
            | gisel@hotmail.com | RBelmont01 |

