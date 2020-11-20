/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class orders {

    int price = 0;
    int given_exp=0;
    int[] order_list = new int[10];
    
    Random rand = new Random();
    String order_report="";

    int difficult;

    public orders() {
        difficult = 6*Gui_game.Player_1.getLevel();

        for (int i = 0; i <= 9; i++) {
            order_list[i] = rand.nextInt(difficult);
            price += Gui_game.Player_1.Storage.Product[i].getPrice()*order_list[i];
            given_exp+=Gui_game.Player_1.Storage.Product[i].getExperience_given()*order_list[i];
            difficult -= order_list[i];
           

        }
        if (difficult!=0){
        int s=rand.nextInt(9);
        order_list[s] += difficult;
         price += Gui_game.Player_1.Storage.Product[s].getPrice()*order_list[s];
            given_exp+=Gui_game.Player_1.Storage.Product[s].getExperience_given()*order_list[s];

      
        }
    }

    public boolean oders_valid() {
        for (int i = 0; i <= 9; i++) {
            if (order_list[i] > Gui_game.Player_1.Storage.Product[i].getCount()) {
return false;
            }
        }
               for (int n = 0; n <= 9; n++) {
         
            Gui_game.Player_1.Storage.Product[n].use( order_list[n]);
        }
    Gui_game.Player_1.add_Money(price);
 Gui_game.Player_1.inc_experience(given_exp);
return true;

    }
        


}
