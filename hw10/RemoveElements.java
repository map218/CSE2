//Matt Palmieri
//4/2/15
//CSE2 hw08
//RemoveElements
//practice using methods and arrays to do stuff

//import scanner class in order to use it


import java.util.Scanner;
public class RemoveElements{
    public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
	int newArray1[];
	int newArray2[];
	int index,target;
	String answer="";
	do{
  		System.out.println("Random input 10 ints [0-9]");
  		num = randomInput();
  		String out = "The original array is: ";
  		out += listArray(num);
  		System.out.println(out);
 
  		System.out.print("Enter the index ");
  		index = scan.nextInt();
  		newArray1 = delete(num,index);
  		String out1="The output array is: ";
  		out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  		System.out.println(out1);
 
      	System.out.print("Enter the target value ");
  		target = scan.nextInt();
  		newArray2 = remove(newArray1,target);
  		String out2="The output array is: ";
  		out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  		System.out.println(out2);
  	 
  		System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  		answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  		if(j>0){
    		out+=", ";
  		}
  		out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){
  	int i = 0; //initialize i counter at 0
  	int rand;
  	int array[] = new int [10];
  	while (i<10){
   		rand = (int) (Math.random() * 10); //generates random number between 0-9
   		array[i] = rand; //sets array[i] equal to a random int between 0 and 9
   		i++; //increase i counter
  	}
  	return array;
  }
  
  public static int[] delete(int list[], int pos){
  	if (pos<0 || pos>9){ //check to make sure pos is a valid value
  		System.out.println("The index value is not valid");
  		return list; //return the origional array if an incorrect number is given
  	}
  	else{
  		System.out.println("Index "+pos+" element is removed");
  		int i = 0; //initialize i counter at 0
  		int j = 0; //initialize j counter at 0
  		int arraylength = 9; //set array length
  		int array[] = new int [arraylength];
  		while (i<arraylength){
   			if(i == pos){
   				j++; //if the value of i is equal to the position skip it
   				array[i] = list[j]; // set old array equal to new one
  			}
  			else{
  				array[i] = list[j]; // set old array equal to new one
  			}
  			i++;
  			j++;
  		}
  		return array;
  	}
  }
  
  public static int[] remove(int list[], int target){
  	if (target<0 || target>9){ //check to make sure pos is a valid value
  		System.out.println("Element "+target+" was not found.");
  		return list; //return the origional array if an incorrect number is given
  	}
  	else{
  		System.out.println("Element "+target+" has been found.");
  		int i = 0; //initialize i counter at 0
  		int j = 0; //initialize j counter at 0
  		int k = 0; //initialize j counter at 0
  		int arraylength = 9;
  		while (i<arraylength){
  			if(list[i] == target){ //if list[i] is equal to the target value
  			arraylength--; //then subtract from the overall array length
  			}
  			i++;
  		}
  		int array[] = new int [arraylength];
  		while (j<arraylength){
   			while(list[k] == target){
   				k++; //if the value of list[k] is equal to the target skip it
   				array[j] = list[k]; // set old array equal to new one
  			}
  				array[j] = list[k]; // set old array equal to new one
  			j++;
  			k++;
  		}
  		return array;
  	}
  }
}

