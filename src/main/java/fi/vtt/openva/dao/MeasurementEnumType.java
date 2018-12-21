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

package fi.vtt.openva.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.Types;

/**
 * MeasurementEnumType.
 *
 * @author Markus Yliker�l�
 * 
 * Note: all Enums will hopefully become obsolete when the database is redesigned
 */
public class MeasurementEnumType extends OpenVAEnumType<String, MeasurementEnum> {

	/**
	 * Instantiates a new measurement enum type.
	 *
	 * @throws NoSuchMethodException the no such method exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws IllegalAccessException the illegal access exception
	 */
	public MeasurementEnumType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException{
		super(MeasurementEnum.class, MeasurementEnum.values(), "getValue", Types.OTHER);
	}
	
	/**
	 * Instantiates a new measurement enum type.
	 *
	 * @param clazz the clazz
	 * @param enumValues the enum values
	 * @param method the method
	 * @param sqlType the sql type
	 * @throws NoSuchMethodException the no such method exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws IllegalAccessException the illegal access exception
	 */
	public MeasurementEnumType(Class<MeasurementEnum> clazz, MeasurementEnum[] enumValues, String method,
			int sqlType) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		super(MeasurementEnum.class, MeasurementEnum.values(), "getValue", Types.OTHER);
		// TODO Auto-generated constructor stub
	}

}
