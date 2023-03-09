import javax.swing.JOptionPane;

public class Ex5_Flujo {
	public static void main(String[] args) {
		String numOf=JOptionPane.showInputDialog("Introduzca un numero que desee");
		double num= Double.parseDouble(numOf);
		
		if(num%2 ==0)
			JOptionPane.showMessageDialog(null,"El numero introducido es Par");
		else
			JOptionPane.showMessageDialog(null,"El numero introducido es Inpar");
		
	}

}
