/**
 * File:     Processor.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     07.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication;

/**
 * Processor is an immutable class that defines processors.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class Processor {
	/**
	 * The identifier.
	 */
	private final String identifier;

	/**
	 * Default constructor for a processor
	 * 
	 * @since 17
	 */
	public Processor() {
		this(null);
	}

	/**
	 * Creates a processor.
	 * 
	 * @param identifier The identifier.
	 * @since 17
	 */
	public Processor(String identifier) {
		super();

		this.identifier = identifier;
	}

	/**
	 * Returns the identifier.
	 *
	 * @return The identifier.
	 * @since 17
	 */
	public String getIdentifier() {
		return identifier;
	}

}
