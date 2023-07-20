
public class calculadora {

    public static void main(String[] args) {
        double acumulador = 0;
        String operacion = args[0];
        
        String valores[] = new String[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            valores[i] = args[i + 1];
        }

        if (valores.length > 2 && operacion.equals("division")) {
            System.out.println("no se puede dividir mas de 2 numeros");
        } else {
            switch (operacion) {
                case "suma":
                    acumulador = suma(valores);
                    break;

                case "resta":
                    acumulador = resta(valores);
                    break;
                case "multiplicacion":
                    acumulador = multiplicacion(valores);
                    break;

                case "division":
                    acumulador = division(valores);
                    break;
                default:
                    System.out.println("no se ingreso una operacion");
            }
        }

        System.out.println(acumulador);
    }

    public static double suma(String[] lista) {
        double res = 0;
        for (String valor : lista) {
            res += Double.parseDouble(valor);
        }
        return res;
    }

    public static double resta(String[] lista) {
        double res = 0;
        for (String valor : lista) {
            res -= Double.parseDouble(valor);
        }
        return res;
    }

    public static double multiplicacion(String[] lista) {
        double res = 1;
        for (String valor : lista) {
            res *= Double.parseDouble(valor);
        }
        return res;
    }

    public static double division(String[] lista) {
        return Double.parseDouble(lista[0]) / Double.parseDouble(lista[1]);
    }
}
