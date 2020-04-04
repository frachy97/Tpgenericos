import java.util.ArrayList;
import java.util.List;

public class Generic <T extends Comparable>{
    private List<T> array;

    public Generic() {
        this.array = new ArrayList<T>();
    }

    public List<T> getArray() {
        return array;
    }

    public void setArray(List<T> array) {
        this.array = array;
    }

    public boolean isObject(T object){
        return this.array.contains(object);
    }

    public void add(T o)
    {
        array.add(o);
    }

    public T max(){
        T max= this.array.get(0);
        for (T obj: this.array)
        {
            if(max.compareTo(obj)>0){
                max=obj;
            }
        }
        return max;
    }

    public T min(){
        T min= this.array.get(0);
        for (T obj: this.array)
        {
            if(min.compareTo(obj)<0){
                min=obj;
            }
        }
        return min;
    }

    public T deleteLastElement(){
        int size= this.array.size();
        T last= this.array.get(size-1);
        this.array.remove(size-1);
        return last;
    }
}
