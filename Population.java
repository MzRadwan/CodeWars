public class Population {

    public static void main (String [] args){
        System.out.println(nb_year(1500,5,100,5000));
    }

    public static int nb_year(int p0, int percent, int aug, int p){
        int n = 0;
        while(p0 < p){
            p0 += p0 * 0.01 * percent + aug;
            n++;
        }

        return n;
    }
}
