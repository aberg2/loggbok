import java.io.*;

/*
Enkelt test
Skrivet av Magnus
Den 3/9 2020
*/
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        save();
        load();
    }

    private static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ins= new ObjectInputStream(new FileInputStream(new File("testSave.txt")));
        loggbok l = (loggbok) ins.readObject();
        ins.close();
        view myObj = new view();

        System.out.println(myObj.message);

    }

    private static void save() throws IOException {
        loggbok l = new loggbok("test");
        view myObj = new view();

        ObjectOutputStream outs=new ObjectOutputStream(new FileOutputStream(new File("testSave.txt")));
        outs.writeObject(myObj.message);
        outs.flush();
        outs.close();
    }

}