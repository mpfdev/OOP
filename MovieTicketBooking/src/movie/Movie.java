package movie;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private int duration;
    private String rating;
    private List<Showtime> showtimes;

    public Movie (String name, int duration, String rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.showtimes = new ArrayList<>();
    }

    public void addShowtime(Showtime showtime) {
        showtimes.add(showtime);
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", rating='" + rating + '\'' +
                ", showtimes=" + showtimes +
                '}';
    }
}
