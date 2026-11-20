package com.iesteis.prog.ud4;

public class Dimension {

    private final double alto;
    private final double ancho;
    private final double largo;

    public Dimension(double alto, double ancho, double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }
