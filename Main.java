import java.util.*;

public class Main {
	public static void main(String[] args) {
		String binaryNum;
		BinaryWord word, comp;
		PositiveInteger posInt1, posInt2, posInt3, posIntSum;
		int number1, number2, number3;
		RGBColor color1, color2, color3, colorCombo;
		int red1, green1, blue1, red2, green2, blue2, red3, green3, blue3;
		Collection<RGBColor> colorList = new ArrayList<RGBColor>();
		Collection<PositiveInteger> intList = new ArrayList<PositiveInteger>();
		
		Scanner kbd = new Scanner(System.in);
		
		System.out.printf("Enter a binary number: ");
		binaryNum = kbd.next();
		word = new BinaryWord(binaryNum);
		comp = word.complement();
		
		System.out.printf("\n%10s BinaryWord: %s\n", "original", word);
		System.out.printf("%10s BinaryWord: %s\n", "complement", comp);
		
		System.out.printf("\n  Enter value of red for color 1: ");
		red1 = kbd.nextInt();
		System.out.printf("Enter value of green for color 1: ");
		green1 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 1: ");
		blue1 = kbd.nextInt();
		System.out.printf("  Enter value of red for color 2: ");
		red2 = kbd.nextInt();
		System.out.printf("Enter value of green for color 2: ");
		green2 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 2: ");
		blue2 = kbd.nextInt();
		
		color1 = new RGBColor(red1, green1, blue1);
		color2 = new RGBColor(red2, green2, blue2);
		color3 = color1.operator(color2);
		
		System.out.printf("\nBlend of colors 1, 2 RGB: %d %d %d\n", color3.getRed(), color3.getGreen(), color3.getBlue());
		
		System.out.printf("\n  Enter value of red for color 3: ");
		red3 = kbd.nextInt();
		System.out.printf("Enter value of green for color 3: ");
		green3 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 3: ");
		blue3 = kbd.nextInt();
		
		color3 = new RGBColor(red3, green3, blue3);
		colorList.add(color1);
		colorList.add(color2);
		colorList.add(color3);
		colorCombo = RGBColor.combine(colorList);
		
		System.out.printf("\nCombination of colors 1, 2, 3 RGB: %d %d %d\n", colorCombo.getRed(), colorCombo.getGreen(), colorCombo.getBlue());
		
		System.out.printf("\nEnter positive integer 1: ");
		number1 = kbd.nextInt();
		System.out.printf("Enter positive integer 2: ");
		number2 = kbd.nextInt();
		System.out.printf("Enter positive integer 3: ");
		number3 = kbd.nextInt();
		
		posInt1 = new PositiveInteger(number1);
		posInt2 = new PositiveInteger(number2);
		posInt3 = new PositiveInteger(number3);
		intList.add(posInt1);
		intList.add(posInt2);
		intList.add(posInt3);
		posIntSum = PositiveInteger.combine(intList);
		
		System.out.printf("\nSum of numbers: %d\n", posIntSum.getInt());
		
		kbd.close();
		
		System.exit(0);
	}
}