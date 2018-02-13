@Critico
Feature: Creacion Nuevo Oportunidad
	I want to use this template for my feature file

@SmokeTest
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Sorozco S.A." el nombre "PRUEBA Auto1.3" el tipo de venta "Nuevo cliente" fecha estimada de venta "13/02/2018" probabilidad de exito "60%" fecha estimada de ingreso "14/02/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
Then se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40"
Then se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad