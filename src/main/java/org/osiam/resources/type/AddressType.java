/*
 * Copyright (C) 2013 tarent AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.osiam.resources.type;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.osiam.resources.helper.JsonAddressTypeDeserializer;
import org.osiam.resources.helper.JsonAddressTypeSerializer;

/**
 * possible enums for the Address Type
 *
 */
@JsonSerialize(using = JsonAddressTypeSerializer.class)
@JsonDeserialize(using = JsonAddressTypeDeserializer.class)
public enum AddressType{
	WORK ("work"),
	HOME ("home"),
	OTHER ("other")
	;
	
	String value = "";
	
	AddressType(String value){
		this.value = value;
	}
	
	public String toString(){
		return value;
	}
	
	/**
	 * convert's the given non case sensitive String into one of the enum values
	 * @param text one of the enum as String
	 * @return a converted enum
	 * @throws IllegalArgumentException in case the given String could not be converted
	 */
    public static AddressType fromString(String text) {
	    if (text != null) {
	      for (AddressType b : AddressType.values()) {
	        if (text.equalsIgnoreCase(b.toString())) {
	          return b;
	        }
	      }
	    }
	    throw new IllegalArgumentException("Could not convert the value '" 
	    									+ text + "' to a AddressType enum.");
    }
	
}
