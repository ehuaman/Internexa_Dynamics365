package com.internexa.dynamics.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import com.internexa.dynamics.pageObjects.OportunidadPage;
import com.internexa.dynamics.pageObjects.Producto40LASTMILENACIONALEditarPage;
import com.internexa.dynamics.pageObjects.Prd70InternexaIPAccessNGEditarPage;


public class BuscarProductoPage extends PageObject {
	
	Producto40LASTMILENACIONALEditarPage producto40LASTMILENACIONALEditarPage;
	OportunidadPage oportunidadPage;
	Prd70InternexaIPAccessNGEditarPage prd70InternexaIPAccessNGEditarPage;
	Prd37CarrieEthernetNacionalPuntoApuntoPage prd37CarrieEthernetNacionalPuntoApuntoPage;
	Prd300IaaSPage prd300IaaSPage;

	public void seleccionarProducto(String Dato1, String Dato2, String Dato3, String Dato4, String Dato5,String Dato6) {
		//Internexa Last Mile Nacional
		if (OportunidadPage.codigoProductoRegistar.equals("40")) {
			producto40LASTMILENACIONALEditarPage.encontrarOportunidad(Dato1, Dato2,  Dato3, Dato4,"");
		}
		//Internexa IP Access NG
		else if (OportunidadPage.codigoProductoRegistar.equals("70")) {
			prd70InternexaIPAccessNGEditarPage.encontrarOportunidad(Dato1, Dato2, "");
		}
		//Internexa Carrier Ethernet Nacional punto a punto
		else if (OportunidadPage.codigoProductoRegistar.equals("37")) {
			prd37CarrieEthernetNacionalPuntoApuntoPage.encontrarOportunidad(Dato1, Dato2,  Dato3, "","");		
		}
		//IaaS
		else if (OportunidadPage.codigoProductoRegistar.equals("300")) {
			prd300IaaSPage.encontrarOportunidad(Dato1, Dato2,  Dato3, Dato4,Dato5,Dato6,"","");
		}
	}
	public void seleccionProdFact(String Dato1,String Dato2) {
		//Internexa Last Mile Nacional
		if (OportunidadPage.codigoProductoRegistar.equals("40")) {
			producto40LASTMILENACIONALEditarPage.encontrarOportunidad("", "",  "", "",Dato1);
		}
		//Internexa IP Access NG
		else if (OportunidadPage.codigoProductoRegistar.equals("70")) {
			prd70InternexaIPAccessNGEditarPage.encontrarOportunidad("", "", Dato1);
		}
		//Internexa Carrier Ethernet Nacional punto a punto
		else if (OportunidadPage.codigoProductoRegistar.equals("37")) {
			prd37CarrieEthernetNacionalPuntoApuntoPage.encontrarOportunidad("", "",  "", Dato1,Dato2);
		}
		//IaaS
		else if (OportunidadPage.codigoProductoRegistar.equals("300")) {
			prd300IaaSPage.encontrarOportunidad("", "","","","","",Dato1,Dato2);
		}
	}
	
	
}
