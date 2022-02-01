package ec.edu.ups.pwp.EVABoniJuanSRV.ON;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pwp.EVABoniJuanSRV.DAO.AutomovilDAO;
import ec.edu.ups.pwp.EVABoniJuanSRV.modelo.Automovil;

@Local
public interface AutomovilONLocal {
	
	public void insertar(Automovil p) throws Exception;
	
	public List<Automovil> getAutomoviles();
	
	
}
