import java.util.*;  
public class Example{  
public static int getLargest(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-1);  
return element;  
}  
public static void main(String args[]){   
Integer a[]={42,62,98,75,31,27,65,10,13,99};  
System.out.println("Largest: "+getLargest(a,10));  
}}