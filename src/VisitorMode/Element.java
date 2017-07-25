package VisitorMode;

/**
 * Created by leon on 2017/7/25.
 */
public interface Element {
    public abstract void accept(Visitor v);
}
