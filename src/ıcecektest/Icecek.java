/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıcecektest;

/**
 *
 * @author lenovo
 */
public abstract class Icecek {
    
    
    final void siparisHazirla(){
        icecekHazirla();
        suyuKaynat(); 
        icerikEkle();           
        demle();
        bardagaKoy();
    }
    
    public void icecekHazirla(){
        System.out.println("İçecek Hazırlanıyor.");
    }
    
    abstract void demle();
    abstract void icerikEkle();

    public void suyuKaynat(){
        System.out.println("Su kaynatılıyor.");
    }
    
    public void bardagaKoy(){
        System.out.println("İçecek bardağa koyuluyor.");
    }
}
