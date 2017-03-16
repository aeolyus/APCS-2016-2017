import java.util.*;

/**
 * Contains the sorting methods bubble sort, selection sort, insertion sort,
 * merge sort, quick sort
 * 
 * @author Richard Huang
 */
public class Sorts{
	private long steps;

	public Sorts(){
		steps=0;
	}
	
	/**
	 * Sorts the list using bubble sort algorithm
	 * @param list list to be sorted
	 */
	public void bubbleSort(ArrayList<Comparable> list){
		steps=0;
		for(int o=0;o<list.size()-1;o++)
			for(int i=0;i<list.size()-o-1;i++){
				steps+=3;//1 compare, 2 gets
				if(list.get(i).compareTo(list.get(i+1))>0){
					swap(list,i,i+1);
				}
			}
		System.out.println();
		System.out.println("Bubble Sort");
		System.out.println();
	}

	/**
	 * Sorts the list using selection sort algorithm
	 * @param list list to be sorted
	 */
	public void selectionSort(ArrayList<Comparable> list){
		steps=0;
		int min;
		for(int o=0;o<list.size()-1;o++){
			min=o;
			for(int i=o+1;i<list.size();i++){
				steps+=3;//1 compare, 2 gets
				if(list.get(i).compareTo(list.get(min))<0)
					min=i;
			}
			swap(list,o,min);
		}
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println();
	}

	/**
	 * Sorts the list using insertion sort algorithm
	 * @param list list to be sorted
	 */
	public void insertionSort(ArrayList<Comparable> list){
		steps=0;
		for(int o=1;o<list.size();o++){
			int p=o;
			steps++;//1 get
			Comparable k=list.get(p);
			while(p>0&&list.get(p-1).compareTo(k)>0){
				steps+=4;//1 set, 2 get, 1 compare
				list.set(p,list.get(p-1));
				p--;
			}
			steps+=3;//1 set, 1 get, 1 compare
			list.set(p,k);
		}
		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println();
	}

	/**
	 * Takes in entire vector, but will merge the following sections together:
	 * Left sublist from a[first]..a[mid], right sublist from a[mid+1]..a[last].
	 * Precondition: each sublist is already in ascending order
	 * @param a reference to an array of integers to be sorted
	 * @param first starting index of range of values to be sorted
	 * @param mid midpoint index of range of values to be sorted
	 * @param last last index of range of values to be sorted
	 */
	private void merge(ArrayList<Comparable> a,int first,int mid,int last){

	}

	/**
	 * Recursive mergesort of an array of integers
	 * @param a reference to an array of integers to be sorted
	 * @param first starting index of range of values to be sorted
	 * @param last ending index of range of values to be sorted
	 */
	public void mergeSort(ArrayList<Comparable> a,int first,int last){

	}

	/**
	 * Sorts the list using the quick sort algorithm
	 * @param a reference to an array of integers to be sorted
	 * @param first starting index of range of values to be sorted
	 * @param last ending index of range of values to be sorted
	 */
	public void quickSort(ArrayList<Comparable> a,int first,int last){

	}

	/**
	 * Accessor method to return the current value of steps
	 */
	public long getStepCount(){
		return steps;
	}

	/**
	 * Modifier method to set or reset the step count. Usually called prior to
	 * invocation of a sort method.
	 * @param stepCount value assigned to steps
	 */
	public void setStepCount(long stepCount){
		steps=stepCount;
	}

	/**
	 * Interchanges two elements in an ArrayList
	 * @param list reference to an array of integers
	 * @param a index of integer to be swapped
	 * @param b index of integer to be swapped
	 */
	public void swap(ArrayList<Comparable> list,int a,int b){
		Comparable temp=list.get(a);
		list.set(a,list.get(b));
		list.set(b,temp);
		steps+=4;//2 gets and 2 sets
	}
}