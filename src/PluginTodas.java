
public class PluginTodas {
	
	Editor editor;
	
public PDF exportar(Editor editor){	
		
		return (new PDF(editor.getListaDeHojas()));

	
	
}
}