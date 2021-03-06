/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.workspace.shared.dto.stack;

import org.eclipse.che.api.workspace.shared.stack.StackComponent;
import org.eclipse.che.dto.shared.DTO;

/** @author Alexander Andrienko */
@DTO
public interface StackComponentDto extends StackComponent {

  void setName(String name);

  StackComponentDto withName(String name);

  void setVersion(String version);

  StackComponentDto withVersion(String version);
}
