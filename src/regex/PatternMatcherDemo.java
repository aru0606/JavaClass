package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {
	public static void main(String[] args) {

		String text = """
				Welcome to Ocean Academy!

				For course enquiries, contact us at:
				support@oceanacademy.in
				admissions@oceanacademy.in

				Our Java trainer can be reached at java.trainer@gmail.com.
				For Python related queries, email python.team@gmail.com.

				You can also contact our HR team at hr@company.com
				or send your resume to careers@company.org.

				Some random text here...
				This is a training academy providing Java, Python,
				SQL, Testing, React and other technical courses.

				For technical support, contact tech.support@oceanacademy.in.
				For management enquiries, contact manager123@company.net.

				Thank you!
				""";

		// Email Regular Expression
		String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

		// Create Pattern
		Pattern pattern = Pattern.compile(emailRegex);

		// Create Matcher
		Matcher matcher = pattern.matcher(text);

		System.out.println("Email Addresses:");

		// Find and print each email
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		int n = 10;

		String result = (n % 2 == 0) ? "Even" : "Odd";

		System.out.println(result);
		
		if(10>20)
			System.out.println("Hello");
		System.out.println("Everyone");
		
		int i = 0;
		
		for (; i<=10 ; ) {
			System.out.println(i);
			i++;
		}
	}
}
