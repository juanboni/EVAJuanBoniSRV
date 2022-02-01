package ec.edu.ups.pwp.EVABoniJuanSRV.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;


import ec.edu.ups.pwp.EVABoniJuanSRV.ON.AutomovilONLocal;
import ec.edu.ups.pwp.EVABoniJuanSRV.modelo.Automovil;

@WebService

public class AutomovilesServiceSOAP {
	@Inject
	private AutomovilONLocal automovilON;
	
	@WebMethod
	public String crearAutomovil(Automovil autmoAutomovil) {
		try {
			automovilON.insertar(autmoAutomovil);
			return "Ok";
		} catch (Exception e) {
			// TODO: handle exception
			return "ERROR";
		}
	}
	@WebMethod
	public  List<Automovil> getAutomoviles(){
		return automovilON.getAutomoviles();
	}
}
