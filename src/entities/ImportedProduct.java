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

	public double importTax(){
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag()
	{
		return getName() + ", $ " + String.format("%.2f", importTax()) + " ( Customs fee: $ " + String.format("%.2f", customsFee) + " ) ";
	}
	
	
}
