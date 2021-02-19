import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FindArrayConatins {

	public static void main(String[] args) {
		
		//Big o(a*b)
		BiPredicate<String, String> campareTwoString = (s1,s2)->s1.equalsIgnoreCase(s2);
		BiPredicate<String[], String[]> findContanisElemnets = (array1,array2)->{
			for(String str : array1) {
				for(String str2 : array2) {
					if(campareTwoString.test(str, str2)) {
						return true;
					}
				}
			}
			return false;
		};
		
		String[] array1 = {"Nilesh","Harshu"};
		String[] array2 = {"Nilesh","Pooja","Arti"};
		System.out.println("Big o (a*b) -->" +findContanisElemnets.test(array1, array2));
		
		//Solution 1 ----> Big o (a+b)
		Function<String[],Map<String, Boolean>> convertArrayTOMap = (array)->{
			Map<String,Boolean> map = new HashMap<String, Boolean>();
			for(String s:array) { //o(a)
				map.put(s, true); 
			}
			return map;
		};
		
		BiPredicate<String[], String[]> findEle = (s1,s2)->{
			Map<String, Boolean> ObjectMap = convertArrayTOMap.apply(s1);
			for(String str:s2) { //o(b)
				return ObjectMap.containsKey(str);
			}
			return false;
		};
		
		String[] array3 = {"aa","Harshu"};
		String[] array4 = {"Nilesh","Pooja","Arti"};
		System.out.println("Big o(a+b)"+findEle.test(array3, array4));
	}
}
