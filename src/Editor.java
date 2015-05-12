import java.util.ArrayList;
import java.util.List;


public class Editor {

	String pluginCargado = "";
	List<Hoja> listaDeHojas = new ArrayList<Hoja>();
	String nombre = "";
    Hoja hojaActiva ;

public Editor (String plugin, String name, Hoja hojaActual){
	
	this.pluginCargado = plugin;
	this.nombre = name;
	this.hojaActiva = hojaActual;
     }

public void imprimirHojaActiva() {

	this.hojaActiva.escrito.imprimirLineas();

}

}