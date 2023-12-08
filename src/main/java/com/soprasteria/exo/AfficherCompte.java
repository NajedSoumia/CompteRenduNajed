package com.soprasteria.exo;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class AfficherCompte {

	public static void main(String[] args) {
		
			        final String fileName = "banque.xml";
			        try {
			            // we can create JDOM Document from DOM, SAX and STAX Parser Builder classes
			            SAXBuilder builder = new SAXBuilder();
			            File xmlFile = new File(fileName);
			            Document jdomDoc = (Document) builder.build(xmlFile);
			            Element root = jdomDoc.getRootElement();
			            List < Element > listOfComptes = root.getChildren("CompteBanacaire");
			            List <CompteBancaire> compteList = new ArrayList<CompteBancaire>();
			            for(Element compteElement: listOfComptes) {
			                CompteBancaire cb = new CompteBancaire();
			                cb.setNumCompte(Integer.parseInt(compteElement.getChildText("numero")));
			                cb.setNomPropriétaire(compteElement.getChildText("propriétaire"));
			                cb.setSolde(Double.parseDouble(compteElement.getChildText("solde")));
			                cb.setDateCréation(LocalDate.parse(compteElement.getChildText("dateCréation")));
			                cb.setTypeCompte(compteElement.getChildText("type"));
			                compteList.add(cb);
			            }
			            // lets print Comptes list information
			           // compteList.forEach( compte ->{ System.out.println(compte.toString()) ;});
			            System.out.println(compteList);

			        } catch (Exception e) {
			            e.printStackTrace();
			        }

			    }

		


	}


