// 31.Read the documentation of NumberFormatException and try to 
// generate it in Java code.

class Q31{
    public static void main(String args[]){
    
    String str="154ghr93";
    int i=Integer.valueOf(str);
    System.out.println(i);

    }
}

//Number Format Exception is thrown when you're converting String ---> numeric value, but the string contains alphabetical chracters
//which obviously Int can't parse