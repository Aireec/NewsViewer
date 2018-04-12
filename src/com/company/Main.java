package com.company;

import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends selections {

    public Main() {
    }

    public static void main(String[] args) {

        //Greeting
        System.out.println("Hello");

        //Ask while news
        System.out.println("Which news would you like to see");

        selections choices = new selections();
        choices.selections();
        
        //Scanner to ask for user input
        Scanner Question = new Scanner(System.in);
       String answer = Question.next();

        //Switch statement for Choices

        switch (answer){
            //Sport case
            case "Sport" :
                try {
                    Desktop sport = Desktop.getDesktop();
                    URI Sports = new URI("https://www.supersport.com/live.aspx");
                    sport.browse(Sports);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
//Crime case
            case "Crime" :
                try {
                    Desktop crime = Desktop.getDesktop();
                    URI Crime = new URI("https://www.news24.com/Tags/Topics/crime");
                    crime.browse(Crime);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
//Gaming case
            case "Gaming" :
                try {
                    Desktop gaming = Desktop.getDesktop();
                    URI Gaming = new URI("https://www.gamespot.com/news/");
                    gaming.browse(Gaming);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
//Politics case
            case "Politics" :
                try {
                    Desktop politics = Desktop.getDesktop();
                    URI Politics = new URI("https://www.news24.com/SouthAfrica/Politics");
                    politics.browse(Politics);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
//Celebrity case
            case "Celebrity" :
                try {
                    Desktop celebrity = Desktop.getDesktop();
                    URI Celebrity = new URI("https://www.channel24.co.za/Gossip");
                    celebrity.browse(Celebrity);
                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;


        }


    }

}