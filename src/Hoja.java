
public class Hoja {

	Integer numeroDePag ;
	Texto escrito;
	
	
public Hoja (Integer numeroPag, Texto parrafo){
	
	this.numeroDePag = numeroPag;
	this.escrito = parrafo;
	
 }
public void imprimirTexto(){
	
	this.escrito.imprimirLineas();
	
}

}