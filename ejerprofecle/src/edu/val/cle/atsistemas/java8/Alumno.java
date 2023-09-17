package edu.val.cle.atsistemas.java8;

import java.util.Arrays;

public class Alumno {
	
	private String nombre;
	private String edad;
	private int[] notas;
	private float nmedia;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	public float getNmedia() {
		return nmedia;
	}
	public void setNmedia(float nmedia) {
		this.nmedia = nmedia;
	}
	public Alumno(String nombre, String edad, int[] notas, float nmedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notas = notas;
		this.nmedia = nmedia;
	}
	
	public Alumno(String nombre, String edad,  float nmedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notas = new int[5];
		this.nmedia = nmedia;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notas=" + Arrays.toString(notas) + ", nmedia="
				+ nmedia + "]";
	}
	
	
	
	

}
