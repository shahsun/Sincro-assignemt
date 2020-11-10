package org.sincro.assigment.factory;

import org.sincro.assignment.model.SlabDiscount;

public class SlabDiscountFactory {
	
	
	public static final String PREMIUM_CUSTOMER="P";
	public static final int slabPremium[] = { 4000, 8000, 12000 };
	public static final int discountPremium[] = { 10, 15, 20, 30 };
	public static final  int slab[] = { 5000, 10000 };
	public static final  int discount[] = { 0, 10, 20 };
	
	
	
	public SlabDiscount getSlabDiscountByCustType(String custType) {
	
		if(PREMIUM_CUSTOMER.equalsIgnoreCase(custType)) {		
			return new SlabDiscount(slabPremium, discountPremium);			
		}
		else {
			return new SlabDiscount(slab,discount);
		}
	}

}
