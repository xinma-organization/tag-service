package com.xinma.tag.service.exceptions;

import com.xinma.base.core.error.CustomError;
import com.xinma.base.core.exceptions.CustomException;

/**
 * Table存储访问异常，继承自DataStoreException
 * 
 * @author Alauda
 *
 * @date 2015年5月19日
 *
 */
public class TableException extends CustomException {

	private static final long serialVersionUID = -8111207025814059578L;

	public TableException() {
		super();
	}

	public TableException(String message) {
		super(message);
	}

	public TableException(String message, Throwable cause) {
		super(message, cause);
	}

	public TableException(Throwable cause) {
		super(cause);
	}

	public TableException(CustomError error, String... params) {
		super(error, params);
	}

	public TableException(Throwable cause, CustomError error, String... params) {
		super(cause, error, params);
	}
}
