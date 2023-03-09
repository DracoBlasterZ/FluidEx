import javax.swing.JOptionPane;

public class Ex6_Flujo {

	public static void main(String[] args) {
		int IVA= 21;
		String priceOf=JOptionPane.showInputDialog("Introduzca el precio del prodocuto");
		double price= Double.parseDouble(priceOf);
		
		JOptionPane.showMessageDialog(null,"Tendra que pagar "+(price+(price*IVA)/100));

	}

}
