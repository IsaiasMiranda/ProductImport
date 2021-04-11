package entities;

import java.util.*;
import java.text.*;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct(){}
	public UsedProduct(Date manufactureDate, String name, Double price) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate)
	{
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate()
	{
		return manufactureDate;
	}

	@Override
	public String priceTag()
	{
		return getName() + ", (Used) $ " + String.format("%.2f", getPrice() + " Manufacture Date: " + sdf.format(manufactureDate));
	}
}
