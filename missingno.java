import java.util.ArrayList;
class missingno
{

public static void main(String[] args) {
        int[] ar=new int[]{1,2,7,9,10};
ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<ar.length-1;i++)
        {
           if(ar[i]+1!=ar[i+1]){
                al.add(ar[i]+1);
            }
            else{
                continue;
            }
        }
        System.out.println(a);
    }
}
