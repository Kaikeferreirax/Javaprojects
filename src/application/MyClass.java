package application;

import entities.SmartTv;

import java.util.Locale;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println(" volume :" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(" volume :" +smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(" volume :" +smartTv.volume);

        System.out.println("Para qual canal você deseja mudar? ");
        int Canal = smartTv.mudarCanal(sc.nextInt());

        System.out.println("Canal atual: " + Canal);



        sc.close();
    }
}
