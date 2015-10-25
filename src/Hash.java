import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hash {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		HashSet<String> hs = new HashSet();
		Map<Integer, HashSet<String>> m = new HashMap();
		
		while(in.hasNext()){
			String word = in.nextLine();
			int hash = word.hashCode();
			
			if(m.containsKey(hash)){
				hs = m.get(hash);
				hs.add(word);
				
			}
			else{
				HashSet<String> ns = new HashSet();
				ns.add(word);
				m.put(hash, ns);
			}
		}
		
		for(int h : m.keySet()){
			HashSet<String> r = new HashSet();
			r = m.get(h);
			
			if(r.size() > 1){
				System.out.print(h);
				for(String s : r){
					System.out.print(s);
					
				}
			}
			
		}
		
		
	}

}
