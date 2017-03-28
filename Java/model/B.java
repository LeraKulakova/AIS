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
public class B {
    public static void main(String[] args) {
big_loop:
for (int i = 0; i < 3 ; i++) {
try {
for (int j = 0; j < 3 ; j++) {
if (i == j) continue;
else if (i > j) continue big_loop;
System.out.print("A");
}
} finally {
System.out.print("B");
}
System.out.print("C");
}
}
}

