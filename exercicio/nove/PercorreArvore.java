package testes2.exercicio.nove;

public class PercorreArvore {

	public int calculaValor(BinaryTree binaryTree) {
		
		if(binaryTree != null ){			
			return calculaValor(binaryTree.getLeft()) + calculaValor(binaryTree.getRight()) + binaryTree.getValor();
		}
		return 0;
	}
}
