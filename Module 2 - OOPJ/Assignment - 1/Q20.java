  /* 20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
*/

class Q20{

public static void main(String args[]){

long a=500005603;
String str= String.valueOf(a);
System.out.println("String = "+str);

Long b=new Long(a);
System.out.println("Long instance = "+b);

String str1=new String(str);
Long c=new Long(str1);
System.out.println("String instance to Long instance = "+c);
//learnt here that in Instance, no type casting or Boxing needed.

String binary=Long.toBinaryString(a);

String octal=Long.toOctalString(a);

String hex=Long.toHexString(a);

System.out.println("Binary string = "+binary);
System.out.println("Octal string ="+octal);
System.out.println("Hexadecimal string= " +hex);


 
}
}