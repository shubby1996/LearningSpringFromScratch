
/********************************
 * 
 * 
 * 
 * 
 * This is just a dummy class to create scriptlet codes and then paste them to the jsp files 
 * because auto quick fix doesnt work in scriptlets
 * 
 * 
 * 
 * 
 */

package com.entities;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.helper.FactoryProvider;

public class DummyScriptletClasses {

	private static Object Query;

	public static void main(String[] args) {

		Session sessionLocal = FactoryProvider.getFactory().openSession();

		Query q = sessionLocal.createQuery("from Note");

		java.util.List<Note> list = q.list();

		for (Note note : list) {
			System.out.println(note);
		}

		sessionLocal.close();

	}

}
