package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//BASIC
		//List<String> gifts = new ArrayList<>();
		
		//BONUS
		List<Gift> gifts = new ArrayList<>();

		Boolean hasFinish = false;

		Scanner in = new Scanner(System.in);

		while (!hasFinish) {

			System.out.println("Vuoi aggiungere un regalo alla lista?");
			String strAnswer = in.nextLine();
			if (strAnswer.equals("no")) {
				hasFinish = true;
				break;
			}
			
			//BASIC
			//System.out.println("Che regalo vuoi aggiungere?");
			//String gift = in.nextLine();
			//gifts.add(gift);
			
			//BONUS
			System.out.println("Che regalo vuoi aggiungere?");
            String name = in.nextLine();
            
            System.out.println("A chi è destinato il regalo?");
            String recipient = in.nextLine();

            gifts.add(new Gift(name, recipient));
            
            
			System.out.println("Ci sono " + gifts.size() + " regali nella lista!");
		}
		
		System.out.print("Come vuoi ordinare la lista? \n "
				+ "Digita 1 per ordinarla per regali \n "
				+ "Digita 2 per ordinarla per destinatari ");
        String order = in.nextLine();

        if (order.equals("1")) {
            Collections.sort(gifts, Comparator.comparing(Gift::getName));
        } else if (order.equals("2")) {
            Collections.sort(gifts, Comparator.comparing(Gift::getRecipient));
        }
		
		in.close();
		
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("REGALI:");
		
		for (Gift gift : gifts) {
			System.out.println(gift);
		}
		
	}
	
}
