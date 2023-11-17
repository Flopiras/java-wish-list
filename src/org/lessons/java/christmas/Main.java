package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<String> gifts = new ArrayList<>();

		Boolean hasFinish = false;

		Scanner in = new Scanner(System.in);

		while (!hasFinish) {

			System.out.println("Vuoi aggiungere un regalo alla lista?");
			String strAnswer = in.nextLine();
			if (strAnswer.equals("no")) {
				hasFinish = true;
				break;
			}
			
			System.out.println("Che regalo vuoi aggiungere?");
			String gift = in.nextLine();
			gifts.add(gift);
			System.out.println("Ci sono " + gifts.size() + " regali nella lista!");
		}
		
		in.close();
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("REGALI:");
		
		for (String gift : gifts) {
			System.out.println(gift);
		}
		
	}
	
}
