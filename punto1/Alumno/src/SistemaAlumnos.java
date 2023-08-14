import javax.swing.JOptionPane;

public class SistemaAlumnos extends Alumno{
        float Promedio;
    public SistemaAlumnos(String nombre, int edad, int[] calificaciones, float promedio) {
        super(nombre, edad, calificaciones);
        this.Promedio=promedio;
    }
        
    

    

    

    public void mostrar() {
       JOptionPane.showMessageDialog(null, 
       "Nombre: "+Nombre+"\n"+"Edad: "+Edad+"\n"+"Promedio: "+Promedio);
    }
}
