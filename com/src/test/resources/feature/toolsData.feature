@ToolsQA
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Ingresar al Navegador
    #When Realizar registro del formulario <primerN><apellido><correo><genero><celular><fechaN><temas><hobbies><direccion>
    When Realizar registro del formulario <primerN><apellido><celular>
    Then Validar Registro Exitoso
     
    Examples: 
      | primerN  | apellido | celular  |
      | "prueba" |     "Tést" | "3102123312" |



