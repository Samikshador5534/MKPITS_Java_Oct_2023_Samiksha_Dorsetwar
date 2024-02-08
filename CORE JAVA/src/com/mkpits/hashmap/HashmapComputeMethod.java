package com.mkpits.hashmap;


	import java.util.HashMap;
	import java.util.Map;

	public class HashmapComputeMethod {
		public static void main(String[] args) 
		{
	/*
		12. public V 
	        compute(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction)
	Parameters: This method accepts two parameters:

	key: key with which the value is to be associated.
	remappingFunction: function to do the operation on value.
	Returns: This method returns new value associated with the specified key, or null if none. 
	 */
			Map<Integer, String> hMap1 = new HashMap<>();

	// adding element in HashMap
			
			hMap1.put(234, " Vanitav");
			hMap1.put(54, " Tanmay");
			hMap1.put(65, " Nayan");
			hMap1.put(635465, "hiiii");
			
			System.out.println(hMap1.toString());
			System.out.println("Map{} is -->"+hMap1);
			
			hMap1.compute(234, (key, val)-> val + " Paidlewar");
			System.out.println("new hMap1"+hMap1);
			hMap1.compute(234, (key, val)-> key + "150");
			System.out.println("new hMap1"+hMap1);
			
		}

	}

