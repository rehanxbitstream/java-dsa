public static boolean isReverse(int []arr1,int []arr2){
        int j=arr2.length-1;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[j]){
                return false;
            }
            j--;
    }
    return true;
    }
