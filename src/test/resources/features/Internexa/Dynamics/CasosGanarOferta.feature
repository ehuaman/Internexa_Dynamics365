@Critico
	Feature: Creacion Nuevo Oportunidad
	I want to use this template for my feature file

#Nuevo Caso de prueba con TIPO DE OPORTUNIDAD: Proyecto
############################
####PRODUCTO 40 LAST MILE
############################

@CPOportunidadProyecto
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto40.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "15/03/2018" probabilidad de exito "40%" fecha estimada de ingreso "16/03/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
##Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto40.1Factibilidad" el tipo de venta "Novo cliente" fecha estimada de venta "15/03/2018" probabilidad de exito "40%" fecha estimada de ingreso "16/03/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Pananma 1123"
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS "Gelly Andrea Bustamante" Observacion "Pruebas factibilidad 12233"
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta

@CPOportunidadSolucion
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.2Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "16/03/2018" probabilidad de exito "60%" fecha estimada de ingreso "17/03/2018" tipo de oportunidad "Solución" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Panama 1123"
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS "Gelly Andrea Bustamante" Observacion "Pruebas factibilidad 12233"
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta

@CPOportunidadExpres
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "15/03/2018" probabilidad de exito "40%" fecha estimada de ingreso "16/03/2018" tipo de oportunidad "Express" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "40" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "bogotá" dirección "Av Republica de Pananma 1123"
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Sitio A "ICA" ingresa datos de IPS "Gelly Andrea Bustamante" y Contacto Tecnico "FERNANDO PARRA" ganar "Ganar" con Motivo:"4" y Descripcion: "Ofera 12312"


#####################
###PRODUCTO 70 
####################

@CPOportunidadProyecto70
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto70.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "16/03/2018" probabilidad de exito "40%" fecha estimada de ingreso "17/03/2018" tipo de oportunidad "Proyecto" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "70" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "130" ciudad a "Bogotá" ciudad b "" dirección ""
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS "Gelly Andrea Bustamante" Observacion "Pruebas factibilidad 12233"
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta

@CPOportunidadExpres70
Scenario: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta "Avantel S.A." el nombre "PRUEBA Auto1.1Factibilidad" el tipo de venta "Nuevo cliente" fecha estimada de venta "15/03/2018" probabilidad de exito "40%" fecha estimada de ingreso "16/03/2018" tipo de oportunidad "Express" contrato a meses "9" y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto "70" 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad "120" ciudad a "LIMA" ciudad b "" dirección ""
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Sitio A "ICA" ingresa datos de IPS "Gelly Andrea Bustamante" y Contacto Tecnico "FERNANDO PARRA" ganar "Ganar" con Motivo:"4" y Descripcion: "Ofera 12312"


#########################
#Aprobar Factibilidad

@ApruebaFactibilidad @CPOportunidadProyecto @CPOportunidadSolucion @CPOportunidadProyecto70
Scenario: Aprueba Factibilidad
Given me logueo al aplicativo Dynamics como "GBUSTAMANTE@INTERNEXA.COM" con pass "Febrero2018*"
When elijo Ventas luego Actividades 
Then se busca correo de solicitud de factibilidad 
And  se seleccion el correo que necesita aprobacion
And  se ingresa y se llenan datos requeridos, Sitio A "ICA"

@GeneraOferta @CPOportunidadProyecto @CPOportunidadSolucion @CPOportunidadProyecto70
Scenario: Oferta
Given me logueo al aplicativo Dynamics como "jbedoya@internexa.com" con pass "Mar2018*"
When elijo Ventas luego Factibilidad
Then se busca factibilidad estado Finalizada
And generar Oferta
And Ingresar datos de IPS "Gelly Andrea Bustamante" y Contacto Tecnico "FERNANDO PARRA" 
And se ingresa "Perder" con Motivo:"1" y Descripcion: "Ofera 12312"
##And se ingresa "Ganar" con Motivo:"4" y Descripcion: "Ofera 12312"

####   MOTIVO   Perder### 
#1 "Perdido por cliente canceló proyecto"                                                               
#2 "Perdido por cliente final no contrató servicio"                                                     
#3 "Perdido por costo de última milla"                                                                  
#4 "Perdido por factibilidad negativa"                                                                  
#5 "Perdido por fecha de entrega del servicio no alcanzable o viable"                                   
#6 "Perdido por no cumplimiento de los requisitos del proceso."                                         
#7 "Perdido por no participación ITX"                                                                   
#8 "Perdido por no reciprocidad comercial"                                                              
#9 "Perdido por oferta técnica"                                                                         
#10 "Perdido por precio"  
####333333333333333333333333333333   MOTIVO   Ganar### 
#1 "Ganado por mejor oferta económica" 
#2 "Ganado por reciprocidad comercial" 
#3 "Ganado por renovación contrato actual" 
#4 "Ganado por cobertura"
#5 "Ganado por mejor oferta técnica" 

