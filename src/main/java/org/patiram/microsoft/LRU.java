package org.patiram.microsoft;

import java.util.HashMap;
import java.util.Map;

public class LRU {

    final Node head = new Node() ;
    final Node tail = new Node() ;
    Map<Integer , Node > map ;
    int cacheCapacity ;

    public LRU(int capacity) {
        map  = new HashMap(capacity) ;
        this.cacheCapacity = capacity ;
        head.next = tail  ;
        tail.prev = head ;
    }

    public int get(int key) {
        int result = -1 ;
        Node node = map.get(key ) ;
        if( node != null )
        {
            remove( node ) ;
            add(node ) ;
            result = node.val ;
        }

        return result ;
    }

    public void set(int key, int value) {
        Node node = map.get(key) ;
        if( node != null )
        {
            remove(node) ;
            node.val = value ;
            add(node) ;
        }
        else
        {
            if( map.size() == cacheCapacity )
            {
                map.remove(tail.prev.key ) ;
                remove( tail.prev ) ;
            }
            Node new_node = new Node() ;
            new_node.key = key ;
            new_node.val = value ;
            map.put( key , new_node ) ;
            add( new_node ) ;
        }
    }
    public void add( Node node  ){
        Node head_next = head.next ;
        node.next = head_next ;
        head_next.prev = node ;
        head.next = node ;
        node.prev = head ;
    }

    public void remove( Node node ){
        Node next = node.next ;
        Node prev = node.prev ;
        next.prev = prev ;
        prev.next = next ;
    }

    class Node{
        int key ;
        int val ;
        Node prev ;
        Node next ;
    }
}
