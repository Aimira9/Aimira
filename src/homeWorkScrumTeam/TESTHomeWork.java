package homeWorkScrumTeam;

public class TESTHomeWork {
    public static void main(String[] args) {

        ScrumTeam st=new ScrumTeam(); //will print from scrumteam class
        st.progress();
        st.work();
        st.sprint();

        System.out.println("============");


        SDET sdet=new SDET("SDET class","SDET"); //creating object
        sdet.progress();
        sdet.sprint();


        System.out.println("===============");

        Developer d=new Developer("Developer class","DC");
        d.progress();
        d.work();
        d.sprint();



        System.out.println("==========");

        ProductOwner PO=new ProductOwner("Product Owner class","PO");
        PO.progress();
        PO.work();
        PO.sprint();

        System.out.println("=============");

        ScrumMaster sm=new ScrumMaster("ScrumMaster class","SM");
        sm.progress();
        sm.work();
        sm.sprint();



    }
}
