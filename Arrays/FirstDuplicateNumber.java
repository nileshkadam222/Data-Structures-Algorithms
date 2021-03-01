import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 2, 4, 5, 7, 9, 2, 4, 8, 0 };
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					//System.out.println(arr[i]);
				}
			}
		}

		//using hashtable
		Hashtable<Integer, Integer> filterHashTable =  new Hashtable<Integer, Integer>();
		Stream.of(arr).forEach(i->{
			if(filterHashTable.containsKey(i)) {
			 System.out.print(i);
			}else {
				filterHashTable.put(arr[i], arr[i]);
			}
		});
		
		//Using HashSet
		Set<Integer> allItems = new HashSet();
		Integer orElse = Arrays.stream(arr).filter(i -> !allItems.add(i)).findFirst().orElse(-1);
		//System.out.println(orElse);
	}
}
