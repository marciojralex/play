package models;


public class Mensagem {
	
	private Long id;
	private String mensagem;
	private Long usuarioId;

	
	public Mensagem() {
	}
	public Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Mensagem(Long id, String mensagem, Long usuarioId) {
		this.id = id;
		this.mensagem = mensagem;
		this.usuarioId = usuarioId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Long getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
	
}
