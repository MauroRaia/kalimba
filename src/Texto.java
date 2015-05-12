import java.util.ArrayList;
import java.util.List;


public class Texto {

	Boolean siNegrita = false;
	Boolean siCursiva = false;
	Boolean siSubrayado = false;
	String colorActual = "Negro";
	List<LineasTexto> LineasString = new ArrayList<LineasTexto>();

public void imprimirLineas(){
	
	for (LineasTexto linea : this.LineasString){
		linea.imprimir();
	}
	
}
public void agregarLinea(LineasTexto linea){
	
	this.LineasString.add(linea);
	
}
}

