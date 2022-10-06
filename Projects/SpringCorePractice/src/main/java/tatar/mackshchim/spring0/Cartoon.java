package tatar.mackshchim.spring0;

public class Cartoon extends Video{
    public String name;

    public Cartoon(String videoName, String name) {
        super(videoName);
        this.name = name;
    }

    @Override
    public String getFullName() {
        return videoName + " " + name;
    }

}
