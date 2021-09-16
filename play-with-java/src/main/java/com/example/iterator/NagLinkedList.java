package com.example.iterator;


import java.util.Iterator;

public class NagLinkedList<E> implements Iterable<E>{

    private Node head;

    public void add(E e){
        Node newNode=new Node(e);
        if(head==null){
            head=newNode;
        }else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(newNode);
        }
    }

    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            Node tmp=head;
            @Override
            public boolean hasNext() {
                if(tmp!=null) return true;
                else return false;
            }

            @Override
            public E next() {
                E e=tmp.getData();
                tmp=tmp.getNext();
                return e;
            }
        };
    }

    private class Node{
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
