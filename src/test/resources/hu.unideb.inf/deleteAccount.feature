Feature: Delete Account

  Background:
    Given the home page is opened

    Scenario: Delete account
      Given the "Signup / Login" button is clicked
      And the "Email Address" field is filled with "teszt.elek77@mail.hu"
      And the "Password" field is filled with "Jelszó"
      And the "Login" button is clicked
      And the "Delete Account" button is clicked
      Then the "ACCOUNT DELETED!" message is shown