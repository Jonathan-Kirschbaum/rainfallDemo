import java.util.Scanner;

public class rainfallDemo{//Start of class rainfallDemo
	public static void main(String[] args){//start of main method

	double totalRain;
	double avgRain;
	int mostRain;
	int leatRain;
	final int num_Months = 12;

	double[] yearlyRainfall = new double[num_Months];

	String[] month = {"January","February","March","April","May","June",
					 	"July","August","September","October","November","December"};

	rainfall rain = new rainfall(yearlyRain);
	getRainfall(yearlyRain,month);


}//End of main method

public static void getRainfall(double yearlyRainfall,String month){//Start of getRainfall method
rainfallInMonth = 0;
for(int index=0;index<yearlyRainfall.length;index++){//Start of for loop
System.out.println("What was the rainfall for" +month[index]+"?");
rainfallInMonth[index]= keyboard.NextDouble();

}//end of getRainfall method
}//end of class rainfallDemo

public class rainfall{//Start of class rainfall

private double[] rain;

public rainfall(double[] rainfallInMonth){//Start of Constructor

rainInYear = new double[rainfallInMonth.length];

for(int index=0;index<rainfallInMonth.length;index++){//start of for loop
rainInYear[index]=rainInMonth[index];
}//end of constructor

public double getTotalRain(){
	double totalRain = 0.0;

	for(int index=0;index<yearlyRain.length;index++){//start of for loop
	totalRain += yearlyRain[index];
}//end of for loop

return totalRain;
}//end of method getTotalRain

public  getAvgRain(){//Start of method getAvgRain

double avgRain = 0.0;

avgRain = getTotalRain()yearlyRain.length;
return avgRain;
}//end of getAvgRain method

public int getMostRain(){//start of method getMostRain
int most = yearlyRain[0];
int month = 0;

for(index=0;index<yearlyRain.length;index++){//start of for loop

if(yearlyRain[index]>most){//start if statement
most = yearlyRain[index];
month = index;
}//end of if statement

return month;
}//end of method getMostRain

public in getLeastRain(){//start of method getLeastRain
int least = yearlyRain[0];
int month = 0;

for(index=0;index<yearlyRain.length;index++){//start of for loop

if(yearlyRain[index]<least){//start of if statement
	least = yearlyRain[index];
	month = index;
}//end of if statement

return month;
}//end of method getLeastRain

}//end of class rainfall






