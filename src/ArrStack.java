public class ArrStack {
    int array [];
    int topIndex;
    ArrStack()
    {
        array = new int[30];
        topIndex = 0;
    }

    void push (int value)
    {
        array[topIndex] = value;
        topIndex++;
    }

    int pop ()
    {
        topIndex--;
        return array[topIndex];
    }
}
