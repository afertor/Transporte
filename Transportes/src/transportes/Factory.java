package transportes;

import Datos.IntroduceDatos;
import Tipos.Bicicleta;
import Tipos.Camion;
import Tipos.ITransporte;
import Tipos.Barco;

public class Factory {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;
    public static final int BARCO = 3;
    public static Integer cp = null;
    public static Float dimensionX = null;
    public static Float dimensionY = null;
    public static Float dimensionZ = null;
    public static Float peso = null;
   
    public static ITransporte getProducto(int type) {
        cp = IntroduceDatos.Introduceint("Escribe tu codigo postal");
        dimensionX = IntroduceDatos.IntroduceFloat("Escribe una dimensionX");
        dimensionY = IntroduceDatos.IntroduceFloat("Escribe una dimensionY");
        dimensionZ = IntroduceDatos.IntroduceFloat("Escribe una dimensionZ");
        peso = IntroduceDatos.IntroduceFloat("Escribe un peso");
        switch (type) {   
            case CAMION:
                return new Camion(cp, dimensionX, dimensionY, dimensionZ, peso);
            case BICICLETA:
                return new Bicicleta(cp, dimensionX, dimensionY, dimensionZ, peso);
            case BARCO:
                return new Barco(cp, dimensionX, dimensionY, dimensionZ, peso);
            default:
                return null;
        }
    }
}