/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.reactive.streams.test;

import org.eclipse.microprofile.reactive.streams.operators.core.ReactiveStreamsEngineResolver;
import org.eclipse.microprofile.reactive.streams.operators.core.ReactiveStreamsFactoryImpl;
import org.eclipse.microprofile.reactive.streams.operators.spi.ReactiveStreamsFactoryResolver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.ibm.ws.microprofile.reactive.streams.operators.spi.impl.WASReactiveStreamsEngineImpl;

/**
 *
 */
public abstract class AbstractReactiveUnitTest {

    @BeforeClass
    public static void setup() {
        ReactiveStreamsEngineResolver.setInstance(new WASReactiveStreamsEngineImpl());
        ReactiveStreamsFactoryResolver.setInstance(new ReactiveStreamsFactoryImpl());
    }

    @AfterClass
    public static void tearDown() {
        ReactiveStreamsEngineResolver.setInstance(null);
        ReactiveStreamsFactoryResolver.setInstance(null);
    }

}
