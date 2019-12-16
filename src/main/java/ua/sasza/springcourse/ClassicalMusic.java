package ua.sasza.springcourse;

public class ClassicalMusic implements Music {
    public static  ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
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
