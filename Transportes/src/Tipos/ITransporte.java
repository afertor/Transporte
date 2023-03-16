package Tipos;

public interface ITransporte {
    public static final int CODIGO = 36500;

    public static final int PALET = 0;
    public static final int CAJA_CARTON = 1;
    public static final int CAJA_MADERA = 2;
    
    /**
     * Calcula el coste total del transporte para un código postal dado.
     * @param cp Código postal.
     * @return El coste total del transporte.
     */
    Float costeTotal(Integer cp);

    /**
     * Calcula el tipo de embalaje necesario para el transporte.
     * @param ancho Las dimensiones del paquete en ancho.
     * @param largo Las dimensiones del paquete en largo.
     * @param alto Las dimensiones del paquete en alto.
     * @param peso El peso del paquete.
     * @return El número del tipo de embalaje necesario.
     *         0 para palet, 1 para caja de cartón, 2 para caja de madera.
     */
    Integer tipoEmbalaje(Float ancho, Float largo, Float alto, Float peso);
}