/**
 * 
 */
package edu.neu.csye6200.bg;

import java.util.ArrayList;

/**
 * @author zhongwen
 *
 */
public class BGStem {
	 
	private int stem[][];
	private int size;
	
	// Constructor
	public BGStem() {
		this.stem = new int [10][10];
		this.size = 10;
	}
	
	// Set size
	public void setSize(int size) {
		this.size = size;
		this.stem = new int [size][size];
	}
	
	public void displayStem() {
		int x_size = stem[0].length;
		int y_size = stem.length;
		for (int i = 0; i < y_size; i++) {
			for (int j = 0; j < x_size; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println("Size: " + size);
	}
	
	
	public void run() {
		displayStem();		
	}
	
	public static void main(String[] args) {
		BGStem s = new BGStem();
		s.setSize(15);
		s.run();
	}


}
