package VisitorMode;

import CompositeMode.Directory;
import CompositeMode.File;

/**
 * Created by leon on 2017/7/25.
 */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
