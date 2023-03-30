/*23.Write a program to perform below operations on float type to get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float        */

class Q23{

    public static void main(String args[]){
    
    int a=Float.SIZE;
    System.out.println("Bits in Float= "+a);

    int b=Float.BYTES;
    System.out.println("Bytes in Float = "+b);

    float c=Float.MIN_VALUE;
    System.out.println("Min value in Float= "+c);

    float d=Float.MAX_VALUE;
    System.out.println("Max value in Float=" +d);

    }
}