package com.bridgelabz.HashTables;

public class HashTableImplementation<K, V> {
    Node<K, V> head;
    Node<K, V> tail;

    public void add(K key, V value) {
        Node<K, V> myNode = searchNode(key);
        if (myNode == null) {
            myNode = new Node<K, V>(key, value);
            this.append(myNode);
        } else {
            myNode.setValue(value);
        }
    }

    // Append the value in the linked list
    public void append(Node<K, V> myNode) {
        if (this.head == null)
            this.head = myNode;
        if (this.tail == null)
            this.tail = myNode;
        else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    // Searching for the word in the linked list
    public Node<K, V> searchNode(K data) {
        Node<K, V> currentNode = head;
        int position = 0;
        while (currentNode != null) {
            position++;
            if (currentNode.getKey().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    // Searching for the word and get the value from the linked list
    public V get(K word) {
        Node<K, V> myMapNode = searchNode(word);
        if (myMapNode == null) {
            return null;
        } else {
            return myMapNode.getValue();
        }

    }

    // Print the linked list
    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "} ";
    }

    public Node<K, V> getTail() {
        return tail;
    }

    public void setTail(Node<K, V> tail) {
        this.tail = tail;
    }
}