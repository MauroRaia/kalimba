import java.util.ArrayList;
import java.util.List;


public class PluginHojaActiva implements Plugin {
	
	Editor editor;
	
	public PDF exportar(Editor editor){
		
		List<Hoja> listaAyuda = new ArrayList<Hoja>();
		listaAyuda.add(editor.getHojaActiva());
		
		
		return (new PDF(listaAyuda));
	
	}

}
