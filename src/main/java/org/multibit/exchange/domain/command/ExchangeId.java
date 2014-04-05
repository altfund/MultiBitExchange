package org.multibit.exchange.domain.command;

import org.axonframework.domain.IdentifierFactory;
import org.multibit.common.AbstractIdentifier;

import java.io.Serializable;

/**
 * <p>Identifier to provide the following to the domain model:</p>
 * <ul>
 * <li>A unique identifier for {@link org.multibit.exchange.domain.model.Exchange}s</li>
 * </ul>
 *
 * @since 0.0.1
 */
public class ExchangeId extends AbstractIdentifier<String> implements Serializable {

  public ExchangeId() {
    super(IdentifierFactory.getInstance().generateIdentifier());
  }

  public ExchangeId(String identifier) {
    super(identifier);
  }
}
