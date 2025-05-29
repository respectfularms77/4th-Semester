class Rectangle {
    private int len,wid;
    public Rectangle(int l,int w)       {       len=l;      wid=w;          }
    public void setval(int l,int w)     {       len=l;      wid=w;          }
    public int getlength()      {       return len;     }
    public int getwidth()       {       return wid;     }
    
    public int area()           {     return len*wid;          }
    public int perimeter()      {     return 2*(len+wid);       }
}

public class Q2 {
    public static void main(String args[]) {
        Rectangle r=new Rectangle(10,20);
        System.out.println("Rectangle with Length: "+r.getlength()+" & Width of: "+r.getwidth()+"\nHas Area: "+r.area()+" & Perimeter of: "+r.perimeter());
    }
}