import java.util.Random;

public class Rand5fromRand7 {

    public int rand5fromrand7() {
        int currValue  = new Random().nextInt(7);

        while(currValue >= 5) {
            currValue  = new Random().nextInt(7);
        }
        return currValue;
    }

    public static void main(String args[]) {
       System.out.println (new Rand5fromRand7().rand5fromrand7());
        System.out.println (new Rand5fromRand7().rand5fromrand7());
        System.out.println (new Rand5fromRand7().rand5fromrand7());
        System.out.println (new Rand5fromRand7().rand5fromrand7());
    }
}
