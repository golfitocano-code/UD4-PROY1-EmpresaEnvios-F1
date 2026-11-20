package com.iesteis.prog.ud4;

public class Envio {

    // La constante es privada porque solo se utiliza dentro de Envio.
    private static final int MAX_PAQUETES = 3;

    private final String codigo;
    private final String codigoPostal;

    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;
}