package model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Table(name = "tbl_cuenta")
@Entity(name = "cuenta")

public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column(name = "activa")
	private int act ;
	@Column(name = "numeroCuenta")
	private  String  nro_cu ;
	@Column(name = "saldo")
	private double  saldo ;
	
	@OneToOne
	@JoinColumn(name = "tipoCuenta")
	private TipoDeCuenta tipodecuenta;	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAct() {
		return act;
	}
	public void setAct(int act) {
		this.act = act;
	}
	public String getNro_cu() {
		return nro_cu;
	}
	public void setNro_cu(String nro_cu) {
		this.nro_cu = nro_cu;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public TipoDeCuenta getTipodecuenta() {
		return tipodecuenta;
	}
	public void setTipodecuenta(TipoDeCuenta tipodecuenta) {
		this.tipodecuenta = tipodecuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
