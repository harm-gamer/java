
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.
class ContainerWater {
    public int maxArea(int[] height) {
        int i =0;
        int j = height.length -1;
        int maxWater = 0;
        while( i< j){
            int width = j - i;
            int currentHeight = Math.min(height[i],height[j]);
            int Water = width * currentHeight;
            maxWater = Math.max(Water,maxWater);
            
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}
