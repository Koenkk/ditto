/*
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.ditto.model.base.entity.validation;

import static org.eclipse.ditto.model.base.entity.id.RegexPatterns.SUBJECT_REGEX;

import java.util.regex.Pattern;

import javax.annotation.concurrent.Immutable;

@Immutable
public final class SubjectPatternValidator extends AbstractPatternValidator{

    public static SubjectPatternValidator getInstance() {
        return new SubjectPatternValidator();
    }

    @Override
    public Pattern getPattern() {
        return SUBJECT_REGEX;
    }

}
