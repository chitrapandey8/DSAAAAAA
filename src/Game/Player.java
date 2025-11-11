package Game;

public class Player {
    String name;
    int guess;

    Player(String name){
        this.name = name;
    }

    void playerguess(){

        guess = (int)(Math.random()*10);
        System.out.println(this.name + "guessed" + guess);
    }


}
