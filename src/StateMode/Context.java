package StateMode;

/**
 * Created by leon on 2017/8/3.
 */
public interface Context {
    void setClock(int hour);
    void changeState(State state);
    void callSecurityCenter(String msg);
    void recordLog(String msg);
}
