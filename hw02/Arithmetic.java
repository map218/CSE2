//Matt Palmieri
//2/2/15
//CSE2 hw02
//Arithmetic Program
//
//Calculate and print total cost of each kind of item and the sales tax for that total cost
//Calculate and print total cost of purchases (before tax)
//Calculate and print total actually paid for this transaction, including sales tax. 

//define a class
public class Arithmetic {
    //main method required
    public static void main(String [] args) {
        //Assumptions (input variables)
        int nSocks=3; //Number of pairs of socks
        double sockCost$=2.58; //Cost per pair of socks (‘$’ is part of the variable name)
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        int nEnvelopes=1; //Number of boxes of envelopes
        double envelopeCost$=3.25; //cost per box of envelopes
        double taxPercent=0.06; //sales tax
        
        //declare variables for everything we need to calculate
        double totalSockCost$; //total cost of socks
        double sockSalesTax$; //sales tax for the socks
        double totalGlassCost$; //total cost of drinking glasses
        double glassSalesTax$; //sales tax for the drinking glasses
        double totalEnvelopekCost$; //total cost of envelope
        double envelopeSalesTax$; //sales tax for the envelope
        double totalPurchaseCost$; //total cost of purchase before sales tax
        double totalSalesTax$; //total sales tax of the purchase
        double transactionCost$; //total cost of the transaction
        
        //calculate for all of the variables
        totalSockCost$=nSocks*sockCost$; //calculate the total cost of socks
        sockSalesTax$=totalSockCost$*taxPercent; //calculate the tax on the socks
        sockSalesTax$=((int) (sockSalesTax$*100)/100.0); //cut off all unnecessary digits
        totalGlassCost$=nGlasses*glassCost$; //calculate the total cost of glasses
        glassSalesTax$=totalGlassCost$*taxPercent; //calculate the tax on the glasses
        glassSalesTax$=((int) (glassSalesTax$*100)/100.0); //cut off all unnecessary digits
        totalEnvelopekCost$=nEnvelopes*envelopeCost$; //calculate the total cost of the envelope
        envelopeSalesTax$=totalEnvelopekCost$*taxPercent; //calculate the tax on the envelope
        envelopeSalesTax$=((int) (envelopeSalesTax$*100)/100.0); //cut off all unnecessary digits
        totalPurchaseCost$=totalSockCost$+totalGlassCost$+totalEnvelopekCost$; //calculate the total cost of the purchase before sales tax
        totalSalesTax$=totalPurchaseCost$*taxPercent; //calculate the tax for the entire purchase
        totalSalesTax$=((int) (totalSalesTax$*100)/100.0); //cut off all unnecessary digits
        transactionCost$=totalPurchaseCost$+totalSalesTax$; //calculate how much you are actualy paying
        
        //print out our awnsers
        System.out.println("Socks");
        System.out.println("Number Bought: "+(nSocks));
        System.out.println("Cost per Pair of Socks: $"+(sockCost$));
        System.out.println("Cost of Socks: $"+(totalSockCost$));
        System.out.println("Sales Tax for Socks: $"+(sockSalesTax$));
        System.out.println("");
        System.out.println("Drinking Glasses");
        System.out.println("Number Bought: "+(nGlasses));
        System.out.println("Cost per Drinking Glass: $"+(glassCost$));
        System.out.println("Cost of Drinking Glasses: $"+(totalGlassCost$));
        System.out.println("Sales Tax for Drinking Glasses: $"+(glassSalesTax$));
        System.out.println("");        
        System.out.println("Envelope");
        System.out.println("Number Bought: "+(nEnvelopes));
        System.out.println("Cost per Envelope: $"+(envelopeCost$));
        System.out.println("Cost of Envelope: $"+(totalEnvelopekCost$));
        System.out.println("Sales Tax for Envelope: $"+(envelopeSalesTax$));
        System.out.println("");        
        System.out.println("Total Cost of Purchase Before Sales Tax: $"+(totalPurchaseCost$));
        System.out.println("Total Sales Tax: $"+(totalSalesTax$));
        System.out.println("Total Cost of Purchase After Sales Tax: $"+(transactionCost$));
        
    } //end of main method
} //end of class