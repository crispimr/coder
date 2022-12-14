package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto(0.15);	
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Media do carrinho: R$%.2f\n\n", mediaCarrinho);
		
		Produto p3 = new Produto("Celular", 900, 0.10);
		
		System.out.printf("Nome: %s\nPreco: R$%.2f\nDesconto: %.2f",
				p3.nome, p3.preco, p3.desconto);
	}
}
