package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("***** Application Opérateurs *****");
		System.out.println("Veuillez saisir le premier nombre : ");
		int value1 = reader.nextInt();
		System.out.println("Très bien. Veuillez saisie le second nombre : ");
		int value2 = reader.nextInt();
		
		System.out.println("L'addition de ces deux nombres fait : "+ (value1 + value2));
		System.out.println("La soustraction de ces deux nombres fait : "+ (value1 - value2));
		
	}

}
