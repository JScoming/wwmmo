// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class Alliances extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<Alliance> DEFAULT_ALLIANCES = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = Alliance.class)
  public final List<Alliance> alliances;

  public Alliances(List<Alliance> alliances) {
    this.alliances = immutableCopyOf(alliances);
  }

  private Alliances(Builder builder) {
    this(builder.alliances);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Alliances)) return false;
    return equals(alliances, ((Alliances) other).alliances);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = alliances != null ? alliances.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<Alliances> {

    public List<Alliance> alliances;

    public Builder() {
    }

    public Builder(Alliances message) {
      super(message);
      if (message == null) return;
      this.alliances = copyOf(message.alliances);
    }

    public Builder alliances(List<Alliance> alliances) {
      this.alliances = checkForNulls(alliances);
      return this;
    }

    @Override
    public Alliances build() {
      return new Alliances(this);
    }
  }
}
