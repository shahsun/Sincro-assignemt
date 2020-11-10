package org.sincro.assignment.main;

import java.util.Scanner;

import org.sincro.assigment.factory.SlabDiscountFactory;
import org.sincro.assignment.model.Order;

public class AssignmentMain {

	public static void main(String[] args) {

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Order Amount");
			int billAmount = sc.nextInt();
			System.out.println("Enter customer Type Normal/Premium(N/P)");
			String custType = sc.next();

			if (billAmount <= 0) {
				System.out.println("Final Amount is " + billAmount);

			} else {

				SlabDiscountFactory slabDiscountFactory = new SlabDiscountFactory();

				Order ord = new Order(slabDiscountFactory.getSlabDiscountByCustType(custType), billAmount);

				int finalAmount = ord.getFinalDiscountedAmount();
				System.out.println("Final Amount is " + finalAmount);
			}
		} while (true);//Added this to avoid restarting program to take multiple inputs

	}

}
