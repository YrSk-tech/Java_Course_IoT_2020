package ua.lviv.iot.firstLab;

public class Mechanical3DPuzzle {
	private int amountOfElements;
	private int guaranteeInMounts;
	private String material;
	private String typeOfPazzle;
	private String colour;
	private double priceInHrynnia;
	private double weightInGrams;
	private static int id = 255468;

	protected String childAge;
	protected String description;

	public Mechanical3DPuzzle() {
		this(0, 0, null, null);
	}

	public Mechanical3DPuzzle(int amountOfElements, int guarantee, String material, String typeOfPazzle) {
		this(amountOfElements, guarantee, material, typeOfPazzle, null, 0, 0, null, null);
	}

	public Mechanical3DPuzzle(int amountOfElements, int guaranteeInMounts, String material, String typeOfPazzle,
			String colour, double priceInHrynnia, double weightInGrams, String childAge, String description) {
		this.amountOfElements = amountOfElements;
		this.guaranteeInMounts = guaranteeInMounts;
		this.material = material;
		this.typeOfPazzle = typeOfPazzle;
		this.colour = colour;
		this.priceInHrynnia = priceInHrynnia;
		this.weightInGrams = weightInGrams;
		this.childAge = childAge;
		this.description = description;
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

	public String getChildAge() {
		return childAge;
	}

	public void setChildAge(String childAge) {
		this.childAge = childAge;
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

	public void resetValues(int amountOfElements, int guaranteeInMounts, String material, String typeOfPazzle,
			String colour, double priceInHrynnia, double weightInGrams, String childAge, String description) {
		this.amountOfElements = amountOfElements;
		this.guaranteeInMounts = guaranteeInMounts;
		this.material = material;
		this.typeOfPazzle = typeOfPazzle;
		this.colour = colour;
		this.priceInHrynnia = priceInHrynnia;
		this.weightInGrams = weightInGrams;
		this.childAge = childAge;
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
		return "Mechanical3DPuzzle [amountOfElements=" + amountOfElements + "\n" + ", guaranteeInMounts="
				+ guaranteeInMounts + ", material=" + material + "\n" + ", typeOfPazzle=" + typeOfPazzle + ", colour="
				+ colour + "\n" + ", priceInHrynnia=" + priceInHrynnia + ", weightInGrams=" + weightInGrams + "\n"
				+ ", Child's age=" + childAge + ", description=" + description + "]";
	}

}
