/**
 * 
 */
package com.fc.support;

import java.io.Console;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @author Bishoy
 *
 */
@Component
public class PremitivesAndObjectsIds {
	
	public final FilterProvider filters;

	/**
	 * 
	 */
	public PremitivesAndObjectsIds() {
		this.filters = new SimpleFilterProvider().addFilter("premitivesAndObjectsIds",
	            new SimpleBeanPropertyFilter(){
			@Override
			public void serializeAsField(Object elementValue, JsonGenerator jgen, SerializerProvider provider,
					PropertyWriter writer) throws Exception {
				System.out.println(elementValue);
			}
		   @Override
		   protected boolean include(BeanPropertyWriter writer) {
		      return true;
		   }
		   @Override
		   protected boolean include(PropertyWriter writer) {
		      return true;
		   }
		});
	}

}
