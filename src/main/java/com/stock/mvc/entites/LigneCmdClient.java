package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCmdClient implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idLigneCmdClient;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandClt")
	private CommandeClient commandeClient;
	
	

	public LigneCmdClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdLigneCmdClient() {
		return idLigneCmdClient;
	}

	public void setIdLigneCmdClient(Long idLigneCmdClient) {
		this.idLigneCmdClient = idLigneCmdClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	

	
}
