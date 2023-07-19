package tutorial.java.serialization.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable  {

    String username = "praveen";
    transient String password = "xyz";


    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String epwd = "123" + this.password;
        oos.writeObject(epwd);
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String  epwd = (String)ois.readObject();
        setPassword(epwd.substring(3));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
