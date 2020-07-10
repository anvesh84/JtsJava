
interface IHello {
	void sayHello();
}

public class LambdaExpr1 {

	public static void main(String[] args) {
		IHello h2=() -> {
			System.out.println("Hi I am Aditya...");
		};
		
		IHello h3=()->{
			System.out.println("Hi I am Chandu...");
		};
		
		h2.sayHello();
		h3.sayHello();
	}
}
