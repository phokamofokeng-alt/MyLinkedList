public class MyLinkedList <T>
{
    // Node references pointing to first and last element in linked list
    private Node <T> head, tail;

    public MyLinkedList()
    {
        // Initialize values of elements to which nodes point
        // List starts out empty
        head = null;
        tail = null;

    }

    // Add elements to end of linked list
    public void append (T element)
    {
        // Create Node to hold new element
        Node <T> newNode = new Node<>(element);

        // if no elements in list
        if(head == null)
        {
            // newNode returns address of the Node that was created
            head = tail = newNode;

        }
        else
        {
            // tail.next points to the address of next obj
            // now we're saying at that address, we save a new Node.
            tail.next = newNode;

            // tail points to last element of list. 
            // So that also changes to the last obj in list, which is the new Node
            tail = newNode;

        }

    }

    

}

