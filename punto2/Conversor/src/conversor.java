import javax.swing.JOptionPane;

public class conversor {
    public float ValorBase;
    public float valor;
    public double total;
    
    
    
    public conversor (float cantidad){
        this. valor = cantidad;
        this.ValorBase=(float)3961.51;


    }

    public void PESO_A_DOLAR(){
        float dolares = valor / ValorBase;
        JOptionPane.showMessageDialog(null, "El valor en dolares es: " + (Float)dolares);
    }

    public void DOLAR_A_PESO (){
        float pesos = valor * ValorBase;
        JOptionPane.showMessageDialog(null, "El valor en pesos Colombianos es: " + (Float)pesos);
    }
}
