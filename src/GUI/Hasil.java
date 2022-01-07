/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Fajar
 */
public class Hasil extends Mhs {
    double rata;
 char grade;
 String hasil;
 
 public Hasil ()
 { }
 
 public Hasil (String nama, int tugas, int uts, int uas)
 {
 super (nama, tugas, uts, uas);
 }
 
 public double getRata ()
 {
 return (tugas*(float)(0.25)) + (uts*(float)(0.35)) + (uas*(float)(0.4));
 }
 
 public char getGrade ()
 {
 char g;
 if (getRata() >= 80)
 {
 g = 'A';
 }
 else if (getRata() >= 70)
 {
 g = 'B';
 }
 else if (getRata() >= 60)
 {
 g = 'C';
 }
 else if (getRata() >= 50)
 {
 g = 'D';
 }
 else g = 'E';
 return g;
}
 
 public String getHasil ()
 {
 String hasil = "";
 if ( (getGrade() == 'A') ||
 (getGrade() == 'B') ||
 (getGrade() == 'C') )
 hasil = "LULUS";
 else hasil = "TIDAK LULUS";
 return hasil;
 }
}
