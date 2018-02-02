@Critico
Feature: Creacion Nuevo Oportunidad
	I want to use this template for my feature file

@SmokeTest
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "ITX-S-CRM@isaempresas.onmicrosoft.com" con pass "C391qsc250"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "GELLY S.A" el nombre "PRUEBA JUANFG" el tipo de venta "Nuevo cliente" fecha estimada de venta "06/02/2018" probabilidad de exito "10%" fecha estimada de ingreso "08/02/2018" tipo de oportunidad "Express" contrato a meses "30" y se guarda la oportunidad
Then se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "INTERNEXA LAST MILE NACIONAL"
Then se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad