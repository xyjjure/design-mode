package MementoMode;

import MementoMode.Game.Gamer;
import MementoMode.Game.Memento;

/**
 * Created by leon on 2017/7/31.
 */
public class Main {
    public static void main(String[] args){
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for(int i=0;i<100;i++){
            System.out.println("====" + i);
            System.out.println("current state:" + gamer);
            gamer.bet();
            System.out.println("Money :" + gamer.getMoney());

            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("money increased,keep state.");
                memento = gamer.createMemento();
            }else if(gamer.getMoney() <memento.getMoney()/2){
                System.out.println("money decreased,restore previous state.");
                gamer.restoreMemento(memento);
            }

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println();
            }
        }
    }
}
