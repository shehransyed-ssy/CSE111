public class Student {
	Sting name;
	String ID;
	Double CGPA;
	int theorySec;
	int labSec;

	Student(String n, String id, double cgpa, int ts, int ls) {
		name = n;
		ID = id;
		CGPA = cgpa;
		theorySec = ts;
		labSec = ls;
	}

	void makeRequest(int from, int to) {
		Manager.swap(this, from, to);
	}
}