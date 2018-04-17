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
And se ingresa informacion de contrato: Modo de Venta <TxtModoVenta>, Modo de facturación: <TxtModFactura>,Cuenta Facturacion: <TxtNomCuentaFactura>
And se ingresa ganar o perder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>, Si se gana Nombre Documento a cargar: <TxtNombreDocumento>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|FecEstimadaVenta|TxtProvExito|FecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCapacidad|TxtCiudadA|TxtCiudadB|TxtDireccion|TxtIps|TxtFactObsevacion|TxtUsuarioIps|TxtPassIps|TxtSitioA|TxtSitioB|TxtNomTecnico|TxtModoVenta|TxtModFactura|TxtNomCuentaFactura|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|TxtNombreDocumento|
##@externaldata@./src/test/resources/Datadriven/DataDrivenInternexa.xlsx@ProyectoSolucion
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto70.1 Proyecto Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Proyecto|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|ICA||FERNANDO PARRA|100000002-Cobro único|100000002-vencido|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto37.1 Proyecto Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Solución|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|ICA|CHICLAYO|FERNANDO PARRA|100000000-Cargo fijo mensual|100000000-Anticipado|Nuqui|Perder|4|Ofera 12312||

###EJECUCION CASO PRODUCTO 300

@CPGEneralSolucionProyectoConFactibilidad300
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <FecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <FecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto>
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad Ciudad principal <TxtCiudadPrincipal> capacidad <TxtCapacidad> MemoriaRAM <TxtMemoriaRAM> Categoría <TxtCategoria> Observación <TxtObservacion> Tipo de nube <TxtTipoNube>  
And se ingresa la factibilidad 
And se detallan datos de factibilidad IPS <TxtIps> Observacion <TxtFactObsevacion>
And se envia solicitud factibilidad verificar Nombre Aplicativo <TxtNombreAplicativo> Cuantos Usuarios acceden <TxtNumUsuarios>
##And se envia solicitud factibilidad //Se cambia por la linea anterior si el flujo es como los casos de los otros productos
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
And se ingresa informacion de contrato: Modo de Venta <TxtModoVenta>, Modo de facturación: <TxtModFactura>,Cuenta Facturacion: <TxtNomCuentaFactura>
And se ingresa ganar o perder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>, Si se gana Nombre Documento a cargar: <TxtNombreDocumento>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|FecEstimadaVenta|TxtProvExito|FecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCiudadPrincipal|TxtCapacidad|TxtMemoriaRAM|TxtCategoria|TxtObservacion|TxtTipoNube|TxtIps|TxtFactObsevacion|TxtUsuarioIps|TxtPassIps|TxtNombreAplicativo|TxtNumUsuarios|TxtNomTecnico|TxtModoVenta|TxtModFactura|TxtNomCuentaFactura|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|TxtNombreDocumento|
##@externaldata@./src/test/resources/Datadriven/DataDrivenInternexa.xlsx@ProyectoSolucion300
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Proyecto Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Proyecto|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Privada|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|Choucair|112|FERNANDO PARRA|100000002-Cobro único|100000002-vencido|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Solucion Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Solución|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Pública|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|Choucair|112|FERNANDO PARRA|100000005-Amortizaciones|100000002-vencido|Nuqui|Perder|4|Ofera 12312||
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Proyecto Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Proyecto|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Pública|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|Choucair|112|FERNANDO PARRA|100000004-Otros acuerdos|100000001-presente|Nuqui|Perder|4|Ofera 12312||
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Solucion Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Solución|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Privada|Gelly Andrea Bustamante|Pruebas factibilidad 12233|GBUSTAMANTE@INTERNEXA.COM|Abr2018*|Choucair|112|FERNANDO PARRA|100000003-Swaps|100000000-Anticipado|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|

@CPOportunidadExpres
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <DateFecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <DateFecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto> 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad capacidad <TxtCapacidad> ciudad a <TxtCiudadA> ciudad b <TxtCiudadB> dirección <TxtDireccion>
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Sitio A <TxtSitioA> Sitio B <TxtSitioB> ingresa datos de IPS <TxtNomIPS> y Contacto Tecnico <TxtNomTecnico> 
And se ingresa informacion de contrato: Modo de Venta <TxtModoVenta>, Modo de facturación: <TxtModFactura>,Cuenta Facturacion: <TxtNomCuentaFactura>
And se ingresa ganar o perder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>, Si se gana Nombre Documento a cargar: <TxtNombreDocumento>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|DateFecEstimadaVenta|TxtProvExito|DateFecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCapacidad|TxtCiudadA|TxtCiudadB|TxtDireccion|TxtSitioA|TxtSitioB|TxtNomIPS|TxtNomTecnico|TxtModoVenta|TxtModFactura|TxtNomCuentaFactura|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|TxtNombreDocumento|
##@externaldata@./src/test/resources/Datadriven/DataDrivenInternexa.xlsx@Express
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto70.1 Express Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|70|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|100000002-Cobro único|100000002-vencido|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto70.1 Express Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|70|47|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|100000003-Swaps|100000000-Anticipado|Nuqui|Perder|4|Ofera 12312||
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto40.1 Express Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|12|40|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|100000004-Otros acuerdos|100000001-presente|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto40.1 Express Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|40|120|LIMA|bogotá|Av Republica de Panama 1123|ICA||Gelly Andrea Bustamante|FERNANDO PARRA|100000005-Amortizaciones|100000002-vencido|Nuqui|Perder|4|Ofera 12312||
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto37.1 Express Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|37|120|LIMA|bogotá|Av Republica de Panama 1123|ICA|CHICLAYO|Gelly Andrea Bustamante|FERNANDO PARRA|100000000-Cargo fijo mensual|100000000-Anticipado|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto37.1 Express Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|10|37|120|LIMA|bogotá|Av Republica de Panama 1123|ICA|CHICLAYO|Gelly Andrea Bustamante|FERNANDO PARRA|100000001-Cargo variable mensual|100000001-presente|Nuqui|Perder|4|Ofera 12312||


@CPOportunidadExpres300
Scenario Outline: Creacion de Oportunidades
Given me logueo al aplicativo Dynamics como <TxtUsuario> con pass <TxtClave>
And elijo Ventas luego Oportunidades
When selecciono NUEVO
Then se presenta la pantalla de Nuevo Oportunidad y se ingresa la cuenta <TxtCuenta> el nombre <TxtNombreOportunidad> el tipo de venta <TxtTipoVenta> fecha estimada de venta <DateFecEstimadaVenta> probabilidad de exito <TxtProvExito> fecha estimada de ingreso <DateFecEstimadaIncio> tipo de oportunidad <TxtTipoOportunidad> contrato a meses <TxtContratoMeses> y se guarda la oportunidad
And se ingresa a la oportunidad y se elige la opcion y  se ingresa el producto <TxtCodigoProducto> 
And se ingresa a la pagina de propiedades del producto se elige las instancias requeridas y que posean campo de valor propiedad vacio se valida el tipo de dato y se ingresa para agregar valor propiedad Ciudad principal <TxtCiudadPrincipal> capacidad <TxtCapacidad> MemoriaRAM <TxtMemoriaRAM> Categoría <TxtCategoria> Observación <TxtObservacion> Tipo de nube <TxtTipoNube>
And se ingresa a crear la oferta Express se ingresa y se llenan datos requeridos, Nombre Aplicativo <TxtNombreAplicativo> Cuantos Usuarios acceden <TxtNumUsuarios> ingresa datos de IPS <TxtNomIPS> y Contacto Tecnico <TxtNomTecnico> 
And se ingresa informacion de contrato: Modo de Venta <TxtModoVenta>, Modo de facturación: <TxtModFactura>,Cuenta Facturacion: <TxtNomCuentaFactura>
And se ingresa ganar o perder <TxtSelecGanarPerder> con Motivo:<TxtMotivoGanarPerder> y Descripcion: <TxtDescripGanarPerder>, Si se gana Nombre Documento a cargar: <TxtNombreDocumento>

Examples:
|TxtUsuario|TxtClave|TxtCuenta|TxtNombreOportunidad|TxtTipoVenta|DateFecEstimadaVenta|TxtProvExito|DateFecEstimadaIncio|TxtTipoOportunidad|TxtContratoMeses|TxtCodigoProducto|TxtCiudadPrincipal|TxtCapacidad|TxtMemoriaRAM|TxtCategoria|TxtObservacion|TxtTipoNube|TxtNombreAplicativo|TxtNumUsuarios|TxtNomIPS|TxtNomTecnico|TxtModoVenta|TxtModFactura|TxtNomCuentaFactura|TxtSelecGanarPerder|TxtMotivoGanarPerder|TxtDescripGanarPerder|TxtNombreDocumento|
##@externaldata@./src/test/resources/Datadriven/DataDrivenInternexa.xlsx@Express300
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Express Ganar Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Privada|Choucair|123|Gelly Andrea Bustamante|FERNANDO PARRA|100000000-Cargo fijo mensual|100000001-presente|Nuqui|Ganar|4|Ofera 12312|C:/Users/Administrador/Documents/COLOMBIA-ProyectoINTERNEXA/Documento de orden de servicio Prueba Auto.txt|
|jbedoya@internexa.com|Abr2018*|Avantel S.A.|PRUEBA Auto300.1 Express Perder Oferta|Nuevo cliente|23/04/2018|40%|24/04/2018|Express|9|300|CAJAMARCA|170|300|SCADA|Observacion 300|Pública|Choucair|123|Gelly Andrea Bustamante|FERNANDO PARRA|100000002-Cobro único|100000000-Anticipado|Nuqui|Perder|4|Ofera 12312||
