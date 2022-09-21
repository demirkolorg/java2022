public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");

		// string
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println("ortaMetin: " + ortaMetin);
		System.out.println("altMetin: " + altMetin);
		System.out.println(ortaMetin + " <=> " + altMetin);

		// integer
		int vade = 12;
		double oran = 1.69;

		System.out.println("vade: " + vade);
		System.out.println("oran: " + oran);

		// other
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";

		System.out.println("myNum: " + myNum);
		System.out.println("myFloatNum: " + myFloatNum);
		System.out.println("myLetter: " + myLetter);
		System.out.println("myBool: " + myBool);
		System.out.println("myText: " + myText);

	
		// dollar example
		double dolarDun = 18.14;
		double dolarBugun = 18.10;
		boolean dolarDustuMu = false;
		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			dolarDustuMu = true;
			System.out.println("DÜŞTÜ!!! == dolar durumu=" + okYonu + " ve Dolar Düştü mü= " + dolarDustuMu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			dolarDustuMu = false;
			System.out.println("ÇIKTI!!! == dolar durumu=" + okYonu + " ve Dolar Düştü mü= " + dolarDustuMu);
		} else {
			okYonu = "equal.svg";
			dolarDustuMu = false;
			System.out.println("AYNI!!! == dolar durumu=" + okYonu + " ve Dolar Düştü mü= " + dolarDustuMu);
		}
		
		
		//array
		String[] krediler= {"İhtiyaç","Taşıt","Konut"};
		
		
		for (String kredi : krediler) {
			System.out.println("kredi: "+kredi);
		}
		
		//for
		for (int i= 0; i<krediler.length; i++) {
			System.out.println(i+1+". kredi: "+krediler[i]);			
		}

	}

}
