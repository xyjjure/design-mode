package MementoMode.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by leon on 2017/7/31.
 */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsName = {
            "苹果","葡萄","香蕉","橘子"
    };

    public Gamer(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("money added;");
        }else if(dice == 2){
            money /= 2;
            System.out.println("money decreased half;");
        }else if(dice == 6){
            String fruit = getFruit();
            System.out.println("gain a fruit (" + fruit + ").");
            fruits.add(fruit);
        }else{
            System.out.println("nothiing happened");
        }
    }

    public Memento createMemento(){
        Memento memento = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()){
            String fruit = (String)it.next();
            if(fruit.startsWith("good taste")){
                memento.addFruit(fruit);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.money;
        this.fruits = memento.fruits;
    }

    public String toString(){
        return "[money = " + money + ",fruits = " + fruits + "]";
    }

    private String getFruit(){
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "good taste";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }
}
