package com.datastructure.data_structures.Arrays;

public class DynamicArrays1 {

    public int length;
    private String[] data;
    private int capacity;

    DynamicArrays1(){
        this.length = 0;
        this.capacity = 1;
        this.data = new String[capacity];
    }

    public String getData(int index){
        return this.data[index];
    }
    public int pushData(String data){
        if(this.length == this.capacity){
            //calculate the capacity
            this.capacity = this.capacity * 2;

            //create new array with double capacity.
            String[] tempArray = new String[this.capacity];

            //copy all the elements from old array to new array
            for(int i=0;i<length;i++){
                tempArray[i] = this.data[i];
            }

            //assigen newly created array to old array
            this.data = tempArray;
        }
        this.data[this.length] = data;
        this.length++;
        return this.length;
    }

    public void popData(){
        if(this.length > 0){
            //create a new temp array
            this.length--;
        }
    }

    public void printdata(){
        System.out.println();
        for(int i=0;i<this.length;i++){
            System.out.print(this.data[i] + "  ");
        }
    }
    public void deleteData(int index){
       //start form index to lengnt -1, because we dont required to shift last element.
        if(index < capacity && index <= length){
            for(int i =index;i<length-1;i++){
                this.data[i] = this.data[i+1];
            }
            //to delete last element
            popData();
        }else{
            throw new ArrayIndexOutOfBoundsException("Array out of bound");
        }

    }

}

class useArray{
    public static void main(String[] args) {
        DynamicArrays1 myArray = new DynamicArrays1();
        System.out.println(myArray.length);
        myArray.pushData("Nilesh");
        myArray.pushData("Harshu");
        myArray.pushData("kadam");
        myArray.printdata();
        myArray.deleteData(1);
        myArray.printdata();
    }
}
