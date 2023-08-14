import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
                String nombre = JOptionPane.showInputDialog("Nombre del estuante: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del estudiante: "));
                

                float promedio = 0;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Número de notas a ingresar: "));
                float [] calificaciones = new float[cantidad];
                byte valor =1;
                for (int i = 0; i < cantidad; i++) {
                    calificaciones[i] = Float.parseFloat(JOptionPane.showInputDialog("Nota " + valor + ": "));
                    promedio = promedio + calificaciones[i]/cantidad;
                    valor++;
                }

                SistemaAlumnos estudiante =new SistemaAlumnos(nombre, edad, null, promedio);
                estudiante.mostrar();

        
        
    }
}
