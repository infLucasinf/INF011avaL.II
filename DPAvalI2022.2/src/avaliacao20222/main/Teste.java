package avaliacao20222.main;

import avaliacao20222.Q1.AdapterConversorXML;
import avaliacao20222.Q1.AdapterConversorJSON;
import avaliacao20222.Q1.ConversorJSON;
import avaliacao20222.Q1.ConversorXML;
//import aval20222.q1.Conversor;
//import aval20222.q1.ConversorJSON;
//import aval20222.q1.ConversorXML;
//import aval20222.q2.Relatorio;
//import aval20222.q2.RelatorioHTML;
//import aval20222.q2.RelatorioLaTeX;
//import aval20222.q2.TipoRelatorio;
import model.Album;
import model.Obra;

public class Teste {

	public static void main(String args[]) {

		Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);

		ConversorJSON t3 = new ConversorJSON();

		AdapterConversorJSON a = new AdapterConversorJSON(t3);
		a.convertendoJSON(a);

		ConversorXML t2 = new ConversorXML();

		AdapterConversorXML b = new AdapterConversorXML(t2);
		b.convertendoXML(b);

	}

}
