package movie;

import java.util.Date;

public class Showtime {
    protected Date time;
    protected Movie movie;
    protected boolean[][] seats;

    public Showtime (Date time, Movie movie, int rows, int columns) {
        this.time = time;
        this.movie = movie;
        this.seats = new boolean[rows][columns];
    }

    public int getNumberOfAvailableSeats() {
        int count = 0;
        for (boolean[] row : seats) {
            for (boolean seat: row) {
                if(!seat) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public boolean bookSeats(int numberOfSeats) {
        if (numberOfSeats > getNumberOfAvailableSeats()) {
            return false;
        }
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {
                    seats[i][j] = true;
                    numberOfSeats -= 1;
                    if (numberOfSeats == 0) {
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public Date getTime() {
        return time;
    }

    public Movie getMovie() {
        return movie;
    }

    public boolean[][] getSeats() {
        return seats;
    }
}
