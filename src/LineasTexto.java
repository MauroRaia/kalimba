
public class LineasTexto {

	String contenido;
	Texto parrafo;
	
public void imprimir(){
	
	System.out.println(parrafo.lineasString.indexOf(this));
	System.out.println(this.contenido);
	
}
public LineasTexto (String contenido, Texto texto){
	
	this.contenido = contenido;
	this.parrafo = texto;
}


}
