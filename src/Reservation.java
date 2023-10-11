public class Reservation {

    //this will help me make reservation objects

    public int numPeople;
    public double time;
    public int priority;
    public long timeMade;
    //helpful for finding current time
    //System.currentTimeMillis()

    public Reservation(){
        numPeople = 8;
        time = 7.0;

    }

    public Reservation(int pNumPeople, double pTime, int pPriority, long pTimeMade){
        numPeople = pNumPeople;
        time = pTime;
        priority = pPriority;
        timeMade = pTimeMade;

    }

    public void print(){
       System.out.println("num ppl: " + numPeople +" time: " + time + " priority: " + priority +" time made: " + timeMade);
    }

}
