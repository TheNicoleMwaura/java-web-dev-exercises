package exercises;
import java.util.Scanner;

public class Strings {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(str);
        System.out.println("Search for a word in the sentence above: ");
        String word = input.nextLine();

        if(str.contains(word)){
            System.out.println("Your word is in the sentence: " + word);

        }else{
            System.out.println(word+ " not found");
        }

    }

}
