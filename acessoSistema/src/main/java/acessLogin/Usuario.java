package acessLogin;

import java.util.Date;

public class Usuario {
	
	private String login;
	private String senha;
	private Date dataValidade;
	
	public Usuario() {
	}

	public Usuario(String login, String senha, Date dataValidade) {
		this.login = login;
		this.senha = senha;
		this.dataValidade = dataValidade;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	
	public Date getDataValidade() {
		return dataValidade;
    }
}