public class Immagine extends ClasseAstrattaElemento {

    private int luminosità;

    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }

    public void diminuisciLuminosità() {
        luminosità--;

    }
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosità));
    }

}

