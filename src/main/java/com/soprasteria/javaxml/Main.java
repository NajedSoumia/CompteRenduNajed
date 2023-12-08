package com.soprasteria.javaxml;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Main {

	public static void main(String[] args) {
		// Lecture en dur
		try {
			Document doc = new Document();
			doc.setRootElement(new Element("Animal"));
			// Construire des objects de type Animal
			Animal a1 = new Animal("canari", "oiseau", 2, 0.2);
			Animal a2 = new Animal("rod", "chien", 2, 12);

			// attacher ces deux elements à l'element racine
			doc.getRootElement().addContent(createUserXMLElement(a1));
			doc.getRootElement().addContent(createUserXMLElement(a2));

			// xmlOutputter : objet pour ecrire dans un fichier.xml
			XMLOutputter xmlOutput = new XMLOutputter();

			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("animals.xml"));
			System.out.println("File Saved!");

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} finally {
		}
	}

	private static String CreateAnimalXMLElement(Animal a1) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Element createUserXMLElement(Animal animal) {
		Element animalElemnt = new Element("Animal");

		animalElemnt.addContent(new Element("nom").setText(animal.getNom()));
		animalElemnt.addContent(new Element("espece").setText(animal.getEspèce()));
		animalElemnt.addContent(new Element("age").setText("" + animal.getAge()));
		animalElemnt.addContent(new Element("poids").setText("" + animal.getPoids()));
		return animalElemnt;
	}
	// Lecture au clavier via Scanner

}
