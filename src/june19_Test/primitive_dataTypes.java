package june19_Test;

public class primitive_dataTypes {
    byte b;
    short s;
    int i;
    long l;
    char c;
    float f;
    double d;
    boolean b1;
public void default_values ()
{
    System.out.println("default value of byte " + b);
    System.out.println("default value of short " + s);
    System.out.println("default value of int " + i);
    System.out.println("default value of long " + l);
    System.out.println("default value of char " + c);
    System.out.println("default value of float " + f);
    System.out.println("default value of double " + d);
    System.out.println("default value of boolean " + b1);
}
    public static void main(String[] args) {
primitive_dataTypes obj = new primitive_dataTypes();
  obj.default_values();
    }
}
