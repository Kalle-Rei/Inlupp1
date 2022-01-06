import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        ArrayList<Squirrel> squirrelList = makeSquirrels();
        Owl owl1 = makeOwl();
        PineTree tree1 = makePineTree(squirrelList, owl1);
        System.out.println("tree1: " + tree1.toString());
//        owl1.eat(tree1);
//        System.out.println("\ncheckEat: " + tree1.checkEat());
//        System.out.println("\ntree1.getNumOfSquirrels: " + tree1.getNumOfSquirrels());
//        checkFall(tree1);
        checkSquirrelEat(tree1);


    }
    public static ArrayList<Squirrel> makeSquirrels(){
        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel squirrel1 = new Squirrel(1.5, 2, 12, true);
        Squirrel squirrel2 = new Squirrel(1.2, 1, 0, true);
        squirrelList.add(squirrel1);
        squirrelList.add(squirrel2);
        return squirrelList;
    }
    public static void checkSquirrelEat(PineTree pineTree){
        for(Squirrel e: pineTree.getSquirrels()){
            e.eat(pineTree);
        }
        System.out.println("after checkSquirrelEat: " + pineTree.toString());

    }
    public static Owl makeOwl(){
        Owl owl1 = new Owl(20,20,20, true);
        return owl1;
    }
    public static PineTree makePineTree(ArrayList<Squirrel> squirrelList, Owl owl1){
        PineTree tree1 = new PineTree(200, 20,15, squirrelList, owl1, false);
        tree1.updateNumOfSquirrels();
        return tree1;
    }
    public static void checkFall(PineTree pineTree){
        pineTree.fall(pineTree.getWindSpeed(), pineTree.getAge(), true);
        System.out.println("\ntree after fall(): " + pineTree.toString());
    }
}
