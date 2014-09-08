/*
 *  Universidad del Valle de Guatemala
 *  Algoritmos y estructura de datos 2014
 *  
 *  Autores:    Nancy Girón Muñoz - 13467
 *              Martín Meyer Ramazzini - 13043
 *              Alberto López Montenegro - 13181
 */
public class Persona{
	String nombre;
	byte capacidad;
	public Persona(String in_nombre,byte in_capacidad){
		nombre=in_nombre;
		capacidad=in_capacidad;
	}
	public String toString(){
		String titulos="";
		byte iterar=capacidad;
		if(iterar-4>=0){titulos+="web ";iterar-=4;}
		if(iterar-2>=0){titulos+="java ";iterar-=2;}
		if(iterar-1>=0){titulos+="cel ";}
		return nombre+": "+titulos;
	}
}