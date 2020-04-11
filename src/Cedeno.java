
import java.util.Scanner;


public class Cedeno {
    
    int value;
    Cedeno next;
    Cedeno prev;
    
    Cedeno(int v){
 
        this.value = v;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int counter=0;
        System.out.print(" array size : ");
        int q=sc.nextInt();
            int arr [] =new int [q];
        for(int a=0;a<q;a++){
            arr[a]=sc.nextInt();
            counter++;
        }
        if(counter!=0){
             System.out.print("first -> ");
       for(int a=0;a<q;a++){     Cedeno first = null;
     Cedeno temp = new Cedeno(arr[a]);
       Cedeno dummy = temp;
           if(dummy==null){
            temp=new Cedeno(arr[a]); System.out.print(dummy.value+ " <> ");
             dummy= dummy.next;
           }
           else{
              temp=new Cedeno(arr[a]);                      System.out.print(dummy.value+ " <> ");
               dummy= dummy.next;
           }
           }
       System.out.print(" -> null");
       
    }
    }
    
}
/*
5
1
2
3
4
5
*/