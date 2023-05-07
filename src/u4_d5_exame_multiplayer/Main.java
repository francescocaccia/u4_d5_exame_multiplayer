package u4_d5_exame_multiplayer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ElementoMultimediale[] myArray = new ElementoMultimediale[5];
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("inserisci 1 per l'immagine, 2 per video e 3 per registrazione audio");
			Scanner scanner = new Scanner(System.in);
			int sceltaUtente = scanner.nextInt();
			System.out.println("inserisci il titolo");
			scanner.nextLine();
			String titolo = scanner.nextLine();
			System.out.println("inserisci la durata");

			int durata = scanner.nextInt();
			switch (sceltaUtente) {
			case 1:
				System.out.println("inserisci la luminosita");
				int luminosita = scanner.nextInt();
				Immagine myImmagine = new Immagine(titolo, durata, luminosita);
				 myArray[i] = myImmagine;
				break;
			case 2:
				System.out.println("inserisci la luminosita");
				int luminosita1 = scanner.nextInt();
				System.out.println("inserisci il video");
				int video = scanner.nextInt();
				Video myVideo = new Video(titolo, durata, video, luminosita1);
				 myArray[i] = myVideo;
				break;
			case 3:
				System.out.println("inserisci un volume");
				int volume = scanner.nextInt();
				RegistrazioneAudio myRegistrazioneAudio = new RegistrazioneAudio(volume, durata, titolo);
				myArray[i] = myRegistrazioneAudio;
				break;
			}
		}

	}

}
