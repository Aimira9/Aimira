package homeWorkScrumTeam;

public class Developer extends ScrumTeam {
    String teamName;
    String ProjectName;

//    public Developer() {
//
//    }

    public Developer(String ProjectName) {
        super("Aimira  from Developer class");
        this.ProjectName=ProjectName;
    }
    public Developer(String teamName,String ProjectName) {
        this(ProjectName);
        this.teamName=teamName;
    }
    @Override
    public void progress() {

        System.out.println("progress from developer class");
    }
    @Override
    public void work() {

        System.out.println("work from developer class");
    }
    @Override
    public void sprint() {

        System.out.println("sprint from developer class");
    }
}
