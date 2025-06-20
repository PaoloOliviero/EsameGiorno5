import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Immagine img = new Immagine ("Paesaggio", 5);
        RegistrazioneAudio ra = new RegistrazioneAudio ("Podcast", 4, 3);
        Video deo = new Video ("harry", 3, 5, 45);

        System.out.println();
        img.show();

        System.out.println();
        ra.Riproduzione();
        System.out.println();
        deo.Riproduzione();

        ClasseAstrattaElemento[] Elementi = new ClasseAstrattaElemento[5];





    }

}