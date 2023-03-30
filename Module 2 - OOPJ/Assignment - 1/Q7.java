/*
7.Write a program to perform below operations on byte type to 
get:
a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte
d. The maximum value a byte
*/

class Q7{
    public static void main(String args[]){
        int a=Byte.SIZE;
        System.out.println("Bits in Int= "+a);

        int b=Byte.BYTES;
        System.out.println("Bytes in Int= "+b);

        byte c=Byte.MAX_VALUE;
        System.out.println("Max value in Int= " +c);

        byte d=Byte.MIN_VALUE;
        System.out.println("Min value in Int= "+ d);




    }
}