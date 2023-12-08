package com.soprasteria.exo;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;



public class saisixml {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println(newAccount(scanner,"Courant"));
//		System.out.println("**************");
//		System.out.println(newAccount(scanner,"Epargne"));
		CompteBancaire cbCourant = newAccount(scanner,"Courant");
		CompteBancaire cbEpargne = newAccount(scanner,"Epargne");
		try {
			Document doc = new Document();
			doc.setRootElement(new Element("CompteBanacaire"));
			
			doc.getRootElement().addContent(createCompteBancaire(cbCourant));
			doc.getRootElement().addContent(createCompteBancaire(cbEpargne));
			
			XMLOutputter xmlOutput=new XMLOutputter();
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("banque.xml"));
			System.out.println("File Saved!");
			
		}
		catch(IOException io) {
			System.out.println(io.getMessage());
		}
	}

	private static CompteBancaire newAccount(Scanner scanner, String typeCompte) {
		
      CompteBancaire cb = new CompteBancaire();
      System.out.println("Donner le numéro de compte");
      int numCompte = scanner.nextInt();
      cb.setNumCompte(numCompte);
      
      System.out.println("Donner le nom proprio de compte");
      String nom = scanner.next();
      cb.setNomPropriétaire(nom);
      
      System.out.println("Donner le solde de compte");
      double solde = scanner.nextDouble();
      cb.setSolde(solde);
      
      System.out.println("Donner le type du compte Epargne ou Courant");
      String type = scanner.next();
      cb.setTypeCompte(type);
      
      cb.setDateCréation(LocalDate.now());
      
      return cb;
		
	}
	private static Element createCompteBancaire(CompteBancaire compteBancaire) {
		Element cbElement = new Element ("CompteBanacaire");
		cbElement.addContent(new Element("numero").setText(""+compteBancaire.getNumCompte()));
		cbElement.addContent(new Element("propriétaire").setText(compteBancaire.getNomPropriétaire()));
		cbElement.addContent(new Element("solde").setText(""+compteBancaire.getSolde()));
		cbElement.addContent(new Element("dateCréation").setText(""+compteBancaire.getDateCréation()));
		cbElement.addContent(new Element("type").setText(compteBancaire.getTypeCompte()));
		return cbElement;
	}
	
}
