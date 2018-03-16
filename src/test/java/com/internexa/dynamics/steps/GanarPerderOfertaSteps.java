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
		ganarPerderOfertaPage.Presentar();
	}
	
	public void seleccionarGanarPerder(String strGanarPerder, String strMotivo, String strDescrip) {
		ganarPerderOfertaPage.EligeGanarPerder(strGanarPerder, strMotivo, strDescrip);
	}
	
	public void ganarPerderExpress(String strSitioA, String strSitioB, String strIPS, String strContactoTec, String strGanarPerder , String strMotivo, String strDescrip) {
		ganarPerderOfertaPage.IngresarOfertaExpress( strSitioA, strSitioB, strIPS,  strContactoTec,  strGanarPerder ,  strMotivo,  strDescrip);
	}
	
	public void ganarPerderExpress300(String strNomAplicativo, String strNumUsuarios, String strIPS, String strContactoTec, String strGanarPerder , String strMotivo, String strDescrip) {
		ganarPerderOfertaPage.IngresarOfertaExpress( strNomAplicativo, strNumUsuarios, strIPS,  strContactoTec,  strGanarPerder ,  strMotivo,  strDescrip);
	}

}
