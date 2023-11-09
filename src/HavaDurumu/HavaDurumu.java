package HavaDurumu;

import java.util.Scanner;

public class HavaDurumu {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hava sicakligini giriniz: ");
		
		heat = input.nextInt();
		
		
		if (heat < 5 ) {
			System.out.println("Kayak yapmaya gidebilirsin");
		
		
		}else if (heat >= 5 && heat <= 25) {
			if (heat <= 15) {
				System.out.println("Sinemaya gidebilirsin");
			} if (heat>= 15) {
				System.out.println("Piknige gidebilirsin");
			}
		} else {
			System.out.println("Yuzmeye gidebilirsin");
		}
		
		

	}

}
