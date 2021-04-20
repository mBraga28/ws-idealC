package entidadesM13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacao {
	
	private Date comentario;
	private String titulo;
	private String satisfacao;
	private Integer curtidas;
	
	private List<Comentario> coment = new ArrayList<>();
	
	public Publicacao() {
	}

	public Publicacao(Date comentario, String titulo, String satisfacao, Integer curtidas) {
		this.comentario = comentario;
		this.titulo = titulo;
		this.satisfacao = satisfacao;
		this.curtidas = curtidas;
	}

	public Date getComentario() {
		return comentario;
	}

	public void setComentario(Date comentario) {
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSatisfacao() {
		return satisfacao;
	}

	public void setSatisfacao(String satisfacao) {
		this.satisfacao = satisfacao;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getComent() {
		return coment;
	}
	
	public void addComentario(Comentario comentario) {
		coment.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		coment.remove(comentario);
	}
	

}
