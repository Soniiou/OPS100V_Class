import java.util.*;

public class PageReplacement{

  int a[][];

  PageReplacement(int frameNos){
    a=new int [frameNos][frameNos];  
  }

  public void LRU(int req[]){
  
  }

  public static void main(String ar[]){
    int n,s,a[][];
    Scanner sc=new Scanner(System.in());
   
    System.out.println("Enter the Number of Frames");
    n=sc.nextInt(); 
    
    System.out.println("Enter the Reference Array size");
    n=sc.nextInt(); 
    
    PageReplacement pr=new PageReplacement(n);
  }
}
