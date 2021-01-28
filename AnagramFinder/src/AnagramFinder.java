import java.util.*;

public class AnagramFinder {

    public static void main(String[] args) {
        //String[] input = {"ABC","BHSD","XYZ","HDBS","CBA","ZYX","ZXY","PRG","BAC"};
        String[] input = {"CAT", "DOG", "TAC", "MAD", "DAM", "AMD", "GOD", "SET"};
        printAnagrams(input);

    }

    private static void printAnagrams(String[] input) {

        Map<String,List<String>> processList = new HashMap<>();

        for(String s : input){

            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String compVal = String.valueOf(charArray);
            if(processList.containsKey(compVal)){
                processList.get(compVal).add(s);
            }else{
                List<String> value = new ArrayList<String>();
                value.add(s);
                processList.put(compVal, value);
            }
        }

/*        for ( String key : processList.keySet()) {

                System.out.print(processList.get(key));

        } */


        Iterator iter = processList.keySet().iterator();

        while(iter.hasNext()){

            System.out.print(processList.get(iter.next()) );
            if(iter.hasNext()){
                System.out.print(",");
            }
        }
    }
}