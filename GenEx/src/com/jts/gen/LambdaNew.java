import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaNew {
	public static void main(String[] args) {
		List<Employ> lst=new ArrayList<Employ>();
		
		lst.add(new Employ(1,"Prasanna", 52333));
		lst.add(new Employ(3,"Chandu",52111));
		lst.add(new Employ(4,"Aditya",52552));
		lst.add(new Employ(5,"Shashank",67333));
		
		System.out.println("Default Values  ");
		lst.forEach((x) -> System.out.println(x));
		
		Collections.sort(lst,(e1,e2) -> {
			return e1.name.compareTo(e2.name);
		});
		System.out.println("Data after Sorting....\n----------------");
		lst.forEach((x) -> System.out.println(x));
		
		Collections.sort(lst,(e1,e2) -> {
			return (int) (e1.basic-e2.basic);
		});
		
		System.out.println("Sorted By Basic Wise  ");
		
		lst.forEach((x) -> System.out.println(x));
	}
}
