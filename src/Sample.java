import java.util.Calendar;

public class Sample {

	public static void main(String[] args) {
		
		int x;
		x = 5;
		System.out.println(x);
		
		long l = 3874892492874l;
		float f = 0.987943f;
		
		double d = 23.21;
		int sum = 2 + (int)d;
		
		String h = "hello";
		String w = "world";
				
		System.out.println(h + w);
		System.out.println(h + 5);
		
		String hs = "hellow\nworld\tworld\\\"";
		System.out.println(hs);
		
		conditionBranching();
	}
	
	public static void conditionBranching() {
		int age = 12;
		if (age > 20) {
			System.out.println("adult");
		} else if (age > 10) {
			System.out.println("child");
		} else {
			System.out.println("Infant");
		}
		
		String message;
		message = (age > 20) ? "adult" : "child";
		System.out.println(message);
		
		conditionBranchingBySwitch();
	}
	
	public static void conditionBranchingBySwitch() {
		int n = 3;
		
		switch (n) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
			case 4:
				System.out.println("three or four");
				break;
			default:
				System.out.println("None");
				break;
		}
		roopByWhile();
	}
	
	public static void roopByWhile() {
		int n = 0;
		while (n < 10) {
			System.out.println(n + "while");
			n++;
		}
		
		do {
			System.out.println(n + "do while");
			n++;
		} while (n < 10);
		
		roopByFor();
	}
	
	public static void roopByFor() {
		 for (int n = 0; n < 10; n ++) {
//			 if (n == 5) {
//				 break;
//			 }
			 if (n % 2 == 0) {
				 continue;
			 }
			 System.out.println(n + "for");
		 }
		 
		 array();
	}
	
	public static void array() {
		int sales[];
		sales = new int[4];
		sales[0] = 150;
		sales[1] = 200;
		sales[2] = 140;
		sales[3] = 440;
		
		System.out.println(sales.length);
		
		for (int i = 0; i < sales.length; i++) {
			System.out.println(sales[i] + "sales");
		}
		
		int arrays[] = {150, 200, 329, 324};
		for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i] + "arrays");
		}
		
		sayHi("Shohei");
		sayHi();
	}
	
	public static void sayHi(String name) {
		System.out.println("Hi I'm " + name);
	}
	public static void sayHi() {
		System.out.println("Hi I'm Nobody");
		callUser();
	}
	
	public static void callUser() {
		User yok = new User("yok");
		yok.sayHi();
		yok.sayMyName();
		
		User sho = new User("sho");
		sho.sayMyName();
		
		SuperUser yoksho = new SuperUser("yoksho");
		yoksho.sayHi();
	}
}

class User {
	protected String name;
	String email;
	
	//コンストラクタ（初期化処理）
	User(String name) {
		this.name = name;
	}
	
	void sayHi() {
		System.out.println("Hi from User");
	}
	
	void sayMyName() {
		System.out.println("I'm " + this.name);
	}
}

class SuperUser extends User {
	SuperUser(String name) {
		super(name);
	}
	
	void sayHi() {
		System.out.println("Hi from SuperUser"+ this.name);
		
		StringSample st = new StringSample();
	}
}

class StringSample {
	
	StringSample() {
		String s = new String("testtest");
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));
		
		s.replaceAll("tes", "TES");
		System.out.println(s);
		
		String sArray = "sun,mon,tue";
		String[] week = sArray.split(",", 0);
		
	    for (int i = 0; i < week.length; i++) {
			System.out.println(week[i]);
		}
		
	    MathTest m = new MathTest();
	}
}

class MathTest {
	MathTest() {
		double n = 5.433;
		
		System.out.println(Math.ceil(n));
		System.out.println(Math.floor(n));
		System.out.println(Math.round(n));
		System.out.println(Math.random());
		System.out.println(Math.PI);
		
		CalendarTest c = new CalendarTest();
	}
}



class CalendarTest {
	CalendarTest() {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.DATE));
		
		cal.set(2016, 1, 23, 21, 59);
		System.out.println(cal.get(Calendar.DATE));
		
		cal.add(Calendar.DATE, 5);
		System.out.println(cal.get(Calendar.DATE));
	}
}
