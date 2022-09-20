package Collections;

import java.util.ArrayList;

public class QueueImplementationUsingArrayList {
	ArrayList<Object> q = new ArrayList<Object>();
	int size;

	public void addElement(Object ele) { // Inserting a new element into the queue
		q.add(ele);
		size++;
	}

	public Object removeElement() { // Deleting the front element from the queue
		try {
			size--;
			return q.remove(0);

		} catch (Exception IndexOutOfBoundsException) {
			size++;
			return null;
		}
	}

	public Object display(int index) { // Getting an element from the queue
		return q.get(index);
	}

	public String empty() { // Checking whether the queue is empty
		return size() == 0 ? "empty" : "not empty";
	}

	public int size() { // Finding the number of elements in the queue
		return size;
	}

	public int frequency(Object ele) { // Finding the frequency of an element in the queue
		int count = 0;
		for (int i = 0; i < size(); i++) {
			if (q.get(i).equals(ele))
				count++;
		}
		return count;
	}

	public int search(Object ele) { // Finding the position of an element in the queue
		for (int i = 0; i < size(); i++) {
			if (q.get(i).equals(ele))
				return i;
		}
		return -1;
	}
}
