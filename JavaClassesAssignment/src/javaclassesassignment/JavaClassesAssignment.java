/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassesassignment;

import java.util.Scanner;

/**
 *
 * @author Breakthru
 */
public class JavaClassesAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Run run = new Run();
        Swim swim = new Swim();
        Soccer soccer = new Soccer();
        
        System.out.printf("To Run enter 1%nTo Swim enter 2%nTo Play Soccer enter 3%n");
        int value = input.nextInt();
        switch(value){
            case 1 : 
                System.out.println("For Hundred Meters enter 1\nFor Cross Country enter 2");
                int value2 = input.nextInt();
                if (value2 == 1) {
                  run.hundredMeters();
                }else if(value2 == 2){
                    run.crossCountry();
                }else{
                    System.out.println("Invalid Option");
                }
                break;
                case 2 : 
                System.out.println("For Back Stroke enter 1\nFor Butterfly enter 2");
                int value3 = input.nextInt();
                if (value3 == 1) {
                  swim.backStroke();
                }else if(value3 == 2){
                    swim.butterfly();
                }else{
                    System.out.println("Invalid Option");
                }
                break;
                case 3 : 
                System.out.println("For Rugby enter 1\nFor Football enter 2");
                int value4 = input.nextInt();
                if (value4 == 1) {
                  soccer.rugby();
                }else if(value4 == 2){
                    soccer.football();
                }else{
                    System.out.println("Invalid Option");
                }
                break;
                default:
                    System.out.println("Select a valid Option");
                    break;
        }
    }
    
}
