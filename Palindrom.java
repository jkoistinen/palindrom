public class Palindrom {

public static void main(String[] args) {

String inputCleaned = args[0].toLowerCase().replaceAll("\\s",""); //convert to lowercase and remove all spaces

String inputReversed = ""; //reverse the inputCleaned
for(int i = inputCleaned.length() -1; i>=0; i--){
  inputReversed = inputReversed + inputCleaned.charAt(i);
}

//compare inputCleaned and inputReversed, if they are the same we have a Palindrome
if( inputCleaned.equals(inputReversed )){
  System.out.println("Palindrome!");
}

}
}
