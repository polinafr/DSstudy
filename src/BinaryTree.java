public class BinaryTree {
    class Element
    {
        int value;
        Element left, right;// Содержат value, left, right
        // Element left = 5 (int)
        //
        public Element(int _value)
        {
            value = _value;
            left = right = null;
        }

    }
    private Element root;
    // add
    //search
    public boolean search(int val)// non-recursive
    {
        return search(val, root);
    }
    private boolean search(int val, Element el)// recursive
    {
        //final
        if (el.value == val)
            return true;
        //else
        if (el.left!=null&& el.right!=null)
            return search(val, el.left)||search(val, el.right);
        if (el.left!=null)
            return search(val, el.left);
        if (el.right!=null)
            return search(val, el.right);
        //if (el.left==null&& el.right==null)
        return false;
    }
}
