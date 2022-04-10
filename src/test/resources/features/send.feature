@tag
Feature: send information
  how data base user I want to send information to database

  @insert
  Scenario Outline: send successful
    When user send customer information
      | fecha   | portafolio   | nominal   | precio   | total   |
      | <fecha> | <portafolio> | <nominal> | <precio> | <total> |
    And User consult the information <total> in the database
    And User calculate total value with fields <nominal>, <precio> and <portafolio>
    Then user should see the total calculated is equals total field in the database

    Examples: 
      | fecha      | portafolio | nominal | precio | total     |
      | 15/05/2020 | OBL-MORDER |  123000 |  23.65 |   2908950 |
      | 15/05/2020 | OBL-MORDER |   10000 |     25 |    250000 |
      | 15/05/2020 | OBL-RIESGO | 1276987 |  -10.2 | -13023267 |
      | 15/05/2020 | OBL-RIESGO |  123000 |   1.29 |    160670 |
