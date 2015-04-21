// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

/**
 *
 * Represents a collection of device registrations.
 */
public final class DeviceRegistrations extends Message {
  private static final long serialVersionUID = 0L;

  public static final List<DeviceRegistration> DEFAULT_REGISTRATIONS = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED, messageType = DeviceRegistration.class)
  public final List<DeviceRegistration> registrations;

  public DeviceRegistrations(List<DeviceRegistration> registrations) {
    this.registrations = immutableCopyOf(registrations);
  }

  private DeviceRegistrations(Builder builder) {
    this(builder.registrations);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DeviceRegistrations)) return false;
    return equals(registrations, ((DeviceRegistrations) other).registrations);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = registrations != null ? registrations.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<DeviceRegistrations> {

    public List<DeviceRegistration> registrations;

    public Builder() {
    }

    public Builder(DeviceRegistrations message) {
      super(message);
      if (message == null) return;
      this.registrations = copyOf(message.registrations);
    }

    public Builder registrations(List<DeviceRegistration> registrations) {
      this.registrations = checkForNulls(registrations);
      return this;
    }

    @Override
    public DeviceRegistrations build() {
      return new DeviceRegistrations(this);
    }
  }
}
