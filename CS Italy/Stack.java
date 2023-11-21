//  Just started
//  Do everything
//

public class StackFixedArray<E> implements Container {
    private final int INIT_CAP = 100;

    protected Object[] v;
    protected int vSize;

    public StackFixedArray() {
        v = new Object[INIT_CAP];
        vSize = 0;
    }



}