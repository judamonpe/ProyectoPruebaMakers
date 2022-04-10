@tag
Feature: llenar formulario
  Como usuario quiero llenat formulario de somosmakers

  Background: 
    Given el usuario esta en la pagina https://somosmakers.co/
    When el usuario hace clic en el enlace CONTACTO

  @capturaCelular
  Scenario: Captura numero celular del cliente
   #Then el usuario captura el numero de celular +57 (315) 369 6145 de servicio al cliente

  @LlenarFormulario
  Scenario Outline: Llenar formulario
    When el usuario ingresa la informacion en el formulario dejanos un mensaje
      | Nombre   | Apellido   | Email   | Telefono   |
      | <Nombre> | <Apellido> | <Email> | <Telefono> |
    And el usuario toma un pantallazo a la informacion diligenciada

    Examples: 
      | Nombre        | Apellido | Email                  | Telefono |
      | Peter Albeiro | Alzate   | peteralbeiro@gmail.com |  2212014 |
