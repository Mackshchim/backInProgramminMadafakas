package tatar.mackshchim.spring0;

public class VideoPlayer {
    Video current;

    public void play() {
        System.out.println("Playing: " + current.getFullName());
    }

    public void setCurrent(Video current) {
        this.current = current;
    }
}
