package stringdemo;

public class StringDemo {
	public static void main(String[] args) {
		String name = "Java";
		name = name + " Programming";
		
		
		System.out.println(name);
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" Programming");
		
		System.out.println(sb);
		String value = "Hello";
		StringBuilder sbl = new StringBuilder("Java");
		sbl.append(" Programming");
		
		
		long stringStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			name = name + " Programming";
		}
		long stringEnd = System.currentTimeMillis();
		
		
		long stringBStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sb.append(" Programming");
		}
		long stringBEnd = System.currentTimeMillis();
		
		
		long stringBlStart = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbl.append(" Programming");
		}
		long stringBlEnd = System.currentTimeMillis();
		
		
		System.out.println("Time taken by String: "+(stringEnd-stringStart));
		System.out.println("Time taken by StringBuffer: "+(stringBEnd-stringBStart));
		System.out.println("Time taken by StringBuilder: "+(stringBlEnd-stringBlStart));
		
	}
}
