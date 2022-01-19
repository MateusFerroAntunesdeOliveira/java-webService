package br.com.webService.dados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.webService.dominio.Pagamento;

public class StaticBD {
	private static List<Pagamento> pagamentos = new ArrayList<Pagamento>();
	
	static {
		pagamentos.add(new Pagamento(1, "Mouse", LocalDate.of(2022, 01, 19), 45.00, true));
		pagamentos.add(new Pagamento(2, "Teclado", LocalDate.of(2022, 01, 19), 445.00, true));
		pagamentos.add(new Pagamento(3, "PC", LocalDate.of(2022, 01, 19), 12225.00, false));
		pagamentos.add(new Pagamento(4, "HeadSet", LocalDate.of(2022, 01, 19), 645.00, true));
		pagamentos.add(new Pagamento(5, "Celular", LocalDate.of(2022, 01, 19), 1259.00, false));
		pagamentos.add(new Pagamento(6, "Tv", LocalDate.of(2022, 01, 19), 5000.00, true));
		pagamentos.add(new Pagamento(7, "Netflix", LocalDate.of(2022, 01, 19), 29.90, true));
	}
	
	public static List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
}
