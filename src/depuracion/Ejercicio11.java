package depuracion;

public class Ejercicio11
{
	public static void main(String[] args) 
	{
		int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	
		int[][] result = matrixMultiply(matrixA, matrixB);
	
		System.out.println("Resultado de la multiplicación de matrices:");
		for (int i = 0; i < result.length; i++) 
		{
			for (int j = 0; j < result[i].length; j++) 
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Implementa la multiplicación de matrices
	public static int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) 
	{
		int rowsA = matrixA.length;
		int colsA = matrixA[0].length;
		int colsB = matrixB[0].length;
	
		int[][] result = new int[rowsA][colsB];
	
		for (int i = 0; i < rowsA; i++) 
		{
			for (int j = 0; j < colsB; j++) 
			{
				int sum = 0;
				for (int k = 0; k < colsA; k++) 
				{
					sum += matrixA[i][k] * matrixB[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}
}