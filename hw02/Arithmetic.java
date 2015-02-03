public class Arithmetic {
//Creates class Arithmetic
public static void main(String[] args){
//Creates integer variable representing number of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost=3.25;
double taxPercent=0.06;

double chargeSocks=nSocks*sockCost;//cost of socks without tax
double totalSocks=chargeSocks+taxPercent*sockCost;//cost of socks with tax
double chargeGlasses=nGlasses*glassCost;//cost of glasses without tax
double totalGlasses=chargeGlasses+taxPercent*glassCost;//cost of glasses with tax
double chargeEnvelopes=nEnvelopes*envelopeCost;//cost of envelopes without tax
double totalEnvelopes=chargeEnvelopes+envelopeCost*taxPercent;//cost of envelopes with tax

//Convert doubles to two decimal places by converting to integer then back
totalSocks*=100;int totalSocksI=(int)totalSocks;double totalSocksn=totalSocksI*.01;
chargeSocks*=100;int chargeSocksI=(int)chargeSocks;double chargeSocksn=chargeSocksI*.01;
totalGlasses*=100;int totalGlassesI=(int)totalGlasses;double totalGlassesn=totalGlassesI*.01;
chargeGlasses*=100;int chargeGlassesI=(int)chargeGlasses;double chargeGlassesn=chargeGlassesI*.01;
totalEnvelopes*=100;int totalEnvelopesI=(int)totalEnvelopes;double totalEnvelopesn=totalEnvelopesI*.01;
chargeEnvelopes*=100;int chargeEnvelopesI=(int)chargeEnvelopes;double chargeEnvelopesn=chargeEnvelopesI*.01; 

//Find tax charge for each good and overall
double sockTax=totalSocksn-chargeSocksn;
double glassesTax=totalGlassesn-chargeGlassesn;
double envelopesTax=totalEnvelopesn-chargeEnvelopesn;
double totalWithoutTax=chargeSocksn+chargeGlassesn+chargeEnvelopesn;//total cost without tax
double total=totalSocksn+totalGlassesn+totalEnvelopesn;//total cost of all items with tax
double totalTax=total-totalWithoutTax;

//Convert to strings so that they can be printed
String totalSockss = String.valueOf(totalSocksn);
String totalGlassess = String.valueOf(totalGlassesn);
String totalEnvelopess = String.valueOf(totalEnvelopesn);
String sockTaxs = String.valueOf(sockTax);
String glassesTaxs = String.valueOf(glassesTax);
String envelopesTaxs = String.valueOf(envelopesTax);
String totalTaxs = String.valueOf(totalTax);
String totals = String.valueOf(total);

//print statements printing total cost of each good and then a total
System.out.println("The total cost of the socks was $"+totalSockss);
System.out.println("The total cost of the glasses was $"+totalGlassess);
System.out.println("The total cost of the envelopes was $"+totalEnvelopess);
System.out.println("The tax on the socks was $"+sockTaxs);
System.out.println("The tax on the glasses was $"+glassesTaxs);
System.out.println("The tax on the envelopes was $"+envelopesTaxs);
System.out.println("The total tax on the purchase was $"+totalTaxs);
System.out.println("The total cost of the purchase was $"+totals);
}
}