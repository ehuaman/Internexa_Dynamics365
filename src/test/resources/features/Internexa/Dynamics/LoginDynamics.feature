@Critico
	Feature: Creacion Nuevo Oportunidad
	I want to use this template for my feature file

#Nuevo Caso de prueba con TIPO DE OPORTUNIDAD: Proyecto

@CPOportunidadProyecto
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "27/02/2018" probabilidad de exito "40%" fecha estimada de ingreso "28/02/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Pananma 1123"
And se ingresa la factibilidad 
And se detallan datos de factibilidad
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta


#Nuevo Caso de prueba con TIPO DE OPORTUNIDAD: Solución

@CPOportunidadSolucion
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.2Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "27/02/2018" probabilidad de exito "60%" fecha estimada de ingreso "28/02/2018" tipo de oportunidad "Solución" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Panama 1123"
And se ingresa la factibilidad 
And se detallan datos de factibilidad
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta

#Aprobar Factibilidad

@ApruebaFactibilidad @CPOportunidadProyecto @CPOportunidadSolucion
Scenario: Aprueba Factibilidad
Given me logueo al aplicativo Dynamics como "SOROZCO_DYNAMICS365@INTERNEXA.COM" con pass "t4SpUquw"
When elijo Ventas luego Actividades 
Then se busca correo de solicitud de factibilidad 
And  se seleccion el correo que necesita aprobacion
And  se ingresa y se llenan datos requeridos

@CPOportunidadExpres
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "27/02/2018" probabilidad de exito "40%" fecha estimada de ingreso "28/02/2018" tipo de oportunidad "Express" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Pananma 1123"
##And se ingresa la factibilidad 
##And se detallan datos de factibilidad
##And se envia solicitud factibilidad
##And se cierra sesión de Gerente Cuenta

#@GeneraOferta
#Scenario: Oferta
#Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Feb2018*"
#When elijo Ventas luego Ofertas
#Then se busca correo de solicitud de factibilidad 
