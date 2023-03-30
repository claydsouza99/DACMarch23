/*8.Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.        */

class Q8{
    public static void main(String args[]){
        byte a=100;
        String str=String.valueOf(a);
        System.out.println("String ="+str);

        Byte b=new Byte(a);
        System.out.println("Byte instance = "+b);

        String str1=new String("125");
        Byte b2=new Byte(str1);
        System.out.println("Byte instance ="+b2);
    }
}