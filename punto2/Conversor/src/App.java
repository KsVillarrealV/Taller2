import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        float cantidad = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor: "));
       
    conversor valor = new conversor(cantidad);
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Dolares a Pesos Colombianos \n 2.Pesos Colombianos a Dolares \n Elige una opción: "));
        
        switch (opcion) {
            case 1:
                valor.DOLAR_A_PESO();
                break;
            case 2:
                valor.PESO_A_DOLAR();
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "la opción elegida no se encuentra disponible");
                break;
        }
    }
}
