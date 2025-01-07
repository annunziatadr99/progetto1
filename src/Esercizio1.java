import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Ciao mondo");
        int x = 10;
        int y = 20;
        String testo = "il numero da te scelto è ";
        String[] arrStr = {"uno", "due", "tre","quattro","cinque"};


        System.out.println("il risultato della moltiplicazione è = " + moltiplico(x,y));
        System.out.println(concateno(testo,x));
        System.out.println(Arrays.toString(inserisciInArray(arrStr,"magic")));
        }

        public static int moltiplico(int num1,int num2){
        return num1 * num2;
        }
        public static String concateno(String str, int num){
        return str + num;
        }
        public static String[] inserisciInArray(String[] arr, String s) {
            String[] newArr = new String[6];
            newArr[0] = arr[0];
            newArr[1] = arr[1];
            newArr[2] = s;
            newArr[3] = arr[2];
            newArr[4] = arr[3];
            newArr[5] = arr[4];
            return  newArr;
        }

    }
