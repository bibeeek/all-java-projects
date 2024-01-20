import java.io.Serializable;

public class Seriliaxation implements Serializable

{

    String name;
    String password;


    public void sayHello(){
        System.out.println("hello "+name);
    }

}
