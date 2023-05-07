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
//un elemento multimediale è una immagine,un video o una registrazioneAudio identificato da un titolo
//un elemento è riproducibile se ha una durata(un valore positivo di tipo int)e un metodo play()
//una registrazione audio è riproducibile e ha associato anche un volume(un valore positivo di tipo int) e i metodi
//abbassavolume() e alzavolume() per regolarlo.Se riprodotta, ripete per un numero di volte pari alla durata la stampa del titolo
//concatenato a una sequenza di punti esclamativi di lunghezza pari al volume(una stampa per riga)

}
