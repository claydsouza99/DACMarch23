/*16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.
*/

class Q16{
    public static void main(String args[]){

        int a=50;

        String str=String.valueOf(a);
        System.out.println("String = "+str);

        Integer i=new Integer(a);
        System.out.println("Integer instance = "+i);

        String str1=new String(str);
        Integer j=new Integer(str1);
        System.out.println("String instance to Integer instance= "+j);

        String binary_string = Integer.toBinaryString(a);
        String octal_string =Integer.toOctalString(a);
        String hex_string = Integer.toHexString(a);

        System.out.println("Binary String = "+binary_string);
        System.out.println("Octal String = "+octal_string);
        System.out.println("Hexadecimal String = "+hex_string);

    }
}


/*
LOGIC -
toBinaryString(int i)
Returns a string representation of the integer argument as an unsigned integer in base 2.

toHexString(int i)

Returns a string representation of the integer argument as an unsigned integer in base 16.

toOctalString(int i)
Returns a string representation of the integer argument as an unsigned integer in base 8.
*/