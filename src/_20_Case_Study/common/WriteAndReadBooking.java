package _20_Case_Study.common;

import _20_Case_Study.models.Booking;

import java.io.*;
import java.util.Collection;

public class WriteAndReadBooking {
    public  void Write(String pathFile, Collection<Booking> collection) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(collection);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Collection<Booking> Read(String pathfile) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Collection<Booking> collection = null;
        try {
            fileInputStream = new FileInputStream(pathfile);
            objectInputStream = new ObjectInputStream(fileInputStream);
            collection = (Collection<Booking>)objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return collection;
    }

}
