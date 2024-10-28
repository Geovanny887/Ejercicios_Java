
import javax.swing.JOptionPane;

public class Calificaciones {
    public static void main(String[] args) {
        int cantidadalumnos=0;
        double minAprobacion = 70;
        int aprobados=0;
        int reprobados=0;
        int mayornoventa=0;
        int masalumnos=0; //yes = 0, no = 1,cancel = 2
        
        JOptionPane.showMessageDialog(
                null, 
                "Se van a leer las calificaciones de los alumnos del tema 3 de "
                        + "la materia de fundamentos."
        );
        
        while (masalumnos==0){
            cantidadalumnos++;
            double calificacion =0.0;
            calificacion=Double.parseDouble(
                    JOptionPane.showInputDialog(
                        null,
                        "Dame la calificacion del alumno "+ cantidadalumnos
                    )
            );
            if (calificacion<minAprobacion){
                reprobados++;
            }
            else{
                aprobados++;
                if (calificacion>90){
                    mayornoventa++;
                }
            }
            masalumnos=JOptionPane.showConfirmDialog(null,"Hay mas alumnos?");
        }
        JOptionPane.showMessageDialog(
                null, 
                "Resultados:\n"
                + "Total de alumnos: " + cantidadalumnos + "\n"
                + "Alumnos reprobados: " + reprobados + "\n"
                + "Alumnos aprobados: " + aprobados + "\n"
                + "Alumnos con calificacion mayor a 90: " + mayornoventa
        );
    }
    
}
