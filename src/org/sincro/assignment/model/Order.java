package org.sincro.assignment.model;

public class Order {
	
	private SlabDiscount slabDiscount;
	private int billAmount;
	
	
	
	

	public Order(SlabDiscount slabDiscount, int billAmount) {
		super();
		this.slabDiscount = slabDiscount;
		this.billAmount = billAmount;
	}

	public int getFinalDiscountedAmount() {
		int[] slab = slabDiscount.getSlab();
		int[] discount = slabDiscount.getDiscount();
		int afterDiscAmount = 0;
		int slabLength = slab.length;
		for (int i = 0; i <= slabLength; i++) {
			if (i == slab.length || billAmount <= slab[i]) { 
				if (i == 0) {
					afterDiscAmount += calculatePercentage(billAmount, discount[i]);
				} else {
					afterDiscAmount += calculatePercentage(billAmount - slab[i - 1], discount[i]);
				}
				break;
			} else {
				if (i == 0) {
					afterDiscAmount += calculatePercentage(slab[i], discount[i]);
				} else {
					afterDiscAmount += calculatePercentage(slab[i] - slab[i - 1], discount[i]);
				}

			}

		}

		return afterDiscAmount;
	}

	private int calculatePercentage(int num, int percentage) {

		return num - num * percentage / 100;
	}

}
