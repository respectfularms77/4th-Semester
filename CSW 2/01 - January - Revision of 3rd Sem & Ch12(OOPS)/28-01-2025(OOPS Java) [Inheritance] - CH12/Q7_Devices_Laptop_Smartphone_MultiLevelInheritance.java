class Devices {
    String brand,model;
    public Devices(String b,String m)   {
        brand=b;        model=m;
    }
    public void display()   {
        System.out.println("Brand Name is: "+brand+"\nModel is: "+model);
    }
}

class Laptop extends Devices {
    String prostype;    int ramsize;
    public Laptop(String b,String n,String pt,int ram)  {
        super(b,n);
        prostype=pt;        ramsize=ram;
    }
    public void display()   {
        super.display();
        System.out.println("Processor Type is: "+prostype+"\nRam Size is: "+ramsize+" GB");
    }
}

class Smartphone extends Devices {
    int camres;    int batcap;
    public Smartphone(String b,String n,int camres,int batcap)  {
        super(b,n);
        this.camres=camres;        this.batcap=batcap;
    }
    public void display()   {
        super.display();
        System.out.println("Camera Resolution is: "+camres+" MP\nBattery Capacity is: "+batcap+" mAH");
    }
}

public class Q7_Devices_Laptop_Smartphone_MultiLevelInheritance {
    public static void main(String args[])  {
        Laptop lp = new Laptop("Dell","DL342330","Intel i5 7th Gen",16);
        lp.display();
        System.out.println();
        Smartphone sp = new Smartphone("Xiomi","RMX20215X",64,5000);
        sp.display();
    }
}