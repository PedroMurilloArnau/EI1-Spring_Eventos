package com.ite.eventos.modelo.beans;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ite.eventos.beans.Evento;
import com.ite.eventos.beans.Reservas;
import com.ite.eventos.beans.Usuarios;
import com.ite.eventos.modelo.daos.IntEventoDao;
import com.ite.eventos.modelo.daos.IntReservasDao;
import com.ite.eventos.modelo.daos.IntUsuariosDao;




@Controller
public class GestionEventos {

@Autowired
private IntUsuariosDao users ;
@Autowired
private IntEventoDao iva;
@Autowired
private IntReservasDao res;

@GetMapping("/login")
public String login (Model model) {
	model.addAttribute("mensaje", "Introduzca su nombre de usuario y contraseña");
	return "login";
}
@PostMapping("/login")
public String logearse (RedirectAttributes atts, @RequestParam("userName") String userName,@RequestParam("pasword") String pasword, HttpSession sesion) {
	System.out.println(userName);
	System.out.println(pasword);
	
	Usuarios user = users.findByNombrePasword(userName, pasword);
	System.out.println(user);
	
	if (user == null)
		atts.addFlashAttribute("mensajelogin","Login incorrecto");
		
	else {
		sesion.setAttribute("usario", user.getIdUsuario());
		atts.addFlashAttribute("mensajelogin", "Login correcto").addFlashAttribute("Prop",user.getNombre()).addFlashAttribute(user);
	}
	/*
	Usuarios uso = users.findByNombrePasword(usuario.getUserName(), usuario.getPasword());
	
	System.out.println(uso.toString());*/
	//para ir a un metodo Get Maping
	
	return "redirect:/inicio";
	
}
@GetMapping("/cerrarSesion")
public String logout(HttpSession sesion){
	sesion.removeAttribute("usario");
	sesion.removeAttribute("1");
	sesion.removeAttribute("2");
	sesion.removeAttribute("3");
	sesion.removeAttribute("4");
	sesion.removeAttribute("5");
	sesion.removeAttribute("6");
	return "redirect:/login";
}
@GetMapping("/detalle")
 String editar(Model model,@RequestParam("id") int idEvento) {
	Evento evento = iva.findById(idEvento);
	/*System.out.println("El evento recogido es el" + evento);*/
	model.addAttribute("evento", evento);
	return "detalle";
	
}
@PostMapping("/reservar/{id}")
public String abrirReservas(RedirectAttributes atts,@PathVariable("id") int idProducto,@RequestParam("cantidad") int cantid, HttpSession sesion) {
	
	int canti = cantid;
	String idRes= String.valueOf(idProducto);
	System.out.println("El atributo es"+idRes);
	
	if(sesion.getAttribute(idRes)== null) {
		sesion.setAttribute(idRes, cantid);
	}
	else {
		int sume = (int) sesion.getAttribute(idRes);
		cantid = sume + cantid;
		if(cantid > 10) {
			atts.addFlashAttribute("mensajelogin", "No puedes realizar más de 10 plazs de este evento, Melon!");
			return "redirect:/inicio";
		}
		else {
			System.out.println("El acumuluado del reserva de ese evento es" + cantid);
		sesion.setAttribute(idRes, cantid);
		
	}
	
	}
	
	System.out.println("Se gestiona la reserva del evento de id = "+ idProducto);
	Evento eve = iva.findById(idProducto);
	int cantidad = eve.getAforoMaximo();
	int userid = (int) sesion.getAttribute("usario");
	Reservas rso = new Reservas();
	List<Reservas> ivar = res.findAll();
	int total = ivar.size();
	System.out.println("El size inicial de reservas es de " + total);
	rso.setCantidad(canti);
	rso.setEvento(iva.findById(idProducto));
	rso.setPrecioVenta(eve.getPrecio());
	rso.setUsuario(users.findById(userid));
	res.addReserva(rso);
	System.out.println("La reserva sera la siguiente " + rso);
	List<Reservas> ivor = res.findAll();
	int totali = ivor.size();
	System.out.println("El size inicial de reservas es de " + totali);
	
	if (totali-total != 0) {
		atts.addFlashAttribute("mensajelogin", "Todo correcto, mensaje reserva realizada.");
		eve.setAforoMaximo(cantidad- canti);
	}
	
	else {
		atts.addFlashAttribute("mensajelogin", "Problemas al dar de alta, reserva no realizada.");
	}
	
	return "redirect:/inicio";
}
}

