# Autor> Carlos
@Stories
Feature: Utest
  I want to register as user on utest.com
  @scenario1
  Scenario: Register as user on uTest
    Given than Carlos wants to register as user on Utest
      | strFname     | strLname   | strEmailAdd              | strMonth      | strDay     | strYear    |strCity    | strZipCode   | strCountry   | strYourComputer  | strVersion  | strLanguage  | strYourMobilDevice        | strModel  | strOperatingSystem  | strPassword  | strConfirmPassword  |
      | Carlos       | Falcon     | falconcar1980@gmail.com  | December      | 25         | 1980       |Panamá     | 612          | Panama       | Windows          | 10          | Spanish      | Apple                     | Iphone11  | iOS 14.6            | Cambiar*001  | Cambiar*001         |
    When I should accept the conditions
      | strCheckCode1                    | strCheckCode2                    |
      | <input-check-box signup-consent> | <input-check-box signup-consent> |
    Then I should press button to process succesfully