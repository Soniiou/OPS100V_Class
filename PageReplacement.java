import java.util.*;
public class PageReplacement{

  //you may need to introduce more variables

  PageReplacement(int frameNos){
      
  }

  
    public void secondChance(int req[]){
  
  }
    public void lru(int req[]){
  
  }
  
    public void nru(int req[]){
  
}
    public void fifo(int req[]){
  
}
    public void clock(int req[]){
  
}
  

  public static void main(String ar[]){
    int n,s,a[];
    Scanner sc=new Scanner(System.in());
   
    System.out.println("Enter the Number of Frames");
    n=sc.nextInt(); 
    
    System.out.println("Enter the Reference Array size");
    s=sc.nextInt();
    a=new int [s];
    
    for(int i=0;i<s;i++){
      System.out.println("Enter "+i+"th referencing page");
      a[i]=sc.nextInt();
    }
    
    
    PageReplacement pr=new PageReplacement(n);
  }
}


//This is a test
