package avaliacao20222.Q2;

import model.Obra;

public interface Relatorio {
	public String formatoRelatorio(Obra obra, TipoRelatorio tipo);
	//public Relatorio clone();
}
//Essa é a segunda questão do trabalho, nós utilizamos o padrão prototype, onde temos a interface Relatorio, onde as classes concretas RelatorioLaTeX e RelatorioHTML implementam a interface Relatorio. 

