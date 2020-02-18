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

package fi.vtt.openva.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import fi.vtt.openva.domain.OiBackgroundpropertyValue;
import fi.vtt.openva.domain.OitypeProperty;

/**
 * OiBackgroundpropertyValueRepository
 * 
 * @author Markus Yliker�l�
 *
 */
@Transactional(readOnly = true, timeout=30)
public interface OiBackgroundpropertyValueRepository extends CrudRepository<OiBackgroundpropertyValue, Integer> {
	@Query(nativeQuery = true, value="SELECT DISTINCT on (codevalue) * FROM oi_backgroundproperty_value WHERE oitype_property_title=?1")
	List<OiBackgroundpropertyValue> findUniqueCodeValues(String typePropTitle);

	@Query(nativeQuery = true, value="SELECT DISTINCT on (background_value) * FROM oi_backgroundproperty_value WHERE oitype_property_id=?1")
	List<OiBackgroundpropertyValue> findUniqueBackgroundValues(int id);
	
	List<OiBackgroundpropertyValue> findByOitypeProperty(OitypeProperty oitp);
	List<OiBackgroundpropertyValue> findByOitypePropertyAndCodeValueIn(OitypeProperty oitp,List<String> values);
	List<OiBackgroundpropertyValue> findByOitypePropertyAndBackgroundValueIn(OitypeProperty oitp,List<Float> values);
}
