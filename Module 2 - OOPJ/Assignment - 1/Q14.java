//14.Write a program to convert state of Short instance into byte, 
//short, int, long, float and double.

class Q14{
    public static void main(String args[]){

        short value=120;
        Short sh=new Short(value);
        
        byte b=sh.byteValue();
        System.out.println("Byte= "+b);

        short sh1=sh;
        System.out.println("In short= "+ sh1);

        int i=sh.intValue();
        System.out.println("In int= "+ i);

        long l=sh.longValue();
        System.out.println("In long= "+ l);

        float f=sh.floatValue();
        System.out.println("In float= "+ l);

        double d=sh.doubleValue();
        System.out.println("In Double= "+ l);

    }
}