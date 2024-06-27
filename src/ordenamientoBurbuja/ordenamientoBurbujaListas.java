package ordenamientoBurbuja;

import java.util.ArrayList;
import java.util.List;

public class ordenamientoBurbujaListas {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(5);
		listaNumeros.add(2);
		listaNumeros.add(8);
		listaNumeros.add(3);
		listaNumeros.add(1);

		List<String> listaStrings = new ArrayList<>();
		listaStrings.add("Cinco");
		listaStrings.add("Dos");
		listaStrings.add("Ocho");
		listaStrings.add("Tres");
		listaStrings.add("Uno");

		// Mostrar la lista desordenada
		System.out.println("Listas desordenada:");
		for (int num : listaNumeros) {
			System.out.print(num + " ");
		}

		System.out.println("");

		for (String Strings : listaStrings) {
			System.out.print(Strings + " ");
		}

		System.out.println("");
		// Aplicar el algoritmo de ordenamiento burbuja
		for (int i = 0; i < (listaNumeros.size() - 1); i++) {
			for (int j = 0; j < (listaNumeros.size() - i - 1); j++) {
				if (listaNumeros.get(j) > listaNumeros.get(j + 1)) {
					// Intercambiar los elementos de numero
					int temporalNumero = listaNumeros.get(j);

					int SegundoElementoNumero = listaNumeros.get(j + 1);

					listaNumeros.set(j, SegundoElementoNumero); // lista.set(posicion en la lista, nuevo dato)
					listaNumeros.set(j + 1, temporalNumero);

					// Intercambiar los elementos de strings, SEGUN los numeros
					String temporalString = listaStrings.get(j);

					String SegundoElementoString = listaStrings.get(j + 1);

					listaStrings.set(j, SegundoElementoString); // lista.set(posicion en la lista, nuevo dato)
					listaStrings.set(j + 1, temporalString);
				}
			}
		}

		// Mostrar la lista ordenada
		System.out.println("--------");

		System.out.println("\nListas ordenada:");

		System.out.println("Lista de numeros:" + listaNumeros);
		System.out.println("Lista de strings:" + listaStrings);

	}
}
