package com.xenon.practice.java.code.generics.customcollection;

import java.util.*;
import java.util.function.UnaryOperator;

class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

     T getData() {
        return data;
    }

     void setData(T data) {
        this.data = data;
    }

     Node<T> getNext() {
        return next;
    }

     void setNext(Node<T> next) {
        this.next = next;
    }

     Node<T> getPrev() {
        return prev;
    }

     void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}

public class CustomList<T> implements List<T> {
    private Node<T> start;
    private Node<T> prev;
    private Node<T> next;
    private Node<T> tem;
    private Node<T> myNode;

    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int size() {
        int size = 0;
        for (tem = start; tem != null; tem = tem.getNext()) {
            size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return start == null;
    }

    @Override
    public boolean contains(Object obj) {
        boolean isFound = false;

        if (start != null) {
            for (tem = start; tem != null; tem = tem.getNext()) {
                if (tem.getData().equals(obj)) {
                    isFound = true;
                    break;
                }
            }
        }
        return isFound;
    }

    @Override
    public boolean add(T data) {
        myNode = new Node<>();
        myNode.setNext(null);
        myNode.setPrev(null);
        myNode.setData(data);

        if (start == null) {
            start = myNode;
        } else {
            tem = start;
            while (tem.getNext() != null) {
                tem = tem.getNext();
            }

            tem.setNext(myNode);
            myNode.setPrev(tem);
        }
        return true;
    }

    @Override
    public boolean remove(Object obj) {
        if (contains(obj)) {
            int index = indexOf(obj);
            if (index == 0) {
                start = start.getNext();
                if (start != null)
                    start.setPrev(null);
            } else {
                tem = start;
                for (int i = 0; i < index; i++) {
                    prev = tem;
                    tem = tem.getNext();
                }
                prev.setNext(tem.getNext());
                if (prev.getNext() != null) {
                    prev.getNext().setPrev(prev);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        start = null;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size()) {
            tem = start;
            for (int i = 0; i <= index; i++) {
                prev = tem;
                tem = tem.getNext();
            }
            return prev.getData();
        }
        return null;
    }

    @Override
    public T set(int index, T element) {
        add(index, element);
        return element;
    }

    @Override
    public void add(int index, T element) {
        myNode = new Node<>();
        myNode.setPrev(null);
        myNode.setNext(null);
        myNode.setData(element);

        int size = size();
        if (index <= 0) {
            myNode.setNext(start);
            start.setPrev(myNode);
            start = myNode;
        } else if (index >= size) {
            add(element);
        } else {
            int i = 0;
            tem = start;
            while (i < index) {
                prev = tem;
                tem = tem.getNext();
                i++;
            }
            myNode.setPrev(prev);
            myNode.setNext(tem);
            prev.setNext(myNode);
            tem.setPrev(myNode);
        }
    }

    @Override
    public T remove(int index) {
        T obj = get(index);
        remove(obj);
        return obj;
    }

    @Override
    public int indexOf(Object obj) {
        int index = -1;
        if (contains(obj)) {
            tem = start;
            while (tem != null) {
                index++;
                if (tem.getData().equals(obj)) {
                    break;
                }
                tem = tem.getNext();
            }
        }

        return index;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[ ");
        for (tem = start; tem != null; tem = tem.getNext()) {
            builder.append(tem + " ");
        }
        builder.append("]");
        return builder.toString();
    }
}
