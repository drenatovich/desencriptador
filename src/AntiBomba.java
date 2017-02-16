
public class AntiBomba {
	
	public AntiBomba() {
		
	}
	
	public String descifrador(String mensajeCifrado, int saltos){
		String mensajeDescifrado="";
		
		for(int i=0;i<saltos;i++){
			mensajeDescifrado=mensajeCifrado.substring(mensajeCifrado.length()-1,mensajeCifrado.length())+mensajeCifrado.substring(0,mensajeCifrado.length()-1);
			mensajeCifrado=mensajeDescifrado;
		}
		return mensajeDescifrado;
		
	}
}
