
public class LineasTexto {

	String contenido;
	Integer numeroDeLinea;
	
public void imprimir(){
	
	System.out.println(this.numeroDeLinea);
	System.out.println(this.contenido);
	
}
public LineasTexto (String contenido, Hoja hoja, Integer numeroDeLinea){
	
	this.numeroDeLinea = numeroDeLinea;
	this.contenido = contenido;
	hoja.escrito.agregarLinea(this);
	
}


}
