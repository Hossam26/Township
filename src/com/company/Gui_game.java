/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import static com.company.town.Builds;
import com.sun.media.jfxmedia.Media;
import java.awt.Color;
import java.awt.*;
import java.awt.Toolkit;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.audio.*;
import java.util.*;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author Admin
 */
public class Gui_game extends javax.swing.JFrame {

    /**
     * Creates new form Gui_game
     */
    Timer timer;
    int min = 59;
    Timer x;
    Timer h;
    int g;
   int p_1,p_2,p_3,p_4,p_5,p_6;
   
    int l_8;
    int y = 1;

    @Override
    public void setVisible(boolean bln) {
        super.setVisible(bln); //To change body of generated methods, choose Tools | Templates.
    }

    public Gui_game() {
        this.setAlwaysOnTop(true);
        Player_1 = new player("", 1, 0, 0, 500, 20);
        this.setResizable(false);
        initComponents();

        name_field.setBackground(new java.awt.Color(0, 0, 0, 1));
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
        Player_1.Town.Builds[6] = new soil_house();
        Player_1.Town.Builds[7] = new order_building();
        Green_background.setSize(xsize, ysize);
        face(false);
        order_frame.setVisible(false);
        orders.setVisible(false);
        this.validate();

        this.repaint();
        option(false);
        bars(false);
        setLabel_1(1);
        setLabel_2(1);
        barn.setVisible(false);
        d_1.setVisible(false);
        d_2.setVisible(false);
        d_3.setVisible(false);
        d_4.setVisible(false);
        d_5.setVisible(false);
        d_6.setVisible(false);
        d_7.setVisible(false);
        d_8.setVisible(false);
        d_9.setVisible(false);
        d_10.setVisible(false);
        d_11.setVisible(false);
        d_12.setVisible(false);
        level_up.setVisible(false);
        up_level.setVisible(false);
        cash_rew.setVisible(false);
        coin_rew.setVisible(false);
        storage_build.setVisible(false);
        head_Build.setVisible(false);
        mall_build.setVisible(false);
        chicken_coop.setVisible(false);
        club_build.setVisible(false);
        football_build.setVisible(false);
        cottage_build.setVisible(false);
        detail(false);
        school_build.setVisible(false);

        soil_house.setVisible(false);
        suger_sh_build.setVisible(false);
        house_site.setVisible(false);
        tower_site.setVisible(false);
        cloth_build_1.setVisible(false);
        Build.setVisible(false);
        bakery_build1.setVisible(false);
        sweet_build.setVisible(false);
        back.setVisible(false);
        forward.setVisible(false);
        back_ground.setVisible(false);
        options.setVisible(false);
        close();
        update_bar();
        ////////////////////////////
        build_1.setVisible(false);
        build_2.setVisible(false);
        build_3.setVisible(false);
        build_4.setVisible(false);
        build_5.setVisible(false);
        build_6.setVisible(false);
        build_7.setVisible(false);
        build_8.setVisible(false);
        build_9.setVisible(false);
        build_10.setVisible(false);
        build_11.setVisible(false);
        build_12.setVisible(false);

        cloth_build_1.setEnabled(false);
        bakery_build1.setEnabled(false);
        sweet_build.setEnabled(false);
        tower_site.setEnabled(false);
        house_site.setEnabled(false);
        suger_sh_build.setEnabled(false);
        chicken_coop.setEnabled(false);
        school_build.setEnabled(false);
        football_build.setEnabled(false);
        club_build.setEnabled(false);
        mall_build.setEnabled(false);
        cottage_build.setEnabled(false);

//////////////////////////////////////
        customer_list[0] = new orders();
        customer_list[1] = new orders();
        customer_list[2] = new orders();
        customer_list[3] = new orders();
        customer_list[4] = new orders();

    }

    public void bars(boolean e) {
        bar.setVisible(e);
        logo.setVisible(e);
        Town_name.setVisible(e);
        money_amount1.setVisible(e);
        c_bar1.setVisible(e);
        coin_bar.setVisible(e);
        cash_amount.setVisible(e);

        mbar.setVisible(e);
        level.setVisible(e);
        star.setVisible(e);
        Ex_bar.setVisible(e);

    }

    public void face(boolean e) {
        order_1_lab.setVisible(e);
        order_2_lab.setVisible(e);
        order_3_lab.setVisible(e);
        order_4_lab.setVisible(e);
        order_5_lab.setVisible(e);

    }

    public void setLabel_1(int i) {

        if (i == 1) {
            j1.setText("" + new bakery().price);
            j2.setText("" + new Tower().price);
            j3.setText("" + new clothes_Factory().price);
            j4.setText("" + new sweet_shop().price);
            j5.setText("" + new house().price);
            j6.setText("" + new suger_shop().price);

        } else if (i == 2) {
            j1.setText("" + new bakery().price_by_cash);
            j2.setText("" + new Tower().price_by_cash);
            j3.setText("" + new clothes_Factory().price_by_cash);
            j4.setText("" + new sweet_shop().price_by_cash);
            j5.setText("" + new house().price_by_cash);
            j6.setText("" + new suger_shop().price_by_cash);
        }
    }

    public void setLabel_2(int i) {
        if (i == 1) {
            j7.setText("" + new cottage().price);
            j8.setText("" + new school().price);
            j9.setText("" + new mall().price);
            j10.setText("" + new football_club().price);
            j11.setText("" + new chicken_coop().price);
            j12.setText("" + new club().price);
        } else if (i == 2) {
            j7.setText("" + new cottage().price_by_cash);
            j8.setText("" + new school().price_by_cash);
            j9.setText("" + new mall().price_by_cash);
            j10.setText("" + new football_club().price_by_cash);
            j11.setText("" + new chicken_coop().price_by_cash);
            j12.setText("" + new club().price_by_cash);
        }
    }

    public void store_elements_1(boolean e) {
        build_tower.setVisible(e);
        tower_lab.setVisible(e);
        build_cloth.setVisible(e);
        build_sweet.setVisible(e);
        sweet_lab.setVisible(e);
        cloth_lab.setVisible(e);
        build_bakery.setVisible(e);
        bakery_lab.setVisible(e);
        build_suger_sh.setVisible(e);
        suger_sh_lab.setVisible(e);
        build_house.setVisible(e);
        house_lab.setVisible(e);
        j1.setVisible(e);
        j2.setVisible(e);
        j3.setVisible(e);
        j4.setVisible(e);
        j5.setVisible(e);
        j6.setVisible(e);

    }

    public void soil_elements(boolean e) {
        container.setVisible(e);
        soil_wheat.setVisible(e);
        soil_cotton.setVisible(e);
        soil_sugercane.setVisible(e);
    }

    public void orderIschosen() {
        orders.setVisible(false);
        accept_or.setVisible(true);
        order_1.setVisible(false);
        order_2.setVisible(false);
        order_3.setVisible(false);
        order_4.setVisible(false);
        order_5.setVisible(false);
        order_frame.setVisible(true);
        face(false);
       
    }

    public void show_items(int i) {
        int m_1 = 0;
        int m_2 = 0;
        int m_3 = 0;
        int m_4 = 0;
        int m_5 = 0;
        int m_6 = 0;
        int m_7 = 0;
        int m_8 = 0;
        int m_9 = 0;
        for (int j = 0; j <= 9; j++) {
            if (customer_list[i].order_list[j] != 0 && m_1 != 1) {
                Icon icon1 = new ImageIcon("src/com/company/assets/" + j + ".png");
                m_1 = 1;
                o_1.setIcon(icon1);
                j_1.setText("" + customer_list[i].order_list[j]);
                o_1.setVisible(true);
                j_1.setVisible(true);
                continue;
            }
            if (customer_list[i].order_list[j] != 0 && m_2 != 1) {
                Icon icon2 = new ImageIcon("src/com/company/assets/" + j + ".png");
                m_2 = 1;
                o_2.setIcon(icon2);
                j_2.setText("" + customer_list[i].order_list[j]);
                o_2.setVisible(true);
                j_2.setVisible(true);
                continue;
            }
            if (customer_list[i].order_list[j] != 0 && m_3 != 1) {
                Icon icon3 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_3.setIcon(icon3);
                j_3.setText("" + customer_list[i].order_list[j]);
                m_3 = 1;
                     o_3.setVisible(true);
                j_3.setVisible(true);
                continue;
            }
            if (customer_list[i].order_list[j] != 0 && m_4 != 1) {
                Icon icon4 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_4.setIcon(icon4);
                j_4.setText("" + customer_list[i].order_list[j]);
                m_4 = 1;
                     o_4.setVisible(true);
                j_4.setVisible(true);
                continue;

            }

            if (customer_list[i].order_list[j] != 0 && m_5 != 1) {
                Icon icon5 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_5.setIcon(icon5);
                j_5.setText("" + customer_list[i].order_list[j]);
                m_5 = 1;
                                o_5.setVisible(true);
                j_5.setVisible(true);
                continue;
            }

            if (customer_list[i].order_list[j] != 0 && m_6 != 1) {
                Icon icon6 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_6.setIcon(icon6);
                j_6.setText("" + customer_list[i].order_list[j]);
                m_6 = 1;
                                o_6.setVisible(true);
                j_6.setVisible(true);
                continue;
            }
            if (customer_list[i].order_list[j] != 0 && m_7 != 1) {
                Icon icon7 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_7.setIcon(icon7);
                j_7.setText("" + customer_list[i].order_list[j]);
                m_7 = 1;
                                o_7.setVisible(true);
                j_7.setVisible(true);
                continue;
            }
            if (customer_list[i].order_list[j] != 0 && m_8 != 1) {
                Icon icon4 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_8.setIcon(icon4);
                j_8.setText("" + customer_list[i].order_list[j]);
                m_8 = 1;
                                o_8.setVisible(true);
                j_8.setVisible(true);
                continue;

            }
            if (customer_list[i].order_list[j] != 0 && m_9 != 1) {
                Icon icon4 = new ImageIcon("src/com/company/assets/" + j + ".png");
                o_9.setIcon(icon4);
                j_9.setText("" + customer_list[i].order_list[j]);
                o_9.setVisible(true);
                j_9.setVisible(true);
                m_9 = 1;

            }

        }
        order_ex.setText("" + customer_list[i].given_exp);
        order_price.setText("" + customer_list[i].price);
    }

    public void store_elements_2(boolean e) {
        build_club.setVisible(e);
        build_chicken_coop.setVisible(e);
        build_school.setVisible(e);
        build_football_club.setVisible(e);
        build_cottage.setVisible(e);
        build_mall.setVisible(e);
        mall_lab.setVisible(e);
        club_lab.setVisible(e);
        cottage_lab.setVisible(e);
        school_label.setVisible(e);
        chicken_lab.setVisible(e);
        football_lab.setVisible(e);
        j7.setVisible(e);
        j8.setVisible(e);
        j9.setVisible(e);
        j10.setVisible(e);
        j11.setVisible(e);
        j12.setVisible(e);

    }

    public void setcolor(JButton p) {
        p.setBackground(new Color(250, 250, 210));

    }

    public void resetcolor(JButton p1) {
        p1.setBackground(new Color(240, 240, 240));

    }

    public static void music(String e) {

        InputStream in;
        Path sound = Paths.get(e + ".wav");
        String location = sound.toString();

        try {
            in = new FileInputStream(new File(location));

            AudioStream audios = new AudioStream(in);
            AudioPlayer.player.start(audios);
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f);
        }

    }

//     public static void music_back_ground(String e) {
//
//        InputStream in;
//        Path sound = Paths.get(e + ".wav");
//        String location = sound.toString();
//
//        try {
//            in = new FileInputStream(new File(location));   
//            AudioStream audios = new AudioStream(in);
//            AudioData D=audios.getData();
//            ContinuousAudioDataStream  loop= new ContinuousAudioDataStream(D);
//            AudioPlayer.player.start(loop);      
//        } catch (Exception f) {
//            JOptionPane.showMessageDialog(null, f);
//        }
//
//    }
    public void detail(boolean e) {
        o_1.setVisible(e);
        o_2.setVisible(e);
        o_3.setVisible(e);
        o_4.setVisible(e);
        o_5.setVisible(e);
        o_6.setVisible(e);
        o_7.setVisible(e);
        o_8.setVisible(e);
        o_9.setVisible(e);
        j_1.setVisible(e);
        j_2.setVisible(e);
        j_3.setVisible(e);
        j_4.setVisible(e);
        j_5.setVisible(e);
        j_6.setVisible(e);
        j_7.setVisible(e);
        j_8.setVisible(e);
        j_9.setVisible(e);

    }

    public void given(boolean e) {
        order_ex.setVisible(e);
        order_price.setVisible(e);
    }

    public void close() {
        pay_by_cash.setVisible(false);
        pay_by_coin.setVisible(false);
        accept_or.setVisible(false);
        cotton_icon.setVisible(false);
        coton_amount.setVisible(false);
        flour_icon.setVisible(false);
        flour_amount.setVisible(false);
        soil_elements(false);

        wheat_am.setVisible(false);
 level_up.setVisible(false);
            up_level.setVisible(false);
            cash_rew.setVisible(false);
            coin_rew.setVisible(false);
        small.setVisible(false);
        wheat_am.setVisible(false);
        produce_p1.setLocation(710, 920);
        produce_p1.setVisible(false);
        produce_p2.setVisible(false);
        back_button.setVisible(false);
        back_ground.setVisible(false);
        t_shirt_icon.setVisible(false);
        t_shirt_amount.setVisible(false);
        bread_icon.setVisible(false);
        bread_amount.setVisible(false);
        face(false);
        duration.setVisible(false);
        store_elements_2(false);
        orders.setVisible(false);
        detail(false);
        given(false);
        order_frame.setVisible(false);
        name_warning.setVisible(false);
        store_elements_1(false);
        name_warning_ok.setVisible(false);
        order_ex.setVisible(false);
        order_price.setVisible(false);
        order_1.setVisible(false);
        order_2.setVisible(false);
        order_3.setVisible(false);
        order_4.setVisible(false);
        order_5.setVisible(false);
        soil_cotton.setVisible(false);
        soil_wheat.setVisible(false);
        soil_sugercane.setVisible(false);
        wheat_am.setVisible(false);
        produce_p1.setVisible(false);
        produce_p2.setVisible(false);
        barn.setVisible(false);

    }

    public void option(boolean e) {
        option_manu.setVisible(e);
        yes.setVisible(e);
        no.setVisible(e);
        No_button.setEnabled(e);
        Yes_button.setEnabled(e);

    }

    public void show_items() {
        int m_1 = 0;
        int m_2 = 0;
        int m_3 = 0;
        int m_4 = 0;
        int m_5 = 0;
        int m_6 = 0;
        int m_7 = 0;
        int m_8 = 0;
        int m_9 = 0;
        for (int i = 0; i < 9; i++) {
            if (Player_1.Storage.Product[i].getCount() != 0 && m_1 != 1) {
                Icon icon1 = new ImageIcon("src/com/company/assets/" + i + ".png");
                m_1 = 1;
                o_1.setIcon(icon1);
                j_1.setText("" + Player_1.Storage.Product[i].getCount());
                o_1.setVisible(true);
                j_1.setVisible(true);
                continue;

            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_2 != 1) {
                Icon icon2 = new ImageIcon("src/com/company/assets/" + i + ".png");
                m_2 = 1;
                o_2.setIcon(icon2);
                j_2.setText("" + Player_1.Storage.Product[i].getCount());
                o_2.setVisible(true);
                j_2.setVisible(true);

                continue;
            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_3 != 1) {
                Icon icon3 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_3.setIcon(icon3);
                j_3.setText("" + Player_1.Storage.Product[i].getCount());
                m_3 = 1;
                o_3.setVisible(true);
                j_3.setVisible(true);
                continue;
            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_4 != 1) {
                Icon icon4 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_4.setIcon(icon4);
                j_4.setText("" + Player_1.Storage.Product[i].getCount());
                m_4 = 1;
                o_4.setVisible(true);
                j_4.setVisible(true);
                continue;

            }

            if (Player_1.Storage.Product[i].getCount() != 0 && m_5 != 1) {
                Icon icon5 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_5.setIcon(icon5);
                j_5.setText("" + Player_1.Storage.Product[i].getCount());
                m_5 = 1;
                o_5.setVisible(true);
                j_5.setVisible(true);
                continue;
            }

            if (Player_1.Storage.Product[i].getCount() != 0 && m_6 != 1) {
                Icon icon6 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_6.setIcon(icon6);
                j_6.setText("" + Player_1.Storage.Product[i].getCount());
                m_6 = 1;
                o_6.setVisible(true);
                j_6.setVisible(true);
                continue;
            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_7 != 1) {
                Icon icon7 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_7.setIcon(icon7);
                j_7.setText("" + Player_1.Storage.Product[i].getCount());
                m_7 = 1;
                o_7.setVisible(true);
                j_7.setVisible(true);
                continue;
            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_8 != 1) {
                Icon icon8 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_8.setIcon(icon8);
                j_8.setText("" + Player_1.Storage.Product[i].getCount());
                m_8 = 1;
                o_8.setVisible(true);
                j_8.setVisible(true);
                continue;

            }
            if (Player_1.Storage.Product[i].getCount() != 0 && m_9 != 1) {
                Icon icon9 = new ImageIcon("src/com/company/assets/" + i + ".png");
                o_9.setIcon(icon9);
                j_9.setText("" + Player_1.Storage.Product[i].getCount());
                m_9 = 1;
                o_9.setVisible(true);
                j_9.setVisible(true);
                continue;

            }

        }
    }

    public void open_storage() {
        back_button.setVisible(true);
        barn.setVisible(true);
        show_items();
    }

    public void BuildingIsChosen() {
        Build.setVisible(true);
        Build_lab.setVisible(true);
        back_ground.setVisible(false);
        back_button.setVisible(false);
        back.setVisible(false);
        forward.setVisible(false);
        store_elements_1(false);
        store_elements_2(false);
        pay_by_coin.setVisible(false);
        pay_by_cash.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pay_method = new javax.swing.ButtonGroup();
        logo = new javax.swing.JLabel();
        cash_rew = new javax.swing.JLabel();
        coin_rew = new javax.swing.JLabel();
        up_level = new javax.swing.JLabel();
        level_up = new javax.swing.JLabel();
        Build_lab = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        star = new javax.swing.JLabel();
        bar = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        accept_name = new javax.swing.JButton();
        Ask_name_back_ground = new javax.swing.JLabel();
        Town_name = new javax.swing.JLabel();
        option_manu = new javax.swing.JLabel();
        yes = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        No_button = new javax.swing.JButton();
        Yes_button = new javax.swing.JButton();
        soil_cotton = new javax.swing.JButton();
        soil_wheat = new javax.swing.JButton();
        soil_sugercane = new javax.swing.JButton();
        wheat_am = new javax.swing.JLabel();
        produce_p1 = new javax.swing.JButton();
        produce_p2 = new javax.swing.JButton();
        Build = new javax.swing.JButton();
        cloth_lab = new javax.swing.JLabel();
        mall_lab = new javax.swing.JLabel();
        house_lab = new javax.swing.JLabel();
        chicken_lab = new javax.swing.JLabel();
        suger_sh_lab = new javax.swing.JLabel();
        club_lab = new javax.swing.JLabel();
        tower_lab = new javax.swing.JLabel();
        school_label = new javax.swing.JLabel();
        bakery_lab = new javax.swing.JLabel();
        cottage_lab = new javax.swing.JLabel();
        sweet_lab = new javax.swing.JLabel();
        football_lab = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j6 = new javax.swing.JLabel();
        j7 = new javax.swing.JLabel();
        j8 = new javax.swing.JLabel();
        j9 = new javax.swing.JLabel();
        j10 = new javax.swing.JLabel();
        j11 = new javax.swing.JLabel();
        j12 = new javax.swing.JLabel();
        build_house = new javax.swing.JButton();
        build_chicken_coop = new javax.swing.JButton();
        build_bakery = new javax.swing.JButton();
        build_cottage = new javax.swing.JButton();
        build_cloth = new javax.swing.JButton();
        build_mall = new javax.swing.JButton();
        build_tower = new javax.swing.JButton();
        build_school = new javax.swing.JButton();
        build_suger_sh = new javax.swing.JButton();
        build_club = new javax.swing.JButton();
        build_sweet = new javax.swing.JButton();
        build_football_club = new javax.swing.JButton();
        t_shirt_icon = new javax.swing.JLabel();
        cash_amount = new javax.swing.JLabel();
        coin_bar = new javax.swing.JLabel();
        c_bar1 = new javax.swing.JLabel();
        money_amount1 = new javax.swing.JLabel();
        mbar = new javax.swing.JLabel();
        t_shirt_amount = new javax.swing.JLabel();
        flour_amount = new javax.swing.JLabel();
        bread_icon = new javax.swing.JLabel();
        flour_icon = new javax.swing.JLabel();
        bread_amount = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        back = new javax.swing.JButton();
        forward = new javax.swing.JButton();
        coton_amount = new javax.swing.JLabel();
        cotton_icon = new javax.swing.JLabel();
        order_1_lab = new javax.swing.JLabel();
        order_1 = new javax.swing.JButton();
        order_2_lab = new javax.swing.JLabel();
        order_2 = new javax.swing.JButton();
        order_3_lab = new javax.swing.JLabel();
        order_3 = new javax.swing.JButton();
        order_4_lab = new javax.swing.JLabel();
        order_4 = new javax.swing.JButton();
        order_5_lab = new javax.swing.JLabel();
        order_5 = new javax.swing.JButton();
        pay_by_coin = new javax.swing.JRadioButton();
        pay_by_cash = new javax.swing.JRadioButton();
        back_ground = new javax.swing.JLabel();
        o_1 = new javax.swing.JLabel();
        j_1 = new javax.swing.JLabel();
        o_2 = new javax.swing.JLabel();
        j_2 = new javax.swing.JLabel();
        o_3 = new javax.swing.JLabel();
        j_3 = new javax.swing.JLabel();
        o_4 = new javax.swing.JLabel();
        j_4 = new javax.swing.JLabel();
        o_5 = new javax.swing.JLabel();
        j_5 = new javax.swing.JLabel();
        o_6 = new javax.swing.JLabel();
        j_6 = new javax.swing.JLabel();
        o_7 = new javax.swing.JLabel();
        j_7 = new javax.swing.JLabel();
        o_8 = new javax.swing.JLabel();
        j_8 = new javax.swing.JLabel();
        o_9 = new javax.swing.JLabel();
        j_9 = new javax.swing.JLabel();
        order_price = new javax.swing.JLabel();
        order_ex = new javax.swing.JLabel();
        orders = new javax.swing.JLabel();
        accept_or = new javax.swing.JButton();
        order_frame = new javax.swing.JLabel();
        barn = new javax.swing.JLabel();
        small = new javax.swing.JLabel();
        container = new javax.swing.JLabel();
        build_1 = new javax.swing.JButton();
        build_2 = new javax.swing.JButton();
        build_3 = new javax.swing.JButton();
        build_4 = new javax.swing.JButton();
        build_5 = new javax.swing.JButton();
        build_6 = new javax.swing.JButton();
        build_7 = new javax.swing.JButton();
        build_8 = new javax.swing.JButton();
        build_9 = new javax.swing.JButton();
        build_10 = new javax.swing.JButton();
        build_11 = new javax.swing.JButton();
        build_12 = new javax.swing.JButton();
        soil_house = new javax.swing.JButton();
        d_1 = new javax.swing.JLabel();
        d_2 = new javax.swing.JLabel();
        d_3 = new javax.swing.JLabel();
        d_4 = new javax.swing.JLabel();
        d_5 = new javax.swing.JLabel();
        d_6 = new javax.swing.JLabel();
        d_7 = new javax.swing.JLabel();
        d_8 = new javax.swing.JLabel();
        d_9 = new javax.swing.JLabel();
        d_10 = new javax.swing.JLabel();
        d_11 = new javax.swing.JLabel();
        d_12 = new javax.swing.JLabel();
        chicken_coop = new javax.swing.JButton();
        school_build = new javax.swing.JLabel();
        football_build = new javax.swing.JLabel();
        tower_site = new javax.swing.JLabel();
        head_Build = new javax.swing.JButton();
        mall_build = new javax.swing.JLabel();
        cottage_build = new javax.swing.JLabel();
        sweet_build = new javax.swing.JButton();
        suger_sh_build = new javax.swing.JButton();
        storage_build = new javax.swing.JButton();
        cloth_build_1 = new javax.swing.JButton();
        house_site = new javax.swing.JLabel();
        club_build = new javax.swing.JLabel();
        bakery_build1 = new javax.swing.JButton();
        name_warning = new javax.swing.JLabel();
        name_warning_ok = new javax.swing.JButton();
        options = new javax.swing.JButton();
        Ex_bar = new javax.swing.JProgressBar();
        Green_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 102));
        setUndecorated(true);
        getContentPane().setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/logo.png"))); // NOI18N
        logo.setText("jLabel2");
        getContentPane().add(logo);
        logo.setBounds(0, 0, 90, 70);

        cash_rew.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 52)); // NOI18N
        cash_rew.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cash_rew);
        cash_rew.setBounds(1234, 440, 110, 50);

        coin_rew.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 52)); // NOI18N
        coin_rew.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(coin_rew);
        coin_rew.setBounds(1031, 440, 130, 50);

        up_level.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 52)); // NOI18N
        up_level.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(up_level);
        up_level.setBounds(1390, 300, 90, 70);

        level_up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/Level.png"))); // NOI18N
        getContentPane().add(level_up);
        level_up.setBounds(590, 250, 900, 260);

        Build_lab.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Build_lab.setText("Build");
        Build_lab.setAutoscrolls(true);
        Build_lab.setVisible(false);
        getContentPane().add(Build_lab);
        Build_lab.setBounds(1800, 1020, 80, 40);

        level.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        level.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(level);
        level.setBounds(730, 20, 20, 40);

        star.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/star.png"))); // NOI18N
        getContentPane().add(star);
        star.setBounds(710, 0, 70, 72);

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bar.setForeground(new java.awt.Color(255, 255, 255));
        bar.setAutoscrolls(true);
        getContentPane().add(bar);
        bar.setBounds(90, 20, 180, 40);

        name_field.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 30)); // NOI18N
        name_field.setForeground(new java.awt.Color(255, 255, 255));
        name_field.setBorder(null);
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(name_field);
        name_field.setBounds(720, 530, 480, 50);

        accept_name.setAutoscrolls(true);
        accept_name.setContentAreaFilled(false);
        accept_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accept_nameMousePressed(evt);
            }
        });
        accept_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accept_nameActionPerformed(evt);
            }
        });
        getContentPane().add(accept_name);
        accept_name.setBounds(880, 730, 140, 70);

        Ask_name_back_ground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/Ask_name.png"))); // NOI18N
        Ask_name_back_ground.setAutoscrolls(true);
        getContentPane().add(Ask_name_back_ground);
        Ask_name_back_ground.setBounds(630, 230, 650, 590);

        Town_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/barr.png"))); // NOI18N
        getContentPane().add(Town_name);
        Town_name.setBounds(30, 10, 250, 60);

        option_manu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/option_manu.png"))); // NOI18N
        getContentPane().add(option_manu);
        option_manu.setBounds(820, 220, 536, 293);

        yes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/yes.png"))); // NOI18N
        getContentPane().add(yes);
        yes.setBounds(830, 510, 160, 90);

        no.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/no.png"))); // NOI18N
        getContentPane().add(no);
        no.setBounds(1190, 500, 170, 110);

        duration.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        duration.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(duration);
        duration.setBounds(920, 190, 220, 50);

        No_button.setContentAreaFilled(false);
        No_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                No_buttonMousePressed(evt);
            }
        });
        No_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                No_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(No_button);
        No_button.setBounds(1200, 520, 140, 80);

        Yes_button.setContentAreaFilled(false);
        Yes_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Yes_buttonMousePressed(evt);
            }
        });
        Yes_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yes_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Yes_button);
        Yes_button.setBounds(830, 520, 150, 80);

        soil_cotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/2.PNG"))); // NOI18N
        soil_cotton.setContentAreaFilled(false);
        soil_cotton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soil_cottonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soil_cottonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soil_cottonMousePressed(evt);
            }
        });
        soil_cotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soil_cottonActionPerformed(evt);
            }
        });
        getContentPane().add(soil_cotton);
        soil_cotton.setBounds(890, 900, 120, 130);

        soil_wheat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/1.png"))); // NOI18N
        soil_wheat.setContentAreaFilled(false);
        soil_wheat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soil_wheatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soil_wheatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soil_wheatMousePressed(evt);
            }
        });
        soil_wheat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soil_wheatActionPerformed(evt);
            }
        });
        getContentPane().add(soil_wheat);
        soil_wheat.setBounds(660, 900, 100, 120);

        soil_sugercane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/5.png"))); // NOI18N
        soil_sugercane.setContentAreaFilled(false);
        soil_sugercane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soil_sugercaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soil_sugercaneMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soil_sugercaneMousePressed(evt);
            }
        });
        soil_sugercane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soil_sugercaneActionPerformed(evt);
            }
        });
        getContentPane().add(soil_sugercane);
        soil_sugercane.setBounds(1120, 910, 100, 110);

        wheat_am.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(wheat_am);
        wheat_am.setBounds(1020, 960, 50, 40);

        produce_p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/7.png"))); // NOI18N
        produce_p1.setContentAreaFilled(false);
        produce_p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                produce_p1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                produce_p1MouseExited(evt);
            }
        });
        produce_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produce_p1ActionPerformed(evt);
            }
        });
        getContentPane().add(produce_p1);
        produce_p1.setBounds(710, 920, 110, 100);

        produce_p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/9.png"))); // NOI18N
        produce_p2.setContentAreaFilled(false);
        produce_p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                produce_p2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                produce_p2MouseExited(evt);
            }
        });
        produce_p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produce_p2ActionPerformed(evt);
            }
        });
        getContentPane().add(produce_p2);
        produce_p2.setBounds(1040, 910, 110, 120);

        Build.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/build1.png"))); // NOI18N
        Build.setAutoscrolls(true);
        Build.setContentAreaFilled(false);
        Build.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuildMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuildMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuildMousePressed(evt);
            }
        });
        Build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuildActionPerformed(evt);
            }
        });
        getContentPane().add(Build);
        Build.setBounds(1760, 910, 120, 120);

        cloth_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        cloth_lab.setText("Clothes shop ");
        cloth_lab.setAutoscrolls(true);
        getContentPane().add(cloth_lab);
        cloth_lab.setBounds(1330, 350, 170, 22);

        mall_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        mall_lab.setText("Mall");
        getContentPane().add(mall_lab);
        mall_lab.setBounds(1380, 350, 80, 22);

        house_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        house_lab.setText("House");
        getContentPane().add(house_lab);
        house_lab.setBounds(970, 580, 70, 24);

        chicken_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        chicken_lab.setText("Chicken Coop");
        getContentPane().add(chicken_lab);
        chicken_lab.setBounds(950, 580, 160, 24);

        suger_sh_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        suger_sh_lab.setText("Suger Factory");
        getContentPane().add(suger_sh_lab);
        suger_sh_lab.setBounds(1340, 580, 150, 24);

        club_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        club_lab.setText("Club");
        getContentPane().add(club_lab);
        club_lab.setBounds(1380, 580, 60, 24);

        tower_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        tower_lab.setText("Tower");
        tower_lab.setAutoscrolls(true);
        getContentPane().add(tower_lab);
        tower_lab.setBounds(980, 350, 90, 22);

        school_label.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        school_label.setText("School");
        getContentPane().add(school_label);
        school_label.setBounds(980, 350, 90, 22);

        bakery_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        bakery_lab.setText("Bakery ");
        bakery_lab.setAutoscrolls(true);
        getContentPane().add(bakery_lab);
        bakery_lab.setBounds(560, 350, 110, 30);

        cottage_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        cottage_lab.setText("Cottage");
        getContentPane().add(cottage_lab);
        cottage_lab.setBounds(560, 350, 110, 30);

        sweet_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        sweet_lab.setText("Sweet shop");
        getContentPane().add(sweet_lab);
        sweet_lab.setBounds(540, 580, 120, 24);

        football_lab.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 20)); // NOI18N
        football_lab.setText("Football Club");
        getContentPane().add(football_lab);
        football_lab.setBounds(540, 580, 139, 24);

        j1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j1);
        j1.setBounds(745, 495, 50, 25);

        j2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j2);
        j2.setBounds(1145, 495, 50, 25);

        j3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j3);
        j3.setBounds(1540, 495, 50, 25);

        j4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j4);
        j4.setBounds(740, 715, 50, 30);

        j5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j5);
        j5.setBounds(1140, 715, 50, 25);

        j6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j6);
        j6.setBounds(1540, 715, 50, 25);

        j7.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j7);
        j7.setBounds(745, 495, 50, 25);

        j8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j8);
        j8.setBounds(1140, 495, 50, 25);

        j9.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j9);
        j9.setBounds(1540, 495, 50, 25);

        j10.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j10);
        j10.setBounds(740, 715, 50, 25);

        j11.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j11);
        j11.setBounds(1145, 715, 50, 25);

        j12.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 23)); // NOI18N
        j12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(j12);
        j12.setBounds(1540, 715, 50, 25);

        build_house.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/house.png"))); // NOI18N
        build_house.setContentAreaFilled(false);
        build_house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_houseActionPerformed(evt);
            }
        });
        getContentPane().add(build_house);
        build_house.setBounds(920, 610, 150, 153);

        build_chicken_coop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/ch.png"))); // NOI18N
        build_chicken_coop.setContentAreaFilled(false);
        build_chicken_coop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_chicken_coopActionPerformed(evt);
            }
        });
        getContentPane().add(build_chicken_coop);
        build_chicken_coop.setBounds(890, 610, 230, 150);

        build_bakery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/baker6.png"))); // NOI18N
        build_bakery.setAutoscrolls(true);
        build_bakery.setContentAreaFilled(false);
        build_bakery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_bakeryMousePressed(evt);
            }
        });
        build_bakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_bakeryActionPerformed(evt);
            }
        });
        getContentPane().add(build_bakery);
        build_bakery.setBounds(500, 390, 150, 141);

        build_cottage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/cottage_sh.png"))); // NOI18N
        build_cottage.setContentAreaFilled(false);
        build_cottage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_cottageActionPerformed(evt);
            }
        });
        getContentPane().add(build_cottage);
        build_cottage.setBounds(530, 390, 150, 141);

        build_cloth.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/cloth_bulid.png"))); // NOI18N
        build_cloth.setAutoscrolls(true);
        build_cloth.setContentAreaFilled(false);
        build_cloth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_clothMousePressed(evt);
            }
        });
        build_cloth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_clothActionPerformed(evt);
            }
        });
        getContentPane().add(build_cloth);
        build_cloth.setBounds(1340, 390, 155, 140);

        build_mall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/mall_sh.png"))); // NOI18N
        build_mall.setContentAreaFilled(false);
        build_mall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_mallActionPerformed(evt);
            }
        });
        getContentPane().add(build_mall);
        build_mall.setBounds(1320, 390, 152, 141);

        build_tower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/tower_sh.png"))); // NOI18N
        build_tower.setContentAreaFilled(false);
        build_tower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_towerActionPerformed(evt);
            }
        });
        getContentPane().add(build_tower);
        build_tower.setBounds(940, 390, 115, 140);

        build_school.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/school_sh.png"))); // NOI18N
        build_school.setContentAreaFilled(false);
        build_school.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_schoolActionPerformed(evt);
            }
        });
        getContentPane().add(build_school);
        build_school.setBounds(940, 390, 140, 141);

        build_suger_sh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/suger_sh.png"))); // NOI18N
        build_suger_sh.setContentAreaFilled(false);
        build_suger_sh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_suger_shActionPerformed(evt);
            }
        });
        getContentPane().add(build_suger_sh);
        build_suger_sh.setBounds(1270, 610, 210, 150);

        build_club.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/club_sh.png"))); // NOI18N
        build_club.setContentAreaFilled(false);
        build_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_clubActionPerformed(evt);
            }
        });
        getContentPane().add(build_club);
        build_club.setBounds(1300, 610, 180, 141);

        build_sweet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/sweet _.png"))); // NOI18N
        build_sweet.setContentAreaFilled(false);
        build_sweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_sweetActionPerformed(evt);
            }
        });
        getContentPane().add(build_sweet);
        build_sweet.setBounds(510, 610, 150, 150);

        build_football_club.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/football_club_sh.png"))); // NOI18N
        build_football_club.setContentAreaFilled(false);
        build_football_club.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_football_clubActionPerformed(evt);
            }
        });
        getContentPane().add(build_football_club);
        build_football_club.setBounds(500, 620, 176, 130);

        t_shirt_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/0.PNG"))); // NOI18N
        t_shirt_icon.setAutoscrolls(true);
        getContentPane().add(t_shirt_icon);
        t_shirt_icon.setBounds(670, 610, 119, 90);

        cash_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cash_amount.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cash_amount);
        cash_amount.setBounds(120, 160, 150, 40);

        coin_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/coin.png"))); // NOI18N
        getContentPane().add(coin_bar);
        coin_bar.setBounds(10, 70, 70, 70);

        c_bar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/cash_bar.png"))); // NOI18N
        getContentPane().add(c_bar1);
        c_bar1.setBounds(10, 130, 250, 90);

        money_amount1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        money_amount1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(money_amount1);
        money_amount1.setBounds(80, 86, 120, 40);

        mbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/barr.png"))); // NOI18N
        mbar.setText("jLabel1");
        getContentPane().add(mbar);
        mbar.setBounds(20, 70, 240, 70);

        t_shirt_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t_shirt_amount.setText("0");
        t_shirt_amount.setAutoscrolls(true);
        getContentPane().add(t_shirt_amount);
        t_shirt_amount.setBounds(690, 700, 40, 30);

        flour_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        flour_amount.setText("0");
        flour_amount.setAutoscrolls(true);
        getContentPane().add(flour_amount);
        flour_amount.setBounds(970, 560, 30, 30);

        bread_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/3.PNG"))); // NOI18N
        bread_icon.setAutoscrolls(true);
        getContentPane().add(bread_icon);
        bread_icon.setBounds(960, 610, 107, 90);

        flour_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/1.png"))); // NOI18N
        flour_icon.setAutoscrolls(true);
        getContentPane().add(flour_icon);
        flour_icon.setBounds(950, 460, 90, 100);

        bread_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bread_amount.setText("0");
        bread_amount.setAutoscrolls(true);
        getContentPane().add(bread_amount);
        bread_amount.setBounds(990, 700, 50, 40);

        back_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/Close-icon.png"))); // NOI18N
        back_button.setAutoscrolls(true);
        back_button.setContentAreaFilled(false);
        back_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                back_buttonMousePressed(evt);
            }
        });
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button);
        back_button.setBounds(1560, 220, 40, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(400, 510, 50, 55);

        forward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/forward.png"))); // NOI18N
        forward.setContentAreaFilled(false);
        forward.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forwardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forwardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forwardMousePressed(evt);
            }
        });
        forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardActionPerformed(evt);
            }
        });
        getContentPane().add(forward);
        forward.setBounds(1560, 510, 50, 57);

        coton_amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coton_amount.setText("0");
        coton_amount.setAutoscrolls(true);
        getContentPane().add(coton_amount);
        coton_amount.setBounds(700, 570, 30, 30);

        cotton_icon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cotton_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/2.PNG"))); // NOI18N
        cotton_icon.setText("your name:");
        cotton_icon.setAutoscrolls(true);
        getContentPane().add(cotton_icon);
        cotton_icon.setBounds(650, 440, 110, 130);

        order_1_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/1_.png"))); // NOI18N
        getContentPane().add(order_1_lab);
        order_1_lab.setBounds(670, 370, 79, 109);

        order_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order_1.setText("cotton");
        order_1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        order_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_1ActionPerformed(evt);
            }
        });
        getContentPane().add(order_1);
        order_1.setBounds(640, 370, 950, 120);

        order_2_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/2_.png"))); // NOI18N
        getContentPane().add(order_2_lab);
        order_2_lab.setBounds(680, 490, 90, 110);

        order_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order_2.setText("kllkflkasdflasldlkasddddddddd");
        order_2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        order_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_2ActionPerformed(evt);
            }
        });
        getContentPane().add(order_2);
        order_2.setBounds(640, 490, 950, 110);

        order_3_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/3_.png"))); // NOI18N
        getContentPane().add(order_3_lab);
        order_3_lab.setBounds(680, 600, 96, 110);

        order_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order_3.setText("jButton1");
        order_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        order_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_3ActionPerformed(evt);
            }
        });
        getContentPane().add(order_3);
        order_3.setBounds(640, 600, 950, 110);

        order_4_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/4_.png"))); // NOI18N
        getContentPane().add(order_4_lab);
        order_4_lab.setBounds(680, 710, 99, 110);

        order_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order_4.setText("jButton1");
        order_4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        order_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_4ActionPerformed(evt);
            }
        });
        getContentPane().add(order_4);
        order_4.setBounds(640, 710, 950, 110);

        order_5_lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/5_.png"))); // NOI18N
        getContentPane().add(order_5_lab);
        order_5_lab.setBounds(680, 830, 100, 80);

        order_5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        order_5.setText("jButton2");
        order_5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        order_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_5ActionPerformed(evt);
            }
        });
        getContentPane().add(order_5);
        order_5.setBounds(640, 820, 950, 100);

        Pay_method.add(pay_by_coin);
        pay_by_coin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pay_by_coin.setText("Coin");
        pay_by_coin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pay_by_coinMousePressed(evt);
            }
        });
        pay_by_coin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_by_coinActionPerformed(evt);
            }
        });
        getContentPane().add(pay_by_coin);
        pay_by_coin.setBounds(410, 800, 90, 31);

        Pay_method.add(pay_by_cash);
        pay_by_cash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pay_by_cash.setText("Cash");
        pay_by_cash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pay_by_cashMousePressed(evt);
            }
        });
        pay_by_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pay_by_cashActionPerformed(evt);
            }
        });
        getContentPane().add(pay_by_cash);
        pay_by_cash.setBounds(510, 800, 100, 30);

        back_ground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/store_window.png"))); // NOI18N
        back_ground.setAutoscrolls(true);
        back_ground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(back_ground);
        back_ground.setBounds(380, 210, 1300, 660);
        getContentPane().add(o_1);
        o_1.setBounds(690, 410, 110, 123);

        j_1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_1);
        j_1.setBounds(720, 530, 50, 30);
        getContentPane().add(o_2);
        o_2.setBounds(940, 410, 110, 123);

        j_2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_2);
        j_2.setBounds(970, 530, 50, 30);
        getContentPane().add(o_3);
        o_3.setBounds(1200, 410, 110, 123);

        j_3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_3);
        j_3.setBounds(1230, 530, 50, 30);
        getContentPane().add(o_4);
        o_4.setBounds(1440, 410, 110, 123);

        j_4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_4);
        j_4.setBounds(1470, 530, 50, 30);
        getContentPane().add(o_5);
        o_5.setBounds(690, 590, 110, 123);

        j_5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_5);
        j_5.setBounds(720, 720, 50, 30);
        getContentPane().add(o_6);
        o_6.setBounds(940, 590, 110, 123);

        j_6.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_6);
        j_6.setBounds(970, 720, 50, 30);
        getContentPane().add(o_7);
        o_7.setBounds(1200, 590, 110, 123);

        j_7.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_7);
        j_7.setBounds(1230, 720, 50, 30);
        getContentPane().add(o_8);
        o_8.setBounds(1440, 590, 110, 123);

        j_8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_8);
        j_8.setBounds(1470, 720, 50, 30);
        getContentPane().add(o_9);
        o_9.setBounds(690, 750, 110, 123);

        j_9.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        getContentPane().add(j_9);
        j_9.setBounds(720, 880, 50, 30);

        order_price.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        order_price.setForeground(new java.awt.Color(255, 255, 255));
        order_price.setToolTipText("");
        getContentPane().add(order_price);
        order_price.setBounds(710, 975, 50, 20);

        order_ex.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 14)); // NOI18N
        order_ex.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(order_ex);
        order_ex.setBounds(840, 975, 50, 20);

        orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/orders.png"))); // NOI18N
        orders.setText("jLabel1");
        getContentPane().add(orders);
        orders.setBounds(600, 180, 1020, 850);

        accept_or.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/send.png"))); // NOI18N
        accept_or.setContentAreaFilled(false);
        accept_or.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accept_orMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accept_orMousePressed(evt);
            }
        });
        accept_or.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accept_orActionPerformed(evt);
            }
        });
        getContentPane().add(accept_or);
        accept_or.setBounds(1010, 930, 180, 110);

        order_frame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/order_d.png"))); // NOI18N
        order_frame.setText("jLabel1");
        getContentPane().add(order_frame);
        order_frame.setBounds(610, 200, 1063, 850);

        barn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/barn_im.png"))); // NOI18N
        barn.setText("jLabel2");
        getContentPane().add(barn);
        barn.setBounds(610, 200, 1020, 820);

        small.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/small.png"))); // NOI18N
        getContentPane().add(small);
        small.setBounds(740, 890, 402, 170);

        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/crops_container.png"))); // NOI18N
        getContentPane().add(container);
        container.setBounds(580, 900, 700, 140);

        build_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_1.setContentAreaFilled(false);
        build_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_1MousePressed(evt);
            }
        });
        build_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                build_1KeyPressed(evt);
            }
        });
        getContentPane().add(build_1);
        build_1.setBounds(80, 310, 70, 70);

        build_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_2.setContentAreaFilled(false);
        build_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_2MousePressed(evt);
            }
        });
        getContentPane().add(build_2);
        build_2.setBounds(1740, 455, 80, 70);

        build_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_3.setContentAreaFilled(false);
        build_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_3MousePressed(evt);
            }
        });
        getContentPane().add(build_3);
        build_3.setBounds(70, 490, 70, 70);

        build_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_4.setContentAreaFilled(false);
        build_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_4MousePressed(evt);
            }
        });
        getContentPane().add(build_4);
        build_4.setBounds(1700, 265, 90, 60);

        build_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_5.setContentAreaFilled(false);
        build_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_5MousePressed(evt);
            }
        });
        getContentPane().add(build_5);
        build_5.setBounds(1530, 110, 90, 70);

        build_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_6.setContentAreaFilled(false);
        build_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_6MousePressed(evt);
            }
        });
        getContentPane().add(build_6);
        build_6.setBounds(1420, 10, 80, 70);

        build_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_7.setContentAreaFilled(false);
        build_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_7MousePressed(evt);
            }
        });
        getContentPane().add(build_7);
        build_7.setBounds(140, 720, 80, 110);

        build_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_8.setContentAreaFilled(false);
        build_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_8MousePressed(evt);
            }
        });
        getContentPane().add(build_8);
        build_8.setBounds(1230, 0, 90, 80);

        build_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_9.setContentAreaFilled(false);
        build_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_9MousePressed(evt);
            }
        });
        getContentPane().add(build_9);
        build_9.setBounds(1303, 190, 70, 70);

        build_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_10.setContentAreaFilled(false);
        build_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_10MousePressed(evt);
            }
        });
        build_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                build_10ActionPerformed(evt);
            }
        });
        getContentPane().add(build_10);
        build_10.setBounds(1360, 445, 80, 100);

        build_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_11.setContentAreaFilled(false);
        build_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_11MousePressed(evt);
            }
        });
        getContentPane().add(build_11);
        build_11.setBounds(1477, 255, 90, 70);

        build_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/button.png"))); // NOI18N
        build_12.setContentAreaFilled(false);
        build_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                build_12MousePressed(evt);
            }
        });
        getContentPane().add(build_12);
        build_12.setBounds(1180, 350, 103, 87);

        soil_house.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/soil1.png"))); // NOI18N
        soil_house.setAutoscrolls(true);
        soil_house.setContentAreaFilled(false);
        soil_house.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                soil_houseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                soil_house_entered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                soil_houseMousePressed(evt);
            }
        });
        soil_house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soil_houseActionPerformed(evt);
            }
        });
        getContentPane().add(soil_house);
        soil_house.setBounds(850, 60, 370, 350);

        d_1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_1);
        d_1.setBounds(1370, 90, 220, 50);

        d_2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_2);
        d_2.setBounds(1530, 140, 250, 50);

        d_3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_3);
        d_3.setBounds(1670, 270, 230, 50);

        d_4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_4);
        d_4.setBounds(1680, 480, 190, 50);

        d_5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_5);
        d_5.setBounds(70, 780, 260, 50);

        d_6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_6.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_6);
        d_6.setBounds(0, 510, 200, 50);

        d_7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_7.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_7);
        d_7.setBounds(50, 340, 220, 50);

        d_8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_8);
        d_8.setBounds(1170, 50, 270, 50);

        d_9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_9.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_9);
        d_9.setBounds(1230, 220, 260, 50);

        d_10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_10.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_10);
        d_10.setBounds(1340, 460, 210, 50);

        d_11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_11.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_11);
        d_11.setBounds(1180, 360, 220, 50);

        d_12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        d_12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(d_12);
        d_12.setBounds(1420, 290, 220, 50);

        chicken_coop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/ch_e.png"))); // NOI18N
        chicken_coop.setContentAreaFilled(false);
        chicken_coop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chicken_coopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chicken_coopMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chicken_coopMousePressed(evt);
            }
        });
        chicken_coop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken_coopActionPerformed(evt);
            }
        });
        getContentPane().add(chicken_coop);
        chicken_coop.setBounds(1650, 410, 243, 170);

        school_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/school_fr.png"))); // NOI18N
        getContentPane().add(school_build);
        school_build.setBounds(30, 460, 154, 170);

        football_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/football_club_fr.png"))); // NOI18N
        getContentPane().add(football_build);
        football_build.setBounds(1440, 240, 194, 170);

        tower_site.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/tower_front.png"))); // NOI18N
        getContentPane().add(tower_site);
        tower_site.setBounds(1670, 150, 150, 270);

        head_Build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/buildingTiles_100.png"))); // NOI18N
        head_Build.setAutoscrolls(true);
        head_Build.setContentAreaFilled(false);
        head_Build.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                head_BuildMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                head_BuildMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                head_BuildMousePressed(evt);
            }
        });
        head_Build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                head_BuildActionPerformed(evt);
            }
        });
        getContentPane().add(head_Build);
        head_Build.setBounds(1630, 690, 230, 160);

        mall_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/mall_fr.png"))); // NOI18N
        getContentPane().add(mall_build);
        mall_build.setBounds(1270, 140, 180, 190);

        cottage_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/cottage_fr.png"))); // NOI18N
        getContentPane().add(cottage_build);
        cottage_build.setBounds(1390, 0, 140, 190);

        sweet_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/sweet.png"))); // NOI18N
        sweet_build.setContentAreaFilled(false);
        sweet_build.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sweet_buildMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sweet_buildMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sweet_buildMousePressed(evt);
            }
        });
        sweet_build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sweet_buildActionPerformed(evt);
            }
        });
        getContentPane().add(sweet_build);
        sweet_build.setBounds(1140, 320, 140, 180);

        suger_sh_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/suger_sh.png"))); // NOI18N
        suger_sh_build.setContentAreaFilled(false);
        suger_sh_build.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suger_sh_buildMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suger_sh_buildMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suger_sh_buildMousePressed(evt);
            }
        });
        suger_sh_build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suger_sh_buildActionPerformed(evt);
            }
        });
        getContentPane().add(suger_sh_build);
        suger_sh_build.setBounds(60, 680, 200, 230);

        storage_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/Storage_buildd.png"))); // NOI18N
        storage_build.setAutoscrolls(true);
        storage_build.setContentAreaFilled(false);
        storage_build.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                storage_buildMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                storage_buildMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                storage_buildMousePressed(evt);
            }
        });
        storage_build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storage_buildActionPerformed(evt);
            }
        });
        getContentPane().add(storage_build);
        storage_build.setBounds(220, 10, 450, 320);

        cloth_build_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/cloth_front.png"))); // NOI18N
        cloth_build_1.setAutoscrolls(true);
        cloth_build_1.setContentAreaFilled(false);
        cloth_build_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cloth_build_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cloth_build_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cloth_build_1MousePressed(evt);
            }
        });
        cloth_build_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cloth_build_1ActionPerformed(evt);
            }
        });
        getContentPane().add(cloth_build_1);
        cloth_build_1.setBounds(1320, 430, 130, 180);

        house_site.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/house.png"))); // NOI18N
        getContentPane().add(house_site);
        house_site.setBounds(1210, 0, 160, 190);

        club_build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/club_fr.png"))); // NOI18N
        getContentPane().add(club_build);
        club_build.setBounds(1500, 70, 210, 180);

        bakery_build1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/baker6_.png"))); // NOI18N
        bakery_build1.setAutoscrolls(true);
        bakery_build1.setContentAreaFilled(false);
        bakery_build1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bakery_build1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bakery_build1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bakery_build1MousePressed(evt);
            }
        });
        bakery_build1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakery_build1ActionPerformed(evt);
            }
        });
        getContentPane().add(bakery_build1);
        bakery_build1.setBounds(10, 250, 210, 230);

        name_warning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/warning.png"))); // NOI18N
        name_warning.setAutoscrolls(true);
        getContentPane().add(name_warning);
        name_warning.setBounds(650, 200, 560, 370);

        name_warning_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/ok.png"))); // NOI18N
        name_warning_ok.setAutoscrolls(true);
        name_warning_ok.setContentAreaFilled(false);
        name_warning_ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                name_warning_okMousePressed(evt);
            }
        });
        name_warning_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_warning_okActionPerformed(evt);
            }
        });
        getContentPane().add(name_warning_ok);
        name_warning_ok.setBounds(990, 530, 239, 105);

        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/options.png"))); // NOI18N
        options.setContentAreaFilled(false);
        options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                optionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                optionsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                optionsMousePressed(evt);
            }
        });
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        getContentPane().add(options);
        options.setBounds(1710, 0, 170, 165);

        Ex_bar.setBackground(new java.awt.Color(255, 255, 255));
        Ex_bar.setForeground(new java.awt.Color(255, 255, 255));
        Ex_bar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Ex_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ex_barMouseEntered(evt);
            }
        });
        getContentPane().add(Ex_bar);
        Ex_bar.setBounds(760, 20, 390, 40);

        Green_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/company/assets/green_ground_land_grass_textures_free_24.png"))); // NOI18N
        Green_background.setAutoscrolls(true);
        Green_background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Green_background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Green_backgroundMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Green_backgroundMousePressed(evt);
            }
        });
        getContentPane().add(Green_background);
        Green_background.setBounds(0, 0, 1890, 1830);
        Green_background.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accept_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accept_nameActionPerformed

        Player_name = name_field.getText();
        if (Player_name.equals("") || Player_name.equals(" ")) {

            name_warning.setVisible(true);
            name_warning_ok.setVisible(true);

        }

        name_field.setVisible(false);
        back_ground.setVisible(false);
        accept_name.setVisible(false);
        Ask_name_back_ground.setVisible(false);
        if (!Player_name.equals("")) {
            Build.setVisible(true);
            storage_build.setVisible(true);
            head_Build.setVisible(true);
            soil_house.setVisible(true);
            Player_1.setName(Player_name);
            options.setVisible(true);
            bars(true);
            update_bar();

            Build_lab.setVisible(true);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_accept_nameActionPerformed

    private void head_BuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_head_BuildActionPerformed
        // TODO add your handling code here:
        //barn.setVisible(true

        /*order_list[0].show_items()
                  order_list[1].show_items()
                          order_list[2].show_items()
                                   order_list[3].show_items()
                                           order_list[4].show_items()*/
        if (!back_button.isShowing() && !option_manu.isShowing()) {
            close();
            back_button.setVisible(true);
            face(true);
            order_1.setText("New Order!");
            order_2.setText("New Order!");
            order_3.setText("New Order!");
            order_4.setText("New Order!");
            order_5.setText("New Order!");
            order_1.setVisible(true);
            order_2.setVisible(true);
            order_3.setVisible(true);
            order_4.setVisible(true);
            order_5.setVisible(true);
            orders.setVisible(true);
        }

        ////this for orders
    }//GEN-LAST:event_head_BuildActionPerformed

    private void cloth_build_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cloth_build_1ActionPerformed

        close();
        if (f.available()) {
            small.setVisible(true);
            current_p1 = 0;
            set_produce_p1_icon(current_p1, false);
            produce_p1.setLocation(890, 910);
            produce_p1.setVisible(true);

            update_bar();
        }

    }//GEN-LAST:event_cloth_build_1ActionPerformed

    private void storage_buildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storage_buildActionPerformed

        close();
        open_storage();
        update_bar();


    }//GEN-LAST:event_storage_buildActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
 Icon normal = new ImageIcon("src/com/company/assets/store_window.png");
        back_ground.setIcon(normal);
        if (barn.isShowing()) {
            barn.setVisible(false);
            storage_build.setVisible(true);
            options.setVisible(false);
            Build.setVisible(true);
            Build_lab.setVisible(true);
            options.setVisible(true);
        } else {
            back_ground.setVisible(false);
            Build.setVisible(true);
            Build_lab.setVisible(true);
            back.setVisible(false);
            forward.setVisible(false);
            setLabel_1(1);
            setLabel_1(1);

        }

        close();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    void start_building(int i) {
        //duration part
        start_building = new Date();
        Calendar d_date = Calendar.getInstance();
        d_date.setTime(start_building);
        d_date.add(Calendar.SECOND, Player_1.Town.Builds[i].getTime_To_Build());
        builder_situation = i;
        end_building = d_date.getTime();
        ///

    }

    void finish_build() {

        Date current = new Date();
        if (end_building.before(current)) {
            switch (builder_situation) {
                case 0:
                    build_10.setVisible(false);
                    music("c");
                    Icon normal0 = new ImageIcon("src/com/company/assets/cloth_front.png");
                    cloth_build_1.setIcon(normal0);
                    cloth_build_1.setEnabled(true);
                    break;
                case 1:
                    build_1.setVisible(false);
                    music("c");
                    Icon normal1 = new ImageIcon("src/com/company/assets/baker6_.png");
                    bakery_build1.setIcon(normal1);
                    bakery_build1.setEnabled(true);
                    break;
                case 2:
                    build_12.setVisible(false);
                    Icon normal2 = new ImageIcon("src/com/company/assets/sweet.png");
                    sweet_build.setIcon(normal2);
                    music("c");
                    sweet_build.setEnabled(true);
                    break;
                case 3:
                    build_4.setVisible(false);
                    Icon normal3 = new ImageIcon("src/com/company/assets/tower_front.png");
                    tower_site.setIcon(normal3);
                    music("c");
                    tower_site.setEnabled(true);
                    break;
                case 4:
                    build_8.setVisible(false);
                    Icon normal4 = new ImageIcon("src/com/company/assets/house.png");
                    house_site.setIcon(normal4);
                    music("c");
                    house_site.setEnabled(true);
                    break;
                case 5:
                    build_7.setVisible(false);
                    Icon normal5 = new ImageIcon("src/com/company/assets/suger_sh.png");
                    suger_sh_build.setIcon(normal5);
                    music("c");
                    suger_sh_build.setEnabled(true);
                    break;

                case 8:
                    build_2.setVisible(false);
                    Icon normal6 = new ImageIcon("src/com/company/assets/ch_e.png");
                    chicken_coop.setIcon(normal6);
                    music("c");
                    chicken_coop.setEnabled(true);
                    break;

                case 9:
                    build_3.setVisible(false);
                    Icon normal7 = new ImageIcon("src/com/company/assets/school_fr.png");
                    school_build.setIcon(normal7);
                    music("c");
                    school_build.setEnabled(true);
                    break;

                case 10:
                    build_11.setVisible(false);
                    Icon normal8 = new ImageIcon("src/com/company/assets/football_club_fr.png");
                    football_build.setIcon(normal8);
                    music("c");
                    football_build.setEnabled(true);
                    break;
                case 11:
                    build_5.setVisible(false);
                    Icon normal9 = new ImageIcon("src/com/company/assets/club_fr.png");
                    club_build.setIcon(normal9);
                    music("c");
                    club_build.setEnabled(true);
                    break;
                case 12:
                    build_9.setVisible(false);
                    Icon normal10 = new ImageIcon("src/com/company/assets/mall_fr.png");
                    mall_build.setIcon(normal10);
                    music("c");
                    mall_build.setEnabled(true);
                    break;
                case 13:
                    build_6.setVisible(false);
                    Icon normal11 = new ImageIcon("src/com/company/assets/cottage_fr.png");
                    cottage_build.setIcon(normal11);
                    music("c");
                    cottage_build.setEnabled(true);
                    break;
                default:
                    break;
            }
            builder_situation = -1;

        }
    }

    void set_produce_p1_icon(int i, boolean light) {
        if (!light) {
            Icon icon1 = new ImageIcon("src/com/company/assets/" + i + ".png");
            produce_p1.setIcon(icon1);
        } else {
            Icon icon1 = new ImageIcon("src/com/company/assets/" + i + "_e.png");
            produce_p1.setIcon(icon1);

        }

    }

    void set_produce_p2_icon(int i, boolean light) {
        if (!light) {
            Icon icon2 = new ImageIcon("src/com/company/assets/" + i + ".png");
            produce_p2.setIcon(icon2);
        } else {
            Icon icon2 = new ImageIcon("src/com/company/assets/" + i + "_e.png");
            produce_p2.setIcon(icon2);
        }

    }
    private void BuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuildActionPerformed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing()) {
            close();
            if (builder_situation == -1) {
                forward.setVisible(true);
                Build.setVisible(false);
                Build_lab.setVisible(false);
                back_ground.setVisible(true);
                back_button.setVisible(true);
                store_elements_1(true);
                pay_by_cash.setVisible(true);
                pay_by_coin.setSelected(true);
                pay_by_coin.setVisible(true);
            }
        }

    }//GEN-LAST:event_BuildActionPerformed

    private void build_clothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_clothActionPerformed
        if ((Player_1.getMoney() >= new clothes_Factory().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new clothes_Factory().price_by_cash && pay_by_cash.isSelected()) {
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            cloth_build_1.setIcon(icon1);
            cloth_build_1.setVisible(true);

            BuildingIsChosen();
            Player_1.Town.Builds[0] = new clothes_Factory();

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[0].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[0].price_by_cash;
                Player_1.setcash(m);
            }

            Player_1.inc_experience(50);
            build_cloth.setEnabled(false);
            start_building(0);
            d_10.setVisible(true);
            update_bar();
            l_8 = new clothes_Factory().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_10.setVisible(false);
                        build_10.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 0) {
                        d_10.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }
    }//GEN-LAST:event_build_clothActionPerformed

    private void build_bakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_bakeryActionPerformed

        if ((Player_1.getMoney() >= new bakery().price && pay_by_coin.isSelected()) || (Player_1.getCash() >= new bakery().price_by_cash && pay_by_cash.isSelected())) {
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            bakery_build1.setIcon(icon1);

            bakery_build1.setVisible(true);
            BuildingIsChosen();
            Player_1.Town.Builds[1] = new bakery();

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[1].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[1].price_by_cash;
                Player_1.setcash(m);
            }
            build_bakery.setEnabled(false);

            start_building(1);
            d_7.setVisible(true);

            Player_1.inc_experience(60);
            update_bar();
            l_8 = new bakery().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_7.setVisible(false);
                        build_1.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 1) {
                        d_7.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }
    }//GEN-LAST:event_build_bakeryActionPerformed

    private void bakery_build1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakery_build1ActionPerformed

        if (f.available()) {
            close();
            small.setVisible(true);
            current_p1 = 3;
            set_produce_p1_icon(current_p1, false);
            produce_p1.setLocation(890, 910);
            produce_p1.setVisible(true);
            update_bar();
        }

    }//GEN-LAST:event_bakery_build1ActionPerformed

    private void soil_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soil_houseActionPerformed
        // TODO add your handling code here:

        if (!back_button.isShowing() && !option_manu.isShowing()) {
            close();
            if (current_plant == 0) {
                soil_elements(true);
                //back_button.setVisible(true);
            }
        }
    }//GEN-LAST:event_soil_houseActionPerformed

    private void name_warning_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_warning_okActionPerformed
        // TODO add your handling code here:
        name_warning.setVisible(false);
        name_warning_ok.setVisible(false);
        name_field.setVisible(true);

        accept_name.setVisible(true);
        Ask_name_back_ground.setVisible(true);

    }//GEN-LAST:event_name_warning_okActionPerformed

    private void BuildMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuildMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing()) {
            Icon light = new ImageIcon("src/com/company/assets/build_li.png");
            Build.setIcon(light);

        }// TODO add your handling code here:

    }//GEN-LAST:event_BuildMouseEntered

    private void BuildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuildMouseExited
        Icon Buildd = new ImageIcon("src/com/company/assets/build1.png");
        Build.setIcon(Buildd);        // TODO add your handling code here:
    }//GEN-LAST:event_BuildMouseExited

    private void optionsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMouseEntered
        if (!barn.isShowing()&&!container.isShowing() && !back_ground.isShowing() && !option_manu.isShowing()) {
            Icon op1 = new ImageIcon("src/com/company/assets/options_li.png");
            options.setIcon(op1);
        }// TODO add your handling code here:
    }//GEN-LAST:event_optionsMouseEntered

    private void optionsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMouseExited
        Icon op = new ImageIcon("src/com/company/assets/options.png");
        options.setIcon(op); // TODO add your handling code here:
    }//GEN-LAST:event_optionsMouseExited

    private void No_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_No_buttonActionPerformed
        option(false);        // TODO add your handling code here:
    }//GEN-LAST:event_No_buttonActionPerformed

    private void Yes_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yes_buttonActionPerformed
        if (option_manu.isShowing()) {
            Gui back_again = new Gui();
            this.close();
            back_again.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Yes_buttonActionPerformed

    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed

        if (!back_button.isShowing() && !container.isShowing() && !small.isShowing()) {
            close();
            soil_elements(false);
            option(true);

        }// TODO add your handling code here:
    }//GEN-LAST:event_optionsActionPerformed

    private void storage_buildMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storage_buildMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing()) {
            Icon storage1 = new ImageIcon(("src/com/company/assets/Storage_build_li.png"));
            storage_build.setIcon(storage1);
        }// TODO add your handling code here:
    }//GEN-LAST:event_storage_buildMouseEntered

    private void storage_buildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storage_buildMouseExited
        Icon storage2 = new ImageIcon("src/com/company/assets/Storage_buildd.png");
        storage_build.setIcon(storage2);        // TODO add your handling code here:
    }//GEN-LAST:event_storage_buildMouseExited

    private void accept_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accept_nameMousePressed
        music("a");        // TODO add your handling code here:
    }//GEN-LAST:event_accept_nameMousePressed

    private void No_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_No_buttonMousePressed
        if (option_manu.isShowing()) {
            music("a");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_No_buttonMousePressed

    private void Yes_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Yes_buttonMousePressed
        if (option_manu.isShowing()) {
            music("a");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Yes_buttonMousePressed

    private void BuildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuildMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing()) {
            Icon build_pre = new ImageIcon("src/com/company/assets/build_pre.png");
            Build.setIcon(build_pre);
            music("b");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_BuildMousePressed

    private void build_bakeryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_bakeryMousePressed
        music("a");        // TODO add your handling code here:
    }//GEN-LAST:event_build_bakeryMousePressed

    private void build_clothMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_clothMousePressed
        music("a");        // TODO add your handling code here:
    }//GEN-LAST:event_build_clothMousePressed

    private void back_buttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_buttonMousePressed
        music("a");        // TODO add your handling code here:
    }//GEN-LAST:event_back_buttonMousePressed

    private void storage_buildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storage_buildMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing()) {
            Icon op = new ImageIcon("src/com/company/assets/Storage_build_pre.png");
            storage_build.setIcon(op);
            music("b");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_storage_buildMousePressed

    private void soil_houseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_houseMousePressed
  
        if (!back_button.isShowing() && !option_manu.isShowing() ) {
              music("b");
                  // TODO add your handling code here:
        }

    }//GEN-LAST:event_soil_houseMousePressed


    private void name_warning_okMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_name_warning_okMousePressed

        music("a");        // TODO add your handling code here:


    }//GEN-LAST:event_name_warning_okMousePressed

    private void optionsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMousePressed

        if (!option_manu.isShowing()&&!container.isShowing() && !back_button.isShowing()) {
            Icon op = new ImageIcon("src/com/company/assets/option1.png");
            options.setIcon(op);
            music("b");
        }        // TODO add your handling code here:

    }//GEN-LAST:event_optionsMousePressed

    public void planting(int seeds_price, int seeds_seril) {
        if (Player_1.getMoney() >= seeds_price * 5) {

            Player_1.setMoney(Player_1.getMoney() - (seeds_price * 5));
            Player_1.inc_experience(10);
            start_plant = new Date();
            Calendar d_date = Calendar.getInstance();
            d_date.setTime(start_plant);
            d_date.add(Calendar.MINUTE, 1);
            current_plant = seeds_seril;
            end_plant = d_date.getTime();
            update_bar();
        } else {

            JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void soil_cottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soil_cottonActionPerformed
        // TODO add your handling code here:

        planting(new storage().Product[2].getPrice(), 2);
        soil_elements(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (back_button.isShowing()) {
                    duration.setVisible(false);
                }
                duration.setText(min + "Seconds left");
                min--;
                if (min == 0) {
                    timer.stop();
                    duration.setText("available");
                    min = 59;
                }

            }

        });
        timer.start();

    }//GEN-LAST:event_soil_cottonActionPerformed

    private void soil_wheatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soil_wheatActionPerformed
        planting(new storage().Product[1].getPrice(), 1);
        soil_elements(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (back_button.isShowing()) {
                    duration.setVisible(false);
                }

                duration.setText(min + "Seconds left");
                min--;
                if (min == 0) {
                    timer.stop();
                    duration.setText("available");
                    min = 59;
                }
            }

        });
        timer.start();


    }//GEN-LAST:event_soil_wheatActionPerformed

    private void soil_house_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_house_entered
        //duration.setVisible(false);  // TODO add your handling code here:
        Icon op = new ImageIcon("src/com/company/assets/soil1.png");
        soil_house.setIcon(op);
        duration.setVisible(false);

    }//GEN-LAST:event_soil_house_entered

    private void soil_houseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_houseMouseEntered
        if (!back_button.isShowing() && !option_manu.isShowing()) {
            Icon op = new ImageIcon("src/com/company/assets/soil_li.png");
            soil_house.setIcon(op);

            duration.setVisible(true);

            if (current_plant != 0) {

                Date current = new Date();
                if (end_plant.before(current)) {
                    Player_1.Storage.Product[current_plant].add(5);
                    Player_1.inc_experience(30);
                    current_plant = 0;
                    duration.setVisible(false);

                }
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_soil_houseMouseEntered

    private void Ex_barMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ex_barMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Ex_barMouseEntered

    private void Green_backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Green_backgroundMouseEntered
        x = new Timer(1000, new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent ae) {
                
                Ex_bar.setValue(Player_1.getExperience_to_pass() / Player_1.getLevel());
                cash_amount.setText("" + Player_1.getCash());

                if (Player_1.getLevel() > y) {

                    up_level.setText("" + Player_1.getLevel());
                    cash_rew.setText("" + (2 * Player_1.getLevel()));
                    coin_rew.setText("" + (50 * Player_1.getLevel()));
                    level_up.setVisible(true);
                    up_level.setVisible(true);
                    cash_rew.setVisible(true);
                    coin_rew.setVisible(true);
                    music("d");
                    y++;
                }
                level.setText("" + Player_1.getLevel());
            }

        });
        x.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_Green_backgroundMouseEntered

    private void build_sweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_sweetActionPerformed
        if ((Player_1.getMoney() >= new sweet_shop().price && pay_by_coin.isSelected()) || (Player_1.getCash() >= new sweet_shop().price_by_cash && pay_by_cash.isSelected())) {
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            sweet_build.setIcon(icon1);
            sweet_build.setVisible(true);

            BuildingIsChosen();
            Player_1.Town.Builds[2] = new sweet_shop();

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[2].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[2].price_by_cash;
                Player_1.setcash(m);
            }
            build_sweet.setEnabled(false);
            start_building(2);
            d_11.setVisible(true);
            Player_1.inc_experience(45);
            update_bar();
            l_8 = new sweet_shop().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_11.setVisible(false);
                        build_12.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 2) {
                        d_11.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        } // TODO add your handling code here:
    }//GEN-LAST:event_build_sweetActionPerformed

    private void sweet_buildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sweet_buildActionPerformed
        close();
        if (f.available()) {
            container.setVisible(true);

            current_p1 = 7;
            set_produce_p1_icon(current_p1, false);
            current_p2 = 9;
            produce_p1.setLocation(710, 920);
            produce_p1.setVisible(true);

            set_produce_p2_icon(current_p2, false);
            produce_p2.setVisible(true);

            update_bar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_sweet_buildActionPerformed

    private void build_towerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_towerActionPerformed
        if ((Player_1.getMoney() >= new Tower().price && pay_by_coin.isSelected()) || (Player_1.getCash() >= new Tower().price_by_cash && pay_by_cash.isSelected())) {
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            tower_site.setIcon(icon1);

            tower_site.setVisible(true);
            BuildingIsChosen();
            Player_1.Town.Builds[3] = new Tower();

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[3].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[3].price_by_cash;
                Player_1.setcash(m);
            }
            build_tower.setEnabled(false);
            start_building(3);
            d_3.setVisible(true);
            Player_1.inc_experience(40);
            update_bar();
            l_8 = new Tower().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_3.setVisible(false);
                        build_4.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 3) {
                        d_3.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }   // TODO add your handling code here:
    }//GEN-LAST:event_build_towerActionPerformed

    private void build_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_houseActionPerformed
        if ((Player_1.getMoney() >= new house().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new house().price_by_cash && pay_by_cash.isSelected()) {
            house_site.setVisible(true);

            BuildingIsChosen();
            Player_1.Town.Builds[4] = new house();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            house_site.setIcon(icon1);
            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[4].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[4].price_by_cash;
                Player_1.setcash(m);
            }
            build_house.setEnabled(false);
            start_building(4);
            Player_1.inc_experience(45);
            update_bar();
            d_8.setVisible(true);
            l_8 = new house().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_8.setVisible(false);
                        build_8.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 4) {
                        d_8.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();
        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }

        } // TODO add your handling code here:
    }//GEN-LAST:event_build_houseActionPerformed

    private void build_suger_shActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_suger_shActionPerformed
        if ((Player_1.getMoney() >= new suger_shop().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new suger_shop().price_by_cash && pay_by_cash.isSelected()) {
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            suger_sh_build.setIcon(icon1);
            suger_sh_build.setVisible(true);

            BuildingIsChosen();
            Player_1.Town.Builds[5] = new suger_shop();

            if (pay_by_coin.isSelected()) {
                int m = Player_1.getMoney() - Player_1.Town.Builds[5].price;
                Player_1.setMoney(m);
            } else {
                int m = Player_1.getCash() - Player_1.Town.Builds[5].price_by_cash;
                Player_1.setcash(m);
            }

            build_suger_sh.setEnabled(false);
            start_building(5);
            d_5.setVisible(true);
            Player_1.inc_experience(35);
            update_bar();
            l_8 = new suger_shop().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_5.setVisible(false);
                        build_7.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 5) {
                        d_5.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }

        }

// TODO add your handling code here:
    }//GEN-LAST:event_build_suger_shActionPerformed

    private void suger_sh_buildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suger_sh_buildActionPerformed
        close();
        if (f.available()) {
            container.setVisible(true);
            current_p1 = 4;
            set_produce_p1_icon(current_p1, false);
            current_p2 = 8;
            produce_p1.setLocation(710, 920);
            produce_p1.setVisible(true);

            set_produce_p2_icon(current_p2, false);
            produce_p2.setVisible(true);

            update_bar();
        }// TODO add your handling code here:
    }//GEN-LAST:event_suger_sh_buildActionPerformed

    public void accept_order(int i) {
        if (customer_list[i].oders_valid()) {
            update_bar();
            customer_list[i] = new orders();
            detail(false);
            order_frame.setVisible(false);
            close();
        } else {
            JOptionPane.showMessageDialog(this, "you do not have required items", "Alert", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void order_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_1ActionPerformed
        // TODO add your handling code here:
        orderIschosen();
        g = 0;
        show_items(0);
        given(true);
        //accept_order(0);
        //order_1.setText(order_list[0].show_items());

    }//GEN-LAST:event_order_1ActionPerformed

    private void order_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_2ActionPerformed
        // TODO add your handling code here:
        orderIschosen();
        g = 1;
        show_items(1);
        given(true);

        //accept_order(1);
        //order_2.setText(order_list[1].show_items());

    }//GEN-LAST:event_order_2ActionPerformed

    private void order_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_3ActionPerformed
        // TODO add your handling code here:
        orderIschosen();
        g = 2;
        show_items(2);
        given(true);
        //accept_order(2);
        //order_3.setText(order_list[2].show_items());


    }//GEN-LAST:event_order_3ActionPerformed

    private void order_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_4ActionPerformed
        // TODO add your handling code here:
        orderIschosen();
        g = 3;
        show_items(3);
        given(true);
        //accept_order(3);
        //order_4.setText(order_list[3].show_items());


    }//GEN-LAST:event_order_4ActionPerformed

    private void order_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_5ActionPerformed
        // TODO add your handling code here:
        orderIschosen();
        show_items(4);
        g = 4;
        given(true);
        //accept_order(4);
        //order_5.setText(order_list[4].show_items());


    }//GEN-LAST:event_order_5ActionPerformed

    private void forwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardActionPerformed
        // TODO add your handling code here:
        back.setVisible(true);
        forward.setVisible(false);
        store_elements_1(false);
        store_elements_2(true);
    }//GEN-LAST:event_forwardActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        back.setVisible(false);
        forward.setVisible(true);
        store_elements_1(true);
        store_elements_2(false); // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        if (back_ground.isShowing()) {
            Icon light = new ImageIcon("src/com/company/assets/back_li.png");
            back.setIcon(light);
        }  // TODO add your handling code here:
    }//GEN-LAST:event_backMouseEntered

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        if (back_ground.isShowing()) {
            Icon pre = new ImageIcon("src/com/company/assets/back_pre.png");
            back.setIcon(pre);
            music("a");
        }   // TODO add your handling code here:
    }//GEN-LAST:event_backMousePressed

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        if (back_ground.isShowing()) {
            Icon normal = new ImageIcon("src/com/company/assets/back.png");
            back.setIcon(normal);
        } // TODO add your handling code here:
    }//GEN-LAST:event_backMouseExited

    private void forwardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardMouseExited
        if (back_ground.isShowing()) {
            Icon normal = new ImageIcon("src/com/company/assets/forward.png");
            forward.setIcon(normal);
        }   // TODO add your handling code here:
    }//GEN-LAST:event_forwardMouseExited

    private void forwardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardMousePressed
        if (back_ground.isShowing()) {
            Icon pre = new ImageIcon("src/com/company/assets/forward_pre.png");
            forward.setIcon(pre);
            music("a");
        }  // TODO add your handling code here:
    }//GEN-LAST:event_forwardMousePressed

    private void forwardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardMouseEntered
        if (back_ground.isShowing()) {
            Icon light = new ImageIcon("src/com/company/assets/forward_li.png");
            forward.setIcon(light);

        }   // TODO add your handling code here:
    }//GEN-LAST:event_forwardMouseEntered

    private void build_chicken_coopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_chicken_coopActionPerformed
        if ((Player_1.getMoney() >= new chicken_coop().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new chicken_coop().price_by_cash && pay_by_cash.isSelected()) {
            Player_1.Town.Builds[8] = new chicken_coop();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            chicken_coop.setIcon(icon1);

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[8].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[8].price_by_cash;
                Player_1.setcash(m);
            }
            chicken_coop.setVisible(true);
            BuildingIsChosen();
            Player_1.inc_experience(40);
            d_4.setVisible(true);
            build_chicken_coop.setEnabled(false);
            start_building(8);
            l_8 = new chicken_coop().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_4.setVisible(false);
                        build_2.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 8) {
                        d_4.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();
            update_bar();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        }  // TODO add your handling code here:
    }//GEN-LAST:event_build_chicken_coopActionPerformed

    private void build_schoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_schoolActionPerformed

        if ((Player_1.getMoney() >= new school().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new school().price_by_cash && pay_by_cash.isSelected()) {
            Player_1.Town.Builds[9] = new school();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            school_build.setIcon(icon1);

            if (pay_by_coin.isSelected()) {
                int m = Player_1.getMoney() - Player_1.Town.Builds[9].price;
                Player_1.setMoney(m);
            } else {
                int m = Player_1.getCash() - Player_1.Town.Builds[9].price_by_cash;
                Player_1.setcash(m);
            }

            school_build.setVisible(true);
            BuildingIsChosen();
            d_6.setVisible(true);
            Player_1.inc_experience(80);
            build_school.setEnabled(false);
            start_building(9);

            update_bar();
            l_8 = new school().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_6.setVisible(false);
                        build_3.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 9) {
                        d_6.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }   // TODO add your handling code here:
    }//GEN-LAST:event_build_schoolActionPerformed

    private void build_football_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_football_clubActionPerformed
        if ((Player_1.getMoney() >= new football_club().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new football_club().price_by_cash && pay_by_cash.isSelected()) {
            Player_1.Town.Builds[10] = new football_club();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            football_build.setIcon(icon1);

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[10].price;
                Player_1.setMoney(m);
            } else {
                int m = Player_1.getCash() - Player_1.Town.Builds[10].price_by_cash;
                Player_1.setcash(m);
            }
            football_build.setVisible(true);
            BuildingIsChosen();
            Player_1.inc_experience(70);
            build_football_club.setEnabled(false);
            start_building(10);
            d_12.setVisible(true);
            update_bar();
            l_8 = new football_club().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_12.setVisible(false);
                        build_11.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 10) {
                        d_12.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }   // TODO add your handling code here:
    }//GEN-LAST:event_build_football_clubActionPerformed

    private void build_clubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_clubActionPerformed
        if ((Player_1.getMoney() >= new club().price && pay_by_coin.isSelected()) || Player_1.getCash() >= new club().price_by_cash && pay_by_cash.isSelected()) {
            Player_1.Town.Builds[11] = new club();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            club_build.setIcon(icon1);

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[11].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[11].price_by_cash;
                Player_1.setcash(m);
            }
            club_build.setVisible(true);
            BuildingIsChosen();
            Player_1.inc_experience(65);
            build_club.setEnabled(false);
            start_building(11);
            d_2.setVisible(true);
            update_bar();
            l_8 = new club().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_2.setVisible(false);
                        build_5.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 11) {
                        d_2.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }    // TODO add your handling code here:
    }//GEN-LAST:event_build_clubActionPerformed

    private void build_mallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_mallActionPerformed
        if ((Player_1.getMoney() >= new mall().price && pay_by_coin.isSelected()) || (Player_1.getCash() >= new mall().price_by_cash && pay_by_cash.isSelected())) {
            Player_1.Town.Builds[12] = new mall();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            mall_build.setIcon(icon1);

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[12].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[12].price_by_cash;
                Player_1.setcash(m);
            }
            mall_build.setVisible(true);
            BuildingIsChosen();
            Player_1.inc_experience(75);
            build_mall.setEnabled(false);
            start_building(12);
            d_9.setVisible(true);
            update_bar();
            l_8 = new mall().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_9.setVisible(false);
                        build_9.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 12) {
                        d_9.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }   // TODO add your handling code here:
    }//GEN-LAST:event_build_mallActionPerformed

    private void build_cottageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_cottageActionPerformed
        if ((Player_1.getMoney() >= new cottage().price && pay_by_coin.isSelected()) || (Player_1.getCash() >= new cottage().price_by_cash && pay_by_cash.isSelected())) {
            Player_1.Town.Builds[13] = new cottage();
            Icon icon1 = new ImageIcon(("src/com/company/assets/opp.png"));
            cottage_build.setIcon(icon1);

            if (pay_by_coin.isSelected()) {

                int m = Player_1.getMoney() - Player_1.Town.Builds[13].price;
                Player_1.setMoney(m);
            } else {

                int m = Player_1.getCash() - Player_1.Town.Builds[13].price_by_cash;
                Player_1.setcash(m);
            }
            cottage_build.setVisible(true);
            BuildingIsChosen();
            d_1.setVisible(true);
            Player_1.inc_experience(40);
            build_cottage.setEnabled(false);
            start_building(13);

            update_bar();
            l_8 = new cottage().getTime_To_Build();
            h = new Timer(1000, new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent ae) {
                    if (l_8 < 0) {

                        d_1.setVisible(false);
                        build_6.setVisible(true);
                        h.stop();
                    }
                    if (builder_situation == 13) {
                        d_1.setText(l_8 + "Seconds");
                        l_8--;
                    }

                }

            });
            h.start();

        } else {

            if (pay_by_coin.isSelected()) {

                if (pay_by_coin.isSelected()) {
                    JOptionPane.showMessageDialog(this, "you do not have enough money", "Alert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "you do not have enough coin", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }

        }    // TODO add your handling code here:
    }//GEN-LAST:event_build_cottageActionPerformed


    private void pay_by_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_by_cashActionPerformed
        setLabel_1(2);
        setLabel_2(2);
         Icon normal = new ImageIcon("src/com/company/assets/store_window-.png");
        back_ground.setIcon(normal);
       // TODO add your handling code here:*/
    }//GEN-LAST:event_pay_by_cashActionPerformed

    private void soil_cottonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_cottonMouseEntered

        Icon big = new ImageIcon("src/com/company/assets/2_e.png");
        soil_cotton.setIcon(big);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_cottonMouseEntered

    private void soil_cottonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_cottonMouseExited

        Icon normal = new ImageIcon("src/com/company/assets/2.png");
        soil_cotton.setIcon(normal);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_cottonMouseExited

    private void soil_wheatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_wheatMouseEntered

        Icon big = new ImageIcon("src/com/company/assets/1_e.png");
        soil_wheat.setIcon(big);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_wheatMouseEntered

    private void soil_wheatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_wheatMouseExited

        Icon normal = new ImageIcon("src/com/company/assets/1.png");
        soil_wheat.setIcon(normal);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_wheatMouseExited

    private void soil_cottonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_cottonMousePressed
        music("a"); // TODO add your handling code here:
    }//GEN-LAST:event_soil_cottonMousePressed

    private void soil_wheatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_wheatMousePressed
        music("a");  // TODO add your handling code here:
    }//GEN-LAST:event_soil_wheatMousePressed

    private void soil_sugercaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_sugercaneMouseEntered

        Icon big = new ImageIcon("src/com/company/assets/5_e.png");
        soil_sugercane.setIcon(big);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_sugercaneMouseEntered

    private void soil_sugercaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_sugercaneMouseExited

        Icon normal = new ImageIcon("src/com/company/assets/5.png");
        soil_sugercane.setIcon(normal);
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_sugercaneMouseExited

    private void soil_sugercaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soil_sugercaneMousePressed
        music("a");// TODO add your handling code here:
    }//GEN-LAST:event_soil_sugercaneMousePressed

    private void soil_sugercaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soil_sugercaneActionPerformed
        planting(new storage().Product[5].getPrice(), 5);
        soil_elements(false);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (back_button.isShowing()) {
                    duration.setVisible(false);
                }

                duration.setText(min + "Seconds left");
                min--;
                if (min == 0) {
                    timer.stop();
                    duration.setText("available");
                    min = 59;
                }
            }

        });
        timer.start();
        // TODO add your handling code here:
    }//GEN-LAST:event_soil_sugercaneActionPerformed

    private void Green_backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Green_backgroundMousePressed
        if (!name_warning.isShowing() && !back_button.isShowing()) {
            soil_elements(false);
            close();
            level_up.setVisible(false);
            up_level.setVisible(false);
            cash_rew.setVisible(false);
            coin_rew.setVisible(false);
            produce_p1.setLocation(710, 920);// TODO add your handling code here:
        }
    }//GEN-LAST:event_Green_backgroundMousePressed

    private void pay_by_coinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pay_by_coinActionPerformed
        setLabel_1(1);
        setLabel_2(1);
         Icon normal = new ImageIcon("src/com/company/assets/store_window.png");
        back_ground.setIcon(normal);
        // TODO add your handling code here:
    }//GEN-LAST:event_pay_by_coinActionPerformed

    private void pay_by_cashMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pay_by_cashMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_pay_by_cashMousePressed

    private void pay_by_coinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pay_by_coinMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_pay_by_coinMousePressed

    private void bakery_build1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bakery_build1MouseEntered
        // TODO add your handling code here:
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && bakery_build1.isEnabled()) {
            Icon light = new ImageIcon("src/com/company/assets/baker_li.png");
            bakery_build1.setIcon(light);
            f = (Factory) (Player_1.Town.Builds[1]);
            f.produce_finished();

        }

    }//GEN-LAST:event_bakery_build1MouseEntered

    private void accept_orActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accept_orActionPerformed

        accept_order(g);

        // TODO add your handling code here:
    }//GEN-LAST:event_accept_orActionPerformed

    private void chicken_coopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken_coopActionPerformed

        if (f.available()) {
            close();
            small.setVisible(true);
            current_p1 = 6;
            set_produce_p1_icon(current_p1, false);
            produce_p1.setLocation(890, 910);
            produce_p1.setVisible(true);

            update_bar();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_chicken_coopActionPerformed

    private void cloth_build_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloth_build_1MouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && cloth_build_1.isEnabled()) {
            Icon light = new ImageIcon("src/com/company/assets/cloth_li.png");
            cloth_build_1.setIcon(light);
            f = (Factory) (Player_1.Town.Builds[0]);
            f.produce_finished();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cloth_build_1MouseEntered

    private void suger_sh_buildMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suger_sh_buildMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && suger_sh_build.isEnabled()) {
            Icon light = new ImageIcon("src/com/company/assets/suger_li.png");
            suger_sh_build.setIcon(light);
            f = (Factory) (Player_1.Town.Builds[5]);
            f.produce_finished();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_suger_sh_buildMouseEntered

    private void sweet_buildMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sweet_buildMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && sweet_build.isEnabled()) {
            Icon light = new ImageIcon("src/com/company/assets/sweet_li.png");
            sweet_build.setIcon(light);
            f = (Factory) (Player_1.Town.Builds[2]);
            f.produce_finished();

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_sweet_buildMouseEntered

    private void chicken_coopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chicken_coopMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && chicken_coop.isEnabled()) {
            Icon light = new ImageIcon("src/com/company/assets/ch_li.png");
            chicken_coop.setIcon(light);
            f = (Factory) (Player_1.Town.Builds[8]);
            f.produce_finished();

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_chicken_coopMouseEntered

    private void produce_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produce_p1ActionPerformed
        // TODO add your handling code here:
        if (f.produce(1)) {
            //update_bar();
            Player_1.inc_experience(10);
            update_bar();
            produce_p1.setLocation(710, 920);
            close();
        } else {
            JOptionPane.showMessageDialog(this, "you do not have enough", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_produce_p1ActionPerformed

    private void produce_p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produce_p1MouseEntered
        // TODO add your handling code here:
        set_produce_p1_icon(current_p1, true);


    }//GEN-LAST:event_produce_p1MouseEntered

    private void produce_p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produce_p1MouseExited
        // TODO add your handling code here:
        set_produce_p1_icon(current_p1, false);


    }//GEN-LAST:event_produce_p1MouseExited

    private void produce_p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produce_p2MouseEntered
        // TODO add your handling code here:
        set_produce_p2_icon(current_p2, true);


    }//GEN-LAST:event_produce_p2MouseEntered

    private void produce_p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produce_p2MouseExited
        // TODO add your handling code here:

        set_produce_p2_icon(current_p2, false);

    }//GEN-LAST:event_produce_p2MouseExited

    private void produce_p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produce_p2ActionPerformed
        // TODO add your handling code here:
        if (f.produce(2)) {
            //update_bar();
            Player_1.inc_experience(10);
            update_bar();
            close();
        } else {
            JOptionPane.showMessageDialog(this, "you do not have enough", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_produce_p2ActionPerformed

    private void build_1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_build_1KeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_build_1KeyPressed

    private void build_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_1MousePressed

        if (builder_situation != -1) {
            finish_build();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_build_1MousePressed

    private void build_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_build_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_build_10ActionPerformed

    private void build_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_2MousePressed
        if (builder_situation != -1) {
            finish_build();
        }  // TODO add your handling code here:
    }//GEN-LAST:event_build_2MousePressed

    private void build_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_3MousePressed
        if (builder_situation != -1) {
            finish_build();
        }    // TODO add your handling code here:
    }//GEN-LAST:event_build_3MousePressed

    private void build_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_4MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_4MousePressed

    private void build_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_5MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_5MousePressed

    private void build_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_6MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_6MousePressed

    private void build_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_7MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_7MousePressed

    private void build_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_8MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_8MousePressed

    private void build_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_9MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_9MousePressed

    private void build_10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_10MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_10MousePressed

    private void build_11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_11MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_11MousePressed

    private void build_12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_build_12MousePressed
        if (builder_situation != -1) {
            finish_build();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_build_12MousePressed

    private void accept_orMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accept_orMousePressed
        Icon big = new ImageIcon("src/com/company/assets/send_e.png");
        accept_or.setIcon(big);  // TODO add your handling code here:
    }//GEN-LAST:event_accept_orMousePressed

    private void accept_orMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accept_orMouseExited
        Icon normal = new ImageIcon("src/com/company/assets/send.png");
        accept_or.setIcon(normal); // TODO add your handling code here:
    }//GEN-LAST:event_accept_orMouseExited

    private void cloth_build_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloth_build_1MousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && cloth_build_1.isEnabled()) {
            Icon pre = new ImageIcon("src/com/company/assets/cloth_pre.png");
            cloth_build_1.setIcon(pre);
            music("b");

        }  // TODO add your handling code here:
    }//GEN-LAST:event_cloth_build_1MousePressed

    private void chicken_coopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chicken_coopMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && chicken_coop.isEnabled()) {
            Icon pre = new ImageIcon("src/com/company/assets/ch_pre.png");
            chicken_coop.setIcon(pre);
            music("b");

        }  // TODO add your handling code here:
    }//GEN-LAST:event_chicken_coopMousePressed

    private void sweet_buildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sweet_buildMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && sweet_build.isEnabled()) {
            Icon pre = new ImageIcon("src/com/company/assets/sweet_pre.png");
            sweet_build.setIcon(pre);
            music("b");

        }  // TODO add your handling code here:
    }//GEN-LAST:event_sweet_buildMousePressed

    private void suger_sh_buildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suger_sh_buildMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && suger_sh_build.isEnabled()) {
            Icon pre = new ImageIcon("src/com/company/assets/suger_pre.png");
            suger_sh_build.setIcon(pre);
            music("b");

        }         // TODO add your handling code here:
    }//GEN-LAST:event_suger_sh_buildMousePressed

    private void bakery_build1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bakery_build1MousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing() && bakery_build1.isEnabled()) {
            Icon pre = new ImageIcon("src/com/company/assets/baker_pre.png");
            bakery_build1.setIcon(pre);
            music("b");

        }         // TODO add your handling code here:
    }//GEN-LAST:event_bakery_build1MousePressed

    private void bakery_build1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bakery_build1MouseExited
        if (bakery_build1.isEnabled()) {
            Icon op = new ImageIcon("src/com/company/assets/baker6_.png");
            bakery_build1.setIcon(op);
        }// TODO add your handling code here:
    }//GEN-LAST:event_bakery_build1MouseExited

    private void chicken_coopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chicken_coopMouseExited
        if (chicken_coop.isEnabled()) {
            Icon op = new ImageIcon("src/com/company/assets/ch_e.png");
            chicken_coop.setIcon(op);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_chicken_coopMouseExited

    private void sweet_buildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sweet_buildMouseExited
        if (sweet_build.isEnabled()) {
            Icon op = new ImageIcon("src/com/company/assets/sweet.png");
            sweet_build.setIcon(op);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_sweet_buildMouseExited

    private void suger_sh_buildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suger_sh_buildMouseExited
        if (suger_sh_build.isEnabled()) {
            Icon op = new ImageIcon("src/com/company/assets/suger_sh.png");
            suger_sh_build.setIcon(op);
        }// TODO add your handling code here:
    }//GEN-LAST:event_suger_sh_buildMouseExited

    private void cloth_build_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cloth_build_1MouseExited
        if (cloth_build_1.isEnabled()) {
            Icon op = new ImageIcon("src/com/company/assets/cloth_front.png");
            cloth_build_1.setIcon(op);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cloth_build_1MouseExited

    private void head_BuildMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head_BuildMouseEntered
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing()) {
            Icon light = new ImageIcon("src/com/company/assets/head_li.png");
            head_Build.setIcon(light);

        }  // TODO add your handling code here:
    }//GEN-LAST:event_head_BuildMouseEntered

    private void head_BuildMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head_BuildMouseExited
        Icon op = new ImageIcon("src/com/company/assets/buildingTiles_100.png");
        head_Build.setIcon(op); // TODO add your handling code here:
    }//GEN-LAST:event_head_BuildMouseExited

    private void head_BuildMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_head_BuildMousePressed
        if (!option_manu.isShowing() && !back_button.isShowing() && !container.isShowing() && !small.isShowing()) {
            Icon pre = new ImageIcon("src/com/company/assets/head_pre.png");
            head_Build.setIcon(pre);
            music("b");

        }        // TODO add your handling code here:
    }//GEN-LAST:event_head_BuildMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_game().setVisible(true);

            }
        });
    }

    public void update_bar() {
        bar.setText(Player_1.getName() + "'s town");
        money_amount1.setText("" + Player_1.getMoney());
        cash_amount.setText("" + Player_1.getCash());

    }

    orders[] customer_list = new orders[5];

    Date start_plant;
    Date end_plant;
    Date start_building;
    Date end_building;
    Factory f;
    String Player_name;
    int current_plant;
    int builder_situation = -1;
    int current_p1;
    int current_p2;
    public static player Player_1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ask_name_back_ground;
    private javax.swing.JButton Build;
    private javax.swing.JLabel Build_lab;
    private javax.swing.JProgressBar Ex_bar;
    private javax.swing.JLabel Green_background;
    private javax.swing.JButton No_button;
    private javax.swing.ButtonGroup Pay_method;
    private javax.swing.JLabel Town_name;
    private javax.swing.JButton Yes_button;
    private javax.swing.JButton accept_name;
    private javax.swing.JButton accept_or;
    private javax.swing.JButton back;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel back_ground;
    private javax.swing.JButton bakery_build1;
    private javax.swing.JLabel bakery_lab;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel barn;
    private javax.swing.JLabel bread_amount;
    private javax.swing.JLabel bread_icon;
    private javax.swing.JButton build_1;
    private javax.swing.JButton build_10;
    private javax.swing.JButton build_11;
    private javax.swing.JButton build_12;
    private javax.swing.JButton build_2;
    private javax.swing.JButton build_3;
    private javax.swing.JButton build_4;
    private javax.swing.JButton build_5;
    private javax.swing.JButton build_6;
    private javax.swing.JButton build_7;
    private javax.swing.JButton build_8;
    private javax.swing.JButton build_9;
    private javax.swing.JButton build_bakery;
    private javax.swing.JButton build_chicken_coop;
    private javax.swing.JButton build_cloth;
    private javax.swing.JButton build_club;
    private javax.swing.JButton build_cottage;
    private javax.swing.JButton build_football_club;
    private javax.swing.JButton build_house;
    private javax.swing.JButton build_mall;
    private javax.swing.JButton build_school;
    private javax.swing.JButton build_suger_sh;
    private javax.swing.JButton build_sweet;
    private javax.swing.JButton build_tower;
    private javax.swing.JLabel c_bar1;
    private javax.swing.JLabel cash_amount;
    private javax.swing.JLabel cash_rew;
    private javax.swing.JButton chicken_coop;
    private javax.swing.JLabel chicken_lab;
    private javax.swing.JButton cloth_build_1;
    private javax.swing.JLabel cloth_lab;
    private javax.swing.JLabel club_build;
    private javax.swing.JLabel club_lab;
    private javax.swing.JLabel coin_bar;
    private javax.swing.JLabel coin_rew;
    private javax.swing.JLabel container;
    private javax.swing.JLabel coton_amount;
    private javax.swing.JLabel cottage_build;
    private javax.swing.JLabel cottage_lab;
    private javax.swing.JLabel cotton_icon;
    private javax.swing.JLabel d_1;
    private javax.swing.JLabel d_10;
    private javax.swing.JLabel d_11;
    private javax.swing.JLabel d_12;
    private javax.swing.JLabel d_2;
    private javax.swing.JLabel d_3;
    private javax.swing.JLabel d_4;
    private javax.swing.JLabel d_5;
    private javax.swing.JLabel d_6;
    private javax.swing.JLabel d_7;
    private javax.swing.JLabel d_8;
    private javax.swing.JLabel d_9;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel flour_amount;
    private javax.swing.JLabel flour_icon;
    private javax.swing.JLabel football_build;
    private javax.swing.JLabel football_lab;
    private javax.swing.JButton forward;
    private javax.swing.JButton head_Build;
    private javax.swing.JLabel house_lab;
    private javax.swing.JLabel house_site;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j10;
    private javax.swing.JLabel j11;
    private javax.swing.JLabel j12;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel j6;
    private javax.swing.JLabel j7;
    private javax.swing.JLabel j8;
    private javax.swing.JLabel j9;
    private javax.swing.JLabel j_1;
    private javax.swing.JLabel j_2;
    private javax.swing.JLabel j_3;
    private javax.swing.JLabel j_4;
    private javax.swing.JLabel j_5;
    private javax.swing.JLabel j_6;
    private javax.swing.JLabel j_7;
    private javax.swing.JLabel j_8;
    private javax.swing.JLabel j_9;
    private javax.swing.JLabel level;
    private javax.swing.JLabel level_up;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mall_build;
    private javax.swing.JLabel mall_lab;
    private javax.swing.JLabel mbar;
    private javax.swing.JLabel money_amount1;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel name_warning;
    private javax.swing.JButton name_warning_ok;
    private javax.swing.JLabel no;
    private javax.swing.JLabel o_1;
    private javax.swing.JLabel o_2;
    private javax.swing.JLabel o_3;
    private javax.swing.JLabel o_4;
    private javax.swing.JLabel o_5;
    private javax.swing.JLabel o_6;
    private javax.swing.JLabel o_7;
    private javax.swing.JLabel o_8;
    private javax.swing.JLabel o_9;
    private javax.swing.JLabel option_manu;
    private javax.swing.JButton options;
    private javax.swing.JButton order_1;
    private javax.swing.JLabel order_1_lab;
    private javax.swing.JButton order_2;
    private javax.swing.JLabel order_2_lab;
    private javax.swing.JButton order_3;
    private javax.swing.JLabel order_3_lab;
    private javax.swing.JButton order_4;
    private javax.swing.JLabel order_4_lab;
    private javax.swing.JButton order_5;
    private javax.swing.JLabel order_5_lab;
    private javax.swing.JLabel order_ex;
    private javax.swing.JLabel order_frame;
    private javax.swing.JLabel order_price;
    private javax.swing.JLabel orders;
    private javax.swing.JRadioButton pay_by_cash;
    private javax.swing.JRadioButton pay_by_coin;
    private javax.swing.JButton produce_p1;
    private javax.swing.JButton produce_p2;
    private javax.swing.JLabel school_build;
    private javax.swing.JLabel school_label;
    private javax.swing.JLabel small;
    private javax.swing.JButton soil_cotton;
    private javax.swing.JButton soil_house;
    private javax.swing.JButton soil_sugercane;
    private javax.swing.JButton soil_wheat;
    private javax.swing.JLabel star;
    private javax.swing.JButton storage_build;
    private javax.swing.JButton suger_sh_build;
    private javax.swing.JLabel suger_sh_lab;
    private javax.swing.JButton sweet_build;
    private javax.swing.JLabel sweet_lab;
    private javax.swing.JLabel t_shirt_amount;
    private javax.swing.JLabel t_shirt_icon;
    private javax.swing.JLabel tower_lab;
    private javax.swing.JLabel tower_site;
    private javax.swing.JLabel up_level;
    private javax.swing.JLabel wheat_am;
    private javax.swing.JLabel yes;
    // End of variables declaration//GEN-END:variables
}
