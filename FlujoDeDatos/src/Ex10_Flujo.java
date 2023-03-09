import javax.swing.JOptionPane;

public class Ex10_Flujo {

	public static void main(String[] args) {
		String numOf=JOptionPane.showInputDialog("Introduzca un numero que desee");
		int vent= Integer.parseInt(numOf);
		double sumVent=0.0;
		for(int i=0;i<vent;i++)
		{
			String priceOf=JOptionPane.showInputDialog("Cuanto vale el producto numero "+ (i+1));
			double priceNum=Double.parseDouble(priceOf);
			sumVent=sumVent+ priceNum;
		}
		JOptionPane.showMessageDialog(null,"El precio total seran "+sumVent);
			
	}

}
