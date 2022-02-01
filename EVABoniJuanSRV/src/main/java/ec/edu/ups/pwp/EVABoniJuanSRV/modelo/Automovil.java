package ec.edu.ups.pwp.EVABoniJuanSRV.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_automovil")
public class Automovil {
	@Id
	@Column(name = "aut_placa")
	private String placa;
	@Column(name = "aut_modelo")
	private String modelo;
	@Column(name = "aut_marca")
	private String marca;
	@Column(name = "aut_tipo")
	private String Tipo;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	

}
