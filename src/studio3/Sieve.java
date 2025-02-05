package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How high do we want to get checking prime numbers?");
		int n;
		n = scan.nextInt();

		boolean [] primeNum = new boolean [n];
		for(int i = 0; i<n; i++){
			primeNum[i]= true;
		}
		for(int l=2;l<n;l++) {
		
			for(int p=2*l; p<n; p=p+l){
				primeNum[p]=false;
			}
		}
	for(int t = 2; t<n; t++) {
		if(primeNum[t]==true) {
			System.out.println(t);
		}
	}
	}
}