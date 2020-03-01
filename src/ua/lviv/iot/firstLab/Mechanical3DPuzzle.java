package ua.lviv.iot.firstLab;

public class Mechanical3DPuzzle {
	private int amountOfElements = 1000;
	private int guaranteeInMounts = 12;
	private String material = "wood";
	private String typeOfPazzle = "building" ;
	private String colour = "wooden";
	private double priceInHrynnia = 450;
	private double weightInGrams = 370;
	private static int id = 255468;

	protected String age = "16+";
	protected String description = "Notre-Dame de Paris";

	public Mechanical3DPuzzle(int amountOfElements, int guaranteeInMounts, String material, String typeOfPazzle, String colour,
			double priceInHrynnia, double weightInGrams, String age, String description) {
		this.amountOfElements = amountOfElements;
		this.guaranteeInMounts = guaranteeInMounts;
		this.material = material;
		this.typeOfPazzle = typeOfPazzle;
		this.colour = colour;
		this.priceInHrynnia = priceInHrynnia;
		this.weightInGrams = weightInGrams;
		this.age = age;
		this.description = description;
	}

	public Mechanical3DPuzzle(int amountOfElements, int guarantee, String material, String typeOfPazzle) {
		this(amountOfElements, guarantee, material, typeOfPazzle, null, 0, 0, null, null);
	}

	public Mechanical3DPuzzle() {
	}

	public int getAmountOfElements() {
		return amountOfElements;
	}

	public void setAmountOfElements(int amountOfElements) {
		this.amountOfElements = amountOfElements;
	}

	public int getGuaranteeInMounts() {
		return guaranteeInMounts;
	}

	public void setGuaranteeInMounts(int guaranteeInMounts) {
		this.guaranteeInMounts = guaranteeInMounts;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTypeOfPazzle() {
		return typeOfPazzle;
	}

	public void setTypeOfPazzle(String typeOfPazzle) {
		this.typeOfPazzle = typeOfPazzle;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getPriceInHrynnia() {
		return priceInHrynnia;
	}

	public void setPriceInHrynnia(double priceInHrynnia) {
		this.priceInHrynnia = priceInHrynnia;
	}

	public double getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(double weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Mechanical3DPuzzle.id = id;
	}

	public void resetValues(int amountOfElements, int guaranteeInMounts, String material, String typeOfPazzle, String colour,
			double priceInHrynnia, double weightInGrams, String age, String description) {
		this.amountOfElements = amountOfElements;
		this.guaranteeInMounts = guaranteeInMounts;
		this.material = material;
		this.typeOfPazzle = typeOfPazzle;
		this.colour = colour;
		this.priceInHrynnia = priceInHrynnia;
		this.weightInGrams = weightInGrams;
		this.age = age;
		this.description = description;
	}

	static void printStaticId() {
		System.out.println("ID=" + id);
	}

	void printId() {
		System.out.println("ID=" + id);
	}

	@Override
	public String toString() {
		return "Mechanical3DPuzzle [amountOfElements=" + amountOfElements + "\n"
				+ ", guaranteeInMounts=" + guaranteeInMounts + ", material=" + material + "\n" 
				+  ", typeOfPazzle=" + typeOfPazzle + ", colour=" + colour + "\n"
				+ ", priceInHrynnia=" + priceInHrynnia + ", weightInGrams=" + weightInGrams + "\n"
				+ ", age=" + age + ", description=" + description + "]";
	}

}
