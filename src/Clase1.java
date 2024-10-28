
import javax.swing.JOptionPane;

public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumatotal=0 ; //Entero
        int incio = 40;
        int maximo = 500;
        for (int cont = incio; cont <= maximo; cont++) {
            if (cont%2 == 0){
                sumatotal = sumatotal+cont;
            }
        }
        String message = "La suma de los pares entre "+incio+" y "+maximo+" es: "
                +sumatotal;
        JOptionPane.showMessageDialog(null, message);
    }
    
}
