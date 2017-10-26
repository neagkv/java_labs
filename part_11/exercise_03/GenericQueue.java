package part_11.exercise_03;

import java.util.ArrayList;

public class GenericQueue <T> {

    private ArrayList<T> genQueue;
    private int putLocation, getLocation;
    private int size = 1000;

    public GenericQueue(int size) {
        this.size = size; //set custom size for Queue
        genQueue = new ArrayList<T>();// create new ArrayList
        putLocation = getLocation = 0;// set initial location values

    }

    GenericQueue(){

        genQueue = new ArrayList<T>();//create a new ArrayList
        putLocation = getLocation = 0;//set initial location values
    }

    public T get() throws  QueueEmptyException{
        if(getLocation == putLocation){
            System.out.println("Queue is Empty");
            throw new QueueEmptyException();

        }

        T retVal = genQueue.get(getLocation);
        getLocation++;
        return retVal;
    }

    public void  put(T obj) throws QueueFullException {
        if(putLocation == size ){
            System.out.println("Queue is Full");
            throw new QueueFullException();
        }

        genQueue.add(obj);
        putLocation++;
    }

    public boolean hasNext(){
        if(getLocation < putLocation){
            return true;
        }
        return false;
    }

    public static class Car {

        String make;
        String model;


        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }


    }
}
