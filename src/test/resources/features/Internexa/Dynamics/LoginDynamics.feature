@Critico
	Feature: Creacion Nueva Oportunidad
	I want to use this template for my feature file

#Nuevo Caso de prueba con TIPO DE OPORTUNIDAD: Proyecto

@CPGEneralSolucionProyectoConFactibilidad
Scenario Outline: Creacion de Oportunidad
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <FecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <FecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto>
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad <TxtCapacidad> ciudad a <TxtCiudadA> ciudad b <TxtCiudadB> dirección <TxtDireccion>
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS <TxtIps> Observacion <TxtFactObsevacion>
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta
##FACTIBILIDAD
And me logueo al aplicativo Dynamics como <TxtUsuarioIps> con pass <TxtPassIps>
And elijo Ventas luego Actividades 
And se busca correo de solicitud de factibilidad 
And  se seleccion el correo que necesita aprobacion
And  se ingresa y se llenan datos requeridos, Sitio A <TxtSitioA> Sitio B <TxtSitioB>
And se cierra sesión de Gerente Cuenta
##GanarPerderOferta
And me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Factibilidad
And se busca factibilidad estado Finalizada
And generar Oferta
And Ingresar datos de IPS <TxtIps> y Contacto Tecnico <TxtNomTecnico>
And se ingresa ganarPerder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|FecEstimadaVenta|TxtProvExito|FecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCapacidad|TxtCiudadA|TxtCiudadB|TxtDireccion|TxtIps|TxtFactObsevacion|TxtUsuarioIps|TxtPassIps|TxtSitioA|TxtSitioB|TxtNomTecnico|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|
##@externaldata@./src/test/resources/Datadriven/Express300.xlsx@ProyectoSolucion
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Proyecto Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Solucion Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Proyecto Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA|CHICLAYO|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Solucion Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA|CHICLAYO|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Proyecto Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Solucion Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Proyecto Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Solucion Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Proyecto Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA|CHICLAYO|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Solucion Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA|CHICLAYO|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Proyecto Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Solucion Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|ICA||FERNANDO PARRA|Perder|4|Ofera 12312|

###EJECUCION CASO PRODUCTO 300

@CPGEneralSolucionProyectoConFactibilidad300
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <FecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <FecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto>
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad Ciudad principal <TxtCiudadPrincipal> capacidad <TxtCapacidad> MemoriaRAM <TxtMemoriaRAM> Categoría <TxtCategoria> Observación <TxtObservacion>  
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS <TxtIps> Observacion <TxtFactObsevacion>
And se envia solicitud factibilidad
And se cierra sesión de Gerente Cuenta
##Factibilidad
And me logueo al aplicativo Dynamics como <TxtUsuarioIps> con pass <TxtPassIps>
And elijo Ventas luego Actividades 
And se busca correo de solicitud de factibilidad 
And  se seleccion el correo que necesita aprobacion
And  se ingresa y se llenan datos requeridos, Nombre Aplicativo <TxtNombreAplicativo> Cuantos Usuarios acceden <TxtNumUsuarios>
And se cierra sesión de Gerente Cuenta
##GanarPerderOferta
And me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Factibilidad
And se busca factibilidad estado Finalizada
And generar Oferta
And Ingresar datos de IPS <TxtIps> y Contacto Tecnico <TxtNomTecnico>
And se ingresa ganarPerder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|FecEstimadaVenta|TxtProvExito|FecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCiudadPrincipal|TxtCapacidad|TxtMemoriaRAM|TxtCategoria|TxtObservacion|TxtIps|TxtFactObsevacion|TxtUsuarioIps|TxtPassIps|TxtNombreAplicativo|TxtNumUsuarios|TxtNomTecnico|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|
##@externaldata@./src/test/resources/Datadriven/Express300.xlsx@ProyectoSolucion300
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Proyecto Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|Choucair|112|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Solucion Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|Choucair|112|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Proyecto Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Proyecto|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|Choucair|112|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Solucion Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Solucion|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Mar2018*|Choucair|112|FERNANDO PARRA|Ganar|4|Ofera 12312|

@CPOportunidadExpres
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <DateFecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <DateFecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto> 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad <TxtCapacidad> ciudad a <TxtCiudadA> ciudad b <TxtCiudadB> dirección <TxtDireccion>
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Sitio A <TxtSitioA> Sitio B <TxtSitioB> ingresa datos de IPS <TxtNomIPS> y Contacto Tecnico <TxtNomTecnico> ganar <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|DateFecEstimadaVenta|TxtProvExito|DateFecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCapacidad|TxtCiudadA|TxtCiudadB|TxtDireccion|TxtSitioA|TxtSitioB|TxtNomIPS|TxtNomTecnico|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|
##@externaldata@./src/test/resources/Datadriven/Express300.xlsx@Express
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Express Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|12|40|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Express Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|ICA|CHICLAYO|Gelly Andrea Bustamante|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Express Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|70|47|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto40.1 Express Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto37.1 Express Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|10|37|120|LIMA|bogotá|Av Republica de Panama 1123|ICA|CHICLAYO|Gelly Andrea Bustamante|FERNANDO PARRA|Perder|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto70.1 Express Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|Perder|4|Ofera 12312|


@CPOportunidadExpres300
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <DateFecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <DateFecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto> 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad Ciudad principal <TxtCiudadPrincipal> capacidad <TxtCapacidad> MemoriaRAM <TxtMemoriaRAM> Categoría <TxtCategoria> Observación <TxtObservacion> 
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Nombre Aplicativo <TxtNombreAplicativo> Cuantos Usuarios acceden <TxtNumUsuarios> ingresa datos de IPS <TxtNomIPS> y Contacto Tecnico <TxtNomTecnico> ganar <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|DateFecEstimadaVenta|TxtProvExito|DateFecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCiudadPrincipal|TxtCapacidad|TxtMemoriaRAM|TxtCategoria|TxtObservacion|TxtNombreAplicativo|TxtNumUsuarios|TxtNomIPS|TxtNomTecnico|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|
##@externaldata@./src/test/resources/Datadriven/Express300.xlsx@Express300
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Express Ganar Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Choucair|123|Gelly Andrea Bustamante|FERNANDO PARRA|Ganar|4|Ofera 12312|
|jbedoya@internexa.com|Mar2018*|Avantel S.A.|PRUEBA Auto300.1 Express Perder Oferta|Nuevo cliente|27/03/2018|40%|28/03/2018|Express|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Choucair|123|Gelly Andrea Bustamante|FERNANDO PARRA|Perder|4|Ofera 12312|
