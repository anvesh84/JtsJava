
public class TimeZone {
	int hrs;
	int mins;
	public TimeZone(int hrs, int mins) {
		super();
		this.hrs = hrs;
		this.mins = mins;
	}
	public TimeZone() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TimeZone [hrs=" + hrs + ", mins=" + mins + "]";
	}
	
	public TimeZone add(TimeZone t1, TimeZone t2) {
		TimeZone t3 = new TimeZone();
		t3.hrs=t1.hrs+t2.hrs;
		t3.mins=t1.mins+t2.mins;
		if(t3.mins > 60) {
			t3.hrs++;
			t3.mins=t3.mins%60;
		}
		return t3;
	}
	public static void main(String[] args) {
		TimeZone t1 = new TimeZone(5, 45);
		TimeZone t2 = new TimeZone(3, 30);
		TimeZone t3 = new TimeZone().add(t1, t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
