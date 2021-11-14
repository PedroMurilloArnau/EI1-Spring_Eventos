package com.ite.eventos.modelo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ite.eventos.modelo.daos.IntUsuariosDao;



@Controller

public class HomeController {
	@Autowired
	private IntUsuariosDao users;
	@GetMapping("/inicio")
	public String inicio (Model model) {
		model.addAttribute("mensaje", "Introduzca su nombre de usuario y contraseña");
		return "index";
		
	}


}