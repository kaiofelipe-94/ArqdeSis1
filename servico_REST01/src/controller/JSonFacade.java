package controller;

import java.util.*;  
import model.Veiculo; 
import org.json.JSONArray; 
import org.json.JSONException; 
import org.json.JSONObject; 

public class JSonFacade 
{
	public static String listToJSon(ArrayList<Veiculo> lista) 
	{    
		JSONArray vetor = new JSONArray();   
		for (Veiculo veiculo : lista) 
		{    
			JSONObject object = new JSONObject();    
			try 
			{     
				object.put("marca", veiculo.getMarca());  
				object.put("classe", veiculo.getClasse());
				object.put("cidade", veiculo.getCidade());
				object.put("km", veiculo.getKm());
				object.put("imagem", veiculo.getImagem());
				object.put("tarKmLivre", veiculo.getTarKmLivre());
				object.put("tarKmControlado", veiculo.getTarKmControlado());
				object.put("modelo", veiculo.getModelo());
				object.put("placa", veiculo.getPlaca());  
							   
				vetor.put(object);    
			} 
			catch (JSONException e) 
			{     
				e.printStackTrace();    
			}   
		}    
		return vetor.toString();  }
}
