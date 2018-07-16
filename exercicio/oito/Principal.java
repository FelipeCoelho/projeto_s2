package testes2.exercicio.oito;

public class Principal {

	public static void main(String[] args) {
		int a = 10256;
		int b = 512;
		int c;
		String a_aux = String.valueOf(a);
		String b_aux = String.valueOf(b);
		String aux = "";
		int tamanho = a_aux.length() + b_aux.length();
		for (int i = 0; i < tamanho;i++){
			if(i < a_aux.length()){
				aux += a_aux.charAt(i);
			}
			if(i < b_aux.length()){
				aux += b_aux.charAt(i);				
			}
		}
		
		c = Integer.parseInt(aux);
		if(c > 1000000){
			c = -1;
		}
		System.out.println(c);
	}

}
