public class Solution {

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && ((temperature >= 25) && (temperature <= 45))){
            return true;
        }else return (temperature >= 25) && (temperature <= 35);
    }
}
