package model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;




@Table(name = "tbl_cliente")
@Entity(name = "cliente")

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column (name = "apellidoMaterno")
	private  String ape_mate ;
	@Column (name = "apellidoPaterno")
	private String ape_pate;
	@Column (name = "nombres")
	private String name;
	
	@OneToMany(mappedBy = "cliente")
    private List<Cuenta> cuentas;
	
	@ManyToMany
    private List<Rol> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApe_mate() {
		return ape_mate;
	}

	public void setApe_mate(String ape_mate) {
		this.ape_mate = ape_mate;
	}

	public String getApe_pate() {
		return ape_pate;
	}

	public void setApe_pate(String ape_pate) {
		this.ape_pate = ape_pate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	
}
