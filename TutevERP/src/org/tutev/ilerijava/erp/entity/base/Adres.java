/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tutev.ilerijava.erp.entity.base;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Lob;

/**
 *
 * @author Bilisim-Hoca
 */
@Embeddable
public class Adres implements Serializable {

    String tel;
    String mail;
    String acikAdres;
    String pk;

    @Column(name = "TEL", length = 13)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Column(name = "MAIL", length = 100)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    //    @Lob
    @Column(name = "ACIK_ADRES", length = 400)
    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    @Column(name = "POSTA_KUTUSU", length = 400)
    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

}
