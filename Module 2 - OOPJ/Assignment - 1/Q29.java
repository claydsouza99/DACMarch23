//29.Write a program to convert state of Double instance into byte, 
//short, int, long, float and double.

class Q29{
    public static void main(String args[]){

        Double inst=new Double(4363466.345346);

        byte b=inst.byteValue();
        System.out.println("Byte ="+b);

        short sh=inst.shortValue();
         System.out.println("Short ="+sh);

        long l=inst.longValue();
         System.out.println("Long ="+l);

        float f=inst.floatValue();
         System.out.println("Float ="+f);

        double d=inst;
         System.out.println("Double ="+d);

    }
}