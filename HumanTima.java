public class HumanTime {

    public static void main(String []args){
        System.out.println(convert(60));
    }

    public static String convert(int sec){
        String result = "";
        if(sec >= 3600){
            int hh = sec / 3600;
            if(hh < 10)
                result += "0";
            result += Integer.toString(hh) + ":";
            sec = sec % 3600;
        }
        else{
         result += "00:";
        }

        if(sec >= 60){
            int mm = sec / 60;
            if(mm < 10)
                result += "0";
            result += Integer.toString(mm) + ":";
            sec = sec % 60;
        }
        else{
            result += "00:";
        }
        if(sec < 10)
            result += "0";
            result += Integer.toString(sec) ;

        return result;
    }
}
