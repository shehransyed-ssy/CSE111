public class Manager {
	static int requestsReceived = 0;
	static int successfulSwaps = 0;
	static int [] CSE111LabSections = new int [18];

	Manager() {
		fillSections();
	}

	private static void fillSections() {
		for (int i = 0; i < CSE111LabSections.length; i++) {
			CSE111LabSections[i] = 40;
		}
	}

	static void swap(Student s, int from, int to) {
		requestsReceived++;
		if (CSE111LabSections[to - 1] <= 42) {
			System.out.println("Success");
			CSE111LabSections[from - 1]--;
			CSE111LabSections[to - 1]++;
			s.labSec = to;
			successfulSwaps++;
		} else {
			System.out.println("Sorry, cannot approve your request");
		}
	}

}