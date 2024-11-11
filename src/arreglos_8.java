
import javax.swing.JOptionPane;

public class arreglos_8 {

 
    public static void main(String[] args) {
        /*
        escribe un programa en java que guarde en un arreglo los kilometros 
        recoridos de cada uno de los 10 taxis y en otro arreglo, la cantidad de gasolina que gasta cada uno de los 10 taxis
        si por cada 15 kilometros es un litro de gasolina y cuanto gasto de dinero cada txi por los litros 
        consumidos de gasolina si el precioi por litro es de 19.40.
        */
        double[] kilometros = new double[10];
        double[] gasolina = new double[10];
        double[] gasto = new double[10];
        double precioGas = 19.4;
        
        for (int index = 0; index < kilometros.length; index++) {
            kilometros[index] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            null, 
                            "Dame los kilometros recorridos del Taxi "+ (index+1)
                    )
            );
            gasolina[index] = kilometros[index]/15;
        }
        
        for (int index = 0; index < gasto.length; index++) {
            gasto[index] = gasolina[index]*precioGas; 
        }
        
        for (int index = 0; index < gasto.length; index++) {
            JOptionPane.showMessageDialog(null, "El Taxi "+(index+1)+ " gastó: $" + gasto[index]);
        }
    }
    
}
