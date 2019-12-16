package ua.sasza.springcourse;


import org.springframework.stereotype.Component;

@Component("clas")
public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMydistroction(){
        System.out.println("Do My distroi");
    }


    @Override
    public String getSong() {
        return "Hungary Rapsodia";
    }




}
