import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor: "));
    calculadora operacion = new calculadora(num1,num2);
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Suma \n 2.Resta  \n 3.Multiplicación  \n 4.División \n Elige la opción que deseas: "));
            
            switch (opcion) {
                case 1:
                    operacion.suma();
                    break;
                case 2:
                    operacion.resta();
                    break;
                case 3:
                    operacion.multiplicacion();
                    break;
                case 4:
                    operacion.division();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida...");
                    break;
        }

    }
}
