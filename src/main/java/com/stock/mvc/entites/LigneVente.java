package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idVent")
	private Vente vente;

	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	
	
	public LigneVente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	
	
}
