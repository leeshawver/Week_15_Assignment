/**
 * 
 */
package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.promineotech.ComponentScanMarker;

/**
 * @author leeshawver
 *
 */

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(JeepSales.class, args);
	}

}
