package com.ua.lesson27;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            String text = "Hello!";
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt"));
            osw.write(text);
            osw.close();
        } catch (FileNotFoundException fe) {
            throw new RuntimeException();
        } catch (IOException ioe) {
            throw new RuntimeException();
        }

        try (InputStream is = new FileInputStream("test.txt")) {
            byte[] data = is.readAllBytes();
            String dataString = new String(data);
            System.out.println(dataString);
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        } catch (IOException io) {
            throw new RuntimeException();
        }

        Student one = new Student("www", 23, new String[]{"rrr", "ooo", "ttt"});
        Student two = new Student("tds", 25, new String[]{"ngf", "fgh", "hjdz"});
        Student three = new Student("hfs", 32, new String[]{"vnhj", "xhh", "sfgh"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Student.txt"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Student.txt"));
            Student oneCer = (Student) is.readObject();
            Student twoCer = (Student) is.readObject();
            Student threeCer = (Student) is.readObject();
            System.out.println("Student one: " + oneCer.getName());
            System.out.println("Student two: " + twoCer.getName());
            System.out.println("Student three: " + threeCer.getName());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        }


    }
}
