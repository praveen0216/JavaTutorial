package tutorial.java.serialization.model;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class RetailAccount implements Serializable {

    private String username = "pravn";
    transient private String pwd = "xyz";
    transient private String gender = "male";
    transient private boolean joint = true;
    transient private int pin = 1234;

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        //In order
        String epwd = "123" + pwd;
        String egender = "trans" + gender;
        boolean ejoint = joint;
        int epin = 4444 + pin;

        oos.writeObject(epwd);
        oos.writeObject(egender);
        oos.writeBoolean(ejoint);
        oos.writeInt(epin);

    }

    private void readObject(ObjectInputStream ois) throws Exception {
        ois.defaultReadObject();

        //In order
        String epwd =  (String) ois.readObject();
        pwd =  epwd.substring(3);
        String egender =  (String) ois.readObject();
        gender =  egender.substring(4);
        boolean ejoint =  (Boolean) ois.readBoolean();
        joint =  ejoint;
        int epin = (Integer) ois.readInt();
        pin = epin - 4444;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isJoint() {
        return joint;
    }

    public void setJoint(boolean joint) {
        this.joint = joint;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
