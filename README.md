# Sousa_Daniel_Pruebas.SOLID.Java
## **1.Creación de una Clase Matriz en Java:** 
El código Java define una clase llamada Matriz, que representa una matriz numérica. Esta clase tiene un campo privado llamado matriz para almacenar los datos de la matriz, un constructor que inicializa esta matriz, un método llamado imprimir() que recorre la matriz e imprime sus elementos en la consola, y un método llamado transpuesta() que calcula la matriz transpuesta y la devuelve como una nueva instancia de Matriz. En el método main, se crea una matriz 2x2 y se instancia un objeto Matriz con ella. Luego se imprime la matriz original y su transpuesta en la consola, demostrando así el funcionamiento de los métodos de la clase Matriz.

Aquí se muestra lo que hace cada metodo de la clase Matriz:

1. *private int[][] matriz;*: Este es un campo privado que almacena los datos de la matriz como una matriz de enteros.
2. *protected Matriz(int[][] matriz)*: Este es el constructor de la clase Matriz. Toma una matriz como argumento y la asigna al campo matriz.
3. *protected void imprimir()*: Este método itera sobre cada elemento de la matriz e imprime su valor en la consola, organizando la salida en filas y columnas.
4. *protected Matriz transpuesta()*: Este método calcula la transpuesta de la matriz actual. Crea una nueva matriz con las dimensiones intercambiadas y copia los elementos de la matriz original en las posiciones correspondientes para obtener la transpuesta. Luego devuelve una nueva instancia de Matriz con la matriz transpuesta.

En el método main:

1. *int[][] matriz = {{1, 2}, {3, 4}};*: Aquí se crea una matriz 2x2 con valores predefinidos.
2. *Matriz m = new Matriz(matriz);*: Se instancia un objeto de la clase Matriz utilizando el constructor definido, pasándole la matriz creada anteriormente.
3. *m.imprimir();*: Se llama al método imprimir() en el objeto m, lo que imprime la matriz original en la consola.
4. *m.transpuesta().imprimir();*: Se llama al método transpuesta() en el objeto m, lo que devuelve la matriz transpuesta. Luego se llama al método imprimir() en esta matriz transpuesta, imprimiéndola en la consola.


## **2.Sistema de Gestión de Pedidos de Pizza en Línea:**
El codigo Java representa un sistema de pedidos de pizzas en el que el usuario transmite por pantalla cada pizza que desee pedir, a partir de ahi el sistema lo que hara sera procesar esa informacion y cada uno de los precios para que al finañ, le transmita al usuario el precio que debera abonar correspondiente a su pedido. Los metodos y clases principales utilizados han sido los siguientes:

1. DataBaseManager: Clase responsable de manejar la conexión con la base de datos y realizar operaciones CRUD.
2. Authenticator: Clase utilizada para manejar la autenticación de usuarios.
3. OrderManager: Clase encargada de la gestión de los pedidos, incluyendo la creación, actualización y eliminación de pedidos de los usuarios.
4. PaymentProcessor: Clase responsable de manejar las transacciones de pago.

