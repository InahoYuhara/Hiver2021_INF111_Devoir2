package test;

public class ProgrammeTest {
    public static void main(String[] args) {

        int tab[] = new int[10];
        tab[0] = 1;
        tab[1] = 2;

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[0]);

        tab[1] = tab[2];

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[0]);

    }
}
