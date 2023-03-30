//9.Write a program to convert state of Byte instance into byte, 
//short, int. long, float and double.

class Q9{
    public static void main(String args[]){

    byte value=120;
    Byte b=new Byte.valueOf(value);

    System.out.println("Byte = "+b);

    /* byte instance to byte
    byte value =123;
    Byte bs=new Byte(value);
    byte number=bs.byteValue();
    System.out.println("Byte "+number);          */

    short s=(short)b;
    System.out.println("Short ="+s);

    int i=(int)b;
    System.out.println("Int = "+i);

    long l=(long)b;
    System.out.println("Long ="+l);

    float f=(float)b;
    System.out.println("Long ="+l);

    double d=(double)b;
    System.out.println("Long ="+l);
    }
}
