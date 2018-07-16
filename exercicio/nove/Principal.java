package testes2.exercicio.nove;

public class Principal {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(1);
		binaryTree.setLeft(new BinaryTree());
		binaryTree.getLeft().setValor(2);
		binaryTree.setRight(new BinaryTree());
		binaryTree.getRight().setValor(3);

		PercorreArvore percorreArvore = new PercorreArvore();

		System.out.println(percorreArvore.calculaValor(binaryTree));
	}

}
