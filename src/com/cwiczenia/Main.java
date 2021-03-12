package com.cwiczenia;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Zmiana");

	    int wiek=10;
	    String zdanie="Ala ma kota";
	    int[] tab=new int[5];
	    tab[0]=10;
	    //...
		//Stwórz metodę z następującą sygnaturą
		// multiplyNumbers(int x, int y) i zwracac wynik
		int rezultat=multiplyNumbers(5, 10);
		int rezultat2=multiplyNumbers(11, 14);
		int rezultat3=multiplyNumbers(544, 103);
		System.out.println(rezultat);
    }

    public static int multiplyNumbers(int x, int y){
    	//int sum=x*y;
		return x*y;
    }


}
