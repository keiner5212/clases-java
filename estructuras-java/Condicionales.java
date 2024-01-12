public class Condicionales {
    public static void main(String[] args) {
        int x = 5;

        // Ejemplo de la sentencia if
        if (x > 0) {
            System.out.println("x es positivo");
        }

        // Ejemplo de la sentencia if-else
        if (x % 2 == 0) {
            System.out.println("x es par");
        } else {
            System.out.println("x es impar");
        }

        // Ejemplo de la sentencia if-else-if
        if (x < 0) {
            System.out.println("x es negativo");
        } else if (x == 0) {
            System.out.println("x es cero");
        } else {
            System.out.println("x es positivo");
        }
    }
}

// Las estructuras condicionales en Java te permiten ejecutar ciertas partes del
// código solo si se cumple una condición específica. La estructura condicional
// más común en Java es la sentencia if.