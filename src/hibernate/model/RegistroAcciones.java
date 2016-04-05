package hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * RegistroAcciones entity. @author MyEclipse Persistence Tools
 */

public class RegistroAcciones implements java.io.Serializable {

	// Fields

	private Integer id;
	private Usuarios usuarios;
	private AccionTipo accionTipo;
	private Timestamp fecha;
	private Set controlEmpleadosForEntrada = new HashSet(0);
	private Set controlEmpleadosForSalida = new HashSet(0);

	// Constructors

	/** default constructor */
	public RegistroAcciones() {
	}

	/** minimal constructor */
	public RegistroAcciones(Usuarios usuarios, AccionTipo accionTipo,
			Timestamp fecha) {
		this.usuarios = usuarios;
		this.accionTipo = accionTipo;
		this.fecha = fecha;
	}

	/** full constructor */
	public RegistroAcciones(Usuarios usuarios, AccionTipo accionTipo,
			Timestamp fecha, Set controlEmpleadosForEntrada,
			Set controlEmpleadosForSalida) {
		this.usuarios = usuarios;
		this.accionTipo = accionTipo;
		this.fecha = fecha;
		this.controlEmpleadosForEntrada = controlEmpleadosForEntrada;
		this.controlEmpleadosForSalida = controlEmpleadosForSalida;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public AccionTipo getAccionTipo() {
		return this.accionTipo;
	}

	public void setAccionTipo(AccionTipo accionTipo) {
		this.accionTipo = accionTipo;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Set getControlEmpleadosForEntrada() {
		return this.controlEmpleadosForEntrada;
	}

	public void setControlEmpleadosForEntrada(Set controlEmpleadosForEntrada) {
		this.controlEmpleadosForEntrada = controlEmpleadosForEntrada;
	}

	public Set getControlEmpleadosForSalida() {
		return this.controlEmpleadosForSalida;
	}

	public void setControlEmpleadosForSalida(Set controlEmpleadosForSalida) {
		this.controlEmpleadosForSalida = controlEmpleadosForSalida;
	}

}