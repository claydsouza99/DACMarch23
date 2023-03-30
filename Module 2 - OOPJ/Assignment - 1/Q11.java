/*
11. Accept character from command line and perform below 
operations. Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
   If it is in lowercase then convert it into upper case and print it well as its code point. 
   If it is in uppercase then convert it into lower case and print it well as its code point.     */


class Q11{
    public static void main(String args[]){

    char a=args[0].charAt(0);                  //To use charAt, put args[0] in front then DOT
    System.out.println(a);                     

    //boolean b= Character.isLetterOrDigit(a);          //From Java docs, isLetterOrDigit(char ch) Determines if the specified character is a letter or digit.
    //System.out.println(b);

    boolean c= Character.isDigit(a);                //From Java docs, isDigit(char ch) Determines if the specified character is digit.
    System.out.println("Is digit? " + c);

    if(c==true)
    { System.out.println("Value of digit = "+a);
    }

    boolean d= Character.isLowerCase(a);
    System.out.println("Is lowercase? " +d);

    if (d==true)
    {
        char convert= Character.toUpperCase(a);           //if lower case, will convert to uppercase 
        System.out.println("Conversion = " +convert);

        int codepoint=(int)convert;                         // Codepoint is the ASCII value. So for A, it should be 65.
        System.out.println("Codepoint= "+codepoint);        // Since a is char, we need to make it into int to get 65 value 
    }

    else {                                                //if upper case, will convert to lower case
        char convert=Character.toLowerCase(a); 
        System.out.println("Conversion = " +convert);

        int codepoint1=(int)convert;
        System.out.println("Codepoint= "+codepoint1);
    }

    }
}