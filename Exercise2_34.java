/*************************************************************************************
 * Exercise 2_34 page 119.
 * 
 *(World Population Growth Calculator) Search the Internet to determine the current world
 *
 * population and the annual world population growth rate. Write an application that inputs 
 *
 * these values, then displays the estimated world population after one, two, three, four 
 *
 * and five years. 
 * 
 * @author Burak Karacan
 *
 ************************************************************************************/

import java.util.Scanner; // 0.00001

public class Exercise2_34 {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.print("Enter the estimated population of the world in 2022 : ");
			
			double populationIn2022 = input.nextDouble();
			
			System.out.print("Enter the estimated growth value of the world in 2022 : ");
			
			double growthValueIn2022 = input.nextDouble();
			
			double populationIn2023 = populationIn2022 + (populationIn2022 * growthValueIn2022);
			
			double growthValueIn2023 = growthValueIn2022 - 0.0001;
			
			double populationIn2024 = populationIn2023 + (populationIn2023 * growthValueIn2023);
			
			double growthValueIn2024 = growthValueIn2023 - 0.0001;
			
			double populationIn2025 = populationIn2024 + (populationIn2024 * growthValueIn2024);
			
			double growthValueIn2025 = growthValueIn2024 - 0.0001;
			
			double populationIn2026 = populationIn2025 + (populationIn2025 * growthValueIn2025);
			
			double growthValueIn2026 = growthValueIn2025 - 0.0001;
			
			double populationIn2027 = populationIn2026 + (populationIn2026 * growthValueIn2026);
			
			
			System.out.println("The population of the world in 2023 is = " + populationIn2023);
		
			System.out.println("The population of the world in 2024 is = " + populationIn2024);
			
			System.out.println("The population of the world in 2025 is = " + populationIn2025);
			
			System.out.println("The population of the world in 2026 is = " + populationIn2026);
			
			System.out.println("The population of the world in 2027 is = " + populationIn2027);
			
			
		}
		
		

	}

}
