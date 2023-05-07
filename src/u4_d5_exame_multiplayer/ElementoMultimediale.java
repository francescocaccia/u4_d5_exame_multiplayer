package u4_d5_exame_multiplayer;

abstract class ElementoMultimediale {

	private String titolo;
	private int durata;

	public ElementoMultimediale(String titolo, int durata) {
		this.titolo = titolo;
		this.durata = durata;

	}

	public int getDurata() {
		return durata;
	}

	public String getTitolo() {
		return titolo;
	}
	
	abstract void play();
		
	abstract void show();

}
