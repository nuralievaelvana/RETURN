import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String word = i lake Java;
 //       int[] el = new int[]{1, 1, 2, 3, 4, 5, 6, 7, 23, 22, 44, 55, 42};
//        System.out.println(method2(11 , 6 , 5));
//        System.out.println(method4(56));
//        Scanner scanner = new Scanner(System.in);
//        int q = scanner.nextInt();
//        if(q==1){
//       hello();
//        } else if (q==2) {
//            bye();
//        }
//    }
//static void hello(){
//    System.out.println("hello");
//}
//static void bye(){
//    System.out.println("bye");
//-----------------------------------------------------------------------------------------------
//         method();
//    }
//    static void method(){
//        for (int i = 1; i <=10 ; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
//            System.out.println("--------------");
//        }------------------------------------------------------------------------------
/**
 * метод тузуп параметрине массив алсын массивдин ичндеги жуп сандардын суммасын табуу керек
 */
  // varargs(24,"Elvana", " Age ");
 //   }

//    static void method(int[] mass) {
//        for (int i = 0; i < mass.length; i++) {
//            System.out.print(mass[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void elvan(int[] massiv) {
//        int sum = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i] % 2 == 0) {
//                System.out.println(massiv[i]);
//                sum += massiv[i];
//
//            }
//        }
//        System.out.println(" summa :" + sum);
//
////метод тузунуз, ал метод параметринет2 сан алсын анан кконсолго ал сандын орточо арифметикалык маанисин чыгарсын.
//        int q = 14;
//        int w = 143;
//        nag(q, w);
//    }
//
//    static void nag(int q, int w) {
//        System.out.println((q + w) / 2);
//    }
//
//    {
////==============================================================================================
//
//
//    }
//
//    static String method(int a) {
//        if (a % 2 == 0) {
//            return "четный";
//        } else {
//            return "не четный";
//        }
//
////==============================================================================================================
//
//    // static double method2(int a, int b, int c){
////        double w = ( a + b + c ) / 3;
////        return w;
//    //========================================================================
//    static int method4(int h) {
//        int summ = 0;
//        for (int i = 1; i < h; i++) {
//            summ += i;
//        }
//        return summ;
//============================PRACTICE==================================================================
        // varargs(new int[]{18,19,20},"Aidai", "Dilnaz ","Dasha");

        String word = "  I like java !!!";
        System.out.println(word.charAt(word.length() - 1));
        System.out.println(word.startsWith("I like"));
        System.out.println(word.contains("java"));
        System.out.println(word.replace("a","o"));
        System.out.println(word.substring(9,13).toUpperCase());
        System.out.println(word.substring(9,13).toLowerCase());
        System.out.println(word.length());
        System.out.println(word.trim());

}

//    static void varargs(int[]age, String ... varargs){
//        for (int i = 0; i < age.length; i++) {
//            System.out.println(varargs[i] + "  "+age[i]+" age");
//        }
//        System.out.println();
//    }


}
























