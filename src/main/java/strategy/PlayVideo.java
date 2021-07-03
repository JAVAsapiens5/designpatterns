package strategy;

public class PlayVideo implements PlayBehaviour {
    @Override
    public void play() {
        System.out.println("Odtwarzam video");
    }
}
