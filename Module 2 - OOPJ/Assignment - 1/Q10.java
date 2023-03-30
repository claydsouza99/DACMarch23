/*10.Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char        */

class Q10{
    public static void main(String args[]){
        int a=Character.SIZE;
        System.out.println("Bits in Char = "+a);

        int b=Character.BYTES;
        System.out.println("Bytes in Char="+b);

        char c=Character.MIN_VALUE;
        System.out.println("Min value of Char= "+c);

        char d=Character.MAX_VALUE;
        System.out.println("Max value of Char= "+d);

    }
}