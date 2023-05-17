package Listenify;

public class Song {
    public String title;
    public double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    //ToString funtion is an inbuilt function in java that is presenting the object in a nice manner
    @Override
    public String toString() {
        return "Printing Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
