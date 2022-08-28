public class Program {
    public static void main(String[] args) {
        MovieMaker movieMaker = new MovieMaker();
        movieMaker.startMovieHiring(new Actor());
        movieMaker.startMovieHiring(new Actress());
        movieMaker.startMovieHiring(new Director());
        movieMaker.startMovieHiring(new Producer());
        movieMaker.startMovieHiring(new Choreographer());
    }
}