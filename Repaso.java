import java.util.Scanner;
/**
 * @author Peter
 * @version 1.56456345
 * */
public class Repaso {
	public static void main(String[] arg) {
		//creamos un Scanner para leer una palabra
		Scanner sc = new Scanner(System.in);
		//almacenamos el contenido en una variable llamada palabraLeida
		System.out.println("Introduce una palabra que vamos a hacer un arreglo");
		String palabraLeida = sc.next();
		//descomentamos la siguiente línea cuando tengamos hecho el método
		
		String palabraPlural = devolverPalabraPlural(palabraLeida);
		System.out.println("Palabra introducida en plural: " + palabraPlural);
		//descomentamos la siguiente línea cunado tengamos hecho el método
		boolean empiezaVocal = empiezaPorVocal(palabraLeida);

		if(empiezaPorVocal(palabraLeida))
			System.out.println("Empieza por vocal");
		else
			System.out.println("Empieza por consonante");
		//descomentamos la siguiente línea cunado tengamos hecho el método
		boolean conjuncioncopulativa= esUnaConjuncionCopulativa(palabraLeida);
		if(conjuncioncopulativa)
			System.out.println("Es conjunción copulativa");
		else
			System.out.println("No es conjunción copulativa");
		}
		/** metodo devolverPalabraPlural
		 * @param palabraPlural Parámetro de tipo String
		 * @return la palabra en plural
		 * */
		//implementación del método devolverPalabraPlural
		public static String devolverPalabraPlural(String palabraPlural){
				return palabraPlural+="s";
			
		}
		/** metodo empiezaPorVocal
		 * @param palabraLeida parámetro de tipo String
		 * @return la palabra en plural
		 * */
		//implementación del método empiezaPorVocal
		public static boolean empiezaPorVocal(String palabraLeida){
			char a = 'a';
			char e = 'e';
			char i = 'i';
			char u = 'u';
			char o = 'o';
			char primeraLetra = palabraLeida.toLowerCase().charAt(0);
			if(primeraLetra==a||primeraLetra==e||primeraLetra==i||primeraLetra==o||primeraLetra==u)
				return true;
			else
				return false;
				//también se puede añadir la linea comparativa al return-----> return primeraLetra==a|
				//primeraLetra==e|primeraLetra==i|primeraLetra==o|primeraLetra==u 
		}
		/*public static boolean esUnaConjuncionCopulativa(String palabraLeida){
			String conjunción1 = new String("y");
			String conjunción2 = new String("e");
			String conjunción3 = new String("ni");
			String conjunción4 = new String("que");
		return true;}*/
		//implementación del método  esUnaConjuncionCopulativa
		//las conjunciones copulativas son:  Y, E, NI, QUE
		/** metodo esUnaConjuncionCopulativa
		 * @param palabra parámetro de tipo String
		 * @return true o false
		 * */
		public static boolean esUnaConjuncionCopulativa(String palabra){
			/*if(palabra=="y"||palabra=="e"||palabra=="ni"||palabra=="que") 
				return true;
			else 
			return false;*/
			return palabra.equalsIgnoreCase("y")||palabra.equalsIgnoreCase("e")||
			palabra.equalsIgnoreCase("ni")||palabra.equalsIgnoreCase("que");
			
			}
		
}

  
