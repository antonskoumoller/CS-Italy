public class StackGrowingArray extends StackFixedArray {


    @Override
    public void push(Object obj) {
        if (size() >= v.length) {
            Object[] newV = new Object[v.length*2];
            System.arraycopy(v, 0, newV, 0, size());
            v = newV;
        }
        super.push(obj);
    }

}