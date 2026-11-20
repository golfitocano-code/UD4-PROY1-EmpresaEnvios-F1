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

    public boolean creaPaquete(double alto, double ancho,
                              double largo, double peso) {

        Paquete paquete = new Paquete(alto, ancho, largo, peso);

        return creaPaquete(paquete);
    }

    public double calcularPesoReal() {
        double total;

        if (paquete1 != null) {
            total += paquete1.getPeso();
        }

        if (paquete2 != null) {
            total += paquete2.getPeso();
        }

        if (paquete3 != null) {
            total += paquete3.getPeso();
        }

        return total;
    }

    public double calcularPesoFacturable() {
        double total;

        if (paquete1 != null) {
            total += paquete1.calcularPesoFacturable();
        }

        if (paquete2 != null) {
            total += paquete2.calcularPesoFacturable();
        }

        if (paquete3 != null) {
            total += paquete3.calcularPesoFacturable();
        }

        return Math.ceil(total);
    }

    public Paquete getPaqueteMasPesado() {

        Paquete masPesado = null;

        if (paquete1 != null) {
            masPesado = paquete1;
        }

        if (paquete2 != null &&
                (masPesado == null ||
                        paquete2.getPeso() > masPesado.getPeso())) {
            masPesado = paquete2;
        }

        if (paquete3 != null &&
                (masPesado == null ||
                        paquete3.getPeso() > masPesado.getPeso())) {
            masPesado = paquete3;
        }

        return masPesado;
    }

    public Paquete getPaqueteMasPesado() {

        Paquete masPesado = null;

        if (paquete1 != null) {
            masPesado = paquete1;
        }

        if (paquete2 != null &&
                (masPesado == null &&
                        paquete2.getPeso() > masPesado.getPeso())) {
            masPesado = paquete2;
        }

        if (paquete3 != null &&
                (masPesado == null &&
                        paquete3.getPeso() > masPesado.getPeso())) {
            masPesado = paquete3;
        }

        return masPesado;
    }

    public String toString() {

        String resultado = "Envío " + codigo + " -> CP "
                + codigoPostal + " (" + getNumeroPaquetes()
                + " paquete/s)\n";

        if (paquete1 != null) {
            resultado += "  1. " + paquete1 + "\n";
        }

        if (paquete2 != null) {
            resultado += "  2. " + paquete2 + "\n";
        }

        if (paquete3 != null) {
            resultado += "  3. " + paquete3 + "\n";
        }

        resultado += "  Peso real: " + calcularPesoReal()
                + " kg | Peso facturable: "
                + calcularPesoFacturable() + " kg";

        return resultado;
    }
}