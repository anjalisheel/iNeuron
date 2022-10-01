package MovieApplication.Entities;

import java.util.List;

public interface TheatreService {

    public List<Theatre> findTheatreByZipcode(int zipCode);
    public Theatre findTheaterByName(String name);
    public List<Movie> findMoviesInATheater(String theaterName);
    public void addMoviesInATheater(String theaterName, long movieId, User user);
    public void removeMoviesInATheater(String theaterName, long movieId, User user);
}
