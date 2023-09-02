package tutorial.java.oops;

import java.util.Objects;

public class SlimPerson extends Person {

    int height;
    int width ;

    public SlimPerson(String name, int age, int height,  int width) {
        super(name, age);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlimPerson that = (SlimPerson) o;
        return height == that.height && width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    /*public boolean equals(Object o) {
        if(o == null ) return false;
        if(this == null) return false;
        SlimPerson objectToCompare = (SlimPerson) o;
        return Objects.equals(name, objectToCompare.getName()) &&
                Objects.equals(height, objectToCompare.getHeight()) &&
                Objects.equals(width, objectToCompare.getWidth()) &&
                Objects.equals(age, objectToCompare.getAge());

    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(height, width, name, age);
    }*/

    @Override
    public String toString() {
        return "SlimPerson{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
