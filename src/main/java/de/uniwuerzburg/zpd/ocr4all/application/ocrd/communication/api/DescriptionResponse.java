/**
 * File:     DescriptionResponse.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     13.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api;

import java.io.Serializable;

/**
 * Defines description responses for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class DescriptionResponse implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The description.
	 */
	private final String description;

	/**
	 * Creates a description response for the api.
	 * 
	 * @param description The description.
	 * @since 17
	 */
	public DescriptionResponse(String description) {
		super();

		this.description = description;
	}

	/**
	 * Returns the description.
	 *
	 * @return The description.
	 * @since 17
	 */
	public String getDescription() {
		return description;
	}

}
