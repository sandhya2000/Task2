package conduira.task;
import java.util.*;
public class ArrayListTask2 {
	
	 
	 public static void main(String args[]){
	  
	 ArrayList<Integer> list=new ArrayList<Integer>();  // creating array list
	 list.add(6);                // adding elements at the end(Order)   
	 list.add(2);
	 list.add(5);
	 list.add(8);
		
	 Iterator<Integer> itr=list.iterator();
	 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
	 }
	 

}
