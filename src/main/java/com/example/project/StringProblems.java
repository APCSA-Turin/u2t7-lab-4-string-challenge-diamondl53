package com.example.project;
public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
            // int length = x.length();
            // String lasttwo = x.substring(length-2);
            // if(length<2){
            //     return false;
            // } else if(lasttwo.equals("ly")){
            //     return true;
                
            // } else{
            //     return false;

            // // }
            // int length = x.length();
            // String lasttwo = x.substring(length-2);
            // if(lasttwo.equals("ly")){
            //     return true;
            // } else{
            //     return false;
            // }
            int length = x.length();
            if (length<2){
                return false;
            } else if(x.substring(length-2).equals("ly")){
                return true;
                
            }
            return false; 
            
            

            
       
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat1("abc", "cat") → "abcat"
    // conCat2("dog", "cat") → "dogcat"
    // conCat3("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        int len1 = s1.length();
        int len2 = s2.length();
        if(len2==0){
            return s1;
        }
        String lastofFirst = s1.substring(len1-1);
        String firstofSecond = s2.substring(0,1);
        if(lastofFirst.equals(firstofSecond)){
            String finalSecond = s2.substring(1);
            return s1+finalSecond;
        

        } else{
            return s1+s2;
        }
        
        
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abee") -> "abee"
    // deFront("xbring") -> "bring"
    public String deFont(String s1){
        //implement code here
        int length = s1.length();
        boolean a = s1.substring(0,1).equals("a");
        boolean b = s1.substring(1,2).equals("b");
        String ignoreFirstTwo = "";
        String first = "";
        String second = "";
        if(a==false&&b==false){
            ignoreFirstTwo+= s1.substring(2);
            return ignoreFirstTwo;
        } else if(a==true&&b==false){
             first+= s1.substring(0,1);
             second+= s1.substring(2);
            return first+second;
        } else if(a==false&&b==true){
             first+= s1.substring(1);
            return first;
        } else if(a==true&&b==true){
            return s1;
        }
        return "";
    }
    

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int length = s1.length();
        String stringfinal = "";
        String first = s1.substring(0,1);
        String last = s1.substring(length-1);
        if (first.equals("x")&&last.equals("x")){
            stringfinal = s1.substring(1,length-1);
             return stringfinal;
             
        } else if (first.equals("x")&&!last.equals("x")){
            stringfinal = s1.substring(1,length);
            return stringfinal;
        } else if(!first.equals("x")&&last.equals("x")){
            stringfinal = s1.substring(0,length-1);
            return stringfinal;
        }
        return "";
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
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
    public String fizzString2(int x){
        String stringfinal = "";
        if(x%3!=0&&x%5!=0){
            // stringfinal+="\"";
            stringfinal+=x+"!";
            // stringfinal+="\"";
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