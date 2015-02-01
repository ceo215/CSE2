//Colin Orr
//CSE 002
//February 3, 2014
//Homework 2

//define the class
public class Arithmetic{
    
//define the main method
    public static void main(String[] args) {
        
//set the inputs

        int nSocks=3; //Number of pairs of socks purchased.
        double sockCost$=2.58; //Cost per pair of socks.
        
        int nGlasses=6; //Number of drinking glasses purchased.
        double glassCost$=2.29; //Cost per drinking glass.
        
        int nEnvelopes=1; //Number of boxes of envelopes purchased.
        double envelopeCost$=3.25; //Cost per box of envelopes.
        
        double taxPercent=.06; //PA Sales Tax
        
//declare the output variables
        double totalSockCost$; //total cost of socks before tax
        double sockTax$; //sales tax on socks
        
        double totalGlassCost$; //total cost of glass before tax
        double glassTax$; //sales tax on the glasses
        
        double totalEnvelopeCost$; //total cost of envelopes before tax
        double envelopeTax$; //sales tax on the envelopes
        
        double totalCostNoTax$; //cost of purchases before tax
        double totalSalesTax$; //cost of sales tax of purchase
        double totalCost$; //complete cost of the transaction

//Print the otem being bought, the cost per item, and the number of each item        
        System.out.println("Purchased Item: Socks");        
        System.out.println("Number of Items Purchased: "+nSocks);
        System.out.println("Cost per Item: $"+sockCost$);
        System.out.println(""); //Spacing
        
        System.out.println("Purchased Item: Drinking Glass");        
        System.out.println("Number of Items Purchased: "+nGlasses);
        System.out.println("Cost per Item: $"+glassCost$);
        System.out.println(""); //Spacing
        
        System.out.println("Purchased Item: Envelopes");        
        System.out.println("Number of Items Purchased: "+nEnvelopes);
        System.out.println("Cost per Item: $"+envelopeCost$);
        System.out.println(""); //Spacing
        
//Calculate the costs and taxes of each item and display
        totalSockCost$=nSocks*sockCost$; //Gives sock cost before tax.
        sockTax$=totalSockCost$*taxPercent; //Gives the tax of the sock purchase.
        System.out.println("Total Cost of Socks before Tax: $"+totalSockCost$);
        System.out.printf("Sales Tax from Socks: $%.2f\n",sockTax$);
        System.out.println(""); //Spacing
        
        totalGlassCost$=nGlasses*glassCost$; //Gives glasses cost before tax.
        glassTax$=totalGlassCost$*taxPercent; //Gives the tax of the glasses purchase.
        System.out.println("Total Cost of Glasses before Tax: $"+totalGlassCost$);
        System.out.printf("Sales Tax from Glasses: $%.2f\n",glassTax$);
        System.out.println(""); //Spacing
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$; //Gives envelope cost before tax.
        envelopeTax$=totalEnvelopeCost$*taxPercent; //Gives the tax of the envelope purchase
        System.out.println("Total Cost of Envelopes before Tax: $"+totalEnvelopeCost$);
        System.out.printf("Sales Tax from Envelopes: $%.2f\n",envelopeTax$);
        System.out.println(""); //Spacing

        totalCostNoTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //Gives total cost before tax.
        totalSalesTax$=totalCostNoTax$*taxPercent; //Gives total sales tax of purchase.
        totalCost$=totalCostNoTax$+totalSalesTax$; //Gives the total cost of the purchases, including tax.
        
//Print the final purchase information.
        System.out.println("The total cost of the purchases before tax is $"+totalCostNoTax$);
        System.out.printf("The total sales tax of the purchases is $%.2f\n",totalSalesTax$);
        System.out.printf("The total cost of the purchases, including tax, is $%.2f\n",totalCost$);

    }
}