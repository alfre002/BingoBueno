package bingo;

public class Bingo {

	public static void main(String[] args) {
		
	//intro

	System.out.println("BINGO IES MARTÍNEZ MONTAÑÉS");
	System.out.println("        PREMIOS");
	System.out.println("     Línea: 100 $");
	System.out.println("     Bingo: 500 $");


	System.out.println(" ");
	System.out.println(" ");

	//Jugador 1

	System.out.println("      Jugador 1");
	for (int i = 1; i <= 23; i++) {
	System.out.print("-");		
	}
		
	System.out.println(" ");

	//definición del cartón 1

	int[][] carton1 = new int[2][4];

	//columnas
	
	for (int columnas1 = 1; columnas1 <= 3; columnas1++) {
		
		//definición de las tiradas
		
		int tirada = (int)(Math.random()*9+1);
		int tirada2 = (int)(Math.random()*10+10);
		int tirada3 = (int)(Math.random()*10+20);
		int tirada4 = (int)(Math.random()*10+30);
		int tirada5 = (int)(Math.random()*10+40);
		
		//columna 1
		System.out.print(tirada);
		
		//columna 2
		
		System.out.print(" |" + " " + tirada2);
		
		//columna 3
		
		System.out.print(" |" + " " + tirada3);
		
		//columna 4
		
		System.out.print(" |" + " " + tirada4);
		
		//columna 5
		
		System.out.print(" |" + " " + tirada5);
		System.out.println(" |");
		}
	
		for (int i = 1; i <= 23; i++) {
			System.out.print("-");		
		}
	
		System.out.println(" ");
		System.out.println(" ");

		
		
	//Jugador 2

	System.out.println("      Jugador 2");
	for (int i = 1; i <= 23; i++) {
	System.out.print("-");
			
	}
		
	System.out.println(" ");

	//definición del cartón 2

	int[][] carton2 = new int[2][4];

	//columnas
	
	for (int columnas2 = 1; columnas2 <= 3; columnas2++) {
		
		//definición de las tiradas
		
		int tirada = (int)(Math.random()*9+1);
		int tirada2 = (int)(Math.random()*10+10);
		int tirada3 = (int)(Math.random()*10+20);
		int tirada4 = (int)(Math.random()*10+30);
		int tirada5 = (int)(Math.random()*10+40);
		
		//columna 1
		System.out.print(tirada);
		
		//columna 2
		
		System.out.print(" |" + " " + tirada2);
		
		//columna 3
		
		System.out.print(" |" + " " + tirada3);
		
		//columna 4
		
		System.out.print(" |" + " " + tirada4);
		
		//columna 5
		
		System.out.print(" |" + " " + tirada5);
		System.out.println(" |");
	}

	for (int i = 1; i <= 23; i++) {
		System.out.print("-");		
	}
		
	








		


		}}

		

