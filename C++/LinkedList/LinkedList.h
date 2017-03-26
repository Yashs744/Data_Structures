#ifndef LinkedList_h
#define LinkedList_h

#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node * next;

    Node();
    Node (int value_toStore);
};

class LinkedList
{
    Node * head;

public:
    LinkedList();
    void push(int value_toPush);
    void append(int value_toAppend);
    void printList();
};

#endif
