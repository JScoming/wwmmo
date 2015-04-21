// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ./messages.proto
package au.com.codeka.common.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;

public final class AllianceRequestVote extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_ID = 0;
  public static final Integer DEFAULT_ALLIANCE_ID = 0;
  public static final Integer DEFAULT_ALLIANCE_REQUEST_ID = 0;
  public static final Integer DEFAULT_EMPIRE_ID = 0;
  public static final Integer DEFAULT_VOTES = 0;
  public static final Long DEFAULT_DATE = 0L;

  @ProtoField(tag = 1, type = INT32)
  public final Integer id;

  @ProtoField(tag = 2, type = INT32)
  public final Integer alliance_id;

  @ProtoField(tag = 3, type = INT32)
  public final Integer alliance_request_id;

  @ProtoField(tag = 4, type = INT32)
  public final Integer empire_id;

  @ProtoField(tag = 5, type = INT32)
  public final Integer votes;

  @ProtoField(tag = 6, type = INT64)
  public final Long date;

  public AllianceRequestVote(Integer id, Integer alliance_id, Integer alliance_request_id, Integer empire_id, Integer votes, Long date) {
    this.id = id;
    this.alliance_id = alliance_id;
    this.alliance_request_id = alliance_request_id;
    this.empire_id = empire_id;
    this.votes = votes;
    this.date = date;
  }

  private AllianceRequestVote(Builder builder) {
    this(builder.id, builder.alliance_id, builder.alliance_request_id, builder.empire_id, builder.votes, builder.date);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AllianceRequestVote)) return false;
    AllianceRequestVote o = (AllianceRequestVote) other;
    return equals(id, o.id)
        && equals(alliance_id, o.alliance_id)
        && equals(alliance_request_id, o.alliance_request_id)
        && equals(empire_id, o.empire_id)
        && equals(votes, o.votes)
        && equals(date, o.date);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (alliance_id != null ? alliance_id.hashCode() : 0);
      result = result * 37 + (alliance_request_id != null ? alliance_request_id.hashCode() : 0);
      result = result * 37 + (empire_id != null ? empire_id.hashCode() : 0);
      result = result * 37 + (votes != null ? votes.hashCode() : 0);
      result = result * 37 + (date != null ? date.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AllianceRequestVote> {

    public Integer id;
    public Integer alliance_id;
    public Integer alliance_request_id;
    public Integer empire_id;
    public Integer votes;
    public Long date;

    public Builder() {
    }

    public Builder(AllianceRequestVote message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.alliance_id = message.alliance_id;
      this.alliance_request_id = message.alliance_request_id;
      this.empire_id = message.empire_id;
      this.votes = message.votes;
      this.date = message.date;
    }

    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder alliance_id(Integer alliance_id) {
      this.alliance_id = alliance_id;
      return this;
    }

    public Builder alliance_request_id(Integer alliance_request_id) {
      this.alliance_request_id = alliance_request_id;
      return this;
    }

    public Builder empire_id(Integer empire_id) {
      this.empire_id = empire_id;
      return this;
    }

    public Builder votes(Integer votes) {
      this.votes = votes;
      return this;
    }

    public Builder date(Long date) {
      this.date = date;
      return this;
    }

    @Override
    public AllianceRequestVote build() {
      return new AllianceRequestVote(this);
    }
  }
}
