package model;

/**
 * Created by kaio on 27/09/2015.
 */
public class Veiculo implements Comparable<Veiculo>
{

    private String marca;
    private String modelo;
    private String placa;
    private String classe;
    private String imagem;
    private String cidade;
    private String km;
    private String tarKmLivre;
    private String tarKmControlado;
    private boolean disponivel;
    private int id;
    private int quantidade;

    public Veiculo(String marca, String modelo, String placa, String classe, String cidade, String km, String tarKmLivre, String tarKmControlado, boolean disponivel, int id, String imagem)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.classe = classe;
        this.cidade = cidade;
        this.km = km;
        this.tarKmLivre = tarKmLivre;
        this.tarKmControlado = tarKmControlado;
        this.disponivel = disponivel;
        this.id = id;
        this.imagem = imagem;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public String getPlaca()
    {
        return placa;
    }

    public String getClasse()
    {
        return classe;
    }

    public String getCidade()
    {
        return cidade;
    }

    public String getKm()
    {
        return km;
    }

    public String getTarKmLivre()
    {
        return tarKmLivre;
    }

    public String getTarKmControlado()
    {
        return tarKmControlado;
    }

    public boolean isDisponivel()
    {
        return disponivel;
    }

    public int getId()
    {
        return id;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public void setClasse(String classe)
    {
        this.classe = classe;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public void setKm(String km)
    {
        this.km = km;
    }

    public void setTarKmLivre(String tarKmLivre)
    {
        this.tarKmLivre = tarKmLivre;
    }

    public void setTarKmControlado(String tarKmControlado)
    {
        this.tarKmControlado = tarKmControlado;
    }

    public void setDisponivel(boolean disponivel)
    {
        this.disponivel = disponivel;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getImagem()
    {
        return imagem;
    }

    public void setImagem(String imagem)
    {
        this.imagem = imagem;
    }

    public int getQuantidade()
	{
		return quantidade;
	}

	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}

	@Override
    public String toString()
    {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", classe=" + classe +
                ", cidade='" + cidade + '\'' +
                ", km='" + km + '\'' +
                ", tarKmLivre='" + tarKmLivre + '\'' +
                ", tarKmControlado='" + tarKmControlado + '\'' +
                ", disponivel=" + disponivel +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Veiculo veiculo)
    {
        if (marca.equals(veiculo.getMarca())
                && modelo.equals(veiculo.getModelo())
                && placa.equals(veiculo.getPlaca()))
        {
            return 0;
        }
        return this.getModelo().compareTo(veiculo.getMarca());
    }

}
