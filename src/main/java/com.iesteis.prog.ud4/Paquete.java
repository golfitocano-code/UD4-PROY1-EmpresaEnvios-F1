package com.iesteis.prog.ud4;

public class Paquete {

    public static final double FACTOR_VOLUMETRICO = 5000;

    private final Dimension dimension;
    private final double peso;

    public Paquete(Dimension dimension, double peso) {
        this.dimension = dimension;
        this.peso = peso;
    }

    public Paquete(double alto, double ancho, double largo, double peso) {
        this(new Dimension(alto, ancho, largo), peso);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public double getPeso() {
        return peso;
    }