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
public class ForCycle {
    public static void main(String[] args) {
int tmp = 0;
long tmp2 = 1;
System.out.print("Сумма\t\tПроизведение \n");
for(int i=0;i<10;i++){
tmp += (int)Math.round(Math.random()*10);
tmp2 = tmp2*tmp;
System.out.print(tmp+"\t\t"+tmp2+"\n");
}}
}
