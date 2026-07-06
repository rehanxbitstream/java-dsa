public class RightShitBy1Position{

public static void main(String[] args){

int [] arr = new int[]{3,5,6,7,8,9,0};

int n = arr.length-1;
int temp = arr[n];

for(int i=n;i>0;i--){
arr[i]=arr[i-1];
}

arr[0] = temp;

for(int i:arr){System.out.print(i+" ");}




}



}