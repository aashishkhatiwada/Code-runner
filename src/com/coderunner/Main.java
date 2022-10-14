package com.coderunner;
import java.util.Scanner;
public class Main {
    private static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("enter any command to check if the code runner is running: \n");
int command  = scanner.nextInt();
String running = getRunningMessage(command);
System.out.println(running);
    }
    private static String getRunningMessage(int command) {
        if(command  == 0) return "coderunner  running north";
        else if(command == 1) return "coderunner running south";
else if(command == 2) return "coderunner running west";
else if(command== 3) return "coderunner running east";
else if((command< 0)||(command >= 4)) return "coderunner is confused - doesn't know where to go";
else return "unknown command";
    }
}