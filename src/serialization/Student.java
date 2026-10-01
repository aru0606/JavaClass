package serialization;

import java.io.*;

class Student implements Serializable {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Student s = new Student(101, "Rahul");

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\gomat\\eclipse-workspace\\JavaRockers\\src\\serialization\\student.ser");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);

			oos.close();
			fos.close();

			System.out.println("Object Serialized Successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
