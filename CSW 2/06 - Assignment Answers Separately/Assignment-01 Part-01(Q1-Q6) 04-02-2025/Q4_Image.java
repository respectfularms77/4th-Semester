class Image {
	int imgw,imgh; String colc;
	public Image(){
        setimage(1000,500,"#dd0078");		
    }
	public Image(int iw,int ih,String colc) {
		imgw=iw;	imgh=ih;	this.colc=colc;
	}
	public void setimage(int iw,int ih,String col) {
		imgw=iw;		imgh=ih;		colc=col;
	}
	public int getwi()			{return imgw;}
	public int getih()			{return imgh;}
	public String getcol()		{return colc;}
	public String toString()	{return "Image [Width: "+imgw+", Height: "+imgh+", Color Code: "+colc+"]";}
}
public class Q4_Image {
	public static void main(String[] args) {
		Image ig1=new Image(1200,600,"#ff5690");
		System.out.println("Default Image Details: "+ig1);
		Image ig2=new Image();
		System.out.println("Parameterized Image Details: "+ig2);
	}
}
