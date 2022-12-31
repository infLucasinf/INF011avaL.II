package avaliacao20222.Q1;

import model.Obra;

public class AdapterConversorJSON extends Obra {
	private ConversorJSON conversorJson;

	public AdapterConversorJSON(ConversorJSON conversorJson) {
		super(conversorJson);
		this.conversorJson = conversorJson;
	}

	public String convertendoJSON(Obra obra) {
		return conversorJson.convertendoJSON(obra);
	}

}