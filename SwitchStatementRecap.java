/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatementrecap;

/**
 *
 * @author TafAl
 */
public class SwitchStatementRecap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Grades(1);
        System.out.println(Gradess(67));
    }
    private static void Grades(int grades){
        switch(grades){
            case 1:
                System.out.println("Your final Grade is equal to 1st honours WELL DONE!!");
                break;
            case 2:
                System.out.println("Your grade was a 2.1 feel honoured " + grades);
                break;
            case 3:
                System.out.println("Your grade was a 2.2 with honours good one " + grades);
                break;
            case 4:
                System.out.println("Your grade was a 3rd with honours nice try " + grades);
                break;
            case 5:
                System.out.println("You have Passed below a 3rd" + grades);
                break;
            default:
                System.out.println("Error....");
                break;
        }
        
    }
    private static double Gradess(int grade){
        if(grade == 0){
            return 0;
        }
        else if(grade>= 70){
            return 1;
            
        } else if(grade>=60){
            return 2.1;
        } else if(grade>=50){
            return 2.2;
        }else if (grade>=40){
            return 3;
        }else{
            return -1;
        }
        
    }
}
