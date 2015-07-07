import java.util.ArrayList;
import java.util.List;


public class Editor {

	private Plugin plugin;
	
	
	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}



	private List<Hoja> listaDeHojas = new ArrayList<Hoja>();
	
	
	String nombre = "";
	
    private Hoja hojaActiva;
    
    public Hoja getHojaActiva() {
		return hojaActiva;
	}

	public void setHojaActiva(Hoja hojaActiva) {
		this.hojaActiva = hojaActiva;
	}



	List<LineasTexto> contenidoPortapapeles = new ArrayList<LineasTexto>();

public Editor (String name){
	
	this.nombre = name;
	
     }

public void imprimirHojaActiva() {

	this.hojaActiva.escrito.imprimirLineas();

}

public void elegirHojaActiva(Hoja unaHoja){

    this.hojaActiva = unaHoja;

}

//Copiar,cortar y pegar, con el portapapeles


public void seleccionarTodo(){
	
	this.hojaActiva.escrito.lineasSeleccionadas.addAll(hojaActiva.escrito.lineasString);
	
}

public void seleccionarLineas(Integer num){
	
	this.hojaActiva.escrito.lineasSeleccionadas.add(hojaActiva.escrito.lineasString.get(num));
	
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



public void pegarContenido(Hoja hoja, Integer numeroLista){
	
	Integer x = numeroLista - 1;
	
	for (LineasTexto linea : contenidoPortapapeles){
		
		Integer c = x + 1;
		hoja.escrito.lineasString.add(c, new LineasTexto(linea.contenido, linea.parrafo) );
		
	}
	
	//hoja.escrito.lineasString.addAll(this.contenidoPortapapeles);
	
}
	
public PDF exportar(Editor editor){
	
	return this.plugin.exportar(editor);
}

public List<Hoja> getListaDeHojas() {
	return listaDeHojas;
}

public void setListaDeHojas(List<Hoja> listaDeHojas) {
	this.listaDeHojas = listaDeHojas;
}


}

