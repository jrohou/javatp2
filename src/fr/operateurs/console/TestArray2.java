package fr.operateurs.console;

import java.util.Arrays;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		
		System.out.println("***** L'array d'origine *****");
		System.out.println(Arrays.toString(array));
		
		System.out.println("\n***** L'array des moyennes *****");
		
		int somme = 0;
		float moyenne = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			somme += array[i];
			
		}
		
		moyenne = somme / array.length;
		
		System.out.println(moyenne);
		
		System.out.println("\n***** L'array de l'index *****");
		
		System.out.println(Arrays.asList(array).indexOf(15));
		
	}
	

}
