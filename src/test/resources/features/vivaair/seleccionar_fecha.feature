@test
Feature: Seleccionar una fecha en el calendario

  Yo como usuario
  Quiero seleccionar una fecha

@Scenario:
Scenario: deberia seleccionar la fecha deseada
Given el usuario esta en la seccion inicio de la pagina
When despliega el calendario
And ingresa la fecha
|anio   |dia    |mes     |
|2019   |2     |Aug     |
Then deberia poder ver los datos ingresados