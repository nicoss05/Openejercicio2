public class Main {

    public static void main(String[] args) {
        int numIf = 4;

        if (numIf < 0) {
            System.out.println("if= El numero  " + numIf + " es negativo");
        } else if (numIf > 0) {
            System.out.println("else if= La variable numero " + numIf + " es positivo");
        } else {
            System.out.println("else= La variable numero es 0");
        }

        int numWhile = 1;

        while (numWhile < 3) {
            numWhile++;
            System.out.println("While ahora vale: " + numWhile);
        }


        int numeWhile = 3;
        do {
            numeWhile++;
            System.out.println("Do-While: el numero es: " + numeWhile);
        } while (numeWhile < 3);


        for (int numFor = 0; numFor <= 5; numFor++) {
            System.out.println("For: Es igual= " + numFor);
        }


        String estacion = "verano";
        switch (estacion) {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No existe la estacion");
        }
    }
}
