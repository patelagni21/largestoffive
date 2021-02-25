public class LargestOfFive {
  
   public static void main(String args[]) {
      
       int largest = Integer.parseInt(args[0]);
      
       for(int i=1;i<args.length;i++)
       {
           if(largest<Integer.parseInt(args[i]))
               largest = Integer.parseInt(args[i]);
       }
       System.out.println(largest);
   }
}