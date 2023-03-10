package avaliacao20222.Q2;

import model.Album;
import model.Livro;
import model.Obra;

public class RelatorioLATEX implements Relatorio{

	public String formatoRelatorio(Obra obra, TipoRelatorio tipo) {
		if(obra instanceof Livro && tipo == TipoRelatorio.RESUMIDO) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
			      +"\textbf {"+livro.getTitulo()+"}" + "\n"
			      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}";
		}
        else if(obra instanceof Livro && tipo == TipoRelatorio.COMPLETO) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
		      +"\textbf {"+livro.getTitulo()+"}" + "\n"
		      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}"+"\n"
		      +"Editora: " +livro.getEditora()+"\n"
		      +"Numero de paginas: "+livro.getNumeroPaginas()+"\n"
		      +"Avaliacao: "+livro.getAvaliacao();
        }
		else if(obra instanceof Album && tipo == TipoRelatorio.RESUMIDO) {
			Album album = (Album) obra;
			return "% " + album.getTitulo() + "\n"
			      +"\textbf {"+album.getTitulo()+"}" + "\n"
			      +"emph{"+album.getAutor()+ " "+album.getAno()+"}";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.COMPLETO) {
			Album album = (Album) obra;
			return "% " + album.getTitulo() + "\n"
			      +"\textbf {"+album.getTitulo()+"}" + "\n"
			      +"emph{"+album.getAutor()+ " "+album.getAno()+"}" + "\n"
			      +"Gravadora: " +album.getGravadora() + "\n"
			      +"Estudio: "+album.getEstudio() + "\n"
			      +"Avaliacao: " + album.getAvaliacao();
		}
		else {
			return "";
		}
		
	}

	//public Relatorio clone() {
		//return new RelatorioLATEX();
	//}
	
}
