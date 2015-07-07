import java.util.ArrayList;
import java.util.List;


public class PDF {

	List<Hoja> listaHojas = new ArrayList<Hoja>();

	public PDF(List<Hoja> listaDeHojas){
		
		for(Hoja hoja : listaDeHojas){
			
			this.listaHojas.add(hoja);
			
		}
		
	}

	@Override
	public String toString() {
		return "nuevo print";
	}

	
	
	
}