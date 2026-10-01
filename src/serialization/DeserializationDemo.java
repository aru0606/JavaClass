package serialization;

import java.io.*;

public class DeserializationDemo {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\gomat\\eclipse-workspace\\JavaRockers\\src\\serialization\\student.ser");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println("ID   : " + s.id);
            System.out.println("Name : " + s.name);

            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}