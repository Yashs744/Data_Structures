#include "LinkedList.h"

Node::Node(){}

Node::Node(int value_toStore)
{
    data = value_toStore;
    next = NULL;
}

LinkedList::LinkedList()
{
    head = NULL;
}

void LinkedList::push(int value_toPush)
{
    Node * newNode = new Node(value_toPush);

    if (head == NULL)
    {
        head = newNode;
        return;
    }

    newNode->next = head;
    head = newNode;
}

void LinkedList::append(int value_toAppend)
{
    Node * newNode = new Node(value_toAppend);

    if (head == NULL)
    {
        head = newNode;
        return;
    }

    Node * last = head;

    while (last->next != NULL)
        last = last->next;

    last->next = newNode;
}

void LinkedList::printList()
{
    Node * temp = head;

    if (head == NULL)
    {
        cout << endl << "Empty List" << endl;
        return;
    }

    cout << endl << "List: ";
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
