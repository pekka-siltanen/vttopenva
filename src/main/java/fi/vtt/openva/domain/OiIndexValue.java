// OpenVA - Open software platform for visual analytics
//
// Copyright (c) 2018, VTT Technical Research Centre of Finland Ltd
// All rights reserved.
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are met:
//
//    1) Redistributions of source code must retain the above copyright
//       notice, this list of conditions and the following disclaimer.
//    2) Redistributions in binary form must reproduce the above copyright
//       notice, this list of conditions and the following disclaimer in the
//       documentation and/or other materials provided with the distribution.
//    3) Neither the name of the VTT Technical Research Centre of Finland nor the
//       names of its contributors may be used to endorse or promote products
//       derived from this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS ``AS IS'' AND ANY
// EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
// DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS AND CONTRIBUTORS BE LIABLE FOR ANY
// DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
// (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
// LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
// ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
// SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package fi.vtt.openva.domain;
// Generated Oct 13, 2016 4:34:05 PM by Hibernate Tools 5.1.0.Alpha1

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



// TODO: Auto-generated Javadoc
/**
 * OiIndexValue generated by hbm2java.
 */
@Entity
@Table(name = "oi_index_value", schema = "public")
public class OiIndexValue implements java.io.Serializable {

	/** The id. */
	private long id;
	
	/** The objectofinterest. */
	private Objectofinterest objectofinterest;
	
	/** The oitype index. */
	private OitypeIndex oitypeIndex;
	
	/** The oitype index title. */
	private String oitypeIndexTitle;
	
	/** The oi title. */
	private String oiTitle;
	
	/** The index value. */
	private Float indexValue;
	
	/** The index time. */
	private LocalDateTime indexTime;

	/**
	 * Instantiates a new oi index value.
	 */
	public OiIndexValue() {
	}

	/**
	 * Instantiates a new oi index value.
	 *
	 * @param id the id
	 */
	public OiIndexValue(long id) {
		this.id = id;
	}

	/**
	 * Instantiates a new oi index value.
	 *
	 * @param id the id
	 * @param objectofinterest the objectofinterest
	 * @param oitypeIndex the oitype index
	 * @param oitypeIndexTitle the oitype index title
	 * @param oiTitle the oi title
	 * @param indexValue the index value
	 * @param indexTime the index time
	 */
	public OiIndexValue(long id, Objectofinterest objectofinterest, OitypeIndex oitypeIndex, String oitypeIndexTitle,
			String oiTitle, Float indexValue, LocalDateTime indexTime) {
		this.id = id;
		this.objectofinterest = objectofinterest;
		this.oitypeIndex = oitypeIndex;
		this.oitypeIndexTitle = oitypeIndexTitle;
		this.oiTitle = oiTitle;
		this.indexValue = indexValue;
		this.indexTime = indexTime;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Gets the objectofinterest.
	 *
	 * @return the objectofinterest
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oi_id")
	public Objectofinterest getObjectofinterest() {
		return this.objectofinterest;
	}

	/**
	 * Sets the objectofinterest.
	 *
	 * @param objectofinterest the new objectofinterest
	 */
	public void setObjectofinterest(Objectofinterest objectofinterest) {
		this.objectofinterest = objectofinterest;
	}

	/**
	 * Gets the oitype index.
	 *
	 * @return the oitype index
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oitype_index_id")
	public OitypeIndex getOitypeIndex() {
		return this.oitypeIndex;
	}

	/**
	 * Sets the oitype index.
	 *
	 * @param oitypeIndex the new oitype index
	 */
	public void setOitypeIndex(OitypeIndex oitypeIndex) {
		this.oitypeIndex = oitypeIndex;
	}

	/**
	 * Gets the oitype index title.
	 *
	 * @return the oitype index title
	 */
	@Column(name = "oitype_index_title")
	public String getOitypeIndexTitle() {
		return this.oitypeIndexTitle;
	}

	/**
	 * Sets the oitype index title.
	 *
	 * @param oitypeIndexTitle the new oitype index title
	 */
	public void setOitypeIndexTitle(String oitypeIndexTitle) {
		this.oitypeIndexTitle = oitypeIndexTitle;
	}

	/**
	 * Gets the oi title.
	 *
	 * @return the oi title
	 */
	@Column(name = "oi_title")
	public String getOiTitle() {
		return this.oiTitle;
	}

	/**
	 * Sets the oi title.
	 *
	 * @param oiTitle the new oi title
	 */
	public void setOiTitle(String oiTitle) {
		this.oiTitle = oiTitle;
	}

	/**
	 * Gets the index value.
	 *
	 * @return the index value
	 */
	@Column(name = "index_value", precision = 8, scale = 8)
	public Float getIndexValue() {
		return this.indexValue;
	}

	/**
	 * Sets the index value.
	 *
	 * @param indexValue the new index value
	 */
	public void setIndexValue(Float indexValue) {
		this.indexValue = indexValue;
	}

	
	/**
	 * Gets the index time.
	 *
	 * @return the index time
	 */
	@Column(name = "index_time", length = 29)
	public LocalDateTime getIndexTime() {
		return this.indexTime;
	}

	/**
	 * Sets the index time.
	 *
	 * @param indexTime the new index time
	 */
	public void setIndexTime(LocalDateTime indexTime) {
		this.indexTime = indexTime;
	}

}