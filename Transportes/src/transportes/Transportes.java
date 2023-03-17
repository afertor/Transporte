package transportes;

import Datos.IntroduceDatos;
import Tipos.ITransporte;

public class Transportes {
    static ITransporte transporte;

    public static void main(String[] args) {
        // Variables de entrada
        Float costo = null;
        String tipo = null;
        Integer tipoEmbalaje = null;

        // Pedir al usuario que seleccione el tipo de transporte
        int tipoTransporte = IntroduceDatos.Introduceint("Seleccione el tipo de transporte:\n1. Camion\n2. Bicicleta\n3. Barco");

        // Obtener el objeto transporte correspondiente según la elección del usuario
        switch (tipoTransporte) {
            case 1:
                transporte = Factory.getProducto(Factory.CAMION);
                break;
            case 2:
                transporte = Factory.getProducto(Factory.BICICLETA);
                break;
            case 3:
                transporte = Factory.getProducto(Factory.BARCO);
                break;
            default:
                System.out.println("Opcion no valida.");
                return;
        }

        // Calcular el costo y el tipo de embalaje según las dimensiones y el peso del paquete
        costo = transporte.costeTotal(Factory.cp);
        tipoEmbalaje = transporte.tipoEmbalaje(Factory.dimensionX, Factory.dimensionY, Factory.dimensionZ, Factory.peso);

        // Mostrar el resultado al usuario
        if (costo != null && tipoEmbalaje != null) {
            switch (tipoEmbalaje) {
                case ITransporte.PALET:
                    tipo = "Palet";
                    break;
                case ITransporte.CAJA_MADERA:
                    tipo = "Caja de madera";
                    break;
                case ITransporte.CAJA_CARTON:
                    tipo = "Caja de carton";
                    break;
            }
            System.out.println("Costo de envio: " + costo + " Tipo de embalaje: " + tipo);
        } else {
            System.out.println("Error en el calculo del costo o del tipo de embalaje.");
        }
    }
}




