//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Immagine img = new Immagine ("Paesaggio", 5);
        RegistrazioneAudio ra = new RegistrazioneAudio ("Podcast", 4, 3);
        Video deo = new Video ("harry", 3, 5, 45);

        System.out.println();
        img.show();

        System.out.println();
        ra.Riproduzione();
        System.out.println();
        deo.Riproduzione();

    }
    }