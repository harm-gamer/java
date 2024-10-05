// Can Places Flower
//    You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

//    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
public class PlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int s = flowerbed.length;
        if(s==1 && flowerbed[0]==0){
            return true;
        }
        if(s>=2 && flowerbed[0] ==0 && flowerbed[1] == 0){
            if(n==0) return true;
            flowerbed[0] = 1;
            n--;
        }
        if(s>=2 && flowerbed[s-1] == 0&& flowerbed[s-2] == 0){
            if(n==0) return true;
            flowerbed[s-1] = 1;
            n--;
        }
        for(int i= 1;n!=0 && i<s-1;i++){
            if(flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
               n--;  
            }
        }
        return n==0;
    }
}
