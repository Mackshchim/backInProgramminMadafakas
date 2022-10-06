package tatar.mackshchim.spring0;

public abstract class Video {
    String videoName;

    public Video(String name) {
        this.videoName = name;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getFullName() {
        return videoName;
    }
}
