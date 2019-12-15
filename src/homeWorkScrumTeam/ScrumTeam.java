package homeWorkScrumTeam;

public class ScrumTeam {

    String teamName;
    String projectName;

    public ScrumTeam() {

    }

    public ScrumTeam(String projectName) {
        this.projectName=projectName;

    }

    public ScrumTeam( String teamName, String projectName) {
        this.teamName=teamName;
        this.projectName=projectName;
    }
    public void progress() {
        System.out.println("progress from ScrumTeam");
    }
    public void work() {

        System.out.println("work from ScrumTeam");
    }
    public void sprint() {
        System.out.println("sprint from ScrumTeam");
    }
}
