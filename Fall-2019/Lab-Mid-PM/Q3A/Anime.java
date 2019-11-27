public class Anime {
	String name;
	String genre;
	String type;
	int numOfEpisodes;
	int numOfSeanons;
	String status;
	String DOR;
	private double price_Series = 1000;
	private double price_Movie = 750;
	double cost;

	Anime() {
		this("NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
	}

	Anime(String n, String g, String t, int noe, int nos) {
		name = n;
		genre = g;
		type = t;
		numOfEpisodes = noe;
		numOfSeanons = nos;

		if (type.equals("Series")) {
			cost = price_Series;
		} else if (type.equals("Movie")) {
			cost = price_Movie;
		} else {
			cost = 0;
		}
	}

	Anime(String n, String g, String t, int noe, int nos, String s, String d) {
		this(n, g, t, noe, nos);
		status = s;
		DOR = d;
	}

}