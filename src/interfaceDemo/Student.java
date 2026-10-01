package interfaceDemo;

public class Student implements Comparable<Student>{
	    int marks;

	    Student(int marks) {
	        this.marks = marks;
	    }

	    public int compareTo(Student s) {
	        return this.marks - s.marks;
	    }
	}

