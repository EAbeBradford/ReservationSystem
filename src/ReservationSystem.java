public class ReservationSystem {

    public static void main(String[] args) {
       ReservationSystem jarvis = new ReservationSystem();
    }

    public ReservationSystem(){
        Reservation gavin = new Reservation();
        gavin.numPeople = 13;

        Reservation dog = new Reservation(4, 8.00, 1, 645);
        dog.print();
    }
}
