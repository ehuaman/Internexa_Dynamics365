package com.internexa.dynamics.steps;


import com.internexa.dynamics.pageObjects.GanarPerderOfertaPage;

public class GanarPerderOfertaSteps  {
	
	GanarPerderOfertaPage ganarPerderOfertaPage;
		
	public void buscarFactibilidad() {
		ganarPerderOfertaPage.buscarOferta();
	}
	public void generarOferta() {
		ganarPerderOfertaPage.CrearOferta();
		ganarPerderOfertaPage.OportunidadOfertaRelacionada();
	}
	public void IngresarIPSyTecnico(String NombreIPS, String ContactTecnico) {
		ganarPerderOfertaPage.SeleccionarContactoTecnico(ContactTecnico);
		ganarPerderOfertaPage.SeleccionarIPS(NombreIPS);
		//ganarPerderOfertaPage.Presentar();
	}
	
	public void seleccionarGanarPerder(String strGanarPerder, String strMotivo, String strDescrip, String strNomDocumento) {
		ganarPerderOfertaPage.EligeGanarPerder(strGanarPerder, strMotivo, strDescrip, strNomDocumento);
	}
	
	public void ganarPerderExpress(String strSitioA, String strSitioB, String strIPS, String strContactoTec) {
		ganarPerderOfertaPage.IngresarOfertaExpress( strSitioA, strSitioB, strIPS,  strContactoTec);
	}
	
	public void ganarPerderExpress300(String strNomAplicativo, String strNumUsuarios, String strIPS, String strContactoTec) {
		ganarPerderOfertaPage.IngresarOfertaExpress( strNomAplicativo, strNumUsuarios, strIPS,  strContactoTec);
	}
	
	public void eligeGanarPerder(String strGanarPerder , String strMotivo, String strDescrip, String strNomDocumento) {
		ganarPerderOfertaPage.EligeGanarPerder( strGanarPerder, strMotivo, strDescrip,strNomDocumento);
	}
	public void llenarContrato(String strmodoVenta, String strmodFactura, String strnomCuentaFactura) {
		ganarPerderOfertaPage.LlenarDatos_Contrato(strmodoVenta, strmodFactura, strnomCuentaFactura);
	}
	
	

}
