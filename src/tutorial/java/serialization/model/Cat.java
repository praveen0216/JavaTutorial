package tutorial.java.serialization.model;

import java.io.Serializable;

public class Cat implements Serializable {

    public  int c = 10;
    public final transient int d = 20 ;
}
