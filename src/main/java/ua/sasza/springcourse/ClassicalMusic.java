package ua.sasza.springcourse;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    List clas = new ArrayList();
@PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }
@PreDestroy
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
