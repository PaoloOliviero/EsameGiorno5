public class Video extends ClasseAstrattaRiproduzione {

    private int durata;
    private int volume;
    private int luminosità;

    public Video(String titolo, int durata, int volume, int luminosità) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosità = luminosità;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void diminuisciLuminosità() {
        luminosità--;
    }

    public void aumentaLuminosità() {
        luminosità++;
    }
    @Override
    public void Riproduzione() {
        for (int i = 0; i < durata; i++) {
            String puntiEsclamativi = "!".repeat(volume);
            String asterischi = "*".repeat(luminosità);
            System.out.println(getTitolo() + " " + puntiEsclamativi + asterischi);
        }
    }


}

