package ejercicios;

public class closet {
    public static void main(String[] args) {
        ropa("VV");
    }

    static String ropa(String inventario) {
        int contadorVerano = 0;
        int contadorInvierno = 0;
        int contadorAmbas = 0;

        for (int i = 0; i < inventario.length(); i++) {
            if (inventario.charAt(i) == 'V') {
                contadorVerano++;
            } else if (inventario.charAt(i) == 'I') {
                contadorInvierno++;
            } else if (inventario.charAt(i) == 'A') {
                contadorAmbas++;
            } else if (inventario.charAt(i) == '.') {
                break;
            } else {
                System.out.println("Esta opción no es valida");
            }
        }

        if (contadorVerano > contadorInvierno && contadorVerano > contadorAmbas) {
            return "VERANO";
        } else if (contadorInvierno > contadorVerano && contadorInvierno > contadorAmbas) {
            return "INVIERNO";
        } else {
            return "NINGUNO";
        }
    }
}
