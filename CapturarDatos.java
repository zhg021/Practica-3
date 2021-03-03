import java.util.Random;

public class CapturarDatos {
	
	String name;
	String apellidoP;
	String apellidoM;
	String genero;
	String entidad;
	String mes;
	String dia;
	String epoca;
	char clave1[];
	char clave2[];
	String chars="abcdefghijklmnopqrstuvwxyz";
	Persona datos;
	
	public void EntradaUno(String apellidoP , String apellidoM , String name , String genero){
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.name = name;
		this.genero = genero;
	}
	
	public void EntradaDos(String dia , String mes , String epoca , String entidad ){
		this.dia = dia;
		this.mes = mes;
		this.epoca = epoca;
		this.entidad = entidad;
	}
	
	public void generarC(){
		for(int i = 0 ; i < 18 ; i++){
			if(i==0){
				clave1[i] = apellidoP[0];
			}
			else if(i==1){
				if(apellidoP[1] == 'a' || apellidoP[1] == 'e' || apellidoP[1] == 'i' || apellidoP[1] == 'o' || apellidoP[1] == 'u'){
					clave1[i] = apellidoP[1];
				}
				else{
					clave1[i] = apellidoP[2];
				}
			}
			else if(i==2){
				clave1[i] = apellidoM[0];
			}
			else if(i==3){
				clave1[i] = name[0];
			}
			else if(i==4){
				clave1[i] = epoca[0];
			}
			else if(i==5){
				clave1[i] = epoca[1];
			}
			else if(i==6){
				clave1[i] = mes[0];
			}
			else if(i==7){
				clave1[i] = mes[1];
			}
			else if(i==8){
				clave1[i] = dia[0];
			}
			else if(i==9){
				clave[i] = dia[1];
			}
			else if(i==10){
				clave1[i] = genero[0];
			}
			else if(i==11){
				clave1[i] = entidad[0];
			}
			else if(i==12){
				clave1[i] = entidad[1];
			}
			else if(i==13){
				if(apellidoP[1] != 'a' && apellidoP[1] != 'e' && apellidoP[1] != 'i' && apellidoP[1] != 'o' && apellidoP[1] != 'u'){
					clave1[i] = apellidoP[1];
				}
				else{
					clave1[i] = apellidoP[2];
				}
			}
			else if(i==14){
				if(apellidoM[1] != 'a' && apellidoM[1] != 'e' && apellidoM[1] != 'i' && apellidoM[1] != 'o' && apellidoM[1] != 'u'){
					clave1[i] = apellidoM[1];
				}
				else{
					clave1[i] = apellidoM[2];
				}
			}
			else if(i==15){
				if(name[1] != 'a' && name[1] != 'e' && name[1] != 'i' && name[1] != 'o' && name[1] != 'u'){
					clave1[i] = name[1];
				}
				else{
					clave1[i] = name[2];
				}
			}
			else if(i==16){
				Random gen = new Rabdom();
				clave1[16] = (char)(gen.nextInt(10));
			}
			else{
				Random gen = new Rabdom();
				clave1[17] = (char)(gen.nextInt(10));
			}
		}
		datos.CURP = clave1;
	}
	
	public void generarR(){
		for(int i = 0 ; i < 13 ; i++){
			if(i==0){
				clave2[i] = apellidoP[0];
			}
			else if(i==1){
				clave2[i] = apellidoP[1];
			}
			else if(i==2){
				clave2[i] = apellidoM[0];
			}
			else if(i==3){
				clave2[i] = name[0];
			}
			else if(i==4){
				clave2[i] = epoca[0];
			}
			else if(i==5){
				clave2[i] = epoca[1];
			}
			else if(i==6){
				clave2[i] = mes[0];
			}
			else if(i==7){
				clave2[i] = mes[1];
			}
			else if(i==8){
				clave2[i] = dia[0];
			}
			else if(i==9){
				clave2[i] = dia[1];
			}
			else if(i==10){
				Random gen = new Rabdom();
				clave2[10] = (char)(gen.nextInt(10));
			}
			else if(i==11){
				Random gen = new Rabdom();
				clave2[11] = chars.charAt(gen.nextInt(chars.length()));
			}
			else{
				Random gen = new Rabdom();
				clave2[12] = (char)(gen.nextInt(10));
			}
		}
		datos.RFC = clave2;
	}
	
	public void mostrar(){
		System.out.println("\nCURP:"+datos.CURP);
		System.out.println("\nRFC:"+datos.RFC);
	}
}