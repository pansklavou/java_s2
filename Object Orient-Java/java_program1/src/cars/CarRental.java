package cars;

public class CarRental {
    public static void main(String[] args){
        car a = new car ("AZB6723", 1000);

        a.setRented(false);

        car b = new car("AOO9011", 2500);


        b.setRented(false);



        System.out.println(a.getKm());
        System.out.println(b.getKm());

    }
    
}
