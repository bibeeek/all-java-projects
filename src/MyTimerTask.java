import java.util.*;

public class MyTimerTask {

    //Timer= a facility for threds to schedule tasks
    // for future execution in a background threD

    //timertask= a task that can be scheduled for one time
    // or repeated execution by a Timer


    public static void main(String[] args) {

        Timer timer=new Timer();

        TimerTask tassk=new TimerTask(){
        int counter=10;
            public void run(){
                if(counter>0){
                    System.out.println(counter+" seconds");
                    counter--;
                }
                else{
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();

                }
            }
        };
        Calendar date= Calendar.getInstance();
        date.set(Calendar.YEAR,2024);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23); //0-24 0 midnight
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);


       // timer.schedule(tassk,date.getTime());

       // timer.scheduleAtFixedRate(tassk,0,1000);

        timer.scheduleAtFixedRate(tassk,date.getTime(),1000);
    }

}
