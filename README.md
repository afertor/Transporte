#Procedimiento:

En esta aplicación, se requiere calcular el coste de envío y el tipo de embalaje en función del tipo de transporte utilizado. Para ello, se debe proporcionar el código postal de destino, así como las dimensiones y el peso del paquete.

Cálculo del Coste de Envío:

En el caso del envío por camión, el coste se calcula mediante la diferencia entre los códigos postales de origen y destino, multiplicando dicha diferencia por 0,04. Si la diferencia es igual a cero, el precio será de 0,4 €.

En cambio, para el envío por bicicleta, se calcula la diferencia de los códigos postales y se multiplica por 0,02. Si la diferencia es cero, el precio será de 0,2 €.

Cálculo del Tipo de Embalaje:

El tipo de embalaje es determinado por las dimensiones y el peso del paquete. Si la suma de las dimensiones es menor o igual que 150 y el peso es menor o igual que 40, se utiliza una caja de cartón. Si la suma de las dimensiones es menor o igual que 3000 y el peso es menor o igual que 100, se utiliza una caja de madera. Si no se cumple ninguna de estas dos condiciones, se utiliza un palet.

Este patrón Factory es utilizado para instanciar objetos de tipo transporte según la elección del usuario, y así calcular el coste y tipo de embalaje correspondientes.
