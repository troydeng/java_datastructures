public class Array {

    private int[] data;
    private int size;

    /**
     *
     * @param capacity
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;

    }


    public Array(){
        this(capacity:10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(int e){
//        if(size == data.length)
//            throw new IllegalArgumentException("addLast failed, array is full");
//        data[size++] = e;
        add(size, e);
    }

    public void addFirst(int e){
        add(0, e);
    }

    public void add(int index, int e){
        if(size == data.length)
            throw new IllegalArgumentException("add failed, array is full");

        if(index < 0 || index > size)
            throw new IllegalArgumentException("add failed, illegal index");

        int pos = size;
        while(pos > index){
            data[pos] = data[pos-1];
            pos--;
        }
        data[pos] = e;
        size++;
    }
}
