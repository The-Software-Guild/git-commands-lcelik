/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class LazyTeenager {
    public static void main(String[] args) {
        
        boolean roomIsDirty = true;
        int requestMade = 0;
        int randomChances = RandomNumber(1, 10); //calling the RandomNumber method
        
        //do-while loop until the room is clean
        do {
            requestMade += 1;
            System.out.println("Clean your room!");
            
            if (requestMade >= 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!!");
                break;
            } else if (requestMade > 7 && requestMade == randomChances) {
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
                roomIsDirty = false;
                break;
            }
            
        } while(roomIsDirty);
        
    }
       
        
        //method for random percentage
        public static int RandomNumber(int s, int e) {
             Random rnd = new Random();
             
             int start = s;
             int end = e;
             int random = rnd.nextInt((end + 1) - start) + start;
             return random;
        }
    }

