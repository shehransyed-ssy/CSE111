public class Tracking {
	static double revenue = 0;
	static double lateFine = 0.05;
	static int time = 7;

	static void Rent(Anime a) {
		revenue += a.cost;
	}

	static void Return(Anime a, int t) {
		revenue += Penalize(a, t);
	} 

	private static double Penalize(Anime a, int t) {
		if (t > time) {
			return (t - time) * (lateFine * a.cost);
		} else {
			return 0;
		}
	}

	static double getRevenue() {
		return revenue;
	}

}