package sets;

import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");
        /**
        System.out.println("le plus grand nombre de lettres : " + set.stream().max(Comparator.comparingInt(String::length)));
        
        set.remove(set.stream().max(Comparator.comparingInt(String::length)).get());
		
        for (String s : set)
            System.out.println(s);
        */
        
        String longestString="";
        for(String s: set)
        {
            if (s.length()>longestString.length())
            {
                longestString=s.toString();
            }
        }

        System.out.println("Le pays avec le plus grand nombre de charactères est : "+longestString);

        set.remove(longestString);

        for(String s: set)
        {
            System.out.println(s);
        }


	}

}
