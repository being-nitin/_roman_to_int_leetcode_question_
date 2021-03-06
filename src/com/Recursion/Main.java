package com.Recursion;
import java.util.HashMap;
public class Main {
    // Program to convert the roman numbers to integer:
    public static void main(String[] args) {
	String str = "MXIV";
	int ans = romanToInt(str);
        System.out.println(ans);
    }
    public static int romanToInt(String str){
        HashMap <Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result = map.get(str.charAt(str.length()-1));
        for(int i=str.length()-2;i>=0;i--){
            if(map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                result = result-map.get(str.charAt(i));
            }
            else{
                result = result +map.get(str.charAt(i));
            }
        }
        return result;
    }
}
// in this we have used map, which will store string as key and corresponding Integer as value
/*
  Then we have started the iteration from end and compared the Ith element with I=1th element:
  if the Ith element is less than I+1th element then the result will get subtracted by the
  corresponding value of the key, and if the Ith element is less than I+1th element then the
  result will added by the corresponding value of the key.
 */