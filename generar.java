import java.util.*;
import java.util.Scanner;

public class generar{
	public static void main(String args[]){
		
		CapturarDatos info = new CapturarDatos;
		
		info.EntradaUno(capturaEntrada.capturaString("Applido paterno"),capturaEntrada.capturaString("Applido materno"),capturaEntrada.capturaString("Nombre"),capturaEntrada.capturaString("Genero"));
		info.EntradaDos(capturaEntrada.capturaString("dia de nacimiento , ej: 10 , 03 , 02"),capturaEntrada.capturaString("mes de nacimiento , ej: 01 , 06 , 10 , 11"),capturaEntrada.capturaString("ultimas dos cifras de anio de nacimiento, ej 97 , 99 , 00"),capturaEntrada.capturaString("entidad de origen , ej tj , df"));
		info.generarC();
		info.generarR();
		info.mostrar();
	}
}