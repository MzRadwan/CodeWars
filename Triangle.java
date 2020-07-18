public class Traingle {

    public static void main(String[] args){
        System.out.println(checkTriangle(1,5,6));
    }

    public static boolean checkTriangle(int a, int b, int c){
        boolean isOK = false;
        if(a>0 && b>0 && c>0){
            if((a+b>c)&&(b+c>a)&&(a+c>b) ){
                isOK = true;
            }
        }
        return isOK;
    }
}
