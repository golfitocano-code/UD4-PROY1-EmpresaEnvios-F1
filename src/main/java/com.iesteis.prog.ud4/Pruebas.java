package com.iesteis.prog.ud4;

public class MisPruebas {

    public static void main(String[] args) {

        // PRUEBA 1: Envío vacío.
        Envio envioVacio = new Envio("PX00000001R", "36202");

        System.out.println("PRUEBA 1: ENVÍO VACÍO");
        System.out.println(envioVacio);
        System.out.println("¿Está completo? "
                + envioVacio.estaCompleto());
        System.out.println("Paquete más pesado: "
                + envioVacio.getPaqueteMasPesado());

        System.out.println("--------------------------------");

        // PRUEBA 2: Dos paquetes con el mismo peso real.
        Envio envioEmpate = new Envio("PX00000002R", "36203");

        Paquete p1 = new Paquete(10, 10, 10, 5);
        Paquete p2 = new Paquete(20, 20, 20, 5);

        envioEmpate.addPaquete(p1);
        envioEmpate.addPaquete(p2);

        System.out.println("PRUEBA 2: EMPATE DE PESO");
        System.out.println(envioEmpate);

        System.out.println("Paquete más pesado: "
                + envioEmpate.getPaqueteMasPesado());

        // Comprobamos que devuelve el primero.
        System.out.println("¿Devuelve el primero? "
                + (envioEmpate.getPaqueteMasPesado() == p1));

        System.out.println("--------------------------------");

        // PRUEBA 3: Paquete más pesado que voluminoso.
        Envio envioPeso = new Envio("PX00000003R", "36204");

        Paquete p3 = new Paquete(10, 10, 10, 8);

        envioPeso.addPaquete(p3);

        System.out.println("PRUEBA 3: PESO REAL MAYOR");
        System.out.println(p3);
        System.out.println("Volumen: "
                + p3.calcularVolumen() + " cm3");
        System.out.println("Peso volumétrico: "
                + p3.calcularPesoVolumetrico() + " kg");
        System.out.println("Peso facturable: "
                + p3.calcularPesoFacturable() + " kg");
    }
}
