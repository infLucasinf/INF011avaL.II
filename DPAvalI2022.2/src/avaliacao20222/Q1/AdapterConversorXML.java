package avaliacao20222.Q1;

import model.Obra;

public class AdapterConversorXML extends Obra {
	private ConversorXML conversorXml;

	public AdapterConversorXML(ConversorXML conversorXml) {
		super(conversorXml);
		this.conversorXml = conversorXml;
	}

	public String convertendoXML(Obra obra) {
		return conversorXml.convertendoXML(obra);
	}

}