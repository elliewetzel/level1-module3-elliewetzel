
public class Netflix {
public static void main(String[] args) {
	Movie m = new Movie("Transformers", 5);
	Movie m1 = new Movie("Pirates of the Carribean", 4);
	Movie m2 = new Movie("Star Wars", 5);
	Movie m3 = new Movie("Titanic", 2);
	Movie m4 = new Movie("Black Panther", 4);
	String price = m4.getTicketPrice();
	System.out.println(price);
	NetflixQueue netflix = new NetflixQueue();
	netflix.addMovie(m);
	netflix.addMovie(m1);
	netflix.addMovie(m2);
	netflix.addMovie(m3);
	netflix.addMovie(m4);
	netflix.printMovies();
	System.out.println("The best movie is" + netflix.getBestMovie());
	System.out.println("The second best movie is Black Panther.");
}
}
