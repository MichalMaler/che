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
package org.eclipse.che.api.git.shared;

import java.util.List;
import org.eclipse.che.dto.shared.DTO;

/**
 * Request to add remote configuration {@link #name} for repository at {@link #url}.
 *
 * @author andrew00x
 */
@DTO
public interface RemoteAddRequest {
  /** @return remote name */
  String getName();

  void setName(String name);

  RemoteAddRequest withName(String name);

  /** @return repository url */
  String getUrl();

  void setUrl(String url);

  RemoteAddRequest withUrl(String url);

  /** @return list of tracked branches in remote repository */
  List<String> getBranches();

  void setBranches(List<String> branches);
}
