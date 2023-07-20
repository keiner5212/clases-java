public class Matrices {
    public static void main(String[] args) {
        // Definir una matriz vacía
        int[][] matriz1 = new int[3][3];

        // Asignar valores a la matriz
        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[0][2] = 3;
        matriz1[1][0] = 4;
        matriz1[1][1] = 5;
        matriz1[1][2] = 6;
        matriz1[2][0] = 7;
        matriz1[2][1] = 8;
        matriz1[2][2] = 9;

        // Definir una matriz con valores iniciales
        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Recorrer una matriz con bucles for anidados
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // Recorrer una matriz con bucles for-each anidados
        for (int[] fila : matriz1) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
