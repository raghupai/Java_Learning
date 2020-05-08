package thisKeyword;

public class Chocolate {
	int barCode;
	String name;
	int weight;
	int cost;

	public Chocolate(int barCode, String name, int weight, int cost) {
		this.barCode = barCode;
		this.cost = cost;
		this.name = name;
		this.weight = weight;
		}

	public int getBarCode() {
		return barCode;
		}

	public void setBarCode(int barCode) {
		this.barCode = barCode;	
		}

	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
		}

	public int getWeight() {
		return weight;
		}

	public void setWeight(int weight) {
		this.weight = weight;
		}

	public int getCost() {
		return cost;
		}

	public void setCost(int cost) {
		this.cost = cost;
		}

	public static void main(String[] args) {
		Chocolate c1 = new Chocolate(101, "Cadbury", 12,10);
		
		System.out.println("BarCode is " + c1.barCode);
		System.out.println("Cost is " + c1.cost);
		System.out.println("Name is " + c1.name);
		System.out.println("Weight is " + c1.weight);

		System.out.println("=======New Values=======");

		c1.setBarCode(102);
		c1.setCost(50);
		c1.setWeight(24);
		c1.setName("Hersley's");

		System.out.println("BarCode is " + c1.getBarCode());
		System.out.println("Cost is " + c1.getCost());
		System.out.println("Name is " + c1.getName());
		System.out.println("Weight is " + c1.getWeight());
		}
	}
