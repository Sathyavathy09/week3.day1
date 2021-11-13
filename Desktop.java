package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Returning desktop size");

	}

	public static void main(String[] args) {
		
		Desktop ds = new Desktop();
		ds.computeModel();
		ds.desktopSize();

	}

}
