// 21.Write a program to convert state of Long instance into byte, 
// short, int, long, float and double

class Q21 {
    public static void main(String args[]){

    Long l=new Long(50000000);

    byte b=l.byteValue();
    System.out.println("Byte = "+b);     //out of range 

    short s=l.shortValue();
    System.out.println("Short="+s);     //out of range

    int i=l.intValue();
    System.out.println("Int = "+i);

    float f=(float)l;
    System.out.println("Float= "+f);

    double d=l;
    System.out.println("Double ="+d);


    }
}