package com.bpoplataforma.buscaeventos.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Evento {
	
	private long id;
	private String nombre;
	private String descripcion;
	private String lugar;
	private long ciudadId;
	private Date fechaComienzo;
	private Date fechaFin;
	private double lat;
	private double lon;
	private List<Comentario> comentarios;
	private List<Tag> tags;
	
	public Evento(long id, String nombre, String descripcion, String lugar, long ciudad, String fechaComienzo, String fechaFin, double lat, double lon) throws ParseException{
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.ciudadId = ciudad;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.ciudadId = ciudad;
		this.fechaComienzo = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(fechaComienzo);
		this.fechaFin = (Date) new SimpleDateFormat("dd-MM-yyyyy").parse(fechaFin);
		this.lat = lat;
		this.lon = lon;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setVenue(String lugar) {
		this.lugar = lugar;
	}
	public long getCiudadId() {
		return ciudadId;
	}
	public void setCiudadId(long ciudadId) {
		this.ciudadId = ciudadId;
	}
	
	public Date getFechaComienzo() {
		return fechaComienzo;
	}
	public void setComienzo(Date fechaComienzo) {
		this.fechaComienzo = fechaComienzo;
	}
	public Date getFin() {
		return fechaFin;
	}
	public void setFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}
