package web.app.sample.sandbox.persistence;

/*Generated by MPS */

import com.jetbrains.teamsys.dnq.database.BasePersistentClassImpl;
import jetbrains.teamsys.dnq.runtime.util.DnqUtils;
import jetbrains.exodus.entitystore.Entity;

public class MessageImpl extends BasePersistentClassImpl {
  private static String __ENTITY_TYPE__ = "Message";

  public MessageImpl() {
  }

  public void run() {
    DnqUtils.setPersistentClassInstance(__ENTITY_TYPE__, this);
  }

  protected Entity _constructor(final String _entityType_) {
    final Entity entity;
    entity = super._constructor(_entityType_);
    return entity;
  }

  public static Entity constructor() {
    return ((MessageImpl) DnqUtils.getPersistentClassInstance(null, __ENTITY_TYPE__))._constructor(__ENTITY_TYPE__);
  }
}
