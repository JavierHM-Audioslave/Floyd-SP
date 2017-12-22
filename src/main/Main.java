package main;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File archIn = new File("in4.txt");
		Scanner sc;
		
		try
		{
			sc = new Scanner(archIn);
			Integer cantNodos = sc.nextInt();
			Integer cantAristas = sc.nextInt();
			Grafo grafo = new Grafo(cantNodos, cantAristas);
			grafo.cargarGrafo(sc);
			Floyd floyd = new Floyd(grafo);
			floyd.resolver();
			System.out.println("Hola");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.exit(1);
		}

	}

}
