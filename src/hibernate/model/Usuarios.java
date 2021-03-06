package hibernate.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios entity. @author MyEclipse Persistence Tools
 */

public class Usuarios implements java.io.Serializable {

	// Fields

	private Integer id;
	private EstadoCivil estadoCivil;
	private DetallesEmpleado detallesEmpleado;
	private Roles roles;
	private String nombre;
	private String apellido;
	private String cedula;
	private String email;
	private String direccion;
	private String telefono;
	private Timestamp creacion;
	private Timestamp ultimaModificacion;
	private String foto;
	private Boolean activo;
	private Set pagoMeses = new HashSet(0);
	private Set identidads = new HashSet(0);
	private Set controlEmpleados = new HashSet(0);
	private Set bonos = new HashSet(0);
	private Set registroAccioneses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usuarios() {
	}

	/** minimal constructor */
	public Usuarios(Roles roles, String nombre, String apellido, String cedula,
			String email, String direccion, Timestamp creacion,
			Timestamp ultimaModificacion, Boolean activo) {
		this.roles = roles;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.email = email;
		this.direccion = direccion;
		this.creacion = creacion;
		this.ultimaModificacion = ultimaModificacion;
		this.activo = activo;
	}

	/** full constructor */
	public Usuarios(EstadoCivil estadoCivil, DetallesEmpleado detallesEmpleado,
			Roles roles, String nombre, String apellido, String cedula,
			String email, String direccion, String telefono,
			Timestamp creacion, Timestamp ultimaModificacion, String foto,
			Boolean activo, Set pagoMeses, Set identidads,
			Set controlEmpleados, Set bonos, Set registroAccioneses) {
		this.estadoCivil = estadoCivil;
		this.detallesEmpleado = detallesEmpleado;
		this.roles = roles;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.creacion = creacion;
		this.ultimaModificacion = ultimaModificacion;
		this.foto = foto;
		this.activo = activo;
		this.pagoMeses = pagoMeses;
		this.identidads = identidads;
		this.controlEmpleados = controlEmpleados;
		this.bonos = bonos;
		this.registroAccioneses = registroAccioneses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public DetallesEmpleado getDetallesEmpleado() {
		return this.detallesEmpleado;
	}

	public void setDetallesEmpleado(DetallesEmpleado detallesEmpleado) {
		this.detallesEmpleado = detallesEmpleado;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Timestamp getCreacion() {
		return this.creacion;
	}

	public void setCreacion(Timestamp creacion) {
		this.creacion = creacion;
	}

	public Timestamp getUltimaModificacion() {
		return this.ultimaModificacion;
	}

	public void setUltimaModificacion(Timestamp ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Set getPagoMeses() {
		return this.pagoMeses;
	}

	public void setPagoMeses(Set pagoMeses) {
		this.pagoMeses = pagoMeses;
	}

	public Set getIdentidads() {
		return this.identidads;
	}

	public void setIdentidads(Set identidads) {
		this.identidads = identidads;
	}

	public Set getControlEmpleados() {
		return this.controlEmpleados;
	}

	public void setControlEmpleados(Set controlEmpleados) {
		this.controlEmpleados = controlEmpleados;
	}

	public Set getBonos() {
		return this.bonos;
	}

	public void setBonos(Set bonos) {
		this.bonos = bonos;
	}

	public Set getRegistroAccioneses() {
		return this.registroAccioneses;
	}

	public void setRegistroAccioneses(Set registroAccioneses) {
		this.registroAccioneses = registroAccioneses;
	}

}