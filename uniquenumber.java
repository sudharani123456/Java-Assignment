import java.util.Scanner;
import java.util.ArrayList;
class uniquenumber{
   public static void main(String args[])
   {
    int arr[]=new int[]{1,2,3,4,2,4,5};
ArrayList<Integer>res=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
        {
            if(res.contains(arr[i])){
                continue;
            }
            else{
                res.add(arr[i]);
            }
        }
     System.out.println(res);
}
}











