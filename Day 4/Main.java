//Implementation of Hashing and handling the collision occur while inserting items

import java.util.ArrayList;
import java.util.LinkedList;

class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
      BUCKET=b;
      table=new ArrayList<LinkedList<Integer>>();
      for(int i=0;i<b;i++){
        table.add(new LinkedList<>());
      }

    }


    void insert(Integer k){
        int i=k%BUCKET;
        table.get(i).add(k);
    }

    boolean search (Integer k){
        int i=k%BUCKET;
          return table.get(i).contains(k);
    }

    void delete(Integer k){
        int i=k%BUCKET;
        table.get(i).remove(k);
    }
}


public class Main {


    public static void main(String[] args) {
        MyHash obj=new MyHash(7);
        obj.insert(10);
	    obj.insert(20);
	    obj.insert(15);
	    obj.insert(7);
	    System.out.println(obj.search(10));
	    obj.delete(15);
	    System.out.print(obj. search(15));
    }
    
}
