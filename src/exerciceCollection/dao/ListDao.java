package exerciceCollection.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListDao {

//	//public static void Exo1() {
//		
//		ArrayList<Integer> moy = new ArrayList<Integer>();
//		
//		int moyenne = 0;
//		int valeurSup =0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i <= 20; i++) {
//			
//			int newSc = sc.nextInt();
//			
//			moyenne += newSc;
//			moy.add(newSc);
//			
//		}
//		
//		moyenne = moyenne / moy.size();
//		
//		for (int vs : moy) {
//				
//			if(vs > moyenne) {
//				
//				valeurSup++;
//			}
//			
//		}
//		
//		System.out.println("Le nombre de valeurs au dessus de " + moyenne+ " est de " + valeurSup);
//		
//		
//	}

	public static void exo1() {

		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");

		couleur.add(0, "orange");
		couleur.remove(4);
		couleur.set(3, "blouge");
		System.out.println(couleur.contains("blouge"));

		ArrayList<String> couleur2 = new ArrayList<String>(couleur);

		Collections.sort(couleur);

		Collections.shuffle(couleur);// Mélanger l'array
		Collections.reverse(couleur2);// Inverser l'ordre de l'array

//		for(String col : couleur) {
//			System.out.println(col);
//		}
//		for(String col : couleur2) {
//			System.out.println(col);
//		}

		for (int i = 2; i < 4; i++) {
			System.out.println(couleur.get(i));
		}
	}

	public static void exo7() {

		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");
		
		
		ArrayList<String> couleur2 = new ArrayList<String>();

		couleur2.add("rouge");
		couleur2.add("bleu");
		couleur2.add("vert");
		couleur2.add("jaune");
		
		ArrayList<String> L3 = new ArrayList<String>();
		
	     for(int i=0;i< couleur.size();i++){
	      if(couleur.get(i).equals(couleur2.get(i)))
	       L3.add("1");
	      else
	       L3.add("0");
	     }
	     
	     System.out.println("L3 = "+L3);

	}

	
	public void exo8() {
		
		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");
		
		System.out.println(couleur);
		Collections.swap(couleur, 0, 3);
		System.out.println(couleur);
		
	}
	
	public void exo9() {
		
		
		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");
		
		
		ArrayList<String> couleur2 = new ArrayList<String>();

		couleur2.add("rouge");
		couleur2.add("bleu");
		couleur2.add("vert");
		couleur2.add("jaune");
		
		couleur.addAll(couleur2);
	System.out.println(couleur);
	}
	
	public void exo10() {
		
		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");
		
		System.out.println(couleur);
		
		couleur.clear();
		System.out.println(couleur);
		
	}
	
	public void exo11() {
		
		
		ArrayList<String> couleur = new ArrayList<String>();

		couleur.add("rouge");
		couleur.add("bleu");
		couleur.add("vert");
		couleur.add("jaune");
		
		System.out.println(couleur.isEmpty());
		couleur.clear();
		System.out.println(couleur.isEmpty());
		
	}
	
}
