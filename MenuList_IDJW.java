package final_IDJW2018;

import java.lang.Math;

public class MenuList_IDJW{

	  private Restaurant_IDJW[] array;

	  private int capacity = 1;

	  private int indexOfNext = 0;

	  private int pointer = 0;



	  public MenuList_IDJW(){

	    array = new Restaurant_IDJW[capacity];

	  }

	  public MenuList_IDJW(int num){

	    array = new Restaurant_IDJW[num];

	  }

	  public MenuList_IDJW(Restaurant_IDJW[] arr1, int indexNext){

	    array = arr1;

	    capacity = arr1.length;

	    indexOfNext = indexNext;

	  }

	  public void setArray(Restaurant_IDJW[] arr2){

	    array = arr2;

	  }

	  public Restaurant_IDJW[] getArray(){

	    Restaurant_IDJW[] arrDeep = new Restaurant_IDJW[capacity];

	    for(int x=0; x<array.length;x++){

	      arrDeep[x] = array[x];

	    }

	    return arrDeep;

	  }

	  public void setindexOfNext(int next){

	    indexOfNext = next;

	  }

	  public int getindexOfNext(){

	    int c = indexOfNext;

	    return c;

	  }

	  public int getCapacity(){

	    return capacity;

	  }

	  public void setCapacity(int numCap){

	    capacity = numCap;

	  }

	  public String toString(){

	    String list = "";

	    for(int i=0; i<indexOfNext; i++){

	      list += (array[i] + "\n");

	    }

	    return list;

	  }

	  public Restaurant_IDJW getRestaurantAtIndex(int ind){

	    Restaurant_IDJW v = array[ind];

	    return v;

	  }

	  public void add(Restaurant_IDJW rest){

	    //***dynamic capacity ---> increase if capacity is overflows

	    if(isFull()){

	      moreCapacity();

	    }

	    array[indexOfNext] = rest;

	    indexOfNext++;

	  }

	  public void delete(int deletingNum){

	    // check for empty arrr

	    if(indexOfNext != 0){

	      for(int g=deletingNum;g<indexOfNext;g++){

	        array[g] = (g != indexOfNext-1) ? array[g+1] : null ;

	      }

	    }

	  }

	  public int isThere(Restaurant_IDJW thisRest){

	    int there = -1;

	    //Uses linear search

	      for(int k=0; k<indexOfNext; k++){

	        if(array[k].equals(thisRest)){

	          there = 1;

	          break;

	        }

	      }

	    return there;

	  }

	  public void replaceRestaurant(Restaurant_IDJW rest1, int pos){

	    array[pos] = rest1;

	  }

	  public void insertRestaurant(Restaurant_IDJW rest2, int position){

	    for(int f=indexOfNext-1; f>=position; f--){

	      array[f] = (f != position) ? array[f-1] : rest2;

	    }

	  }

	  public boolean isFull(){

	    if(indexOfNext == capacity){

	      return true;

	    }else{

	      return false;

	    }

	  }

	  public boolean isEmpty(){

	    if(indexOfNext == 0){

	      return true;

	    }else{

	      return false;

	    }

	  }

	  public void clear(){

	    array = new Restaurant_IDJW[capacity];

	    indexOfNext = 0;

	  }

	  public void trim(){

	    capacity = indexOfNext;

	    Restaurant_IDJW[] arr2 = new Restaurant_IDJW[capacity];

	    for(int d=0; d<capacity; d++){

	      arr2[d] = array[d];

	    }

	    array = arr2;

	  }

	  public void moreCapacity(){

	    //adding in 50% more capacity and rounds down

	    //Ex: capacity = 5 --> new capacity 5*1.5 = 7.5 -- round up --> NEW CAPACITY = 8

	    capacity = (int) Math.ceil((double) capacity * 1.5);



	    Restaurant_IDJW[] arr3 = new Restaurant_IDJW[capacity];

	    for(int b=0; b<array.length; b++){

	      arr3[b] = array[b];

	    }

	    array = arr3;

	  }

	  public void resetPointer(){

	    pointer = 0;

	  }

	  public boolean hasNextRestaurant(){

	    if(pointer < indexOfNext){

	      return true;

	    }else{

	      return false;

	    }

	  }

	  public Restaurant_IDJW getNext(){

	    Restaurant_IDJW nextRest = array[pointer];

	    pointer++;

	    return nextRest;

	  }
}