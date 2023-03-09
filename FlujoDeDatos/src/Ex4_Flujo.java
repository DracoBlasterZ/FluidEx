import javax.swing.JOptionPane;

public class Ex4_Flujo {
	public static void main(String[] args) {
		String radioOf=JOptionPane.showInputDialog("Introduzca el radio de su circulo");
		JOptionPane.showMessageDialog(null, "Bienvenido "+(Math.PI*(Math.pow(Double.parseDouble(radioOf),2))));
	}
}
