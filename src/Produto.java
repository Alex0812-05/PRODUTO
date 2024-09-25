public class Produto {
	
	//atributos da classe Produto
	String nome;
	String marca;
	double precoCusto;
	double precoVenda;
	
	//Construção da classe Produto
	public Produto (String nome, String marca, double precoCusto, double precoVenda) {
	    this.nome = nome;
	    this.marca = marca;
	    this.precoCusto = precoCusto;
	    this.precoVenda = precoVenda;
	 }
	
	//Método de calculo do lucro do produto
	public double calcularLucro() {
		return this.precoVenda - this.precoCusto;
	 }
    
	//Método que exibe as informações do produto
	public void informacoes() {
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Marca do produto: " + this.marca);
		System.out.println("Preço de custo: " + this.precoCusto);
		System.out.println("Preço de venda: " + this.precoVenda);
	    System.out.println("Lucro: " + calcularLucro());
	 }

}

 