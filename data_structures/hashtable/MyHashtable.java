package com.datastructure.data_structures.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class KeyValue{
    private String key;
    private int value;

    public KeyValue(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "KeyValue{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

public class MyHashtable {

    private ArrayList<KeyValue>[] data;
    MyHashtable(int size){
        this.data = new ArrayList[size];

    }

    private int hash(String key){
        int hash = 0;
        for(int i=0;i<key.length();i++){
            hash = (hash+key.codePointAt(i)*i) % this.data.length;
        }
        return hash;
    }

    public void set(String key,int value){
        int address = this.hash(key);

        if(this.data[address] == null){
            ArrayList<KeyValue> dataAtAddress = new ArrayList<>();
            this.data[address] = dataAtAddress;
        }
        KeyValue pairData = new KeyValue(key,value);
        this.data[address].add(pairData);
    }

    public int getData(String key){
        int address = this.hash(key);
        ArrayList<KeyValue> datum = this.data[address];
        Optional<KeyValue> b = datum.stream().filter(e->e.getKey().equals(key)).findAny();
        return b.get().getValue();
    }

    public List<String> keys(){
        List<String> collect = Arrays.stream(this.data).flatMap(f -> f.stream().map(m -> m.getKey())).collect(Collectors.toList());
        return collect;
    }
}

class useMyHashTable{
    public static void main(String[] args) {
        MyHashtable hashtable = new MyHashtable(1);
        hashtable.set("Nilesh",10);
        hashtable.set("Harshu",102);
        System.out.println(hashtable.getData("Nilesh"));
        System.out.println(hashtable.getData("Harshu"));
        hashtable.keys().stream().forEach(System.out::println);


    }
}
