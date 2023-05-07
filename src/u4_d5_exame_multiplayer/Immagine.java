package u4_d5_exame_multiplayer;

public class Immagine extends ElementoMultimediale {

	int luminosita;

	public Immagine(String titolo, int durata, int luminosita) {
		super(titolo, durata);
		this.luminosita = luminosita;
	}

	public void show() {

		System.out.print(getTitolo() + ritornaAsterischi());

	}

	private String ritornaAsterischi() {

		String asterisco = "*";
		String risultato = "";

		for (int i = 0; i < luminosita; i++) {
			risultato = asterisco + risultato;
		}
		return risultato;
	}
	void play() {}
}