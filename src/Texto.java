import java.util.ArrayList;
import java.util.List;


public class Texto {

	Hoja hoja;
	Boolean siNegrita = false;
	Boolean siCursiva = false;
	Boolean siSubrayado = false;
	String colorActual = "Negro";
	List<LineasTexto> lineasString = new ArrayList<LineasTexto>();
	List<LineasTexto> lineasSeleccionadas = new ArrayList <LineasTexto>();


public Texto(Hoja unaHoja){
	
	this.hoja= unaHoja;
	
}
	
//Mostrar lineas de texto
	
	
public void imprimirLineas(){
	
	for (LineasTexto linea : this.lineasString){
		linea.imprimir();
	}
	
}
public void agregarLinea(LineasTexto linea){
	
	this.lineasString.add(linea);
}

public Integer getNroLinea(LineasTexto linea){
	
	return this.lineasString.indexOf(linea);
	
}

}
