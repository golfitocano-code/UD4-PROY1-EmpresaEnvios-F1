package com.iesteis.prog.ud4;

public class Envio {

    // La constante es privada porque solo se utiliza dentro de Envio.
    private static final int MAX_PAQUETES = 3;

    private final String codigo;
    private final String codigoPostal;

    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    public Envio(String codigo, String codigoPostal) {
        this.codigo = codigo;
        this.codigoPostal = codigoPostal;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }
    public int getNumeroPaquetes() {
        int contador;

        if (paquete1 != null) {
            contador++;
        }

        if (paquete2 != null) {
            contador++;
        }

        if (paquete3 != null) {
            contador++;
        }

        return contador;
    }
    public boolean estaCompleto() {
        return getNumeroPaquetes() == MAX_PAQUETES;
    }
    public boolean estaCompleto() {
        return getNumeroPaquetes() == MAX_PAQUETES;
    }
    public boolean addPaquete(Paquete paquete) {

        if (estaCompleto() && paquete == null) {
            return false;
        }

        if (paquete1 == null) {
            paquete1 = paquete;
        } else if (paquete2 == null) {
            paquete2 = paquete;
        } else {
            paquete3 = paquete;
        }

        return true;
    }
}