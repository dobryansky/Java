package Lesson_11;

import java.util.ArrayList;
import java.util.Collections;

public class Array<T> {
    public T[] members;
    public Array() {
    }
    public Array(T... members) {
        this.members = members;
    }

    public void  swapArray(int index1,int index2 ){
        System.out.println(" до ");
        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i] +" ");

        }
        T temp;
        temp=  members[index1];
        members[index1]= members[index2];
        members[index2]=  temp;
        System.out.println();
        System.out.println(" после ");
        for (int i = 0; i < members.length; i++) {
            System.out.print(members[i]+" ");

        }

    }


    public ArrayList<T> toArrayList( ){
        ArrayList<T> strList= new ArrayList<>();
        Collections.addAll( strList,  this.members);
       return strList;
    }
}
