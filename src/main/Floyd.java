package main;

public class Floyd {
	
	private Grafo grafoDeCosto; // A diferencia de Dijkstra, el grafo mismo que se le pasa a esta clase es quien tenga los valores modificados de los costos. //
	
	public Floyd(Grafo grafoDeAdyacencia)
	{
		grafoDeCosto = grafoDeAdyacencia;
	}
	
	public Grafo resolver()
	{
		Integer i,j,z;
		Integer cantNodos = grafoDeCosto.obtenerCantNodos();
		Integer valorIteracionColumna;
		Integer valorIteracionFila;
		Integer valorInterseccionFilaColumna;
		
		for(i = 0; i<cantNodos; i++) // "i" recorre cada uno de los nodos. //
		{
			for(j = 0; j<cantNodos; j++) // "j" recorre fila. //
			{
				for(z = 0; z<cantNodos; z++) // "z" recorre columna. //
				{
					valorIteracionColumna = grafoDeCosto.obtenerValor(i, z);
					valorIteracionFila = grafoDeCosto.obtenerValor(j, i);
					valorInterseccionFilaColumna = grafoDeCosto.obtenerValor(j, z);
					if((valorIteracionColumna+valorIteracionFila) < valorInterseccionFilaColumna)
					{
						grafoDeCosto.setValorCelda(j, z, valorIteracionColumna+valorIteracionFila);
					}
				}
			}
		}
		
		return grafoDeCosto;
	}

}
