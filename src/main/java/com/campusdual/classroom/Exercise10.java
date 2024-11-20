package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int contador=0;
        String bola="";

        while (contador<2) {
            bola = getBall();
            System.out.println("La bola es de color: " + bola);
            if (bola.equals("azul")) {
                contador++;
            }
        }
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        //El método getBall() devuelve un String al ser invocado. El String podrá ser "verde",
        // "azul" o "rojo". Dentro del método, utilizando un switch, se llamará al método randomWithRange()
        //  y según el valor numérico que devuelva éste, el switch devolverá un color u otro.
        int random = randomWithRange(1,4);
        switch (random) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
        }
        return "";
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}