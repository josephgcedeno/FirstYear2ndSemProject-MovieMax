
import java.util.Scanner;


public class AddBefore {
        
    int value;
    AddBefore next;
    AddBefore prev;
  
        AddBefore(int value){
 
        this.value = value;

    }
        public static void main(String[] args) {        
            
            //ver2();
            ver3();
        }
    
         public static void ver2(){
   
            Scanner sc= new Scanner(System.in);
             System.out.println("original position: 'First -> 4 <> 6 <> 7 -> null' ");
              System.out.println("position: (1-3) ");
               
              int pos=sc.nextInt();
             
              AddBefore first=null;
            AddBefore temp4= new AddBefore(5);//iinsert
            
            
            
            
            AddBefore temp1= new AddBefore(4);
            AddBefore temp2= new AddBefore(6);
            AddBefore temp3= new AddBefore(7);
         
           
              
               if(pos==1){
                   temp1.prev=first;
                   temp1.next=first;
                   first=temp4;
                   
//                   temp4.next=temp;
//                   temp.prev=first;
//                   
//                   temp.next=temp2;
//                   temp2.prev=first;
//                   
                   
                   temp2.next=temp3;
                   temp3.prev=first;
                  
                   
                         AddBefore dummy=first;
                         
                          System.out.print(" First -> ");
                   
               while(dummy!=null){
                   System.out.print(dummy.value);
                   if(dummy.next!=null){ System.out.print(" <> ");}
                   dummy= dummy.next;
               }                     System.out.print("  -> null ");
                   
                   
               }

               else if(pos==2){
//
//                   temp.prev=null;
//                   temp.next=null;
//                   first=temp;
//                   
//                   temp.next=temp4;
//                   temp4.prev=first;
                   
                   temp4.next=temp2;
                   temp2.prev=first;
                   
                   
                   temp2.next=temp3;
                   temp3.prev=first;
                  
                   
                         AddBefore dummy=first;
                         
                          System.out.print(" First -> ");
                   
               while(dummy!=null){
                   System.out.print(dummy.value);
                   if(dummy.next!=null){ System.out.print(" <> ");}
                   dummy= dummy.next;
               }                     System.out.print("  -> null ");
                    
               }
                  else if(pos==3){
     
//                   temp4.prev=null;
//                   temp4.next=null;
//                   first=temp;
//                   
//                   temp.next=temp2;
//                   temp2.prev=first;
//                   
                   temp2.next=temp3;
                   temp3.prev=first;
                   
                   
                   temp3.next=temp4;
                   temp4.prev=first;
                  
                   
                         AddBefore dummy=first;
                         
                          System.out.print(" First -> ");
                   
               while(dummy!=null){
                   System.out.print(dummy.value);
                   if(dummy.next!=null){ System.out.print(" <> ");}
                   dummy= dummy.next;
               }                     System.out.print("  -> null ");
                    
                   
               }else {
                          System.out.print(" position from 1-3 only ");
                  }
                    

                   
            
                             

        
         }    public static void ver3(){Scanner sc=new Scanner(System.in);
         int test=sc.nextInt();int counter=1;
            AddBefore first=null;
          
                   AddBefore f=null; 
                  AddBefore fi=null; 
            
            
            AddBefore temp= new AddBefore(4);
            AddBefore temp2= new AddBefore(6);
            AddBefore temp3= new AddBefore(7);
                
            
                   temp.prev=first;
                   temp.next=first;
                   first=temp;
                   
                   temp.next=temp2;
                   temp2.next=null;
                   temp2.prev=temp;
                   
                   temp2.next=temp3;
                    temp3.next=null;
                   temp3.prev=temp2;
                   
                    //iinsert
                AddBefore  dummy=first;
                AddBefore  dumm1=null;
    AddBefore dummy1=new AddBefore(989);
   
                 while(dummy!=null){ 
         
                     if(test==counter){  
                         
                         dummy.prev=dummy1;
                         dummy1.prev=null;
                         dummy1.next=dummy;
//                dummy1.prev=dumm1;
//                 dummy1.next=dummy;
//                 dummy.prev=dummy1;
                   f=dummy;
             
                  
                          break;
               } 
              
                   
                    dummy=dummy.next;     
                       dumm1=dummy;
                     counter++;
                 
                     
                 }       
                         System.out.print(" First -> ");
                   
                 while(f!=null){
                   System.out.print(f.value);
                   if(f.next!=null){ System.out.print(" <> ");}
                   f= f.next;
                         }                     System.out.print("  -> null ");
                
               
             
                    
                
                         
                         
//                          System.out.print(" First -> ");
//                   
//               while(dummy!=null){
//                   System.out.print(dummy.value);
//                   if(dummy.next!=null){ System.out.print(" <> ");}
//                   dummy= dummy.next;
//               }                     System.out.print("  -> null ");
                    
             
         }
}