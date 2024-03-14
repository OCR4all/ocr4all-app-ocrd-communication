/**
 * File:     ProcessRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     14.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api;

import java.io.Serializable;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Defines process requests for the api.
 *
 * @author <a href="mailto:herbert.baier@uni-wuerzburg.de">Herbert Baier</a>
 * @version 1.0
 * @since 17
 */
public class ProcessRequest implements Serializable {
	/**
	 * The serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The job key.
	 */
	@NotBlank
	private final String key;

	/**
	 * The working directory of the job. It is relative to the project folder.
	 */
	@NotBlank
	private final String folder;

	/**
	 * The OCR-D processor.
	 */
	@NotBlank
	private final String processor;

	/**
	 * The OCR-D processor arguments.
	 */
	@NotNull
	private final List<String> arguments;

	/**
	 * Creates a process request for the api.
	 * 
	 * @param key       The job key.
	 * @param folder    The working directory of the job. It is relative to the
	 *                  project folder.
	 * @param processor The OCR-D processor.
	 * @param arguments The OCR-D processor arguments.
	 * @since 17
	 */
	public ProcessRequest(String key, String folder, String processor, List<String> arguments) {
		super();

		this.key = key;
		this.folder = folder;
		this.processor = processor;
		this.arguments = arguments;
	}

	/**
	 * Returns the job key.
	 *
	 * @return The job key.
	 * @since 17
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Returns the working directory of the job. It is relative to the project
	 * folder.
	 *
	 * @return The working directory of the job.
	 * @since 17
	 */
	public String getFolder() {
		return folder;
	}

	/**
	 * Returns the OCR-D processor.
	 *
	 * @return The OCR-D processor.
	 * @since 17
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * Returns the OCR-D processor arguments.
	 *
	 * @return The OCR-D processor arguments.
	 * @since 17
	 */
	public List<String> getArguments() {
		return arguments;
	}

}
