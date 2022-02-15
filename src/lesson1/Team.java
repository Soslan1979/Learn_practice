package lesson1;

public class Team {

    int random_number1 = (int) (Math.random() * 10);

    private String name;
    private double personDistJump;
    private double speedRun;
    private double speedSwim;
    private static int CountPerson;

    public Team(String name, double personDistJump, double speedRun, double speedSwim) {
        this.name = name;
        this.personDistJump = personDistJump;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        CountPerson++;
    }

    public String run(int distance){
        if(distance/100/getSpeedRun() > 7) return getName() + " fails to meet the time ";
        return getName() + " successfully run the course";
    }

    public String getName() {
        return name;
    }

    public double getPersonDistJump() {
        return personDistJump;
    }

    public double getSpeedRun() {
        return speedRun;
    }

    public double getSpeedSwim() {
        return speedSwim;
    }

    public static int getCountPerson() {
        return CountPerson;
    }
}
