public class ReservationSystem {

    public static void main(String[] args) {
       ReservationSystem jarvis = new ReservationSystem();
    }
    public ReservationSystem(){
        Reservation gavin = new Reservation();
        gavin.numPeople = 13;

        Reservation dog = new Reservation(4, 8.00, 1, 645);
        dog.print();

        Reservation [] reservations = new Reservation[10];
        reservations[0] = dog;

        reservations[1] = gavin;

        reservations[1].print();

        Reservation cat = new Reservation(2, 8.00,1, 90 );

        reservations[2] = new Reservation(2, 8.00,1, 90 );
        reservations[2].print();
        for(int x =3; x < 10; x++){
            reservations[x] = new Reservation(7, 7.00, 2, 6);
            reservations[x].print();
        }


    }
}
