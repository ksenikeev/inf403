package ru.itis.inf403.lab10;

public class Game {
    private int fieldWidth;
    private int fieldHeigth;
    private int finishFieldWight;
    private int finishFieldHeight;
    private int finishX;
    private int finishY;
    private Entity[] players;


    public Game() {}

    public Game(int fieldWidth, int fieldHeigth, int finishFieldHeight,
                int finishFieldWight, int finishX, int finishY,  Entity[] players) {
        this.fieldWidth = fieldWidth;
        this.fieldHeigth = fieldHeigth;
        this.finishFieldWight = finishFieldWight;
        this.finishFieldHeight = finishFieldHeight;
        this.finishX = finishX;
        this.finishY = finishY;
        this.players = players;
    }

    public Entity start() {
        while (true) {
            for (int i = 0; i < players.length; i++){
                players[i].move();
            }

            for (int i = 0; i < players.length; i++){
                if (players[i].x >= finishX
                        && players[i].x <= finishX + finishFieldWight
                        && players[i].y >= finishY
                        && players[i].y <= finishY + finishFieldHeight){
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }


}
