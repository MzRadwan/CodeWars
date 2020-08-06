public class VowelCount {

    public static void main(String [] args){
        System.out.println(countVow("asdfredc vgfkn aceee"));
    }

    public static int countVow(String s){
        int countOfVowels = 0;
        for(int i =0; i< s.length(); i++){
            String var = s.substring(i, i+1);
            switch (var){
                case "a":
                    countOfVowels++;
                    break;
                case "e":
                    countOfVowels++;
                    break;
                case "i":
                    countOfVowels++;
                    break;
                case "o":
                    countOfVowels++;
                    break;
                case "u":
                    countOfVowels++;
                    break;

            }
        }

        return countOfVowels;
    }
}
