package DecoratorMode;

/**
 * Created by leon on 2017/7/24.
 */
public abstract class Border extends Display{
    protected Display display;
    protected Border(Display display){
        this.display = display;
    }
}
