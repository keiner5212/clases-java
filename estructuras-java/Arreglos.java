public class Arreglos {
    public static void main(String[] args) {
        // Definir un arreglo vacío
        int[] arreglo1 = new int[5];

        // Asignar valores al arreglo
        arreglo1[0] = 1;
        arreglo1[1] = 2;
        arreglo1[2] = 3;
        arreglo1[3] = 4;
        arreglo1[4] = 5;

        // Definir un arreglo con valores iniciales
        int[] numeros = { 1, 2, 3, 4, 5 };

        // Recorrer un arreglo con un bucle for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Recorrer un arreglo con un bucle for-each
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
