package fazendoADiferenca;

public class HeartRates 
{
	private String name;
	private String sobreNome;
	private double idade;
	private double frequencia = 220;
	private double result;
	private double formula;
	//private double herart;
	


	public double getFormula() {
		return formula;
	}

	public void setFormula(double formula) {
		this.formula = formula;
	}

	public HeartRates (String name, double idade)
	{
		this.name = name;
		this.idade = idade; 
		//this.herart= herart;
	}
	
	public void formula(double herat)
	{
		herat = herat +( idade+frequencia);
	}
	
	public double getIdade()
	{
		return idade;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public double getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
	
	

}