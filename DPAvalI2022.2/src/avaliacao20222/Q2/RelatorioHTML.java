package avaliacao20222.Q2;

import model.Album;
import model.Livro;
import model.Obra;

public class RelatorioHTML implements Relatorio{

	public String formatoRelatorio(Obra obra, TipoRelatorio tipo) {
		if(obra instanceof Livro && tipo == TipoRelatorio.RESUMIDO) {
			Livro livro = (Livro) obra;
			return "<HTML>"+"\n"
				  +"<HEAD>"+"</HEAD>"+"\n"
			      +"<BOLD>"+"\n"
				  +"<!-- "+livro.getTitulo() + " -->" + "\n"
			      +"<bold>"+livro.getTitulo()+"</bold>"+"\n"
				  +"<italic>"+livro.getAutor() + " (" + livro.getAno() +")"+"</italic>"+"\n"
			      +"</BOLD>";
		}
		else if(obra instanceof Livro && tipo == TipoRelatorio.COMPLETO) {
			Livro livro = (Livro) obra;
			return "<HTML>"+"\n"
				  +"<HEAD>"+"</HEAD>"+"\n"
			      +"<BOLD>"+"\n"
				  +"<!-- "+livro.getTitulo() + " -->" + "\n"
			      +"<bold>"+livro.getTitulo()+"</bold>"+"\n"
				  +"<italic>"+livro.getAutor() + " (" + livro.getAno() +")"+"</italic>"+"\n"
			      +"Editora: "+livro.getEditora()+"\n"
			      +"Numero de paginas: "+livro.getAno()+"\n"
			      +"Avalicao: "+livro.getAvaliacao()
			      +"</BOLD>";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.RESUMIDO) {
			Album album = (Album) obra;
			return "<HTML>"+"\n"
					  +"<HEAD>"+"</HEAD>"+"\n"
				      +"<BOLD>"+"\n"
					  +"<!-- "+album.getTitulo() + " -->" + "\n"
				      +"<bold>"+album.getTitulo()+"</bold>"+"\n"
				      +"<italic>"+album.getAutor() + " " + album.getAno()+"</italic>"+"\n"
				      +"</BOLD>";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.COMPLETO) {
			Album album = (Album) obra;
			return "<HTML>"+"\n"
					  +"<HEAD>"+"</HEAD>"+"\n"
				      +"<BOLD>"+"\n"
					  +"<!-- "+album.getTitulo() + " -->" + "\n"
				      +"<bold>"+album.getTitulo()+"</bold>"+"\n"
				      +"<italic>"+album.getAutor() + " " + album.getAno()+"</italic>"+"\n"
				      +"Gravadora: "+album.getGravadora()+"\n"
				      +"Estudio: "+album.getEstudio()+"\n"
				      +"Avaliacao: "+album.getAvaliacao()+"\n"
				      +"</BOLD>";
		}
		else {
			return"";
		}
		
	}

	//public Relatorio clone() {
		//return new RelatorioHTML();
	//}
	
}
