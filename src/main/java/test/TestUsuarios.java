package test;




import com.ite.eventos.modelo.daos.IntUsuariosDao;
import com.ite.eventos.modelo.daos.UsuariosDaolmpl;

public class TestUsuarios {

	public static void main(String[] args) {
	
	IntUsuariosDao edao = new UsuariosDaolmpl();
	
	
		System.out.println(edao.findByNombrePasword("Periquito","Contraseña123"));
		System.out.println(edao.findByNombrePasword("Periquito","Contrase"));
		System.out.println(edao.findByNombrePasword("Periquio","Contrase"));

}

}
