package u4_d5_exame_multiplayer;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
	private int volume;

	public RegistrazioneAudio(int volume, int durata, String titolo) {
		super(titolo, durata);
		this.volume = volume;

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

	protected String ritornaPuntiEsclamativi() {
		String punto = "!";
		String risultato = "";
		for (int i = 1; i <= volume; i++) {
			risultato = risultato + punto;
		}
		return risultato;
	}

	@Override
	public void play() {

		for (int i = 1; i <= getDurata(); i++) {
			System.out.println(getTitolo() + ritornaPuntiEsclamativi());
		}

	}
	
	void show() {}

	public void aumentaLuminosita() {}

	public void diminuisciLuminosita() {}

}
