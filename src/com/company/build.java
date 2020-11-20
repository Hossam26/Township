package com.company;

import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;

public class build {

//    private int Experience_Level;
  String name;
    private int Time_To_Build;
    int price;
    int price_by_cash;

    public build(String n, int p, int p_cash, int Time_To_Build) {
        this.name = n;
        this.price = p;
        this.price_by_cash = p_cash;
        this.Time_To_Build = Time_To_Build;
    }

    public int getTime_To_Build() {
        return Time_To_Build;
    }

}

class houses extends build {

    public int getPrice() {
        return price;
    }

    public int getprice_by_cash() {
        return price_by_cash;
    }

    public houses(String n, int p, int p_cash, int Time_To_Build) {
        super(n, p, p_cash, Time_To_Build);
    }

}

class house extends houses {

    public house() {
        super("normal house", 300, 10, 5);
    }

}

class cottage extends houses {

    public cottage() {
        super("cottage", 490, 20, 10);
    }

}

class community_build extends build {

    public community_build(String n, int p, int p_cash, int Time_To_Build) {
        super(n, p, p_cash, Time_To_Build);
    }

}

class farming extends build {

    public farming(String n, int p, int p_cash, int Time_To_Build) {
        super(n, p, p_cash, Time_To_Build);
    }

}


class Tower extends community_build {

    public Tower() {
        super("tower", 170, 5, 10);
    }

}

class mall extends community_build {

    public mall() {
        super("mall", 100, 4, 20);
    }
}

class football_club extends community_build {

    public football_club() {
        super("football_club", 500, 15, 15);
    }
}

class club extends community_build {

    public club() {
        super("club", 260, 12, 25);
    }
}

class school extends community_build {

    public school() {
        super("school", 330, 10, 30);
    }
}

class soil_house extends build {

    public soil_house() {
        super("soil_house", 0, 0, 0);
    }
}

class order_building extends build {

    public order_building() {
        super("order building", 90, 5, 0);
    }
}

abstract class Factory extends build {

    Date start_produce;
    Date end_produce;
    int current = 0;
    private double time_to_product;

    public Factory(String n, int p, int p_cash, int Time_To_Build) {
        super(n, p, p_cash, Time_To_Build);

    }

    public abstract boolean produce(int i);

    abstract public boolean produce_finished();

    public boolean available() {
        if (current == 0) {
            return true;
        } else {
            return false;
        }

    }

}

class chicken_coop extends Factory {
    private int wheat_needed = 1;
    private int egg_produced = 1;
    public chicken_coop() {
        super("Chicken Coop", 190, 18, 30);
    }
    public boolean produce(int i) {
        if (Gui_game.Player_1.Storage.Product[1].getCount() >= wheat_needed) {
            Gui_game.Player_1.Storage.Product[1].use(wheat_needed);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            current = 1;

            return true;
        } else {
            return false;
        }
    }

    public boolean produce_finished() {
        Date current_Date = new Date();
        if (current != 0 && end_produce.before(current_Date)) {

            Gui_game.Player_1.Storage.Product[6].increase(egg_produced);

            current = 0;
            return true;
        }

        return false;
    }

}
class bakery extends Factory {

    private int flour_needed = 2;
    private int Bread_produced = 1;

    public bakery() {
        super("bakery", 200, 10, 25);

    }

    public boolean produce(int i) {
        if (Gui_game.Player_1.Storage.Product[1].getCount() >= flour_needed) {
            Gui_game.Player_1.Storage.Product[1].use(flour_needed);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            current = 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean produce_finished() {
        Date current_Date = new Date();
        if (current != 0 && end_produce.before(current_Date)) {

            Gui_game.Player_1.Storage.Product[3].increase(Bread_produced);

            current = 0;
            return true;
        }

        return false;
    }

}

class suger_shop extends Factory {

    private int sugercane_needed_fo_white = 1;
    private int sugercane_needed_fo_brown = 2;

    private int suger_produced = 1;
    private int brown_suger_produced= 1;

    public suger_shop() {
        super("suger_shop", 250, 10, 20);

    }

    public boolean produce(int i) {
        current = i;
        if (Gui_game.Player_1.Storage.Product[5].getCount() >= sugercane_needed_fo_white && current == 1) {
            Gui_game.Player_1.Storage.Product[5].use(sugercane_needed_fo_white);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            return true;
        } else if (Gui_game.Player_1.Storage.Product[5].getCount() >= sugercane_needed_fo_brown && current == 2) {
            Gui_game.Player_1.Storage.Product[5].use(sugercane_needed_fo_brown);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            return true;
        } else {
            return false;
        }
    }

    public boolean produce_finished() {
        Date current_Date = new Date();
        if (current != 0 && end_produce.before(current_Date)) {
            if (current == 1) {
                Gui_game.Player_1.Storage.Product[4].increase(suger_produced);
            } else if (current == 2) {
                Gui_game.Player_1.Storage.Product[8].increase(brown_suger_produced);
            }

            current = 0;
            return true;
        }

        return false;
    }

}

class sweet_shop extends Factory {
    private int flour_needed = 2;
    private int suger_needed = 1;
     private int brown_suger_needed_fo_cookies = 1;


    private int cookies_produced = 1;
    private int flour_cookies_produced = 1;

    public sweet_shop() {
        super(" sweet_shop", 350, 18, 10);

    }

    public boolean produce(int i) {
            current = i;
        if (Gui_game.Player_1.Storage.Product[1].getCount() >= flour_needed &&Gui_game.Player_1.Storage.Product[4].getCount() >= suger_needed&& current == 1) {
            Gui_game.Player_1.Storage.Product[1].use(flour_needed);
              Gui_game.Player_1.Storage.Product[4].use(suger_needed);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            return true;
        } else if (Gui_game.Player_1.Storage.Product[1].getCount() >= flour_needed &&Gui_game.Player_1.Storage.Product[8].getCount() >= brown_suger_needed_fo_cookies && current == 2) {
            Gui_game.Player_1.Storage.Product[1].use(flour_needed);
            Gui_game.Player_1.Storage.Product[1].use(brown_suger_needed_fo_cookies);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            return true;
        } else {
            return false;
        }
    }
    public boolean produce_finished() {
        Date current_Date = new Date();
        if (current != 0 && end_produce.before(current_Date)) {
            if (current == 1) {
                Gui_game.Player_1.Storage.Product[7].increase(cookies_produced);
            } else if (current == 2) {
                Gui_game.Player_1.Storage.Product[9].increase(flour_cookies_produced);
            }

            current = 0;
            return true;
        }

        return false;
    }

}

class clothes_Factory extends Factory {

    public int cotton_needed = 2;
    public int t_shirt_produced = 1;

    public clothes_Factory() {
        super("clothes_Factory", 150, 8, 35);

    }

    @Override
    public boolean produce(int i) {
        if (Gui_game.Player_1.Storage.Product[2].getCount() >= cotton_needed) {
            Gui_game.Player_1.Storage.Product[2].use(cotton_needed);
            start_produce = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_produce);
            d_date.add(Calendar.SECOND, 10);
            end_produce = d_date.getTime();
            current = 1;

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean produce_finished() {
        Date current_Date = new Date();
        if (current != 0 && end_produce.before(current_Date)) {

            Gui_game.Player_1.Storage.Product[0].increase(t_shirt_produced);

            current = 0;
            return true;
        }

        return false;
    }

}

//class dairy_Factory extends Factory {
//
//    private int milk_needed;
//
//    public dairy_Factory() {
//        super("dairy Factory", 400, 20, 2);
//
//    }
//
//    @Override
//    public boolean produce(int i) {
//        if (Gui_game.Player_1.Storage.Product[0].getCount() >= 0) {
//
//            ///
//            start_produce = new Date();
//            Calendar d_date = Calendar.getInstance();
//            d_date.setTime(start_produce);
//            d_date.add(Calendar.SECOND, 10);
//            end_produce = d_date.getTime();
//            current = 1;
//
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public boolean produce_finished() {
//        Date current_Date = new Date();
//        if (current != 0 && end_produce.before(current_Date)) {
//
//            //        Gui_game.Player_1.Storage.Product[4].increase(suger_produced);
//            current = 0;
//            return true;
//        }
//
//        return false;
//    }
//
//}
