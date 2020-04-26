package com.syntax.review10;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapIntro {
	public static void main(String[] args) {
		//Map
		//HashMap    LinkedHasSet    TreeMap    HashTable
		//Map is a collection of entries
		Map<Integer,String> phoneBook=new HashMap<>();
		phoneBook.put(123456789,"John Smith");
		phoneBook.put(37384953,"James London");
		phoneBook.put(16789678,"Rohani Smith");
		phoneBook.put(9876543,"Donald Trump");
		phoneBook.put(1111111,"Obama");
		phoneBook.put(129282833,"Brad Pitt");
		phoneBook.put(16789678,"Julia Roberts"); //it's replacing with new value
		
		String name=phoneBook.get(129282833);
		System.out.println(name+" is calling");
		
		String name2=phoneBook.get(555);
		System.out.println(name2+" is calling");
		boolean contains=phoneBook.containsKey(5555);
		System.out.println(contains);
		boolean contains2= phoneBook.containsValue("Julia Roberts");
		System.out.println("Julia Roberts is in my contact list:"+contains2);
		
		//will remove trump from my list
		phoneBook.remove(9876543);
		System.out.println(phoneBook);
		
		phoneBook.isEmpty();
		
		///////////////////////////////
		//Let's get all the keys in a Set
		Set<Integer> keys=phoneBook.keySet();
		Iterator<Integer> it=keys.iterator();
		
		while(it.hasNext()) {
			int key=it.next();
			String value=phoneBook.get(key);
			System.out.println(key+"-->"+value);
		}
		//Let's get all the value in a collection(no indexes in collections)
		//if you iterate the values, you cannot find the keys
		Collection<String>values=phoneBook.values();
		for(String v:values) {
			System.out.println(v);
			//Let's get all the entries and store them in a Set
			
			
			}
		System.out.println("-------entrySet()--------");
		Set<Entry<Integer,String>> entries=phoneBook.entrySet();
		
		for(Entry<Integer,String> entry:entries) {
			//System.out.println(entry);
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+"--->"+value);
			
		}
		System.out.println("----------using iterator------");
		
		Iterator<Entry<Integer,String>>entryIt=entries.iterator();
		
		while(entryIt.hasNext()) {
			Entry<Integer,String> i=entryIt.next();
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
