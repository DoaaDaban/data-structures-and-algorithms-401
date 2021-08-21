package com.mohiesen;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable<K,V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int numBuckets;
    private int size;
    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        // create bucket array
        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        // this is to ensure the index is with in the bounds of the bucket array
        int index = hashCode % numBuckets;

        // hashCode can be negative (key.hashCode() can be -ve (negative))
        // so we need to make it positive
        index = index < 0 ? index * -1 : index;

        return index;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(K key, V value) {

        // gets the head of a linked list for a given key
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // check if key present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        // insert the value in to the position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        // if the load factor (number of hasnnodes) goes beyond the threshold
        // double the hashtble aka the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }


    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }

    public boolean contains(K key) {
        return this.get(key) != null;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                ", numBuckets=" + numBuckets +
                ", size=" + size +
                '}';
    }
}
