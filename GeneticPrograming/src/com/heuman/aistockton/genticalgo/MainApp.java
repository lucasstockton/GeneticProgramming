package com.heuman.aistockton.genticalgo;

public class MainApp {

	public static void main(String[] args) {

		GeneticAlgorithms geneticAlgorthims = new GeneticAlgorithms();

		Population population = new Population(100);

		population.initialize();

		int generationCounter = 0;
		
		
		while (population.getFittestIndividual().getFitness() != Constants.MAX_FITNESS) {
			generationCounter++;
			System.out.println(
					"Generation " + generationCounter + " - Fitness" + population.getFittestIndividual().getFitness());
			System.out.println(population.getFittestIndividual() + "\n");
			population = geneticAlgorthims.evolvePopulation(population);

			
			if (generationCounter > 2000)
			{
				System.out.println("BREAKING");
				break;
			}
			
		}
		System.out.println("Soluation Found");
		System.out.println(population.getFittestIndividual());

	}
}
