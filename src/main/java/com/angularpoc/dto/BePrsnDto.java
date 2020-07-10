/**
 * 
 */
package com.angularpoc.dto;

/**
 * @author RamakrishnanV
 *
 */


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import lombok.Data;


/**
 * @author Venkat
 *         The persistent class for the be_prsn database table.
 */
@Entity
@Data
@Table(schema = "dbo", name = "be_prsn")
public class BePrsnDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prsn_id", nullable = false)
	protected Integer prsnId;

	@Version
	@Column(name = "opt_lck_ctl")
	private Integer optLckCtl=1;

	@Column(name = "rcd_crt_ts")
	private Date rcdCrtTs;

	@Column(name = "rcd_crt_nm", columnDefinition = "CHAR(8)")
	private String rcdCrtNm;
	
	/** The brth dt. */
	@Column(name = "brth_dt")
	private Date brthDt;

	/** The delete in. */
	@Column(name = "delete_in")
	private Short deleteIn;

	/** The deth dt. */
	@Column(name = "deth_dt")
	private Date dethDt;

	/** The dsgtn cd. */
	@Column(name = "dsgtn_cd", columnDefinition = "CHAR(4)")
	private String dsgtnCd;

	/** The fst nm. */
	@Column(name = "fst_nm")
	private String fstNm;

	/** The last nm. */
	@Column(name = "last_nm")
	private String lastNm;

	/** The med of comm. */
	@Column(name = "med_of_comm")
	private String medOfComm;

	/** The member id. */
	@Column(name = "member_id")
	private String memberId;

	/** The mid nm. */
	@Column(name = "mid_nm")
	private String midNm;

	/** The mrg eff dt. */
	@Column(name = "mrg_eff_dt")
	private Date mrgEffDt;

	/** The mrtl stat cd. */
	@Column(name = "mrtl_stat_cd", columnDefinition = "CHAR(4)")
	private String mrtlStatCd;

	/** The nbk id. */
	@Column(name = "nbk_id")
	private Integer nbkId;

	/** The old prsn id. */
	@Column(name = "old_prsn_id", insertable = false, nullable = true)
	private Integer oldPrsnId;

	/** The sex cd. */
	@Column(name = "sex_cd", columnDefinition = "CHAR(4)")
	private String sexCd;

	/** The sfx cd. */
	@Column(name = "sfx_cd", columnDefinition = "CHAR(4)")
	private String sfxCd;

	/** The ss nr. */
	@Column(name = "ss_nr", columnDefinition = "CHAR(9)")
	private String ssNr;

	public BePrsnDto() {
		
	}
	public BePrsnDto(int optLckCtl,String rcdCrtNm,Date rcdCrtTs,String dsgtnCd,String fstNm,String midNm,String lastNm,String sfxCd,String ssNr,Date brthDt,Date dethDt,String sexCd,String mrtlStatCd,int nbkId,int oldPrsnId,short deleteIn,String medOfComm,String memberId,Date mrgEffDt) {
		this.optLckCtl=optLckCtl;
		this.rcdCrtNm=rcdCrtNm;
		this.rcdCrtTs=rcdCrtTs;
		this.dsgtnCd=dsgtnCd;
		this.fstNm=fstNm;
		this.midNm=midNm;
		this.lastNm=lastNm;
		this.sfxCd=sfxCd;
		this.ssNr=ssNr;
		this.brthDt=brthDt;
		this.dethDt=dethDt;
		this.sexCd=sexCd;
		this.mrtlStatCd=mrtlStatCd;
		this.nbkId=nbkId;
		this.oldPrsnId=oldPrsnId;
		this.deleteIn=deleteIn;
		this.medOfComm=medOfComm;
		this.memberId=memberId;
		this.mrgEffDt=mrgEffDt;
	}
	public int getPrsnId() {
		return prsnId;
	}
	public void setPrsnId(int prsnId) {
		this.prsnId = prsnId;
	}
	public int getOptLckCtl() {
		return optLckCtl;
	}
	public void setOptLckCtl(int optLckCtl) {
		this.optLckCtl = optLckCtl;
	}
	public Date getRcdCrtTs() {
		return rcdCrtTs;
	}
	public void setRcdCrtTs(Date rcdCrtTs) {
		this.rcdCrtTs = rcdCrtTs;
	}
	public String getRcdCrtNm() {
		return rcdCrtNm;
	}
	public void setRcdCrtNm(String rcdCrtNm) {
		this.rcdCrtNm = rcdCrtNm;
	}
	public Date getBrthDt() {
		return brthDt;
	}
	public void setBrthDt(Date brthDt) {
		this.brthDt = brthDt;
	}
	public Short getDeleteIn() {
		return deleteIn;
	}
	public void setDeleteIn(Short deleteIn) {
		this.deleteIn = deleteIn;
	}
	public Date getDethDt() {
		return dethDt;
	}
	public void setDethDt(Date dethDt) {
		this.dethDt = dethDt;
	}
	public String getDsgtnCd() {
		return dsgtnCd;
	}
	public void setDsgtnCd(String dsgtnCd) {
		this.dsgtnCd = dsgtnCd;
	}
	public String getFstNm() {
		return fstNm;
	}
	public void setFstNm(String fstNm) {
		this.fstNm = fstNm;
	}
	public String getLastNm() {
		return lastNm;
	}
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}
	public String getMedOfComm() {
		return medOfComm;
	}
	public void setMedOfComm(String medOfComm) {
		this.medOfComm = medOfComm;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMidNm() {
		return midNm;
	}
	public void setMidNm(String midNm) {
		this.midNm = midNm;
	}
	public Date getMrgEffDt() {
		return mrgEffDt;
	}
	public void setMrgEffDt(Date mrgEffDt) {
		this.mrgEffDt = mrgEffDt;
	}
	public String getMrtlStatCd() {
		return mrtlStatCd;
	}
	public void setMrtlStatCd(String mrtlStatCd) {
		this.mrtlStatCd = mrtlStatCd;
	}
	public int getNbkId() {
		return nbkId;
	}
	public void setNbkId(int nbkId) {
		this.nbkId = nbkId;
	}
	public int getOldPrsnId() {
		return oldPrsnId;
	}
	public void setOldPrsnId(int oldPrsnId) {
		this.oldPrsnId = oldPrsnId;
	}
	public String getSexCd() {
		return sexCd;
	}
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}
	public String getSfxCd() {
		return sfxCd;
	}
	public void setSfxCd(String sfxCd) {
		this.sfxCd = sfxCd;
	}
	public String getSsNr() {
		return ssNr;
	}
	public void setSsNr(String ssNr) {
		this.ssNr = ssNr;
	}
}