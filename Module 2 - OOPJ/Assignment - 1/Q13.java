//13.Write a program to convert:
//a. short value into String
//b. short value into Short instance.
//c. String instance into Short instance.

class Q13{
    public static void main(String args[])
    {
        short a=100;
        String str=String.valueOf(a);
        System.out.println("String value= "+str);

        short b=50;
        Short sh=new Short(b);
        System.out.println("Short instance=" + sh);

        String str2=new String("Hello");
        String str3=new String(str2);
        System.out.println("String instance= "+str3);

    }
}