package codewars;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
 *
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 *
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 *
 * More similar exercise are found here http://rosalind.info/problems/list-view/ (source)
 *
 * DnaStrand.makeComplement("ATTGC") // return "TAACG"
 *
 * DnaStrand.makeComplement("GTAT") // return "CATA"
 */

public class DnaStrand {
    public static String makeComplement(String dna) {
        String[] split = dna.split("");
        String result ="";
        for (String object:split) {
            switch (object) {
                case "A":
                    result = result.concat("T");
                    break;
                case "T":
                    result = result.concat("A");
                    break;
                case "G":
                    result = result.concat("C");
                    break;
                case "C":
                    result = result.concat("G");
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //System.out.prinln(makeComplement("TAACG"));
    }
}
