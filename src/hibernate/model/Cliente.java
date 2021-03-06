package hibernate.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Cliente entity. @author MyEclipse Persistence Tools
 */

public class Cliente implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nombre;
	private String detalles;
	private Integer ruc;
	private String direccion;
	private String telefono;
	private Boolean activo;
	private Set controlEmpleados = new HashSet(0);

	// Constructors

	/** default constructor */
	public Cliente() {
	}

	/** minimal constructor */
	public Cliente(String nombre, String detalles, Integer ruc,
			String direccion, String telefono, Boolean activo) {
		this.nombre = nombre;
		this.detalles = detalles;
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.activo = activo;
	}

	/** full constructor */
	public Cliente(String nombre, String detalles, Integer ruc,
			String direccion, String telefono, Boolean activo,
			Set controlEmpleados) {
		this.nombre = nombre;
		this.detalles = detalles;
		this.ruc = ruc;
		this.direccion = direccion;
		this.telefono = telefono;
		this.activo = activo;
		this.controlEmpleados = controlEmpleados;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalles() {
		return this.detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	public Integer getRuc() {
		return this.ruc;
	}

	public void setRuc(Integer ruc) {
		this.ruc = ruc;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Set getControlEmpleados() {
		return this.controlEmpleados;
	}

	public void setControlEmpleados(Set controlEmpleados) {
		this.controlEmpleados = controlEmpleados;
	}

}