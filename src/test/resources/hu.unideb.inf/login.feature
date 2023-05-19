Feature: User Login

  Background:
    Given the home page is opened
    And the "Signup / Login" button is clicked

  Scenario Outline: Incorrect login attempts
    Given the "Email Address" field is filled with "<email>"
    And the "Password" field is filled with "<password>"
    And the "Login" button is clicked
    Then the "Your email or password is incorrect!" message is shown
    Examples:
      | email                 | password |
      | teszt.elek77@mail.hu  | jelszó   |
      | teszt.elek777@mail.hu | Jelszó   |
      | teszt.elek777@mail.hu | Jelszo   |
      | teszt.elek77@mail.com | jelszo   |
      | teszt.elek77@mail.hu  | Jelszo   |
      | teszt.elek77@mail.com | Jelszó   |

  Scenario: Successful login
    Given the "Email Address" field is filled with "teszt.elek77@mail.hu"
    And the "Password" field is filled with "Jelszó"
    And the "Login" button is clicked
    Then the "Logged in as Teszt Elek" message is shown