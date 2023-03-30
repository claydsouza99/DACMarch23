/* 24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string    */

class Q24{
    public static void main(String args[]){

        float f=43634632;
        String str=String.valueOf(f);
        System.out.println(str);

        Float f1=new Float(f);
        System.out.println("Float Instance = "+f1);

        String inst=new String(str);
        System.out.println("String instance= "+inst);

        String hexa=Float.toHexString(f);
        System.out.println("Hexadecimal string = "+hexa);

    }
}