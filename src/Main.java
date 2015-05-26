
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Editor kalimba = new Editor ("plugin1", "Kalimbo");	
	Hoja hoja3 = new Hoja (new Integer(1), kalimba);	
	Texto textoHoja3 = new Texto (hoja3);
	kalimba.elegirHojaActiva(hoja3);
	hoja3.agregarTexto(textoHoja3);
    LineasTexto linea1 = new LineasTexto ("hola", 1);
    LineasTexto linea2 = new LineasTexto ("hola1guadaespecial", 2);
    LineasTexto linea3 = new LineasTexto ("hola2maruespecial", 3);
    textoHoja3.agregarLinea(linea1);
    textoHoja3.agregarLinea(linea2);
    textoHoja3.agregarLinea(linea3);
	kalimba.seleccionarLineas(linea3);
	kalimba.seleccionarLineas(linea2);
	kalimba.copiarContenido();
	kalimba.pegarContenido(hoja3);
    kalimba.imprimirHojaActiva();
	
    }
	
	
	
}