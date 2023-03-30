/*15. Write a program to perform below operations on int type to get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer
*/

class Q15{
    public static void main(String args[]){
        
        int a=Integer.SIZE;
        System.out.println("Bits in int = "+a);

        int b=Integer.BYTES;
        System.out.println("Bytes in Int= "+b);

        int c=Integer.MIN_VALUE;
        System.out.println("Minimum value of int= "+c);

        int d=Integer.MAX_VALUE;
        System.out.println("Maximum value of int= "+d);
    }
}