
public class LineasTexto {

	String contenido;
	Integer numeroDeLinea;
	Texto parrafo;
	
public void imprimir(){
	
	System.out.println(this.numeroDeLinea);
	System.out.println(this.contenido);
	
}
public LineasTexto (String contenido, Integer numeroDeLinea){
	
	this.numeroDeLinea = numeroDeLinea;
	this.contenido = contenido;
}


}
