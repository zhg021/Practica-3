
class Persona{
	
	String nombre;
	String CURP;
	String RFC;
	
	public void setNombre(String nomb){
		nombre = nomb;
	}
	
	public void setCURP(String crp){
		CURP = crp;
	}
	
	public void setRFC(String rfc){
		RFC = rfc;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getCURP(){
		return CURP;
	}
	
	public String getRFC(){
		return RFC;
	}
}