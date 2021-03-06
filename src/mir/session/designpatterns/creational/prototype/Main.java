package mir.session.designpatterns.creational.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        createForest();
    }

    private static void createForest() throws CloneNotSupportedException {
        System.out.println("Forest rendering...");

        /**
         * Tree class inin object ini yaratmaq chetin ve vaxt aparan prosesdir. Buna gore bize ele bir
         * funksionalliq lazimdir ki, var olan tree object ini clone (copy) ederek yeni object yarada bilek.
         * Ve bu sayede , cox az xercle cox sayda tree insance si yarada bilek
         * */
        Tree tree1 = new Tree();

        Tree tree2 = tree1.clone();
        tree1.getLeafs().add("leafs4");

        Tree tree3 = tree1.clone();



        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println(tree3.toString());
    }
}
