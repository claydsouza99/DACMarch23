/*6.Write a program to perform below operations on Boolean type to 
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/


public class Q6{
    public static void main(String[] args){
        boolean b=true;
        String a=String.valueOf(b);
        System.out.println("String ="+a);

        
        Boolean d=new Boolean(b);
        System.out.println("Boolean instance=" +d);


        String str="1";
        boolean e=Boolean.valueOf(str);
        System.out.println("Boolean ="+e);

        Boolean f=new Boolean(str);
        System.out.println("String = "+f);
    }
}


