public class BreakVeContineKullanimi {
    public static void main(String[] args) {
        //break: Döngüyü durdurur
        //continue: Döngüyü durdurmaz ama bir sonraki adıma gider

		/*Scanner input = new Scanner (System.in);
		int sayi;
		while(true) {
			System.out.println("Bir Sayı Giriniz");
			sayi = input.nextInt();
			if(sayi == 0) {
				break;
			}
            System.out.println(sayi);
	    }*/



        for (int i=1; i<=10; i++) {
            if (i==4 || i==9) {
                System.out.println("atladı = " + i);
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
