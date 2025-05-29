class Vehicle1 {
    int vid,capa; String route;
    public Vehicle1(int vid,int capa,String route)   {
        this.vid=vid;           this.capa=capa;             this.route=route;
    }
    public void display(){
        System.out.println("Vehicle ID: "+vid+"\nCapacity: "+capa+" Tonnes\nRoute: "+route);
    }
}

class Truck extends Vehicle1 {
    int axlesize;   String ref;
    public Truck(int vid,int capa,String route,int axlesi,String ref) {
        super(vid,capa,route);
        axlesize=axlesi;
        this.ref=ref;
    }
    public void display() {
        super.display();
        System.out.println("Number of Axles: "+axlesize+" inches\nRefrigerated (Yes/No): "+ref);
    }
}

class Ship extends Vehicle1 {
    int decksize,range;
    public Ship(int vid,int capa,String route,int decksi,int range) {
        super(vid,capa,route);
        decksize=decksi;
        this.range=range;
    }
    public void display() {
        super.display();
        System.out.println("Deck Size: "+decksize+" m2\nSailing Range: "+range+" kms");
    }
}

class Planes extends Vehicle1 {
    int maxal;          String engtype;
    public Planes(int vid,int capa,String route,int maxal,String engtype) {
        super(vid,capa,route);
        this.maxal=maxal;
        this.engtype=engtype;
    }
    public void display() {
        super.display();
        System.out.println("Maximum Altitude: "+maxal+" kms\nEngine Type is: "+engtype);
    }
}

class Minitrucks extends Truck {
    int payloa;     double fueleff;
    public Minitrucks(int vid,int capa,String route,int axlesi,String ref,int payloacapa,double fueleff){
        super(vid,capa,route,axlesi,ref);
        payloa=payloacapa;
        this.fueleff=fueleff;
    }
    public void display() {
        super.display();
        System.out.println("Payload Capacity is: "+payloa+" Tonnes\nFuel Efficiency is: "+fueleff+" km/l");
    }
}

public class Q6_Truck_Ship_Planes_MultiLevelInheri {
    public static void main(String args[])  {
        Truck tr=new Truck(1000,2000,"Through Kashmir",4,"No");
        tr.display();
        System.out.println();
        Ship sp=new Ship(1001,20000,"Through Panama Canel",15000,50000);
        sp.display();
        System.out.println();
        Planes pl=new Planes(10001,30000,"Through Hyderabad",25000,"TurboJets");
        pl.display();
        System.out.println();
        Minitrucks mtr=new Minitrucks(1010,700,"Through Sikkim",2,"Yes",300,18.3);
        mtr.display();
        System.out.println();
    }
}