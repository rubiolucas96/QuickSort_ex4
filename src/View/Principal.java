package View;

import Controller.Controller_QuickSort;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		Controller_QuickSort ordena = new Controller_QuickSort();
		vetor = ordena.quickSort(vetor, 0, vetor.length - 1);
		
		for (int valor: vetor) {
			System.out.print(valor + " ");
		}
	}

}
