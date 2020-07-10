/**
 * 
 */
package com.angularpoc.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 *
 */
@Component
public class BePrsnModel implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	private long id;
	@JsonFormat(pattern="MM/dd/yyyy")
	/** The brth dt. */
	private Date brthDt;

	/** The delete in. */
	private Short deleteIn;

	/** The deth dt. */
	private Date dethDt;

	/** The dsgtn cd. */
	private String dsgtnCd;

	/** The fst nm. */
	private String fstNm;

	/** The last nm. */
	private String lastNm;

	/** The med of comm. */
	private String medOfComm;

	/** The member id. */
	private String memberId;

	/** The mid nm. */
	private String midNm;

	/** The mrg eff dt. */
	private Date mrgEffDt;

	/** The mrtl stat cd. */
	private String mrtlStatCd;

	/** The nbk id. */
	private int nbkId;

	/** The old prsn id. */
	private Integer oldPrsnId;

	/** The sex cd. */
	private String sexCd;

	/** The sfx cd. */
	private String sfxCd;

	/** The ss nr. */
	private String ssNr;

	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String cntry;
	
	private String zipCode;

	private String email;

	/**
	 * @return the brthDt
	 */
	public Date getBrthDt() {
		return brthDt;
	}

	/**
	 * @param brthDt the brthDt to set
	 */
	public void setBrthDt(Date brthDt) {
		this.brthDt = brthDt;
	}

	/**
	 * @return the deleteIn
	 */
	public Short getDeleteIn() {
		return deleteIn;
	}

	/**
	 * @param deleteIn the deleteIn to set
	 */
	public void setDeleteIn(Short deleteIn) {
		this.deleteIn = deleteIn;
	}

	/**
	 * @return the dethDt
	 */
	public Date getDethDt() {
		return dethDt;
	}

	/**
	 * @param dethDt the dethDt to set
	 */
	public void setDethDt(Date dethDt) {
		this.dethDt = dethDt;
	}

	/**
	 * @return the dsgtnCd
	 */
	public String getDsgtnCd() {
		return dsgtnCd;
	}

	/**
	 * @param dsgtnCd the dsgtnCd to set
	 */
	public void setDsgtnCd(String dsgtnCd) {
		this.dsgtnCd = dsgtnCd;
	}

	/**
	 * @return the fstNm
	 */
	public String getFstNm() {
		return fstNm;
	}

	/**
	 * @param fstNm the fstNm to set
	 */
	public void setFstNm(String fstNm) {
		this.fstNm = fstNm;
	}

	/**
	 * @return the lastNm
	 */
	public String getLastNm() {
		return lastNm;
	}

	/**
	 * @param lastNm the lastNm to set
	 */
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	/**
	 * @return the medOfComm
	 */
	public String getMedOfComm() {
		return medOfComm;
	}

	/**
	 * @param medOfComm the medOfComm to set
	 */
	public void setMedOfComm(String medOfComm) {
		this.medOfComm = medOfComm;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the midNm
	 */
	public String getMidNm() {
		return midNm;
	}

	/**
	 * @param midNm the midNm to set
	 */
	public void setMidNm(String midNm) {
		this.midNm = midNm;
	}

	/**
	 * @return the mrgEffDt
	 */
	public Date getMrgEffDt() {
		return mrgEffDt;
	}

	/**
	 * @param mrgEffDt the mrgEffDt to set
	 */
	public void setMrgEffDt(Date mrgEffDt) {
		this.mrgEffDt = mrgEffDt;
	}

	/**
	 * @return the mrtlStatCd
	 */
	public String getMrtlStatCd() {
		return mrtlStatCd;
	}

	/**
	 * @param mrtlStatCd the mrtlStatCd to set
	 */
	public void setMrtlStatCd(String mrtlStatCd) {
		this.mrtlStatCd = mrtlStatCd;
	}

	/**
	 * @return the nbkId
	 */
	public int getNbkId() {
		return nbkId;
	}

	/**
	 * @param nbkId the nbkId to set
	 */
	public void setNbkId(int nbkId) {
		this.nbkId = nbkId;
	}

	/**
	 * @return the oldPrsnId
	 */
	public Integer getOldPrsnId() {
		return oldPrsnId;
	}

	/**
	 * @param oldPrsnId the oldPrsnId to set
	 */
	public void setOldPrsnId(Integer oldPrsnId) {
		this.oldPrsnId = oldPrsnId;
	}

	/**
	 * @return the sexCd
	 */
	public String getSexCd() {
		return sexCd;
	}

	/**
	 * @param sexCd the sexCd to set
	 */
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}

	/**
	 * @return the sfxCd
	 */
	public String getSfxCd() {
		return sfxCd;
	}

	/**
	 * @param sfxCd the sfxCd to set
	 */
	public void setSfxCd(String sfxCd) {
		this.sfxCd = sfxCd;
	}

	/**
	 * @return the ssNr
	 */
	public String getSsNr() {
		return ssNr;
	}

	/**
	 * @param ssNr the ssNr to set
	 */
	public void setSsNr(String ssNr) {
		this.ssNr = ssNr;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the cntry
	 */
	public String getCntry() {
		return cntry;
	}

	/**
	 * @param cntry the cntry to set
	 */
	public void setCntry(String cntry) {
		this.cntry = cntry;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	

}
