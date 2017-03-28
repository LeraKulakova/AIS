/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Student
 */
public class Sqrt {
    static void sqrt(long a){
double b=a;
int i=0;
while ((b*b>a)&&(i<200)){
b=(b+a/b)/2;
i++;
}
System.out.print(b);
}
public static void main(String[] args) {
sqrt(45);
}
}
