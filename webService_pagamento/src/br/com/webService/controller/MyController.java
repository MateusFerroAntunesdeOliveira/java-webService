package br.com.webService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.webService.dados.StaticBD;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() {
		return "index"; //WEB-INF/jsp/index.jsp
	}
	
	@RequestMapping("/test")
	public String bemVindo() {
		return "testeWebService"; //WEB-INF/jsp/bemVindo.jsp
	}
	
	@RequestMapping("/lista")
	public String get(Model model) {
		model.addAttribute("pagamentos", StaticBD.getPagamentos());
		return "lista-pagamentos"; //WEB-INF/jsp/lista-pagamentos.jsp
	}
}
