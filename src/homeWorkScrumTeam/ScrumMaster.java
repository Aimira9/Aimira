package homeWorkScrumTeam;

public class ScrumMaster extends  ScrumTeam {
    String teamName;
    String ProjectName;
    public ScrumMaster(String ProjectName) {
        super("Aimira  from Scrum master class");
        this.ProjectName=ProjectName;
    }
    public ScrumMaster(String teamName,String ProjectName) {
        this(ProjectName);
        this.teamName=teamName;
    }
    @Override
    public void progress() {

        System.out.println("progress from  ScrumMaster class");
    }
    @Override
    public void work() {

        System.out.println("work from ScrumMaster class");
    }
    @Override
    public void sprint() {

        System.out.println("sprint from  ScrumMaster class");
    }

}
