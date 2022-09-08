package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		
		var d2 = new Data(1,2,1984);
		
		var d3 = new Data(22,9,1970);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
	}
}
