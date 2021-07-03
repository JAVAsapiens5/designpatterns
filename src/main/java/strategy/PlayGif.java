package strategy;

public class PlayGif implements PlayBehaviour {
    @Override
    public void play() {
        System.out.println("Odtwarzam GIF");
    }
}
