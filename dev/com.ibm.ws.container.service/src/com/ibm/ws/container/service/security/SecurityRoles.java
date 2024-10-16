/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
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
package com.ibm.ws.container.service.security;

import java.util.List;

import com.ibm.ws.javaee.dd.appbnd.SecurityRole;

/**
 *
 */
public interface SecurityRoles {

    /**
     * Gets the merged security role mappings for the application. Roles from
     * server.xml take precedence over roles from any ibm-application-bnd file.
     * 
     * @return The merged security role mappings
     */
    public List<SecurityRole> getSecurityRoles();
}
