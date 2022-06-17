package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
	
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<Double>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        System.out.println("Set : " + set.toString());
        System.out.println("Max : " + TestSetDouble.max(set));
    }

	public static double max(HashSet<Double> set) {
		// TODO Auto-generated method stub
		Iterator<Double> iterator = set.iterator();
        double max = iterator.next();
        while (iterator.hasNext()) {
            double current = iterator.next();
            if (current > max) {
                max = current;
            }
        }
		return max;
	}
	
    public static HashSet<Double> removeMin(HashSet<Double> set){
        HashSet<Double> setCopy = new HashSet<Double>(set);

        Iterator<Double> iterator = setCopy.iterator();
        double min = iterator.next();

        return null;
    }

}
