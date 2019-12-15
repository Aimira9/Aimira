package homeWorkScrumTeam;

public class ProductOwner extends  ScrumTeam {
    String teamName;
    String ProjectName;

    public ProductOwner(String ProjectName) {
        super("Aimira Product owner class");
        this.ProjectName=ProjectName;
    }
    public ProductOwner(String teamName,String ProjectName) {
        this(ProjectName);
        this.teamName=teamName;
    }
    @Override
    public void progress() {

        System.out.println("progress from ProductOwner  class");
    }
    @Override
    public void work() {

        System.out.println("work from ProductOwner  class");
    }
    @Override
    public void sprint() {

        System.out.println("sprint from ProductOwner class");
    }

}
