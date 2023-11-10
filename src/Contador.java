import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Enter the first parameter.");

		int parametroUm = terminal.nextInt();
		System.out.println("Enter the second parameter.");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());

		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
         if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("The second parameter must be greater than the first.");10
            }

		
		int contagem = parametroDois - parametroUm;
	
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Printing number " + i);
        }
	}
}