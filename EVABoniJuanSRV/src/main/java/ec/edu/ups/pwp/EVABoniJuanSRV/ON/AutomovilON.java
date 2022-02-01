package ec.edu.ups.pwp.EVABoniJuanSRV.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pwp.EVABoniJuanSRV.DAO.AutomovilDAO;
import ec.edu.ups.pwp.EVABoniJuanSRV.modelo.Automovil;

@Stateless
public class AutomovilON implements AutomovilONLocal{
	@Inject
	private AutomovilDAO automovildao;
	public void insertar(Automovil p) throws Exception{
		
		automovildao.insert(p);	
	}
	
	public List<Automovil> getAutomoviles(){
		return automovildao.getList();
	}
	
	
}
