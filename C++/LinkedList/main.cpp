#include "LinkedList.h"
using namespace std;

int main()
{
    LinkedList lList;

    lList.push(1);
    lList.push(2);
    lList.append(3);
    lList.append(4);

    lList.printList();
}
