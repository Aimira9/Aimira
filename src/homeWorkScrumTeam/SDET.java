package homeWorkScrumTeam;

public class SDET extends ScrumTeam {
    String ProjectName;
    String teamName;

    public SDET(String ProjectName) {
        super("Aimira SDET class");
        this.ProjectName=ProjectName;
    }
    public SDET(String teamName,String ProjectName) {
        this(ProjectName);
        this.teamName=teamName;
    }

    @Override
    public void progress() {

        System.out.println("progress from SDET class");
    }
    @Override
    public void work() {

        System.out.println("work from SDET class");
    }
    @Override
    public void sprint() {

        System.out.println("sprint from SDET class");
    }
}


