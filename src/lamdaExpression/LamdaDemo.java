package lamdaExpression;

public class LamdaDemo {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			public void run() {
				
			}
		};
		
//		MyInterface mi = new MyInterface() {
//			@Override
//			public void one() {
//				System.out.println("Hello");
//				
//			}
//		};
		
		MyInterface mi = ( a, b) -> {
			System.out.println(a+"Hello Guys"+b);
		};
		
		Runnable r = () -> {
            System.out.println("Thread is running");
        };
        
        r.run();
        mi.one(10,20);
        
//        YourInterface yi = (a,b) ->{ 
//        	return a+b;
//        };
        
        YourInterface yi = (a,b) ->a+b;
        
        System.out.println(yi.sum(10, 20));
        
        
		
	}
}
