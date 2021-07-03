package strategy;

public class Main {

    public static void main(String[] args) {
        MediaFile video = new MediaFile(new PlayVideo());
        video.play();

        MediaFile audio = new MediaFile(new PlayAudio());
        audio.play();

        MediaFile gif = new MediaFile(new PlayGif());
        gif.play();

        MediaFile mediaFile = new MediaFile(null);
        mediaFile.play();

        mediaFile.setPlayBehaviour(new PlayAudio());
        mediaFile.play();

        mediaFile.setPlayBehaviour(new PlayGif());
        mediaFile.play();

        mediaFile.setPlayBehaviour(new ImageView());
        mediaFile.play();
    }
}
