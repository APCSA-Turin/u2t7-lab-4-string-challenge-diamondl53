public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
            int length = x.length();
            String lasttwo = x.substring(length-2);
            if(length<2){
                return false;
            } else if(lasttwo.equals("ly")){
                return true;
                
            } else{
                return false;
            }
        
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        int len1 = s1.length();
        int len2 = s2.length();
        String lastofFirst = s1.substring(len1-1);
        String firstofSecond = s2.substring(0,1);
        if(lastofFirst.equals(firstofSecond)){
            String finalSecond = s2.substring(1);
            return s1+finalSecond;
        }else{
            return s1+s2;

        }
        
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    public String deFont(String s1){
        //implement code here
        int length = s1.length();
        String ignoreFirstTwo = s1.substring(2);
        return ignoreFirstTwo;
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        return "";
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String testfizzString(String s1){
        String first = s1.substring(0,1);
        int length = s1.length();
        String last = s1.substring(length-1);
        if(first.equals("f")&&!last.equals("b")){
            return "Fizz";
        } else if(last.equals("b")&&!first.equals("f")){
            return "Buzz";
        } else if(first.equals("f")&&last.equals("b")){
        return "FizzBuzz";
    } else{
        return s1;
    }

    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String testfizzString2(int x){
        String stringfinal = "";
        if(x%3!=0&&x%5!=0){
            stringfinal+="\"\"";
            stringfinal+=x+"!";
            stringfinal+="\"\"";
        } else if(x%3==0&&x%5!=0){
            stringfinal+="Fizz!";
        } else if(x%3!=0&&x%5==0){
            stringfinal+="Buzz!";
        } else if(x%3==0&&x%5==0){
            stringfinal+="FizzBuzz!";
        }

        return stringfinal;
    }
}