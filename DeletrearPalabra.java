package deletrearPalabra;

public class DeletrearPalabra {
	/**
	 *
	 * @Elba
	 */

	public static char[] deletrear(String palab){//convierte String a char
		int letras = palab.length();
		char [] let = new char [letras]; 
		for (int i=0; i<letras; i++){
			let[i]=palab.charAt(i);
		}
		return let;
	}


	public static void main(String[] args) {
		String palabra="deletrear";
		char [] delet=deletrear(palabra);

		System.out.println("La palabra letra por letra es: ");
		for(int i=0; i<delet.length; i++){
			System.out.println(delet[i]);
		}

	}

}
