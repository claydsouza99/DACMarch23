/*
19.Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long
*/

class Q19{
    public static void main(String args[])
{

int a=Long.SIZE;
System.out.println("Bits in Long ="+a);

int b=Long.BYTES;
System.out.println("Bytes in Long= "+b);

long c=Long.MIN_VALUE;
System.out.println("Min value of Long= "+c);

long d=Long.MAX_VALUE;
System.out.println("Max value of Long= "+d);

}
}
