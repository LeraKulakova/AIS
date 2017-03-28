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
public class Pi {
    static double pi;
static void leibnic(){
for(double i=1;i<100000000;i+=1){
if (i%2==0){
pi-=1/(2*i-1);
}else{
pi+=1/(2*i-1);
}
}
System.out.print("\nЧисло Пи, подсчитанное по методу Лейбница равно: "+pi);
}
static void vallis(){
double pi1=1, pi2=1;
for(double i=2;i<100000000;i+=2){
pi1*=i/(i+1);
pi2*=i/(i-1);
}
pi=pi1*pi2*2;
System.out.print("\nЧисло Пи, подсчитанное по методу Валлиса равно: "+pi);
}
public static void main(String[] args) {
leibnic();
vallis();
}
}
