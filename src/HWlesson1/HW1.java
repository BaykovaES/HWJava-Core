package HWlesson1;


public class HW1 {
    public static void main(String[] args){
        Course course = new Course(12,10);
        Team team = new Team("Победители");

        Team.printTeamInfo();
        Course.doIt();
        Team.printWinInfo();




    }
}
