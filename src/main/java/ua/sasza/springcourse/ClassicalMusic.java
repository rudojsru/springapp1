package ua.sasza.springcourse;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List clas = new ArrayList();

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMydistroction(){
        System.out.println("Do My distroi");
    }


    @Override
    public List getSong() {

        clas.add("Hungary Rapsodia");
        clas.add("Betchowen Letniaja soneta");
        clas.add("Mocart wremena goda");

        return clas;
    }




}
