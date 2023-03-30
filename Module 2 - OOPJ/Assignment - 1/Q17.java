//17. Write a program to convert state of Integer instance into 
//byte, short, int, long, float and double.

class Q17{
    public static void main(String args[]){

        Integer i=new Integer(5);

        byte b=i.byteValue();
       System.out.println("Byte = "+ b);

       short s=i.shortValue();
        System.out.println("Short = "+ s);

        int j=i;
        System.out.println("Int = "+ j);

        long l=(long)i;
        System.out.println("Long = "+ l);

        float f=(float)i;
        System.out.println("Float = "+ f);

        double d=(double)i;
        System.out.println("Double = "+ d);
    }
}