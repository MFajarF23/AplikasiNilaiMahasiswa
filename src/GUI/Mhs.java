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
public class Mhs {
    String nama;
 int tugas;
 int uts;
 int uas;
 public Mhs()
 { }
 public Mhs (String nama, int tugas, int uts, int uas)
 {
 this.nama = nama;
 this.tugas = tugas;
 this.uts = uts;
 this.uas = uas;
 }
 
 public String getNama ()
 {
 return nama;
 }
 public void setNama (String nama)
 {
 this.nama = nama;
 }
 
 public int getTUGAS ()
 {
 return tugas;
 }
 public void setTUGAS (int tugas)
 {
 this.tugas = tugas;
 }
 
 public int getUTS ()
 {
 return uts;
 }
 public void setUTS (int uts)
 {
 this.uts = uts;
 }
 
 public int getUAS ()
 {
 return uas;
 }
 public void setUAS (int uas)
{
 this.uas = uas;
 }
}
