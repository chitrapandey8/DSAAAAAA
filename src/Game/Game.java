package Game;

public class Game {
    private int ExpectedGuess;
    Player p1, p2, p3;

    Game(String name1, String name2, String name3){
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }


    boolean checkwinner(){
        if(p1.guess == ExpectedGuess){
            System.out.println(p1.name + "won");
            return true;
        }
        else if(p2.guess == ExpectedGuess){
            System.out.println(p2.name + "won");
            return true;
        } else if(p3.guess == ExpectedGuess){
            System.out.println(p3.name + "won");
            return true;
        }
        return  false;
    }



    void Start(){
        System.out.println("player 1:" + p1.name);
        while(true){
            ExpectedGuess = (int)(Math.random()*10);
            p1.playerguess();
            p2.playerguess();
            p3.playerguess();
            boolean somonewins = checkwinner();
            if(somonewins){
                break;
            } else{
                ExpectedGuess = (int)(Math.random()*10);
            }
        }
    }


}
