// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

/**
 *
 * An upgrade to a fleet
 */
public final class FleetUpgrade extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_UPGRADE_ID = "";
  public static final String DEFAULT_EXTRA = "";

  @ProtoField(tag = 1, type = STRING)
  public final String upgrade_id;

  @ProtoField(tag = 2, type = STRING)
  public final String extra;

  public FleetUpgrade(String upgrade_id, String extra) {
    this.upgrade_id = upgrade_id;
    this.extra = extra;
  }

  private FleetUpgrade(Builder builder) {
    this(builder.upgrade_id, builder.extra);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FleetUpgrade)) return false;
    FleetUpgrade o = (FleetUpgrade) other;
    return equals(upgrade_id, o.upgrade_id)
        && equals(extra, o.extra);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = upgrade_id != null ? upgrade_id.hashCode() : 0;
      result = result * 37 + (extra != null ? extra.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<FleetUpgrade> {

    public String upgrade_id;
    public String extra;

    public Builder() {
    }

    public Builder(FleetUpgrade message) {
      super(message);
      if (message == null) return;
      this.upgrade_id = message.upgrade_id;
      this.extra = message.extra;
    }

    public Builder upgrade_id(String upgrade_id) {
      this.upgrade_id = upgrade_id;
      return this;
    }

    public Builder extra(String extra) {
      this.extra = extra;
      return this;
    }

    @Override
    public FleetUpgrade build() {
      return new FleetUpgrade(this);
    }
  }
}
