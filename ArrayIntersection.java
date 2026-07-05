import java.util.ArrayList;
public class ArrayIntersection{

public static void main(String[] args){

int []arr1 = {2,3,4,5,6,7,9};
int []arr2 = {1,4,6,9};
ArrayList al = new ArrayList();

int i=0;
int j=0;

while(i<arr1.length && j<arr2.length){

if(arr1[i]<arr2[j]){
i++;
}

else if(arr1[i]>arr2[j]){
j++;
}
else if(arr1[i]==arr2[j]){
al.add(arr1[i]);
i++;
j++;

}


}


System.out.println(al);


}




}