public class ContainerWithMostWater{
 public int maxArea(int[] height){
   int left = 0;
   int right = height.length-1;
   int maxArea = 0;

   while(left<right){
     int cwidth = Math.min(height[left],heigth[right]);
     int cheight = right - left;
     int area = cwidth*cheigth;
     maxArea =  Math.max(maxArea,area);

     if(height[left]<height[right]) left++;
     else right--;
     
   }

return maxArea;
   
}
}
