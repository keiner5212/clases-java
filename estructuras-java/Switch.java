public class Switch {
    public static void main(String[] args) {
        int x = 3;

        // Ejemplo de la sentencia switch
        switch (x) {
            case 1:
                System.out.println("x es uno");
                break;
            case 2:
                System.out.println("x es dos");
                break;
            case 3:
                System.out.println("x es tres");
                break;
            default:
                System.out.println("x no es uno, dos o tres");
        }
    }
}
// En este ejemplo, el valor de x se compara con los valores especificados
// en cada caso (case) y se ejecuta el código correspondiente al caso que
// coincida con el valor de x. Si no hay ningún caso que coincida con el valor
// de x, se ejecuta el código del caso por defecto (default).