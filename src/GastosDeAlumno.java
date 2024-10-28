import javax.swing.JOptionPane;
public class GastosDeAlumno {
    public static void main(String[] args) {
        double totalPagar = 0;
        double precioInsc = 2500;
        double precioMateriaUnit = 1000;
        double precioMaterias = 0;
        
        // Precio talleres
        double[] precioTalleres = {400, 500, 600, 300};
        String[] nombreTalleres = {"Danza", "Natacion", "Futbol", "Pintura"};
        
        String nombreAlumno, semestreAlumno;
        int cantidadMaterias = 0;
        
        
        nombreAlumno = JOptionPane.showInputDialog(null,"Dame el nombre del alumno:");
        semestreAlumno = JOptionPane.showInputDialog(null,"Dame el semestre del alumno:");
        
        cantidadMaterias = Integer.parseInt(JOptionPane.showInputDialog( null,"Hola "+
                nombreAlumno+", el costo de cada materia es de $1000\n  ¿Cuantas materias vas a tomar?"));
        if(cantidadMaterias > 6){
            precioMaterias = 6000 + (precioInsc*0.05) ;
        }
        if(cantidadMaterias <= 6){
            precioMaterias = cantidadMaterias * precioMateriaUnit;
        }
        
        String talleres = JOptionPane.showInputDialog(null,"Talleres disponibles\n"+
            "1.- Danza: $400  2.- Natacion: $500\n"
            + "3.- Futbol: $600  4.- Pintura: $300\n"
            + "Selecciona los talleres que deseas cursar por numero separado por comas `,`\n ejemplo: \"2,4\" "
            );
        String[] talleresSelec =  talleres.split(",");
        double totalPrecioTalleres = 0;
        for(String opccion: talleresSelec){
            int index = Integer.parseInt(opccion)-1;
            if(index >= 0 && index < precioTalleres.length){
                totalPrecioTalleres = totalPrecioTalleres + precioTalleres[index];
            }
        }
        
        totalPagar = precioMaterias + totalPrecioTalleres;
        
        JOptionPane.showMessageDialog(null, "Nombre del alumno: "+nombreAlumno+
                "\nSemestre: "+semestreAlumno+
                "\nCantidad de Materias: "+cantidadMaterias+
                "\nTalleres seleccionados: "+talleres+
                "\nTOTAL A PAGAR: "+totalPagar
                
        );
    }
}
