package org.sincro.assignment.model;

public class SlabDiscount {
	
	private  int slab[];
	private int discount[];
	
	
	public int[] getSlab() {
		return slab;
	}
	public void setSlab(int[] slab) {
		this.slab = slab;
	}
	public int[] getDiscount() {
		return discount;
	}
	public void setDiscount(int[] discount) {
		this.discount = discount;
	}
	
	public SlabDiscount(int[] slab, int[] discount) {
		super();
		this.slab = slab;
		this.discount = discount;
	}
	
	

}
