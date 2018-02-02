import java.util.Scanner;

public class MatematiniaiSkaiciavimai {

    public  static  void main (String[]args){

        Scanner reader = new Scanner(System.in);



        /*
         int a = reader.nextInt();
        Scanner reader1 = new Scanner(System.in);
        System.out.println("Iveskite antra skaiciu");


        Scanner reader1 = new Scanner(System.in);
        System.out.println("Iveskite antra skaiciu");
        int sc = reader.nextInt();
        */
        System.out.println("Pasirinkite");
        Scanner sc = new Scanner(System.in);
        int action = sc.nextInt();
        double a , b;
        switch (action){
            case 1:
                System.out.println("Iveskite pirma skaiciu a");
                 a = sc.nextInt();
                System.out.println("Iveskite pirma skaiciu b");
                 b = sc.nextInt();


                System.out.println("Trikampio plotas yra" +trikampis(a ,b));

                break;


        }

    }

    private static double trikampis(double a, double b){

                return (a*b)/2;
    }

    private static double staciakampis(double a , double b){


        return a* b;
    }

    private  static  double apskritimas(double a){

        double pi =3.1415;
       return pi*(a/2)*pi;

    }

}
