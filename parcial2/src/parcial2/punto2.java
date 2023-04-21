package parcial2;

import java.util.Random;
public class punto2 {

	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	private final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private Object dni;
	
	private static final char SEXO_POR_DEFECTO = 'H';
	private static final int PESO_IDEAL_BAJO = 0;
	private static final int PESO_IDEAL_NORMAL =1;
	private static final int PESO_IDEAL_ALTO =2;
	
	
	public void person (String nombre,int edad,char sexo,double peso,double altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo1(sexo);
		this.peso = peso;
		this.altura = altura;
		this.dni = generaDNI1();
	}
	
	private char comprobarSexo1(char sexo) {
		return sexo == 'H' || sexo == 'M'? sexo : SEXO_POR_DEFECTO;
	}
	
	public boolean esMayorDeEdad() {
		return edad >= 18;
		
	}
	
	public int calcularIMC() {
		double imc = peso/ (altura *altura);
		if(imc < 20) {
			return -1;
		}else if(imc >= 20 && imc <= 25) {
			return PESO_IDEAL_BAJO;
		}else {
			return PESO_IDEAL_ALTO;
		}
	}
	
	private String generaDNI1() {
		int numDNI = Ind.nextInt(999999999) + 1;
		int indiceletra = numDNI % 23;
		
		return String.format("%08d",numDNI) + LETRAS_DNI.charAt(indiceletra);
	}
	
	public String toString() {
		return "Nombre: " + nombre + "\n" +
	    "Edad: " + edad + "\n" +
		"DNI: " + dni + "\n" +
	    "sexo: " + sexo + "\n" +
		"peso :" + peso + "\n" +
	    "altura: " + altura;
	
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	private Object generaDNI() {
		// TODO Auto-generated method stub
		return null;
	}
	private char comprobarSexo(char sexo2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
