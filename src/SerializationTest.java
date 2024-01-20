import java.io.*;


public class SerializationTest  {
    public static void main(String[] args) throws IOException {

        //Serialization: the process of converting an object into a
        // byte stream. Persists(saves the state) the object after program exits
        // this byte stream can be saved as a file or sent over a network
        // can be sent to different machine
        //byte stream can be saved a file(.ser) which is platform independent
        // (think of this as if you re saving a file with the objects info)

        //deserialixation: the reverse process of converting a byte stream into an object
        // think of this as if youre loading a saved file


        Seriliaxation user=new Seriliaxation();
        user.name="nro";
        user.password="gg";

        FileOutputStream fileout=new FileOutputStream("UserInfo.ser");

        ObjectOutputStream out=new ObjectOutputStream(fileout);
        out.writeObject(user);
        out.close();
        fileout.close();

        System.out.println("Object Info saved");

    }
}
