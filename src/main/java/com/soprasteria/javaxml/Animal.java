package com.soprasteria.javaxml;

public class Animal {
	private String nom;
	private String espèce;
	private int age;
	private double poids;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEspèce() {
		return espèce;
	}
	public void setEspèce(String espèce) {
		this.espèce = espèce;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public Animal() {
		
	}
	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", espèce=" + espèce + ", age=" + age + ", poids=" + poids + "]";
	}
	

}
