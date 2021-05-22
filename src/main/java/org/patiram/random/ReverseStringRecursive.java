package org.patiram.random;

public class ReverseStringRecursive {
    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }
    public static void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }

    public static void reverse(char[] s, int start, int end){
        if(end<start)  return;
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        reverse(s, ++start, --end);
    }
}