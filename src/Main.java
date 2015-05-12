
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
	Texto textoHoja3 = new Texto ();	
    Hoja hoja3 = new Hoja (new Integer(1), textoHoja3);
    LineasTexto linea1 = new LineasTexto ("hola", hoja3, 1);
    LineasTexto linea2 = new LineasTexto ("hola1", hoja3, 2);
    LineasTexto linea3 = new LineasTexto ("hola2", hoja3, 3);
	Editor kalimba = new Editor ("plugin1", "Kalimbo", hoja3);		
	kalimba.imprimirHojaActiva();
	
	
    }
	
	
	
}