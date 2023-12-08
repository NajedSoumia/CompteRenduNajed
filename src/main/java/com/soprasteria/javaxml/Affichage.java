package com.soprasteria.javaxml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;





public class Affichage {

	public static void main(String[] args) {
		final String fileName = "animals.xml";
		try {
            // phase1 : désérialisation qui consiste à la création du Document
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(fileName);
            Document jdomDoc = (Document) builder.build(xmlFile);
            
            //phase 2 : récipération du root et de ses enfants
            Element root = jdomDoc.getRootElement();
                List <Element> listOfAnimals = root.getChildren("Animal");
                List <Animal> animals = new ArrayList<Animal>();
            
            for (Element element : listOfAnimals)
            {
            	Animal a = new Animal();
            	a.setNom(element.getChildText("nom"));
            	a.setEspèce(element.getChildText("espece"));
            	a.setAge(Integer.parseInt(element.getChildText("age")));
            	a.setPoids(Double.parseDouble(element.getChildText("poids")));
            }
            System.out.println(animals);
            
        } catch (Exception e) {
            e.printStackTrace();
        }


	}

}
