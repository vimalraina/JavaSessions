package JavaTraining;

public class ConditionalOperator {

	public static void main(String[] args) {
		// conditional Operators < > <= >= ==

		int a = 50;
		int b = 80;

		if (a > b) {
			System.out.println("the largets number is a: " + a);
		} else {
			System.out.println("the largest number is b: " + b);
		}

		int num = 0;
		if (num == 0) {

			System.out.println("num is +ve");
		}

		else if (num < 0) {
			System.out.println("num is -ve");
		}

		else {
			System.out.println("num is  = 0 ");
		}

		String browser = "chrome";
		if (browser.equals("cHRome")) {
			System.out.println("launch chrome browser");
		}

		else if (browser.equalsIgnoreCase("Ie")) {
			System.out.println("launch ie browser");
		}

		else {
			System.out.println("launch firefox browser");
		}

		int xx = 500;
		int yy = 900;
		int zz = 300;

		// write a program to print largest number from the 3 given numbers
		if (xx > yy && xx > zz) {
			System.out.println("xx is the largest number: " + xx);
		} else if (yy > zz) {
			System.out.println("yy is the largest numer: " + yy);
		} else {
			System.out.println("zz is largest number: " + zz);
		}
		int k = 0;
		if (k == 7) {

			System.out.println("value of k is: " + k);
		}

		boolean flag = false;
		if (flag) {
			System.out.println("welcoem");
		} else {
			System.out.println("not welcome");
		}

		int day = 9;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thu");
			break;
		case 5:
			System.out.println("fri");
			break;

		default:
			System.out.println("no day ");
			break;
		}

		String browser12 = "chrome";

		switch (browser12) {
		case "chrome":
			System.out.println("launch chrome ");

			break;

		case "firefox":
			System.out.println("launch firefox ");

			break;
		case "ie":
			System.out.println("launch ie ");

			break;

		default:
			break;
		}

	}
}
