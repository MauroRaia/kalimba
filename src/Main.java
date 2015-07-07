
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Editor kalimba = new Editor ("Kalimbo");	
	Hoja hoja3 = new Hoja (new Integer(1), kalimba);	
	Texto textoHoja3 = new Texto (hoja3);
	kalimba.elegirHojaActiva(hoja3);
	hoja3.agregarTexto(textoHoja3);
    LineasTexto linea1 = new LineasTexto ("texto1",textoHoja3);
    LineasTexto linea2 = new LineasTexto ("texto2 a usar", textoHoja3);
    LineasTexto linea3 = new LineasTexto ("texto3 a usar", textoHoja3);
    LineasTexto linea4 = new LineasTexto ("texto4 a usar", textoHoja3);
    LineasTexto linea5 = new LineasTexto ("texto5 a usar", textoHoja3);
    textoHoja3.agregarLinea(linea1);
    textoHoja3.agregarLinea(linea2);
    textoHoja3.agregarLinea(linea3);
    textoHoja3.agregarLinea(linea4);
    textoHoja3.agregarLinea(linea5);
	kalimba.seleccionarLineas(2);
	//kalimba.seleccionarLineas(linea2);
	kalimba.copiarContenido();
	kalimba.pegarContenido(hoja3, 3);
    kalimba.imprimirHojaActiva();
    kalimba.setPlugin(new PluginHojaActiva());
    kalimba.exportar(kalimba);
    System.out.print(kalimba.exportar(kalimba));
    }
	
	
	
}