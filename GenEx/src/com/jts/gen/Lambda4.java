import java.util.ArrayList;
import java.util.List;

public class Lambda4 {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("Mayank");
		lst.add("Ankit");
		lst.add("Irfan");
		lst.add("Aditya");
		lst.add("Chandu");
		lst.add("Shashank");
		
	//	lst.forEach((n) -> System.out.println(n));
		lst.forEach(System.out::println);
	}
}
