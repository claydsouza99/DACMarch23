/*28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
    (Note: Here you can use doubleToLongBits() method along with methods of Long class).    */

class Q28{

    public static void main(String args[])
    {

        double a=6346346.352534d;

        String str=String.valueOf(a);
        System.out.println("String =" +str);

        Double d=new Double(a);
        System.out.println("Double instance= "+d);

        Double inst=new Double(str);
        System.out.println("String instance = "+inst);

        //once again, no type casting or boxing concept when converting TWO INSTANCES.

        long l=Double.doubleToLongBits(a);
        System.out.println(l);

        String binary=Long.toBinaryString(l);

        String octal=Long.toOctalString(l);

        String hex=Long.toHexString(l);

        System.out.println("Binary string = "+binary);
        System.out.println("Octal string ="+octal);
        System.out.println("Hexadecimal string= " +hex);


    }
}