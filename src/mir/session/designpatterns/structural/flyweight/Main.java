package mir.session.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {


        /**
         * Bele ferz edek ki, Letter object i olduqca boyukdur ve memory de cox yer tutur.
         * Ve biz buna gore de her defe lazimsiz yere yeni Letter objecti yaradib memery de saxlamaqdansa
         * mumkun olduqu qeder evvel yaratdiqimiz Letter instance lerini deyishdirerek istifade etmek isteyirik.
         *
         * Letter object ine fikir versek character hissesi bir cox insance ucun eyni ol biler sadece x ve y hemishe
         * ferqli olur.
         * */

        Letter A = new Letter('A', 12, 44);
        Letter B = new Letter('B', 12, 3);
        Letter A2 = new Letter('A', 182, 454);
        Letter A3 = new Letter('A', 712, 44);

        System.out.println(A);
        System.out.println(B);
        System.out.println(A2);
        System.out.println(A3);
    }
}
