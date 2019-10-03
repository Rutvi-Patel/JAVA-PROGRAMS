package classANDoop;

public class Shoe {
	String color;
	int size;
	public Shoe(String color,int size) {
		this.color = color;
		this.size = size;
	}
	public String getType() {
		return "shoes";
	}
	public String describe() {
		return (this.color+ " " + getType() + ", size "+ this.size);
		}
	}
class Boot extends Shoe {
	int height;
	public Boot(String color,int size,int height) {
		super (color, size);
		this.height= height;
	}
	public String getType() {
		return "boots";
	}
	public String describe(){
		return (super.describe() + ", height "+ this.height);
		}
	}
class Sneaker extends Boot{
	String lace_color;
	public Sneaker(String color,int size,int height,String lace_color) {
		super(color,size,height);
		this.lace_color= lace_color;
	}
	public String getType() {
		return "sneakers";
	}
	public String describe(){
		return (super.describe()+ ", lace color "+this.lace_color);
		}
}


