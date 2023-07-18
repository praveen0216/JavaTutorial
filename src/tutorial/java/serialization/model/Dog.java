package tutorial.java.serialization.model;

import java.io.Serializable;

public class Dog implements Serializable {
    public  int i = 10;
    public final transient int j = 20 ;
}
