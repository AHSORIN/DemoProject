import java.util.*;

public class new2 {
	
	public static void main(String args[]) {
		int count=0;
		List<Integer> array=new ArrayList<Integer>();
		array.add(2);
		array.add(3);
		array.add(2);
		array.add(3);
		array.add(4);
		
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int a:array) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			
			else
				map.put(a, 1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"is coming" + entry.getValue());
			}
		}
		
	/*	for(int i=0;i<array.size();i++) {
			for(int j=i+1;j<array.size();j++) {
				
				if(array.get(i)==array.get(j)) {
					count=count+1;
				}
				
			}
		 for(int k=0;i<array.size();i++) {
			 
		 }
		} */
	}

}
