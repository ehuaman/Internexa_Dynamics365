@Critico
Feature: Creacion Nuevo Oportunidad
	I want to use this template for my feature file

@SmokeTest
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.4" el tipo de venta "Nuevo cliente" fecha estimada de venta "20/02/2018" probabilidad de exito "40%" fecha estimada de ingreso "21/02/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Pananma 1123"
And se ingresa la factibilidad 
And se detallan datos de factibilidad

@ApruebaFactibilidad
Scenario: Aprueba Factibilidad
Given me logueo al aplicativo Dynamics como "gbustamante@internexa.com" con pass "Enero2018*"
When selecciono oportunidad que requiere aprobación
Then Se aprueba Factibilidad
