package MovieApplication.Entities;

public interface MovieService {
    //Allow user to search the movie
    public Movie findMovieById(String id);
    public Movie findMovieByName(String name);

    //create a movie -- only admin should be allowed
    public Movie createMovie(User user);

    //update a movie -- only admin should be allowed
    public Movie updateMovie(User user);
}
