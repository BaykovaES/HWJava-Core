package HWlesson1;

import java.util.Random;

public class Course {
    private static int longCourse;
    private static int countCourse;


    class Barrier{
        private int heightBarrier;

        public Barrier(){

            Random random = new Random();
            this.heightBarrier = random.nextInt(21);
        }

        static Barrier[] barriers = new Barrier[countCourse];


    }

    public Course (int longCourse,int countCourse){
        this.longCourse = longCourse;
        this.countCourse = countCourse;


        for (int i = 0; i < countCourse; i++) {
            Barrier.barriers[i] = new Barrier();
        }



    }



    public static int getCountCourse(){
        return countCourse;
    }



    public static void doIt() {
        Team.Player player;
        Barrier barrier;

        for (int i = 0; i < Team.teamArray.length; i++) {
            player = Team.teamArray[i];
            for (int j = 0; j < Team.teamArray.length; j++) {
                barrier = Barrier.barriers[j];
                if ((Team.Player.getplayerEndurance() / longCourse) >= barrier.heightBarrier) {
                    Team.Player.setResult("Is_win");
                } else {
                    Team.Player.setResult("Is_failed");
                    break;
                }
            }
        }




    }
}


