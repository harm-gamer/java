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
