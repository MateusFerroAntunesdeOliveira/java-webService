package br.com.webService.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webService.dados.StaticBD;
import br.com.webService.dominio.Pagamento;

@RestController
public class Restful {

	//@RequestMapping("get-pagamento")
	//public Pagamento getPagamento(@PathVariable("id") int id) {
	//	Pagamento pagamento = StaticBD.getPagamentos().get(id);
	//	return pagamento; //WEB-INF/jsp/pagamento.jsp
	//}
	
	//@RequestMapping("get-pagamento")
	//public Pagamento getPagamento() {
	//	Pagamento pagamento = StaticBD.getPagamentos().get(2);
	//	return pagamento; //WEB-INF/jsp/pagamento.jsp
	//}
	
	@RequestMapping("get-pagamento/{data}")
	public List<Pagamento> getPagamento(@PathVariable("data") String data) {
		switch (data) {
			case "hoje":
				return StaticBD.getPagamentos().
						stream().
						filter(p -> p.getDataVencimento().equals(LocalDate.now()))
						.collect(Collectors.toList());
			case "todos":
				return StaticBD.getPagamentos();
			default:
				return null;
		}
	}
}
