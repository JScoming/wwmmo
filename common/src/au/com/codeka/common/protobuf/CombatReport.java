// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

/**
 *
 * A CombatReport represents a "complete" conflict, from beginning to resolution.
 */
public final class CombatReport extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_KEY = "";
  public static final String DEFAULT_STAR_KEY = "";
  public static final Long DEFAULT_START_TIME = 0L;
  public static final Long DEFAULT_END_TIME = 0L;
  public static final List<String> DEFAULT_START_EMPIRE_KEYS = Collections.emptyList();
  public static final List<String> DEFAULT_END_EMPIRE_KEYS = Collections.emptyList();
  public static final Integer DEFAULT_NUM_DESTROYED = 0;
  public static final List<CombatRound> DEFAULT_ROUNDS = Collections.emptyList();

  @ProtoField(tag = 1, type = STRING)
  public final String key;

  @ProtoField(tag = 2, type = STRING)
  public final String star_key;

  /**
   * The time the conflict started/finished
   */
  @ProtoField(tag = 3, type = INT64)
  public final Long start_time;

  @ProtoField(tag = 4, type = INT64)
  public final Long end_time;

  /**
   * A list of the empires who joined the conflict
   */
  @ProtoField(tag = 5, type = STRING, label = REPEATED)
  public final List<String> start_empire_keys;

  /**
   * A list of the empires who were left when the conflict was resolved
   */
  @ProtoField(tag = 6, type = STRING, label = REPEATED)
  public final List<String> end_empire_keys;

  /**
   * The number of ships/buildings destroyed in the conflict
   */
  @ProtoField(tag = 7, type = INT32)
  public final Integer num_destroyed;

  /**
   * A page of CombatRound objects that represent this set of results
   */
  @ProtoField(tag = 8, label = REPEATED, messageType = CombatRound.class)
  public final List<CombatRound> rounds;

  public CombatReport(String key, String star_key, Long start_time, Long end_time, List<String> start_empire_keys, List<String> end_empire_keys, Integer num_destroyed, List<CombatRound> rounds) {
    this.key = key;
    this.star_key = star_key;
    this.start_time = start_time;
    this.end_time = end_time;
    this.start_empire_keys = immutableCopyOf(start_empire_keys);
    this.end_empire_keys = immutableCopyOf(end_empire_keys);
    this.num_destroyed = num_destroyed;
    this.rounds = immutableCopyOf(rounds);
  }

  private CombatReport(Builder builder) {
    this(builder.key, builder.star_key, builder.start_time, builder.end_time, builder.start_empire_keys, builder.end_empire_keys, builder.num_destroyed, builder.rounds);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CombatReport)) return false;
    CombatReport o = (CombatReport) other;
    return equals(key, o.key)
        && equals(star_key, o.star_key)
        && equals(start_time, o.start_time)
        && equals(end_time, o.end_time)
        && equals(start_empire_keys, o.start_empire_keys)
        && equals(end_empire_keys, o.end_empire_keys)
        && equals(num_destroyed, o.num_destroyed)
        && equals(rounds, o.rounds);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = key != null ? key.hashCode() : 0;
      result = result * 37 + (star_key != null ? star_key.hashCode() : 0);
      result = result * 37 + (start_time != null ? start_time.hashCode() : 0);
      result = result * 37 + (end_time != null ? end_time.hashCode() : 0);
      result = result * 37 + (start_empire_keys != null ? start_empire_keys.hashCode() : 1);
      result = result * 37 + (end_empire_keys != null ? end_empire_keys.hashCode() : 1);
      result = result * 37 + (num_destroyed != null ? num_destroyed.hashCode() : 0);
      result = result * 37 + (rounds != null ? rounds.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CombatReport> {

    public String key;
    public String star_key;
    public Long start_time;
    public Long end_time;
    public List<String> start_empire_keys;
    public List<String> end_empire_keys;
    public Integer num_destroyed;
    public List<CombatRound> rounds;

    public Builder() {
    }

    public Builder(CombatReport message) {
      super(message);
      if (message == null) return;
      this.key = message.key;
      this.star_key = message.star_key;
      this.start_time = message.start_time;
      this.end_time = message.end_time;
      this.start_empire_keys = copyOf(message.start_empire_keys);
      this.end_empire_keys = copyOf(message.end_empire_keys);
      this.num_destroyed = message.num_destroyed;
      this.rounds = copyOf(message.rounds);
    }

    public Builder key(String key) {
      this.key = key;
      return this;
    }

    public Builder star_key(String star_key) {
      this.star_key = star_key;
      return this;
    }

    /**
     * The time the conflict started/finished
     */
    public Builder start_time(Long start_time) {
      this.start_time = start_time;
      return this;
    }

    public Builder end_time(Long end_time) {
      this.end_time = end_time;
      return this;
    }

    /**
     * A list of the empires who joined the conflict
     */
    public Builder start_empire_keys(List<String> start_empire_keys) {
      this.start_empire_keys = checkForNulls(start_empire_keys);
      return this;
    }

    /**
     * A list of the empires who were left when the conflict was resolved
     */
    public Builder end_empire_keys(List<String> end_empire_keys) {
      this.end_empire_keys = checkForNulls(end_empire_keys);
      return this;
    }

    /**
     * The number of ships/buildings destroyed in the conflict
     */
    public Builder num_destroyed(Integer num_destroyed) {
      this.num_destroyed = num_destroyed;
      return this;
    }

    /**
     * A page of CombatRound objects that represent this set of results
     */
    public Builder rounds(List<CombatRound> rounds) {
      this.rounds = checkForNulls(rounds);
      return this;
    }

    @Override
    public CombatReport build() {
      return new CombatReport(this);
    }
  }
}
