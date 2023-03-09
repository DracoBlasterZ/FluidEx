import javax.swing.JOptionPane;

public class Ex11_Flujo {
	public static void main(String[] args) {
		String dayOf=JOptionPane.showInputDialog("Introduzca un dia de la semana");
		
		switch(dayOf) {
		case "Lunes":
			JOptionPane.showMessageDialog(null,"Es un dia laborable");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null,"Es un dia laborable");
			break;
		case "Miercoles":
			JOptionPane.showMessageDialog(null,"Es un dia laborable");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null,"Es un dia laborable");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null,"Ultimo dia laborable, venga que queda poco!");
			break;
		case "Sabado":
			JOptionPane.showMessageDialog(null,"No es un dia laborable, disfruta!");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null,"No es un dia laborable, pero mañana si, disfruta!");
			break;
			default:
				JOptionPane.showMessageDialog(null,"Creo que lo has escrito mal");
		}
	}

}
