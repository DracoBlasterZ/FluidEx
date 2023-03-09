import javax.swing.JOptionPane;

public class Ex12_Flujo {

	public static void main(String[] args) {
		int intentos=3;
		boolean acierto=false;
		JOptionPane.showMessageDialog(null,"Contraseña creada, vuelva a introducirla para confirmarlo, tendra 3 intentos: Comienza por J y acaba en ava");
		do
		{
			String trycontra=JOptionPane.showInputDialog("Porfavor vuelva a introducir la contraseña, tiene "+intentos+" intentos restantes");
			switch(trycontra)
			{
			case "Java":
				intentos=0;
				acierto=true;
				break;
			default:
				intentos--;
			}
			
		}while(0<intentos);
		
		if(acierto)
			JOptionPane.showMessageDialog(null,"Enhorabuena, has acertado!");
		else
			JOptionPane.showMessageDialog(null,"Te has quedado sin oportunidades");


	}

}
