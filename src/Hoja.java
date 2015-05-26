
public class Hoja {

	Integer numeroDePag ;
	Texto escrito;
	Editor editor;
	
public Hoja (Integer numeroPag, Editor unEditor){
	
	this.numeroDePag = numeroPag;
	this.editor = unEditor;
 }
public void imprimirTexto(){
	
	this.escrito.imprimirLineas();
	
}

public void agregarTexto(Texto unEscrito){

    this.escrito = unEscrito;

}
}