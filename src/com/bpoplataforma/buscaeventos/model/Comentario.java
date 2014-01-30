package com.bpoplataforma.buscaeventos.model;

public class Comentario {
	
	private long id;
	private long eventoId;
	private long usuarioId;
	private String texto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getEventoId() {
		return eventoId;
	}
	public void setEventoId(long eventoId) {
		this.eventoId = eventoId;
	}
	public long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(long usuarioId) {
		this.usuarioId = usuarioId;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	

}
