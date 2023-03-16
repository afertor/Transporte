package Tipos;

import Datos.IntroduceDatos;

public class Camion implements ITransporte {
    private Integer cp;
    private Float dimensionX;
    private Float dimensionY;
    private Float dimensionZ;
    private Float peso;
    private static final int CODIGO = 36500;

    public Camion(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
        this.cp = cp;
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.dimensionZ = dimensionZ;
        this.peso = peso;
    }

    @Override
    public Float costeTotal(Integer cp) {
        while (cp > 37000 || cp < 36000) {
            cp = IntroduceDatos.Introduceint("Este código postal no está disponible. Introduce otro código postal válido entre 36000 y 37000:");
        }
        Integer diferencia = Math.abs(CODIGO - cp);
        float precio = diferencia * 0.04f;
        if (precio == 0) {
            precio = 0.4f;
        }
        return precio;
    }

    @Override
    public Integer tipoEmbalaje(Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
        Integer tipoEmbalaje = null;
        float sumaDimensiones = dimensionX + dimensionY + dimensionZ;

        if (sumaDimensiones <= 150 && peso <= 40) {
            tipoEmbalaje = CAJA_CARTON;
        } else if (sumaDimensiones <= 3000 && peso <= 100) {
            tipoEmbalaje = CAJA_MADERA;
        } else {
            tipoEmbalaje = PALET;
        }
        return tipoEmbalaje;
    }
}
