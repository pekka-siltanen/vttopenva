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
//Generated Feb 13, 2018 10:21:16 AM by Hibernate Tools 5.2.0.Beta1

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
* OiMeasuredproperty generated by hbm2java
*/
@Entity
@Table(name = "oi_measuredproperty", schema = "public")
public class OiMeasuredproperty implements java.io.Serializable {

	private int id;
	private Objectofinterest objectofinterest;
	private OitypeProperty oitypeProperty;
	private String oitypePropertyTitle;
	private String oiTitle;
	private String oiSourceTitle;
	private String dataSource;
	private Float lowerlimit;
	private Float upperlimit;
	private Float goalvalue;
	private Float referencevalue;
	private String frequency;
	private LocalDateTime validFrom;
	private LocalDateTime validTo;
	private LocalDateTime timeCreated;
	private LocalDateTime timeDeleted;
	private String oitypePropertySourceTitle;
	private Set<OiMeasuredpropertyValue> oiMeasuredpropertyValues = new HashSet<OiMeasuredpropertyValue>(0);

	public OiMeasuredproperty() {
	}

	public OiMeasuredproperty(int id) {
		this.id = id;
	}

	public OiMeasuredproperty(int id, Objectofinterest objectofinterest, OitypeProperty oitypeProperty,
			String oitypePropertyTitle, String oiTitle, String oiSourceTitle, String dataSource, Float lowerlimit,
			Float upperlimit, Float goalvalue, Float referencevalue, String frequency, LocalDateTime validFrom,
			LocalDateTime validTo, LocalDateTime timeCreated, LocalDateTime timeDeleted,
			String oitypePropertySourceTitle, Set<OiMeasuredpropertyValue> oiMeasuredpropertyValues) {
		this.id = id;
		this.objectofinterest = objectofinterest;
		this.oitypeProperty = oitypeProperty;
		this.oitypePropertyTitle = oitypePropertyTitle;
		this.oiTitle = oiTitle;
		this.oiSourceTitle = oiSourceTitle;
		this.dataSource = dataSource;
		this.lowerlimit = lowerlimit;
		this.upperlimit = upperlimit;
		this.goalvalue = goalvalue;
		this.referencevalue = referencevalue;
		this.frequency = frequency;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.timeCreated = timeCreated;
		this.timeDeleted = timeDeleted;
		this.oitypePropertySourceTitle = oitypePropertySourceTitle;
		this.oiMeasuredpropertyValues = oiMeasuredpropertyValues;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oi_id")
	public Objectofinterest getObjectofinterest() {
		return this.objectofinterest;
	}

	public void setObjectofinterest(Objectofinterest objectofinterest) {
		this.objectofinterest = objectofinterest;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "oitype_property_id")
	public OitypeProperty getOitypeProperty() {
		return this.oitypeProperty;
	}

	public void setOitypeProperty(OitypeProperty oitypeProperty) {
		this.oitypeProperty = oitypeProperty;
	}

	@Column(name = "oitype_property_title")
	public String getOitypePropertyTitle() {
		return this.oitypePropertyTitle;
	}

	public void setOitypePropertyTitle(String oitypePropertyTitle) {
		this.oitypePropertyTitle = oitypePropertyTitle;
	}

	@Column(name = "oi_title")
	public String getOiTitle() {
		return this.oiTitle;
	}

	public void setOiTitle(String oiTitle) {
		this.oiTitle = oiTitle;
	}

	@Column(name = "oi_source_title")
	public String getOiSourceTitle() {
		return this.oiSourceTitle;
	}

	public void setOiSourceTitle(String oiSourceTitle) {
		this.oiSourceTitle = oiSourceTitle;
	}

	@Column(name = "data_source")
	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	@Column(name = "lowerlimit", precision = 8, scale = 8)
	public Float getLowerlimit() {
		return this.lowerlimit;
	}

	public void setLowerlimit(Float lowerlimit) {
		this.lowerlimit = lowerlimit;
	}

	@Column(name = "upperlimit", precision = 8, scale = 8)
	public Float getUpperlimit() {
		return this.upperlimit;
	}

	public void setUpperlimit(Float upperlimit) {
		this.upperlimit = upperlimit;
	}

	@Column(name = "goalvalue", precision = 8, scale = 8)
	public Float getGoalvalue() {
		return this.goalvalue;
	}

	public void setGoalvalue(Float goalvalue) {
		this.goalvalue = goalvalue;
	}

	@Column(name = "referencevalue", precision = 8, scale = 8)
	public Float getReferencevalue() {
		return this.referencevalue;
	}

	public void setReferencevalue(Float referencevalue) {
		this.referencevalue = referencevalue;
	}

	@Column(name = "frequency")
	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Column(name = "valid_from", length = 29)
	public LocalDateTime getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(LocalDateTime validFrom) {
		this.validFrom = validFrom;
	}

	@Column(name = "valid_to", length = 29)
	public LocalDateTime getValidTo() {
		return this.validTo;
	}

	public void setValidTo(LocalDateTime validTo) {
		this.validTo = validTo;
	}

	@Column(name = "time_created", length = 29)
	public LocalDateTime getTimeCreated() {
		return this.timeCreated;
	}

	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}

	@Column(name = "time_deleted", length = 29)
	public LocalDateTime getTimeDeleted() {
		return this.timeDeleted;
	}

	public void setTimeDeleted(LocalDateTime timeDeleted) {
		this.timeDeleted = timeDeleted;
	}

	@Column(name = "oitype_property_source_title")
	public String getOitypePropertySourceTitle() {
		return this.oitypePropertySourceTitle;
	}

	public void setOitypePropertySourceTitle(String oitypePropertySourceTitle) {
		this.oitypePropertySourceTitle = oitypePropertySourceTitle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "oiMeasuredproperty")
	public Set<OiMeasuredpropertyValue> getOiMeasuredpropertyValues() {
		return this.oiMeasuredpropertyValues;
	}

	public void setOiMeasuredpropertyValues(Set<OiMeasuredpropertyValue> oiMeasuredpropertyValues) {
		this.oiMeasuredpropertyValues = oiMeasuredpropertyValues;
	}

}
