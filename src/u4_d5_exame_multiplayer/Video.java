package u4_d5_exame_multiplayer;

public class Video extends ElementoMultimediale implements Riproducibile {

	int luminosita;
	int volume;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata);
		this.luminosita = luminosita;
		this.volume = volume;
	}

	@Override
	public void aumentaLuminosita() {
		luminosita++;
	}

	@Override
	public void diminuisciLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}

	}

	@Override
	public void play() {

		String titolo = getTitolo();
		String puntiEsclamativi = ritornaPuntiEsclamativi();
		String asterischi = ritornaAsterischi();

		for (int i = 0; i < getDurata(); i++) {
			System.out.println(titolo + puntiEsclamativi + asterischi);
		}

	}

	private String ritornaAsterischi() {

		String asterisco = "*";
		String risultato = "";

		for (int i = 0; i < luminosita; i++) {
			risultato = asterisco + risultato;
		}
		return risultato;

	}

	void show() {
	}
	protected String ritornaPuntiEsclamativi() {
		String punto = "!";
		String risultato = "";
		for (int i = 1; i <= volume; i++) {
			risultato = risultato + punto;
		}
		return risultato;
	}
	
	@Override
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		}
	}

	@Override
	public void alzaVolume() {

		volume++;
	}
	
}
