//25.Write a program to convert state of Float instance into byte, 
//short, int, long, float and double.


class Q25{
    public static void main(String args[]){

    Float f=new Float(335325);

    byte b=f.byteValue();
    System.out.println("Byte ="+b);

    short sh=f.shortValue();
    System.out.println("Short ="+sh);

    int i=f.intValue();
    System.out.println("Int =" +i);

    long l=f.longValue();
    System.out.println("Long= "+l);

    float f1=f;
    System.out.println("Float = "+f1);

    double d=f;
    System.out.println("Double = "+d);

    }
}