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

import org.hibernate.annotations.Type;
// Generated Dec 1, 2016 10:45:58 AM by Hibernate Tools 5.1.0.Alpha1

import fi.vtt.openva.dao.OiRelationEnum;

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
 * OitypeRelation generated by hbm2java.
 */
@Entity
@Table(name = "oitype_relation", schema = "public")
public class OitypeRelation implements java.io.Serializable {

	/** The id. */
	private int id;
	
	/** The oitype by parent oitype id. */
	private Oitype oitypeByParentOitypeId;
	
	/** The oitype by child oitype id. */
	private Oitype oitypeByChildOitypeId;
	
	/** The parent title. */
	private String parentTitle;
	
	/** The child title. */
	private String childTitle;
	
	/** The relationtype. */
	private OiRelationEnum relationtype;
	
	/** The time created. */
	private LocalDateTime timeCreated;
	
	/** The time deleted. */
	private LocalDateTime timeDeleted;

	/**
	 * Instantiates a new oitype relation.
	 */
	public OitypeRelation() {
	}

	/**
	 * Instantiates a new oitype relation.
	 *
	 * @param id the id
	 */
	public OitypeRelation(int id) {
		this.id = id;
	}

	/**
	 * Instantiates a new oitype relation.
	 *
	 * @param id the id
	 * @param oitypeByParentOitypeId the oitype by parent oitype id
	 * @param oitypeByChildOitypeId the oitype by child oitype id
	 * @param parentTitle the parent title
	 * @param childTitle the child title
	 * @param relationtype the relationtype
	 * @param timeCreated the time created
	 * @param timeDeleted the time deleted
	 */
	public OitypeRelation(int id, Oitype oitypeByParentOitypeId, Oitype oitypeByChildOitypeId, String parentTitle,
			String childTitle, OiRelationEnum relationtype, LocalDateTime timeCreated, LocalDateTime timeDeleted) {
		this.id = id;
		this.oitypeByParentOitypeId = oitypeByParentOitypeId;
		this.oitypeByChildOitypeId = oitypeByChildOitypeId;
		this.parentTitle = parentTitle;
		this.childTitle = childTitle;
		this.relationtype = relationtype;
		this.timeCreated = timeCreated;
		this.timeDeleted = timeDeleted;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the oitype by parent oitype id.
	 *
	 * @return the oitype by parent oitype id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_oitype_id")
	public Oitype getOitypeByParentOitypeId() {
		return this.oitypeByParentOitypeId;
	}

	/**
	 * Sets the oitype by parent oitype id.
	 *
	 * @param oitypeByParentOitypeId the new oitype by parent oitype id
	 */
	public void setOitypeByParentOitypeId(Oitype oitypeByParentOitypeId) {
		this.oitypeByParentOitypeId = oitypeByParentOitypeId;
	}

	/**
	 * Gets the oitype by child oitype id.
	 *
	 * @return the oitype by child oitype id
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_oitype_id")
	public Oitype getOitypeByChildOitypeId() {
		return this.oitypeByChildOitypeId;
	}

	/**
	 * Sets the oitype by child oitype id.
	 *
	 * @param oitypeByChildOitypeId the new oitype by child oitype id
	 */
	public void setOitypeByChildOitypeId(Oitype oitypeByChildOitypeId) {
		this.oitypeByChildOitypeId = oitypeByChildOitypeId;
	}

	/**
	 * Gets the parent title.
	 *
	 * @return the parent title
	 */
	@Column(name = "parent_title")
	public String getParentTitle() {
		return this.parentTitle;
	}

	/**
	 * Sets the parent title.
	 *
	 * @param parentTitle the new parent title
	 */
	public void setParentTitle(String parentTitle) {
		this.parentTitle = parentTitle;
	}

	/**
	 * Gets the child title.
	 *
	 * @return the child title
	 */
	@Column(name = "child_title")
	public String getChildTitle() {
		return this.childTitle;
	}

	/**
	 * Sets the child title.
	 *
	 * @param childTitle the new child title
	 */
	public void setChildTitle(String childTitle) {
		this.childTitle = childTitle;
	}

	/**
	 * Gets the relationtype.
	 *
	 * @return the relationtype
	 */
	@Column(name = "relationtype")
	@Type(type="fi.vtt.openva.dao.OiRelationEnumType")
public OiRelationEnum getRelationtype() {
		return this.relationtype;
	}

	/**
	 * Sets the relationtype.
	 *
	 * @param relationtype the new relationtype
	 */
	public void setRelationtype(OiRelationEnum relationtype) {
		this.relationtype = relationtype;
	}

	
	/**
	 * Gets the time created.
	 *
	 * @return the time created
	 */
	@Column(name = "time_created", length = 29)
	public LocalDateTime getTimeCreated() {
		return this.timeCreated;
	}

	/**
	 * Sets the time created.
	 *
	 * @param timeCreated the new time created
	 */
	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}

	
	/**
	 * Gets the time deleted.
	 *
	 * @return the time deleted
	 */
	@Column(name = "time_deleted", length = 29)
	public LocalDateTime getTimeDeleted() {
		return this.timeDeleted;
	}

	/**
	 * Sets the time deleted.
	 *
	 * @param timeDeleted the new time deleted
	 */
	public void setTimeDeleted(LocalDateTime timeDeleted) {
		this.timeDeleted = timeDeleted;
	}

}
