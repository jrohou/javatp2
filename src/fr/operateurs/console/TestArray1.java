package fr.operateurs.console;

import java.util.Arrays;

public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		System.out.println("***** L'array d'origine *****");
		System.out.println(Arrays.toString(array));
		
		System.out.println("\n***** L'array en fonction de sa taille *****");
		for (int i = 0; i < array.length; i++) {

		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("\n***** L'array à l'envers *****");
		for (int i = 0; i < array.length/2; i++) {
			
			int temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length -i -1] = temp;
		}
		System.out.println(Arrays.toString(array));
		
		System.out.println("\n***** L'array supérieur à 3 *****");
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]>3){
				System.out.println(array[i]);
			}
		}
		
		System.out.println("\n***** L'array aux paires *****");
		for (int i = 0; i < array.length; i++) {
			
			if (array[i]%2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("\n***** L'array du plus grand *****");
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]> max) {
				max = array[i];
			}
		}
		System.out.println(max);
		
		
		System.out.println("\n***** L'array du plus petit *****");
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]< min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}

}
