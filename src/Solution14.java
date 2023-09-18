import java.util.LinkedList;
import java.util.Queue;
public class Solution14 {
   public int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> studentsQueue = new LinkedList<Integer>();
     Queue<Integer> sandwhichesQueue = new LinkedList<Integer>();
     int temp;
     int count = 0;
     for(Integer i : students){
        studentsQueue.add(i);
     }
     System.out.println(studentsQueue);
      for(Integer j : sandwiches){
        sandwhichesQueue.add(j);
     }
     System.out.println(sandwhichesQueue);

     if(studentsQueue.peek() == 1 && sandwhichesQueue.peek() ==1){
        studentsQueue.poll();    
        sandwhichesQueue.poll();
        System.out.println(studentsQueue);
        System.out.println(sandwhichesQueue);

     }
      if (studentsQueue.peek() == 1 && sandwhichesQueue.peek() ==0){
         temp = studentsQueue.peek();
        studentsQueue.poll();
        studentsQueue.offer(temp);
        System.out.println(studentsQueue);
     }
    if(studentsQueue.peek() == 0 && sandwhichesQueue.peek() ==0){
        studentsQueue.poll();    
        sandwhichesQueue.poll();
        System.out.println(studentsQueue);
        System.out.println(sandwhichesQueue);

     }
     if (studentsQueue.peek() == 0 && sandwhichesQueue.peek() ==1){
         temp = studentsQueue.peek();
        studentsQueue.poll();
        studentsQueue.offer(temp);
        System.out.println(studentsQueue);
     }

     



        return 0;
        
    }
    
}
