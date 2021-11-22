package test;




import com.ite.eventos.beans.Usuarios;
import com.ite.eventos.modelo.daos.IntUsuariosDao;
import com.ite.eventos.modelo.daos.UsuariosDaolmpl;

public class TestUsuarios {

	public static void main(String[] args) {
	
	IntUsuariosDao edao = new UsuariosDaolmpl();
	Usuarios uso = edao.findByNombrePasword("Periquito","Contrasena123");
	System.out.println(uso.toString());
	Usuarios ed = edao.findByNombrePasword("Grandote","Contrasena1234");
	System.out.println(ed);
	Usuarios eso = edao.findById(2);
	System.out.println(eso);
	/*for (Usuarios ele: edao.findAll())
		System.out.println(ele);*/
		System.out.println(edao.findByNombrePasword("Periquito","Contrase"));
		System.out.println(edao.findByNombrePasword("Periquio","Contrase"));

}

}
