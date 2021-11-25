package ProjectFinal;
import java.io.*;
import java.util.*;
import java.lang.*;
class ExternalDevice extends Thread {
        int i;
        int j;
         ExternalDevice(int i,int j){
             this.i=i;
            this.j=j;
         }
         public void run()
         {
             try {
                 int a=i+1;
                 int b=j+1;
                 System.out.println("Token "+ a +" from source "+ b +" transmitted");
     
             }
             catch (Exception e) {
                 
                 System.out.println("Exception is caught");
             }
         }
         
     
     }

