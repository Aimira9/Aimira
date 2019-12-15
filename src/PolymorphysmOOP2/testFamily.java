package PolymorphysmOOP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class testFamily {

    public static void main(String[] args) {

        human h=new baby();
        h.eat(); //from baby class
        // dynamic method=when we call method it looks in super class but he will print last overriden
        h.shave(); //from men class //dynamic method
        h.walk(); //from men class

        ((baby)h).crawl(); //from baby class
        //((woman)h).makeUp(); //it will give exception
        ((dad)h).feed();

        System.out.println("==========");
        men m=new boy();
        m.playSport(); //from men class
        ((boy)m).cry();//from boy class
        //((baby)m).cry(); //exception  //we cannot go down
        ((human)m).eat();//from boy class //it will print last overriden one
        ((human)m).humanMethod(); //from human class
        m.humanMethod(); //we dont need

        dad d=new baby(); //boy //baby  //men
        d.feed(); //from men class //last overriden

        ((boy)d).run();//from boy class

        Collection list =new ArrayList(); //list is interface //arraylist is class //we can do object ,list and collection
        //we cannot write object in right side

        //String is final String list=new String();
        //after object we can write  everything

        //left side is- reference side   right side=is object side

        Collection coll=new ArrayList();
        coll.add(2);
        coll.add(5);
        coll.add(10);
        //((Set)coll).add(2);





    }
}
