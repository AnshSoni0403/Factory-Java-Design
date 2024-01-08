interface utility{
    public void getdetails();
    
}

class cars implements utility{
    String car_name;
    int car_price;
    boolean car_availibility;

    cars(String car_name,int car_price, boolean car_availibility){
        this.car_name= car_name;
        this.car_price = car_price;
        this.car_availibility = car_availibility;
    }
    @Override
    public void getdetails(){
        System.out.println("Car Name: " + car_name);
        System.out.println("price of car is" + car_price);
        System.out.println("car is available: " + car_availibility);

    }}

    class bike implements utility{
    String bike_name;
    int bike_price;
    boolean bike_availibility;

    bike(String bike_name,int bike_price, boolean bike_availibility){
        this.bike_name= bike_name;
        this.bike_price = bike_price;
        this.bike_availibility = bike_availibility;
    }
    @Override
    public void getdetails(){
        System.out.println("Bike Name: " + bike_name);
        System.out.println("price of bike is" + bike_price);
        System.out.println("Bike is available: " + bike_availibility);

    }



}


public class vehicle {
    public static void main(String[] args){
     cars obj1 = new cars("Audi Q4",2500,true);
     bike obj2 = new bike("Honda",1500,false);

     obj1.getdetails();
     System.out.println("\n");
     obj2.getdetails();
    }
    
}
