package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Table(name = "tbl_movimiento")
@Entity(name = "movimiento")
public class Movimiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column (name = "descripcion")
	private String des;
	@Column (name = "fecha")
	private LocalDate fec;
	@Column (name = "monto")
	private double mont;
	
	@ManyToOne
	@JoinColumn(name = "cuenta_id")
	private Cuenta cuenta;

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public LocalDate getFec() {
		return fec;
	}

	public void setFec(LocalDate localDate) {
		this.fec = localDate;
	}

	public double getMont() {
		return mont;
	}

	public void setMont(double mont) {
		this.mont = mont;
	}

	

}
