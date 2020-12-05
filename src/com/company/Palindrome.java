package com.company;

public class Palindrome {
    public static void reverse(String name){
String newName="";
for(int i=name.length()-1;i>=0;i--){
 newName=newName+name.charAt(i);
}
if(name.equals(newName)){
    System.out.println("palindrome");
}
else {
    System.out.println("Not a palindrome");
}
    }
    public static void main(String args[]){
reverse("abc");
    }
}
