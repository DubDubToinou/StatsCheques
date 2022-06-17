package fr.eni.statscheques;

import java.util.Scanner;

public class StatsCheques {

	static final int STOP = 0;
	
	public static void main(String[] args) {
		
		int compteur = 0;
		float montantTotal = 0.0f;
		float moyenne = 0.0f;
		int compteurChequeInf200 = 0;
		int compteurChequeSup200 = 0;
		float montantChequeInf200 = 0.0f;
		float montantChequeSup200 = 0.0f;
		int numeroCheque;
		float montantCheque =  0.0f;
		int numeroChequeMin = 0;
		float montantChequeMin = 0.0f;
		int numeroChequeMax = 0;
		float montantChequeMax =  0.0f;
		
		
		do
		{
			System.out.println("Merci de saisir le num�ro du ch�que : ");
			numeroCheque = SaisirInt();
			
			if(numeroCheque ==  STOP)
			{
				System.out.println("Vous avez d�cider de mettre fin � la saisi.");
				System.out.println("###### RESULTATS DES CHEQUES SAISI ######");
			}
				else if(numeroCheque != STOP)			
				{
				System.out.println("Merci de saisir le montant du ch�que : ");
				montantCheque = SaisirFloat();
				compteur++;
				montantTotal = montantCheque + montantTotal;
				moyenne = montantTotal/compteur;
					if(montantCheque<200)
					{
					compteurChequeInf200++;
					montantChequeInf200 = montantChequeInf200 + montantCheque;
					}
					
					if(montantCheque>200)
					{
						compteurChequeSup200++;
						montantChequeSup200 = montantChequeSup200 + montantCheque;
					}
					
					if (montantChequeMin == 0 || montantCheque < montantChequeMin) 
					{
						numeroChequeMin = numeroCheque;
						montantChequeMin = montantCheque;
					}
					
					if (montantChequeMax == 0 || montantCheque > montantChequeMax) 
					{
						numeroChequeMax = numeroCheque;
						montantChequeMax = montantCheque;
					}
					
					
					
				}
			
		}while(numeroCheque != STOP);
		
				
		System.out.println("Vous avez saisi "  +compteur +" ch�ques.");
		System.out.println("Le montant total est de : " +montantTotal +" euros");
		System.out.println("La Moyenne des ch�que saisi est de : "+moyenne +" euros");
		System.out.println("Vous avez saisi " +compteurChequeInf200  +" ch�ques dont le montant est inf�rieur � 200 euros. pour un montant total de : " +montantChequeInf200);
		System.out.println("Vous avez saisi " +compteurChequeSup200 +" ch�que dont le montant est sup�rieur � 200 euros pour un montant total de : " +montantChequeSup200);
		System.out.println("Le num�ro de ch�que dont le montant est le plus petit est le " +numeroChequeMin + " d'un montant de "  +montantChequeMin);
		System.out.println("Le num�ro de ch�que dont le montant est le plus grand est le " +numeroChequeMax + " d'un montant de "  +montantChequeMax);
		
				

	}
	
	public static int SaisirInt()
	{
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		return result;
				
	}
	
	public static float SaisirFloat()
	{
		Scanner scan = new Scanner(System.in);
		float result = scan.nextFloat();
		return result;
				
	}
	

}
