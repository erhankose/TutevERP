/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.tutev.ilerijava.erp.test;

import java.util.Date;
import java.util.List;
import org.tutev.ilerijava.erp.entity.genel.Kisi;
import org.tutev.ilerijava.erp.service.KisiService;

/**
 *
 * @author Bilisim-Hoca
 */
public class Calistirici {
    
    public static void main(String[] args) {
        System.out.println("Uygulama Başladı");
        
        KisiService kisiService=new KisiService();        
        Kisi kisi = kisiService.save(new Kisi(null, "Taner", "TEMEL", new Date()));
        
        kisi.setSoyad("ABC");
        kisiService.update(kisi);
        
        List<Kisi> kisiList= kisiService.getAll();
        
        for (Kisi kisi1 : kisiList) {
            System.out.println(kisi1.toString());
        }
        
        System.out.println("Uygulama bitti \n Veri Eklendi Eklenen Kayıt : " + kisi.toString());
    }
    
}
