Feature: Fill out form
  How user I want fill out form somosmakers

  Background: 
    Given user is in the webpage https://somosmakers.co/
    When user clic on tab CONTACTO

  @captureForm
  Scenario: Capture customer cell number
    Then user capture cell number +57 (315) 369 6145 of customer service

  @filloutForm
  Scenario Outline: fill out form
    When user enter information in the leave us a message form
      | Name   | Surname   | Email   | Phone   |
      | <Name> | <Surname> | <Email> | <Phone> |
    Then user should see messsage is ¡Mensaje enviado!

    Examples: 
      | Name          | Surname | Email                  | Phone   |
      | Peter Albeiro | Alzate  | peteralbeiro@gmail.com | 2212014 |
