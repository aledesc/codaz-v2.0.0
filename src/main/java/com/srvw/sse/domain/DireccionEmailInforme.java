package com.srvw.sse.domain;

public class DireccionEmailInforme
{
	public static String NOMBRE="DireccionEmailInforme";
	
	private String emailInspector;
	private String emailCliente;
	private String emailInforme;
	private String emailOferta;
	
	public String getEmailInforme() {
		return emailInforme;
	}
	public void setEmailInforme(String emailInforme) {
		this.emailInforme = emailInforme;
	}
	public String getEmailOferta() {
		return emailOferta;
	}
	public void setEmailOferta(String emailOferta) {
		this.emailOferta = emailOferta;
	}
	
	public String getEmailInspector() {
		return emailInspector;
	}
	public void setEmailInspector(String emailInspector) {
		this.emailInspector = emailInspector;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	@Override
	public String toString() {
		return "DireccionEmailInforme [emailInspector=" + emailInspector + ", emailCliente=" + emailCliente
				+ ", emailInforme=" + emailInforme + ", emailOferta=" + emailOferta + "]";
	}
}

