package HWlesson1;

import java.util.Arrays;

public class Team {
    private static String nameTeam;
    static class Player {
        private static String playerName;
        private static int playerEndurance;
        private static String result;

        public Player(String playerName, int playerEndurance,String result){
            this.playerName = playerName;
            this.playerEndurance = playerEndurance;
            this.result = result;
        }
        public static void setResult(String result) {
            result = result;
        }

        public static int getplayerEndurance() {
            return playerEndurance;
        }





    }


    public Team (String nameTeam) {
        this.nameTeam = nameTeam;

    }

    static Player[] teamArray = {
            new Player("Андрей", 120,"On_start"),
            new Player("Марина", 106,"On_start"),
            new Player("Игорь", 158,"On_start"),
            new Player("Александр",114 ,"On_start")
    };



    public static void printTeamInfo() {
        System.out.println("Информация о команде "+nameTeam+":");
        for (int i = 0; i < 4; i += 1) {
            System.out.println("   Участник №"+(i+1)+" ("+ teamArray[i]+" "+ teamArray[i].result+")");
        }
    }
    public static void printWinInfo(){
        for (int i = 0; i < 4; i += 1) {
            if (Team.Player.result == "Is_win"){
            System.out.println("   Участник №"+(i+1)+teamArray[i]);
            }

        }
    }


}



