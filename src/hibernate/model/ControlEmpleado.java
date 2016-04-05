package hibernate.model;

/**
 * ControlEmpleado entity. @author MyEclipse Persistence Tools
 */

public class ControlEmpleado implements java.io.Serializable {

	// Fields

	private Integer id;
	private Cliente cliente;
	private RegistroAcciones registroAccionesByEntrada;
	private RegistroAcciones registroAccionesBySalida;
	private Integer horasSuplementarias;
	private Integer horasExtras;

	// Constructors

	/** default constructor */
	public ControlEmpleado() {
	}

	/** minimal constructor */
	public ControlEmpleado(RegistroAcciones registroAccionesByEntrada,
			Integer horasSuplementarias, Integer horasExtras) {
		this.registroAccionesByEntrada = registroAccionesByEntrada;
		this.horasSuplementarias = horasSuplementarias;
		this.horasExtras = horasExtras;
	}

	/** full constructor */
	public ControlEmpleado(Cliente cliente,
			RegistroAcciones registroAccionesByEntrada,
			RegistroAcciones registroAccionesBySalida,
			Integer horasSuplementarias, Integer horasExtras) {
		this.cliente = cliente;
		this.registroAccionesByEntrada = registroAccionesByEntrada;
		this.registroAccionesBySalida = registroAccionesBySalida;
		this.horasSuplementarias = horasSuplementarias;
		this.horasExtras = horasExtras;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public RegistroAcciones getRegistroAccionesByEntrada() {
		return this.registroAccionesByEntrada;
	}

	public void setRegistroAccionesByEntrada(
			RegistroAcciones registroAccionesByEntrada) {
		this.registroAccionesByEntrada = registroAccionesByEntrada;
	}

	public RegistroAcciones getRegistroAccionesBySalida() {
		return this.registroAccionesBySalida;
	}

	public void setRegistroAccionesBySalida(
			RegistroAcciones registroAccionesBySalida) {
		this.registroAccionesBySalida = registroAccionesBySalida;
	}

	public Integer getHorasSuplementarias() {
		return this.horasSuplementarias;
	}

	public void setHorasSuplementarias(Integer horasSuplementarias) {
		this.horasSuplementarias = horasSuplementarias;
	}

	public Integer getHorasExtras() {
		return this.horasExtras;
	}

	public void setHorasExtras(Integer horasExtras) {
		this.horasExtras = horasExtras;
	}

}