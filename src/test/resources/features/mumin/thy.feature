@thy
Feature: feature

  Background:

    Given user opens the homepage
    And   user clicks thee "cookieWarningAcceptId" button

  Scenario: Fill the form
    And   user clicks thea "signupbtn" button
    #And   user clicks the "Become a member" button
    When  user fill form of the personel information
      | signup-firstname         |
      | signup-surname           |
      | birthdateInput           |
      | signup-email             |
      | signup-postCode2         |
      | signup-addressLine1      |
      | signup-mobilePhoneNumber |
      | signup-password          |
      | signup-repassword        |
      | signup-sanswer           |
