class Car {
    private String make,model;
    public Car(String mk,String md)     {   make=mk;        model=md;    }
    public void setcardetails(String mk,String md)  {
        make=mk;        model=md;
    }
    public String getmk()               {       return make;         }
    public String getmd()               {       return model;         }
}
public class Q1_CarTester {
    public static void main(String[] args) {
        Car mycar1 = new Car("Toyota","Yaris");
        Car mycar2 = new Car(null,null);
        System.out.println("Initial Details: ");
        System.out.println("Car 1 has Details ->  Make: "+mycar1.getmk()+"\tModel: "+mycar1.getmd());
        System.out.println("Car 2 has Details ->  Make: "+mycar2.getmk()+"\tModel: "+mycar2.getmd());
        
        mycar2.setcardetails("Mercedes Benz", "E Class");
        
        System.out.println("After Details been Updated: ");
        System.out.println("Car 1 has Details ->  Make: "+mycar1.getmk()+"\tModel: "+mycar1.getmd());
        System.out.println("Car 2 has Details ->  Make: "+mycar2.getmk()+"\tModel: "+mycar2.getmd());
    }
}