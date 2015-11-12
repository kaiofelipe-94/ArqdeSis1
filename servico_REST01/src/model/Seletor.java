package model;


import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by kaio on 27/09/2015.
 */
public class Seletor
{
    private static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

    public Seletor(String url)
    {
    	veiculos = cadastroDeVeiculos(url);
    }

    private Veiculo buscarModelo(String modelo)
    {
        for (Veiculo veiculo : veiculos)
        {
            if (modelo.equals(veiculo.getModelo()))
            {
                return veiculo;
            }
        }
        return null;
    }

    public ArrayList<Veiculo> listarModelos(String cidade)
    {
        ArrayList<Veiculo> modelos = new ArrayList<Veiculo>();

        if(cidade.length() > 0)
        {
            modelos = buscarCidade(cidade);
        }
        else
        {
            modelos = todas();
        }

        return modelos;
    }

	public static void adicionar(TreeSet<Veiculo> carrinho, int id, int quantidade){
		
		for(Veiculo vei : veiculos){
			
			if(vei.getId()==id){
				
				vei.setQuantidade(quantidade);
				carrinho.add(vei);
				
			}
			
		}
		
		
	}
    
    private ArrayList<Veiculo> buscarCidade(String cidade)
    {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
        for (Veiculo veiculo : veiculos)
        {
            if (cidade.equals(veiculo.getCidade()))
            {
                lista.add(veiculo);
            }
        }
        return lista;
    }

    private ArrayList<Veiculo> todas()
    {
        ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
        for (Veiculo veiculo : veiculos)
        {
            lista.add(veiculo);
        }
        return lista;
    }

    private static ArrayList<Veiculo> cadastroDeVeiculos(String url)
    {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("Ford", "Fiesta", "ABC-1234", "Econômico com Ar", "São Paulo", "12.998", "41.90", "22.90", true, 1, url + "veiculo001.jpg"));

        veiculos.add(new Veiculo("Hyundai", "Sonata", "ABC-1235", "Executivo", "Guarulhos", "2.125", "131.90", "89.90", true, 2, url +  "veiculo002.jpg"));

        veiculos.add(new Veiculo("Puegeot", "308", "ABC-1236", "Intermediário Premium", "Rio de Janeiro", "6.954", "71.90", "42.90", true, 3, url +  "veiculo003.jpg"));
        
        veiculos.add(new Veiculo("Fiat", "Uno", "ABC-1237", "Econômico", "Rio de Janeiro", "12.979", "41.90", "22.90", true, 4, url + "veiculo004.jpg"));
        
        veiculos.add(new Veiculo("Hyundai", "Sonata", "ABC-1235", "Executivo", "São Paulo", "2.125", "131.90", "89.90", true, 2, url +  "veiculo005.jpg"));
        
        veiculos.add(new Veiculo("Hyundai", "HB-20", "ABC-1236", "Econômico com Ar", "Guarulhos", "22.125", "41.90", "22.90", true, 2, url +  "veiculo006.jpg"));
        
        veiculos.add(new Veiculo("Volksvagen", "Voyage", "ABC-1237", "intermadiário Sedan", "Rio de Janeiro", "13.477", "59.90", "33.90", true, 2, url +  "veiculo007.jpg"));
        
        veiculos.add(new Veiculo("Ford", "EcoSport", "ABC-1238", "SUV", "São Paulo", "1.997", "131.90", "89.90", true, 2, url +  "veiculo008.jpg"));
        
        veiculos.add(new Veiculo("Ford", "Ranger", "ABC-1239", "Pick-Up Luxo", "Guarulhos", "19.491", "141.90", "99.90", true, 2, url +  "veiculo009.jpg"));
        
        veiculos.add(new Veiculo("Chevrolet", "Cruze", "ABC-1240", "Executivo", "São Paulo", "2.483", "131.90", "89.90", true, 2, url +  "veiculo010.jpg"));
        
        veiculos.add(new Veiculo("Hyundai", "Tucson", "ABC-1241", "SUV", "Rio de Janeiro", "12.483", "131.90", "89.90", true, 2, url +  "veiculo011.jpg"));
        

        return veiculos;
    }
    
    public void alterarQuantidade(TreeSet<Veiculo> carrinho, int id, int quantidade){

		for(Veiculo vei: carrinho){
			
			if(vei.getId()==id){
				
				if(quantidade < 1){
					excluirDoCarrinho(carrinho,id);
				}else{
				vei.setQuantidade(quantidade);
				}
			}
			
		}
	
		
	}
	
	public void excluirDoCarrinho(TreeSet<Veiculo> carrinho, int id){
		
		Veiculo veiExcluir=null;
		
		for(Veiculo vei: carrinho){
			
			if(vei.getId()==id){
				
				veiExcluir = vei;
				break;
			}
			
		}
		if(veiExcluir != null){
			carrinho.remove(veiExcluir);
		}
		
		
	}	
}
