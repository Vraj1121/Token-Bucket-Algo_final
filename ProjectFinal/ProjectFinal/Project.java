package ProjectFinal;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Project {
    public static void main(String args[]){
        IntermediateDevice device= new IntermediateDevice();
        System.out.println("Enter Number of Tokens assigned to Intermediate Device: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        device.setMaximumTokens(n);
        System.out.println("Enter Number of External Devices to be there that transmits simultaneously: ");
        int m=sc.nextInt();
        if(n>=m){
        System.out.println("Number of packets with tokens successfully transmitted through an intermediate device: "+m);
        System.out.println("Number of packets lost i.e. returned back to source from intermediate device: 0");
        }
        if(n<m){
            int a=m-n;
            System.out.println("Number of packets with tokens successfully transmitted through an intermediate device: "+n);
            System.out.println("Number of packets lost i.e. returned back to source from intermediate device: "+ a);
            }
         ExternalDevice[] externalDevices= new ExternalDevice[m]; 
         ArrayList<Integer> list = new ArrayList<Integer>();
        for (int k=0; k<m; k++) {
            list.add(k);
        }
        Collections.shuffle(list);
        for(int i=0;i<m ;i++){

            externalDevices[i]= new ExternalDevice(i,list.get(i)); 
        }
        if(m>=n)
        for(int i=0; i<n; i++){
            
            externalDevices[i].start();
        }
        else{
            for(int i=0; i<m; i++){
            
                externalDevices[i].start();
        }
}
    }
}
