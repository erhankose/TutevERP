package org.tutev.ilerijava.erp.entity.stok;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.tutev.ilerijava.erp.entity.base.BaseEntity;

@Entity
@Table(name = "STOK_KART")
public class StokKart extends BaseEntity{
	  
	  private Long id;
	  String kod ;
	  String urunad;
	  String tanim;
	  String barkod;
	  String paraBirim;
	  Long birimFiyat;
	  
	
	@Id
	@SequenceGenerator(name = "SK_ID",sequenceName = "SK_ID",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator = "SK_ID",strategy = GenerationType.SEQUENCE)
	@Column(name = "SK_ID")  
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "SK_URUN_AD",length = 80)
	public String getUrunad() {
		return urunad;
	}
	public void setUrunad(String urunad) {
		this.urunad = urunad;
	}
	
	@Column(name = "SK_KOD",length = 80)
	public String getKod() {
		return kod;
	}
	public void setKod(String kod) {
		this.kod = kod;
	}
	
	@Column(name = "SK_TANIM",length = 400)
	public String getTaným() {
		return tanim;
	}
	public void setTaným(String tanim) {
		this.tanim = tanim;
	}
	@Column(name = "SK_BARKOD",length = 80)
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}
	
	@Column(name = "SK_PARA_BIRIM",length = 20)
	public String getParaBirim() {
		return paraBirim;
	}
	public void setParaBirim(String paraBirim) {
		this.paraBirim = paraBirim;
	}
	
	@Column(name = "SK_BIRIM_FIYAT",length = 80)
	public Long getBirimFiyat() {
		return birimFiyat;
	}
	public void setBirimFiyat(Long birimFiyat) {
		this.birimFiyat = birimFiyat;
	}


	@Override
	public String toString() {
		return "StokKart [id=" + id + ", kod=" + kod + ", urunad=" + urunad
				+ ", tanim=" + tanim + ", barkod=" + barkod + ", paraBirim="
				+ paraBirim + ", birimFiyat=" + birimFiyat + "]";
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 

}
