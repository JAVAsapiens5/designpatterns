package strategy;

// pliku audio i wideo
// nowa funkcjonalność: image
// nowa funkcjonalność 2: gif
public class MediaFile {

    private PlayBehaviour playBehaviour;

    public MediaFile(PlayBehaviour playBehaviour) {
        this.playBehaviour = playBehaviour;
    }

    public void compress() {
        // potrafimy kompresować zarówno audio jak i wideo
    }

    public void play() {
        if (playBehaviour == null) {
            System.out.println("Nie wiem co zrobić.... :(");
        } else {
            playBehaviour.play();
        }
    }

    public void setPlayBehaviour(PlayBehaviour playBehaviour) {
        this.playBehaviour = playBehaviour;
    }
}
