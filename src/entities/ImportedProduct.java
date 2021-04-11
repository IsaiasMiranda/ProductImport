package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct(){}
	public ImportedProduct(Double customsFee, String name, Double price)
	{
		super(name, price);
		this.customsFee = customsFee;
	}

	public void setCustomsFee(Double customsFee)
	{
		this.customsFee = customsFee;
	}

	public Double getCustomsFee()
	{
		return customsFee;
	}

	@Override
	public String priceTag()
	{
		double sum = getPrice() + customsFee;
		return getName() + ", $ " + String.format("%.2f", getPrice()) + String.format("%.2f", sum);
	}
	
	
}
