public class newlab{
  public static void main(String args[]){

    //Chaleng 1
  String word = "hello";
  int wordLength = word.length();
  int midPoint = word.length()/2;
  String firsthalf = word.substring(0,midPoint);
  String secondhalf = word.substring(word.length()/2);
  String mixed = secondhalf + firsthalf;
  System.out.print(mixed);
  // Chaleng 2
  System.out.println(" \n     ________    \n    /_______/\\    \n    \\ \\    / /\n ____\\ \\__/_/____\n/_____\\ \\_______/\\\n\\ \\    \\/ /    / /\n \\ \\   / /\\   / /\n  \\ \\ / /\\ \\ / /\n   \\_\\_/  \\_\\_/");
  }



}