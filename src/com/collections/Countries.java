package com.collections;

import java.util.ArrayList;
import java.util.Collections;
/* Collection vs Collections 
 * --------------------------------
 * -Collection is an interface in java Collections framework
 *It is the root interface to represent objects
 *it provides basic methods to store,retrieve and manipulate the data
 *
 *Interable<Collections<List.Set,Queue
 *
 *common methods present in Collections:
 *-add(),remove(),Size(),contains();clear();isEmpty();
 *
 ****Collections :
 *Collections is a utily class that contains some static methods to operate on collections objects it is use in searching,sorting,reversion and other operations.
 *
 */

public class Countries {

	public static void main(String[] args) {
		ArrayList<String> CountryList=new ArrayList<>();
		CountryList.add("India");
		CountryList.add("Singapore");
		CountryList.add("Taiwan");
		CountryList.add("Canada");
		CountryList.add("Australia");
		System.out.println(CountryList);
		Collections.sort(CountryList);
		System.out.println(CountryList);
		

	}

}
