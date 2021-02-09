import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		Predicate<Integer> lessthan18 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t<18;
			}
			
		};
		
		Predicate<Integer> morethan10 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>10;
			}
			
		};
		System.out.println(lessthan18.test(10));
		Predicate<String> isSNEOn = (String temp)->temp.equals("Yes");
		System.out.println(isSNEOn.test("Yes"));
		System.out.println(lessthan18.and(morethan10).test(17));
		print();
		
	}
	
	public static int print() {
		System.out.println("Hello ...");
		System.out.println("Hello ....");
		System.out.println("Hello .....");
		System.out.println("Hello ......");
		return 1;
	}

}
