/**
 * Created by admin on 13.02.2017.
 */
public class MassaGram {
    public static void main(String[] args) {
        int massaGramm = 145852312;
        int buf = massaGramm;
        int bufN =0;
        int k = 0;
        int [] Poryadok;
        Poryadok  = new int [3];
        String str = "";
        while (buf >0){

          Poryadok[k] = buf % 1000;
          buf = buf / 1000;
          k = k + 1;
         // switch (k)
         // {
         //     case 1 : str = bufN + " gramms " + str ; break;
         //     case 2 : str = str + bufN + " kg "; break;
         //     case 3 : str = str + bufN + " tons "; break;
         // }
        }
        if (Poryadok[2]!=0) {
            str = str + Poryadok[2] + " tons ";
        }
        if (Poryadok[1]!=0) {
            str = str + Poryadok[1] + " kg ";
        }
        if (Poryadok[0]!=0) {
            str = str + Poryadok[0] + " gramms ";
        }
        System.out.print(str);
    }
}
