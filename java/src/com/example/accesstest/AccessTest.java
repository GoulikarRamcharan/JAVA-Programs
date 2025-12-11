package com.example.accesstest;


import com.example.access.PublicClass;
import com.example.access.PackagePrivateClass;
public class AccessTest {

	public static void main(String[] args) {
		PublicClass pbc = new PublicClass();
		
		pbc.publicclass();
		
		PackagePrivateClass ppc = new PackagePrivateClass();
		
		ppc.shoowpackageprivateclass();
		

	}

}
