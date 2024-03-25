/**
 * File:     ProcessRequest.java
 * Package:  de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api
 * 
 * Author:   Herbert Baier (herbert.baier@uni-wuerzburg.de)
 * Date:     14.03.2024
 */
package de.uniwuerzburg.zpd.ocr4all.application.ocrd.communication.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

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
	 * The OCR-D processor.
	 */
	@NotBlank
	private final String processor;

	/**
	 * The working directory of the job. It is relative to the project folder.
	 */
	@NotBlank
	private final String folder;

	/**
	 * The input folder.
	 */
	@NotBlank
	private final String input;

	/**
	 * The output folder.
	 */
	@NotBlank
	private final String output;

	/**
	 * The OCR-D processor arguments.
	 */
	private final List<String> arguments = new ArrayList<>();

	/**
	 * Creates a process request for the api.
	 * 
	 * @param key       The job key.
	 * @param processor The OCR-D processor.
	 * @param folder    The working directory of the job. It is relative to the
	 *                  project folder.
	 * @param input     The input folder.
	 * @param output    The output folder.
	 * @param arguments The OCR-D processor arguments.
	 * @since 17
	 */
	public ProcessRequest(String key, String processor, String folder, String input, String output,
			List<String> arguments) {
		super();

		this.key = key.trim();
		this.processor = processor.trim();
		
		this.folder = folder.trim();
		this.input = input.trim();
		this.output = output.trim();

		if (arguments != null)
			for (String argument : arguments)
				if (argument != null && !argument.isBlank())
					this.arguments.add(argument.trim());
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
	 * Returns the OCR-D processor.
	 *
	 * @return The OCR-D processor.
	 * @since 17
	 */
	public String getProcessor() {
		return processor;
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
	 * Returns the input folder.
	 *
	 * @return The input folder.
	 * @since 17
	 */
	public String getInput() {
		return input;
	}

	/**
	 * Returns the output folder.
	 *
	 * @return The output folder.
	 * @since 17
	 */
	public String getOutput() {
		return output;
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
