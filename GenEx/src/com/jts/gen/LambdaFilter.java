import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFilter {
	public static void main(String[] args) {
		List<Employ> lst=new ArrayList<Employ>();
		
		lst.add(new Employ(1,"Prasanna", 52333));
		lst.add(new Employ(3,"Chandu",52111));
		lst.add(new Employ(4,"Aditya",55666));
		lst.add(new Employ(5,"Shashank",67333));
		
		System.out.println("Default Values  ");
		lst.forEach((x) -> System.out.println(x));
		
		Stream<Employ> filter_data=lst.stream().filter(e -> e.basic > 55000);
		
		System.out.println("Filtered data is  \n------------------");
		filter_data.forEach(e -> System.out.println(e));
	}
}
