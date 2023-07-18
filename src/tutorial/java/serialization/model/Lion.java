package tutorial.java.serialization.model;

import java.io.Serializable;

public class Lion implements Serializable {
    public  int l = 10;
    public final transient int m = 20 ;
}
