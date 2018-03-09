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
	public void IngresarIPSyTecnico(String NombreIPS, String ContaactTecnico) {
		ganarPerderOfertaPage.SeleccionarContactoTecnico(ContaactTecnico);
		ganarPerderOfertaPage.SeleccionarIPS(NombreIPS);
		ganarPerderOfertaPage.Presentar();
	}
	
	public void seleccionarGanarPerder(String strGanarPerder, String strMotivo, String strDescrip) {
		ganarPerderOfertaPage.EligeGanarPerder(strGanarPerder, strMotivo, strDescrip);
	}
	
	public void ganarPerderExpress(String strSitioA, String strIPS, String strContactoTec, String strGanarPerder , String strMotivo, String strDescrip) {
		ganarPerderOfertaPage.IngresarOfertaExpress( strSitioA,  strIPS,  strContactoTec,  strGanarPerder ,  strMotivo,  strDescrip);
	}

}
