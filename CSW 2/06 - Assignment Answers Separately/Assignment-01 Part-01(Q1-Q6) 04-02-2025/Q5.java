import java.util.*;
class ImageController {
	HashSet<Image> ImgLib = new HashSet<>();
	public void insert(Image I) {
		ImgLib.add(I);
	}
	public void Search(Image I) {
		if (ImgLib.contains(I)) {
			System.out.println("The Image has been found ");
			System.out.println(I);
		} 
        else {
			System.out.println("Image is not found.");
		}
	}
	public void getImage(Image I) {
		System.out.println(I);
	}
}
public class Q5 {
	public static void main(String[] args) {
		Image I2 = new Image(300, 400, "#fff666");
		Image I3 = new Image(200, 300, "#eee450");
		Image I4 = new Image(150, 600, "#3480fe");
		ImageController IC = new ImageController();
		IC.insert(I2);
		IC.insert(I4);
		IC.getImage(I2);
		IC.Search(I3);
		IC.Search(I4);
	}

}