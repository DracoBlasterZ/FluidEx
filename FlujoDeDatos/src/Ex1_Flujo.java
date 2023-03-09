import javax.swing.JOptionPane;

public class Ex1_Flujo {
		
		
	public static void main(String []args) {
		double prim= 267.34;
		double seuc =267.34;
		if(prim==seuc)
		{
			JOptionPane.showMessageDialog(null,"Los 2 numeros son iguales");
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"El numero mas grande es: "+Math.max(prim, seuc));
		}
		
	}
	
}
