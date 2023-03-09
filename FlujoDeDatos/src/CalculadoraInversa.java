import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		String numOf1=JOptionPane.showInputDialog("Introduzca el primer numero");
		int num1= Integer.parseInt(numOf1);
		String numOf2=JOptionPane.showInputDialog("Introduzca el segundo numero");
		int num2= Integer.parseInt(numOf2);
		double d;
		
		String operationOf=JOptionPane.showInputDialog("Porfavor que operacion quiere realizar:  + - * / ^ %");
		switch(operationOf)
		{
		case "+":
			JOptionPane.showMessageDialog(null,"La suma es "+(num1+num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null,"La resta es "+(num1-num2));		
			break;
		case "*":
			JOptionPane.showMessageDialog(null,"La multiplicacion es "+(num1*num2));
			break;
		case "/":
			d=num1/num2;
			JOptionPane.showMessageDialog(null,"La division es "+d);
			break;
		case "^":
			JOptionPane.showMessageDialog(null,"La operacion con base "+num1+ " y exponente "+num2+" es "+(Math.pow(num1,num2)));
			break;
		case "%":
			d=num1%num2;
			JOptionPane.showMessageDialog(null,"El resto de la division es "+d);
			break;
		default:
			JOptionPane.showMessageDialog(null,"No se ha reconocido la operacion solicitada ");
			
		}

	}

}
