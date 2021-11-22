package com.ite.eventos.modelo.beans;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ite.eventos.modelo.daos.IntEventoDao;
//import com.ite.eventos.modelo.daos.IntUsuariosDao;



@Controller

public class HomeController {
	@Autowired
	private IntEventoDao eve;
	
	@GetMapping("/inicio")
	public String inicio (Model model,HttpSession sesion) {
		
	
		model.addAttribute("mensaje", "La mejor compañía de gestión de eventos");
		if (sesion.getAttribute("usario") != null) {
		model.addAttribute("usuario",sesion.getAttribute("usario"));
		model.addAttribute("listaEventos", eve.findAll());
		}
		return "index";
		
	}
	
	@GetMapping("/Activos")
	public String mostrarActivos (Model model,HttpSession sesion) {
		model.addAttribute("mensaje", "La lista de eventos activos es :");
		if (sesion.getAttribute("usario") != null) {
		model.addAttribute("listaEventos", eve.findByEstado("Activos"));
		model.addAttribute("Detalle", "detalle");
		}
		return "index";
	}
	@GetMapping("/Destacados")
	public String mostrarDestacados (Model model,HttpSession sesion) {
		model.addAttribute("mensaje","La lista de eventos Destacados es :");
		if (sesion.getAttribute("usario") != null) {
		model.addAttribute("listaEventos", eve.findByEstado("s"));
		model.addAttribute("Detalle", "detalle");
		}
		return "index";
	}

}