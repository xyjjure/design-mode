package CompositeMode;

import VisitorMode.Element;

import java.util.Iterator;

/**
 * Created by leon on 2017/7/24.
 */
public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
