import javax.swing.JOptionPane;

class calculadora{
    public int num1;
    public int num2;
    public int total;

    public calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    
    }

    public void suma(){
        total = num1 + num2;
        JOptionPane.showMessageDialog(null, "la suma de "+num1+"+"+num2+" es: "+ total);
    }

    public void resta(){
        total = num1 - num2;
        JOptionPane.showMessageDialog(null, "la resta de "+num1+"-"+num2+" es: "+ total);

    }

    public void multiplicacion(){
        total = num1 * num2;
        JOptionPane.showMessageDialog(null, "la multiplicación de "+num1+"x"+num2+" es: "+ total);
    }

    public void division(){
        double total = (double)num1 / (double)num2;
        JOptionPane.showMessageDialog(null, "la división de "+num1+"/"+num2+ " es: "+ total);
    }

    
}