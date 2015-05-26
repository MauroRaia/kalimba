import java.util.ArrayList;
import java.util.List;


public class Editor {

	String pluginCargado = "";
	List<Hoja> listaDeHojas = new ArrayList<Hoja>();
	String nombre = "";
    Hoja hojaActiva ;
    List<LineasTexto> contenidoPortapapeles = new ArrayList<LineasTexto>();

public Editor (String plugin, String name){
	
	this.pluginCargado = plugin;
	this.nombre = name;
	
     }

public void imprimirHojaActiva() {

	this.hojaActiva.escrito.imprimirLineas();

}

public void elegirHojaActiva(Hoja unaHoja){

    this.hojaActiva = unaHoja;

}

//Copiar,cortar y pegar, con el portapapeles


public void seleccionarLineas(LineasTexto linea){
	
	this.hojaActiva.escrito.lineasSeleccionadas.add(linea);
	
}

public void copiarContenido(){
	
	this.contenidoPortapapeles.clear();
	this.contenidoPortapapeles = this.hojaActiva.escrito.lineasSeleccionadas ;
	
}

public void cortarContenido(){
	
	this.contenidoPortapapeles.clear();
	for (LineasTexto linea : hojaActiva.escrito.lineasSeleccionadas){
		this.hojaActiva.escrito.lineasString.remove(linea);
		this.contenidoPortapapeles.add(linea);
	}
	
}



public void pegarContenido(Hoja hoja){
	System.out.println(this.contenidoPortapapeles);
	hoja.escrito.lineasString.addAll(this.contenidoPortapapeles);
	
}

}
