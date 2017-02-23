package LeetCode;

import java.util.*;

/*
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

	get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
	put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
	
	Follow up:
	Could you do both operations in O(1) time complexity?
	
	Example:
	
	LRUCache cache = new LRUCache( 2 //capacity / );
	
	cache.put(1, 1);
	cache.put(2, 2);
	cache.get(1);       // returns 1
	cache.put(3, 3);    // evicts key 2
	cache.get(2);       // returns -1 (not found)
	cache.put(4, 4);    // evicts key 1
	cache.get(1);       // returns -1 (not found)
	cache.get(3);       // returns 3
	cache.get(4);       // returns 4
 */

public class LRUCache {

	public static void main(String[] args){
		
		Cache c=new Cache(10);
		
		c.put(10, 13);
		c.put(3, 17);
		c.put(6, 11);
		c.put(10, 5);
		c.put(9, 10);
		System.out.println(c.get(13));
		c.put(2, 19);
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		c.put(5, 25);
		System.out.println(c.get(8));
		c.put(9, 22);
		c.put(5, 5);
		c.put(1, 30);
		System.out.println(c.get(11));
		c.put(9, 12);
		System.out.println(c.get(7));
		System.out.println(c.get(5));
		System.out.println(c.get(8));
		System.out.println(c.get(9));
		c.put(4, 30);
		c.put(9, 3);
		System.out.println(c.get(9));
		System.out.println(c.get(10));
		System.out.println(c.get(10));
		c.put(6, 14);
		c.put(3, 1);
		System.out.println(c.get(3));
		c.put(10,11);
		System.out.println(c.get(8));
		c.put(2,14);
		System.out.println(c.get(1));
		System.out.println(c.get(5));
		System.out.println(c.get(4));
		c.put(11,4);
		c.put(12,24);
		c.put(5,18);
		System.out.println(c.get(13));
		c.put(7,23);
		System.out.println(c.get(8));
	}
}


class Cache {
    
    HashMap<Integer,CNode> hm=new HashMap<Integer,CNode>();
    CNode head=null;
    CNode end=null;
    int capacity=0;
    int currLength=0;
    public Cache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(!hm.containsKey(key))
            return -1;
        
        CNode n=hm.get(key);
        remove(n);
        add2Front(n);
        return n.val;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
        	CNode n=hm.get(key);
        	n.val=value;
            remove(n);
            add2Front(n);
        }
        else{
            
            if(currLength==capacity){
                remove(end);
            }
            CNode n=new CNode(key,value);
            add2Front(n);
            hm.put(key,n);
        }
    }
    
    void remove(CNode n){
        if(n==null)
            return;
        
        if(n.prev!=null){
            n.prev.next=n.next;
        }
        else{
            head=n.next;
        }
        
        if(n.next!=null){
            n.next.prev=n.prev;
        }
        else{
            end=n.prev;
        }
        hm.remove(n.key);
        currLength--;
    }
    
    void add2Front(CNode n){
        
        if(n==null)
            return;
        
        if(head==null){
            head=n;
            end=n;
        }
        else{
            n.next=head;
            head.prev=n;
            head=n;
        }
        hm.put(n.key, n);
        currLength++;
    }
    
}

class CNode{
    int val;
    int key;
    CNode next=null;
    CNode prev=null;
    CNode(int k,int v){
        this.val=v;
        this.key=k;
    }
}