package acessLogin;

public class UsuarioLogado {
	
	private Usuario logado;
		
	public void login(Usuario usuario){
		this.logado = usuario;
	}
	
	public Usuario getUsuario(){
		return logado;
	}
}
