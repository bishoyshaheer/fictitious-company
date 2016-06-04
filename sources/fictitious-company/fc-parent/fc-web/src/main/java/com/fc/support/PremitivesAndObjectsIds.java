/**
 * 
 */
package com.fc.support;

import java.io.Console;
import java.util.Date;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	/**
	 * 
	 */
	public PremitivesAndObjectsIds() {
		this.filters = new SimpleFilterProvider().addFilter("premitivesAndObjectsIds",
	            new SimpleBeanPropertyFilter(){
			@Override
			public void serializeAsField(Object elementValue, JsonGenerator jgen, SerializerProvider provider,
					PropertyWriter writer) throws Exception {
				BeanPropertyWriter beanWriter = (BeanPropertyWriter) writer;
				Object property = beanWriter.get(elementValue);
				if(property instanceof Number 
						|| property instanceof String
						|| property instanceof Date
						|| beanWriter.getType().isPrimitive()
						|| property == null){
					writer.serializeAsField(elementValue, jgen, provider);
				} 
				else if (!(property instanceof Iterable<?>)){
					Object id = entityManagerFactory.getPersistenceUnitUtil().getIdentifier(property);
					writer.serializeAsOmittedField(id, jgen, provider);
				}
			}
		});
	}

}
