package IO.serializationPack;

import java.io.*;

public class ObjectSerializationExample {

    public static void main(String[] args) {

        try {

            Product prod1 = new Product(200, "TV", 2);

            FileOutputStream fos = new FileOutputStream("myobject.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream("myobject.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            oos.writeObject(prod1);

            System.out.println("Object is serialized");

            System.out.println("Start deserializing....");

            Product prodCopy = (Product)ois.readObject();

            System.out.println(prodCopy);

        } catch (IOException e) {

            throw  new RuntimeException(e);

        } catch (ClassNotFoundException e) {

            System.out.println("Error");

        }

    }

}