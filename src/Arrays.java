
public class Arrays {

    public static void main(String[] args) {
        /*
        1- Arreglo: son un tipo de contenedor o estructura de datos indexado y de 
        tamaño fijo, donde se pueden almacenar elementos de forma secuencial, 
        siempre que sean del mismo tipo.
        */
        
        /*
        2- declara 3 arreglos uno de tipo entero, otro de tipo double y uno
        de tipo cadena 
        */
        int[] enteros;
        double[] doubles;
        String[] cadenas;
      
        /*
        3- de acuerdo al punto anterior crea cada uno de los arreglos antes 
        declarados el primero de 10 elementos, el segundo y tercero con 30 
        elementos  
        */
        enteros = new int[10];
        doubles = new double[30];
        cadenas = new String[30];
        
        /*
        4- inicializa un arreglo con los nombres de las materias que cursas.
        */
        String[] materias = {"matematicas", "administracion", "investigacion", "calculo", 
        "programacion", "Etica"};
        
        /*
        5- Clasificacion de arreglos: se clasifican segun su dimensionalidad, 
        es decir, la forma en que se contruyen o declaran.
        - Unidimencionales: tambien conocidos como arreglos vectoriales, 
        son conjuntos de elementos del mismo tipo.
        - Bidimencionales: tambien conocidos como matrices, son arreglos 
        estructurados en dos dimensiones.
        - Multidimensionales: son arreglos estructurados en mas de dos 
        dimensiones
        */
        
        /*
        6- Como estan enumerados los elemntos de un arreglos : el primer indice 
        empieza en 0  siempre 
        */
        
        /*
        7- Declara y cre un arreglo para guardar la cantidad de dinero en pesos 
        que cada uno de los 20 clientes va a cambiar a dolar y otro arreglo donde 
        se guarden los dolares 
        */
        double[] pesos = new double[20];
        double[] dolares = new double[20];

         /*
        8-Escribe un programa en Java que guarde en un arreglo los kilómetros 
        recorridos de cada uno de los 10 taxis y en otro arreglo, la cantidad de 
        gasolina que gasta cada uno de los 10 taxis si por cada 15 kilómetros es 
        un litro de gasolina. Y cuanto gasto de dinero cada taxi por los litros
        consumidos de gasolina si el precio por litro es de 19.40.
        */
    }
}
