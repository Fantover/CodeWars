public class Square{
    public static boolean isSquare(int n) {
        if(n>=0){
            if(Math.pow((int)Math.sqrt(n),2.0) == Math.pow(Math.sqrt(n),2.0)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}