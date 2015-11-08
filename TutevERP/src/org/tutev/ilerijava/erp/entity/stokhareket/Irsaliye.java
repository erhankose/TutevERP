/**
 * 
 */
package org.tutev.ilerijava.erp.entity.stokhareket;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.tutev.ilerijava.erp.entity.base.Adres;
import org.tutev.ilerijava.erp.entity.base.BaseEntity;

/**
 * @author Bilisim-Hoca
 * 
 */

@Entity
@Table(name = "IRS_IRSALIYE")
public class Irsaliye extends BaseEntity {
	private Long id;
	private String tur;
	private Date tarih;
	private Long firma_id;
	private Adres adres;

    @Id
    @SequenceGenerator(name = "SQ_IRSALIYE",sequenceName = "SQ_IRSALIYE",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "SQ_IRSALIYE",strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(name = "TUR", length = 2)
	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

    @Column(name = "TARIH")
    @Temporal(TemporalType.TIMESTAMP)
	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

    @Column(name = "FIRMA_ID",precision=10,scale=0)
	public Long getFirma_id() {
		return firma_id;
	}

	public void setFirma_id(Long firma_id) {
		this.firma_id = firma_id;
	}

	@Embedded
	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

}
