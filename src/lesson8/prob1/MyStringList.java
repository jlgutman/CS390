package lesson8.prob1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length == 0 ? 1 : strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		if (size > 0)
			sb.append(strArray[size - 1]);
		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}

	public int indexOf(String s) {
		if (isEmpty() || s == null) return -1;
		for (int i=0; i<size; i++){
			if (s.equals(strArray[i])) {
				return i;
			}
		}
		return -1;
	}

	public String removeAt(int index) {
		if (isEmpty() || index < 0 || index > size)
			return null;
		String[] temp = new String[strArray.length];
		String removedElement = strArray[index];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return removedElement;
	}

	public void clear() {
		if (isEmpty()) return;
		//Arrays.fill(strArray, null);
		strArray = new String[]{};
		size = 0;
	}

	public String set(int index, String s) {
		if (isEmpty() || index < 0 || index > size || s == null)
			return null;
		String oldElement = strArray[index];
		strArray[index] = s;
		return oldElement;
	}

	public boolean contains(String s) {
		if (s == null) return false;
		for (int i=0; i<size; i++) {
			if (s.equals(strArray[i])) {
				return true;
			}
		}
		return false;
	}

	public boolean containsAll(MyStringList other) {
		if (other == null || other.size == 0) return true;
		if (other.size() > size) return false;

		for (int i=0; i<other.size(); i++) {
			if (!this.contains(other.get(i))) {
				return false;
			}
		}

		return true;
	}

	public MyStringList subList(int start, int end){
		if (start < 0 || end > size || start > end) return null;
		MyStringList result = new MyStringList();
		result.strArray = Arrays.copyOfRange(strArray, start, end);
		result.size = end - start;
		return result;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));
		//Homework tests
		System.out.println("Homework TESTS:::::::::::::::::::::::::::::::::::::");
		System.out.println(l);
		System.out.println("1. Get indexOf: " + l.indexOf("Steve"));
		System.out.println("2. Removed Element: " + l.removeAt(4));
		System.out.println(l);
		System.out.println("3. Clearing all elements...");
		l.clear();
		System.out.println("Collection empty: " + l + ", and size: " + l.size);
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		System.out.println(l);
		System.out.println("4. Set: " + l.set(1, "Tom"));
		System.out.println(l);
		MyStringList otherList = new MyStringList();
		otherList.add("Bob");
		otherList.add("Tom");
		otherList.add("Susan");
		otherList.add("Mark");
		System.out.println("5. ContainsAll: " + l.containsAll(otherList));
		System.out.println(l);
		System.out.println("6. Sub list");
		System.out.println(l.subList(1,3));
		System.out.println(l);
	}
}
