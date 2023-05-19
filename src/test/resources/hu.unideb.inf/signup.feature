Feature: New User Signup

  Background:
    Given the home page is opened

    Scenario: Successful signup
      Given the "Signup / Login" button is clicked
      And the "Name" field is filled with "Teszt Elek"
      And the "Signup Email Address" field is filled with "teszt.elek77@mail.hu"
      And the "Signup" button is clicked
      And the "Signup Password" field is filled with "Jelszó"
      And the "First name" field is filled with "Teszt"
      And the "Last name" field is filled with "Elek"
      And the "Address" field is filled with "Teszt utca 2"
      And the "State" field is filled with "Teszt megye"
      And the "City" field is filled with "Tesztváros"
      And the "Zipcode" field is filled with "1234"
      And the "Mobile Number" field is filled with "012345678910"
      And the "Create Account" button is clicked
      Then the "ACCOUNT CREATED!" message is shown