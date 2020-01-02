package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    printFactors(32);
    }

    public static void printFactors(int number){
        if(number < 1)
            System.out.println("Invalid Value");
        String factors="";
        for(int i = 1; i <= number; i++){
            if(number % i == 0)
                factors += (i + " ");
        }
        System.out.println(factors);
    }
}
