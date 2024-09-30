import java.util.Scanner;

public class TestAuto {
    public static void main(String [] args){
        Scanner t= new Scanner(System.in);
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto();
        Auto a4 = new Auto();

        System.out.println("dammi modello macchina1"); a1.setModello(t.nextLine());
        System.out.println("dammi mmarca macchina1");a1.setMarca(t.nextLine());
        System.out.println("dammi prezzo macchina1");a1.setPrezzo(t.nextDouble());
        t.nextLine();
        System.out.println("dammi modello macchina2");a2.setModello(t.nextLine());
        System.out.println("dammi marca macchina2");a2.setMarca(t.nextLine());
        System.out.println("dammi prezzo macchina2");a2.setPrezzo(t.nextDouble());
        t.nextLine();
        System.out.println("dammi modello macchina3");a3.setModello(t.nextLine());
        System.out.println("dammi marca macchina3");a3.setMarca(t.nextLine());
        System.out.println("dammi prezzo macchina3");a3.setPrezzo(t.nextDouble());
        t.nextLine();
        System.out.println("dammi modello macchina4");a4.setModello(t.nextLine());
        System.out.println("dammi marca macchina4");a4.setMarca(t.nextLine());
        System.out.println("dammi modello macchina4");a4.setPrezzo(t.nextDouble());

        System.out.println("macchina 1: " + a1.getModello() +"\t"+ a1.getMarca() +"\t"+ a1.getPrezzo());
        System.out.println("macchina 2: " + a2.getModello() +"\t"+ a2.getMarca() +"\t"+ a2.getPrezzo());
        System.out.println("macchina 3: " + a3.getModello() +"\t"+ a3.getMarca() +"\t"+ a3.getPrezzo());
        System.out.println("macchina 4: " + a4.getModello() +"\t"+ a4.getMarca() +"\t"+ a4.getPrezzo());

    }
}
