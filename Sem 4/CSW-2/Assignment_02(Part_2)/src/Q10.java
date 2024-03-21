import java.util.Arrays;
import java.util.Hashtable;

//In given large string, find the most occurring words in the string. 
//Hint:-
//a. Create a Hashtable which will keep track of <word, frequency>
//b. Iterate through the string and keep track of word frequency by inserting
//into Hash-Table.
//c. When we have a new word, we will insert it into the Hashtable with
//frequency 1. For all repetition of the word, we will increase the
//frequency.
//d. We can keep track of the most occurring words whenever we are
//increasing the frequency we can see if this is the most occurring word or 
//not.



public class Q10 {
    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();
        String str[] = {"the", "world", "is", "small", "and", "small", "the", "world", "is", "small"};

        int mostFreq = 0;
        String mostFreqword = "";

        for (String st : str) {
            if (ht.containsKey(st)) {
                ht.put(st, ht.get(st) + 1);
                if (mostFreq < ht.get(st)) {
                    mostFreq = ht.get(st);
                    mostFreqword = st;
                }
            } else {
                ht.put(st, 1);
                if (mostFreq == 0) {
                    mostFreq = 1;
                    mostFreqword = st;
                }
            }
        }

        System.out.println(mostFreq);
        System.out.println(mostFreqword);
    }
}
