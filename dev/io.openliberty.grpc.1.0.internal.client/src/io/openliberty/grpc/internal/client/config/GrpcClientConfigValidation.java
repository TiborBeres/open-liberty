/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.grpc.internal.client.config;

import com.ibm.websphere.ras.Tr;
import com.ibm.websphere.ras.TraceComponent;

import io.openliberty.grpc.internal.client.GrpcClientConstants;
import io.openliberty.grpc.internal.client.GrpcClientMessages;

public class GrpcClientConfigValidation {

	private static final TraceComponent tc = Tr.register(GrpcClientConfigValidation.class, GrpcClientMessages.GRPC_TRACE_NAME, GrpcClientMessages.GRPC_BUNDLE);

	/**
	 * @param value - key name
	 * @return true if keep alive time value is valid
	 */
	static boolean validateKeepAliveTime(String value) {
		int time = Integer.parseInt(value);
		if (time < 1) {
			Tr.error(tc, "invalid.keepalive.time", time);
			return false;
		}
		return true;
	}

	/**
	 * @param value - key name
	 * @return true if keep alive timeout value is valid
	 */
	static boolean validateKeepAliveTimeout(String value) {
		int time = Integer.parseInt(value);
		if (time < 1) {
			Tr.error(tc, "invalid.keepalive.timeout", time);
			return false;
		}
		return true;
	}

	/**
	 * @param value - key name
	 * @return true if max inbound message size value is valid
	 */
	static boolean validateMaxInboundMessageSize(String value) {
		int size = Integer.parseInt(value);
		if (size < 1) {
			Tr.error(tc, "invalid.client.inbound.msg.size", size);
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @param value - key name
	 * @return true if sslConfig ID is valid
	 */
	static boolean validateSslConfig(String value) {
		// TODO: actually validate
		return true;
	}
}
