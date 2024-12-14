/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.product.information.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Promotion extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5773855189740007811L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Promotion\",\"namespace\":\"com.product.information.avro.model\",\"fields\":[{\"name\":\"promotionId\",\"type\":\"long\"},{\"name\":\"productList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Product\",\"fields\":[{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"productName\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"},{\"name\":\"brand\",\"type\":{\"type\":\"record\",\"name\":\"Brand\",\"fields\":[{\"name\":\"brandId\",\"type\":\"long\"},{\"name\":\"brandName\",\"type\":\"string\"},{\"name\":\"imageUrl\",\"type\":\"string\"}]}},{\"name\":\"material\",\"type\":\"string\"},{\"name\":\"size\",\"type\":{\"type\":\"record\",\"name\":\"Size\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"sizeUS\",\"type\":\"string\"},{\"name\":\"sizeEU\",\"type\":\"string\"}]}},{\"name\":\"colour\",\"type\":\"string\"},{\"name\":\"ageGroup\",\"type\":\"string\"},{\"name\":\"category\",\"type\":\"string\"},{\"name\":\"imageUrl\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"float\"},{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"quantityTotal\",\"type\":\"int\"},{\"name\":\"quantityAvailable\",\"type\":\"int\"}]}}]}}},{\"name\":\"targetGroup\",\"type\":\"string\"},{\"name\":\"promotionMessage\",\"type\":\"string\"},{\"name\":\"imageUrls\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Promotion> ENCODER =
      new BinaryMessageEncoder<Promotion>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Promotion> DECODER =
      new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Promotion> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Promotion> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Promotion> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Promotion>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Promotion to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Promotion from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Promotion instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Promotion fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long promotionId;
  @Deprecated public java.util.List<com.product.information.avro.model.Product> productList;
  @Deprecated public java.lang.CharSequence targetGroup;
  @Deprecated public java.lang.CharSequence promotionMessage;
  @Deprecated public java.util.List<java.lang.CharSequence> imageUrls;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Promotion() {}

  /**
   * All-args constructor.
   * @param promotionId The new value for promotionId
   * @param productList The new value for productList
   * @param targetGroup The new value for targetGroup
   * @param promotionMessage The new value for promotionMessage
   * @param imageUrls The new value for imageUrls
   */
  public Promotion(java.lang.Long promotionId, java.util.List<com.product.information.avro.model.Product> productList, java.lang.CharSequence targetGroup, java.lang.CharSequence promotionMessage, java.util.List<java.lang.CharSequence> imageUrls) {
    this.promotionId = promotionId;
    this.productList = productList;
    this.targetGroup = targetGroup;
    this.promotionMessage = promotionMessage;
    this.imageUrls = imageUrls;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return promotionId;
    case 1: return productList;
    case 2: return targetGroup;
    case 3: return promotionMessage;
    case 4: return imageUrls;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: promotionId = (java.lang.Long)value$; break;
    case 1: productList = (java.util.List<com.product.information.avro.model.Product>)value$; break;
    case 2: targetGroup = (java.lang.CharSequence)value$; break;
    case 3: promotionMessage = (java.lang.CharSequence)value$; break;
    case 4: imageUrls = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'promotionId' field.
   * @return The value of the 'promotionId' field.
   */
  public long getPromotionId() {
    return promotionId;
  }


  /**
   * Sets the value of the 'promotionId' field.
   * @param value the value to set.
   */
  public void setPromotionId(long value) {
    this.promotionId = value;
  }

  /**
   * Gets the value of the 'productList' field.
   * @return The value of the 'productList' field.
   */
  public java.util.List<com.product.information.avro.model.Product> getProductList() {
    return productList;
  }


  /**
   * Sets the value of the 'productList' field.
   * @param value the value to set.
   */
  public void setProductList(java.util.List<com.product.information.avro.model.Product> value) {
    this.productList = value;
  }

  /**
   * Gets the value of the 'targetGroup' field.
   * @return The value of the 'targetGroup' field.
   */
  public java.lang.CharSequence getTargetGroup() {
    return targetGroup;
  }


  /**
   * Sets the value of the 'targetGroup' field.
   * @param value the value to set.
   */
  public void setTargetGroup(java.lang.CharSequence value) {
    this.targetGroup = value;
  }

  /**
   * Gets the value of the 'promotionMessage' field.
   * @return The value of the 'promotionMessage' field.
   */
  public java.lang.CharSequence getPromotionMessage() {
    return promotionMessage;
  }


  /**
   * Sets the value of the 'promotionMessage' field.
   * @param value the value to set.
   */
  public void setPromotionMessage(java.lang.CharSequence value) {
    this.promotionMessage = value;
  }

  /**
   * Gets the value of the 'imageUrls' field.
   * @return The value of the 'imageUrls' field.
   */
  public java.util.List<java.lang.CharSequence> getImageUrls() {
    return imageUrls;
  }


  /**
   * Sets the value of the 'imageUrls' field.
   * @param value the value to set.
   */
  public void setImageUrls(java.util.List<java.lang.CharSequence> value) {
    this.imageUrls = value;
  }

  /**
   * Creates a new Promotion RecordBuilder.
   * @return A new Promotion RecordBuilder
   */
  public static com.product.information.avro.model.Promotion.Builder newBuilder() {
    return new com.product.information.avro.model.Promotion.Builder();
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.product.information.avro.model.Promotion.Builder newBuilder(com.product.information.avro.model.Promotion.Builder other) {
    if (other == null) {
      return new com.product.information.avro.model.Promotion.Builder();
    } else {
      return new com.product.information.avro.model.Promotion.Builder(other);
    }
  }

  /**
   * Creates a new Promotion RecordBuilder by copying an existing Promotion instance.
   * @param other The existing instance to copy.
   * @return A new Promotion RecordBuilder
   */
  public static com.product.information.avro.model.Promotion.Builder newBuilder(com.product.information.avro.model.Promotion other) {
    if (other == null) {
      return new com.product.information.avro.model.Promotion.Builder();
    } else {
      return new com.product.information.avro.model.Promotion.Builder(other);
    }
  }

  /**
   * RecordBuilder for Promotion instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Promotion>
    implements org.apache.avro.data.RecordBuilder<Promotion> {

    private long promotionId;
    private java.util.List<com.product.information.avro.model.Product> productList;
    private java.lang.CharSequence targetGroup;
    private java.lang.CharSequence promotionMessage;
    private java.util.List<java.lang.CharSequence> imageUrls;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.product.information.avro.model.Promotion.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.promotionId)) {
        this.promotionId = data().deepCopy(fields()[0].schema(), other.promotionId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productList)) {
        this.productList = data().deepCopy(fields()[1].schema(), other.productList);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.targetGroup)) {
        this.targetGroup = data().deepCopy(fields()[2].schema(), other.targetGroup);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.promotionMessage)) {
        this.promotionMessage = data().deepCopy(fields()[3].schema(), other.promotionMessage);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.imageUrls)) {
        this.imageUrls = data().deepCopy(fields()[4].schema(), other.imageUrls);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Promotion instance
     * @param other The existing instance to copy.
     */
    private Builder(com.product.information.avro.model.Promotion other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.promotionId)) {
        this.promotionId = data().deepCopy(fields()[0].schema(), other.promotionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productList)) {
        this.productList = data().deepCopy(fields()[1].schema(), other.productList);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.targetGroup)) {
        this.targetGroup = data().deepCopy(fields()[2].schema(), other.targetGroup);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.promotionMessage)) {
        this.promotionMessage = data().deepCopy(fields()[3].schema(), other.promotionMessage);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.imageUrls)) {
        this.imageUrls = data().deepCopy(fields()[4].schema(), other.imageUrls);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'promotionId' field.
      * @return The value.
      */
    public long getPromotionId() {
      return promotionId;
    }


    /**
      * Sets the value of the 'promotionId' field.
      * @param value The value of 'promotionId'.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder setPromotionId(long value) {
      validate(fields()[0], value);
      this.promotionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'promotionId' field has been set.
      * @return True if the 'promotionId' field has been set, false otherwise.
      */
    public boolean hasPromotionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'promotionId' field.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder clearPromotionId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productList' field.
      * @return The value.
      */
    public java.util.List<com.product.information.avro.model.Product> getProductList() {
      return productList;
    }


    /**
      * Sets the value of the 'productList' field.
      * @param value The value of 'productList'.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder setProductList(java.util.List<com.product.information.avro.model.Product> value) {
      validate(fields()[1], value);
      this.productList = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productList' field has been set.
      * @return True if the 'productList' field has been set, false otherwise.
      */
    public boolean hasProductList() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'productList' field.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder clearProductList() {
      productList = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'targetGroup' field.
      * @return The value.
      */
    public java.lang.CharSequence getTargetGroup() {
      return targetGroup;
    }


    /**
      * Sets the value of the 'targetGroup' field.
      * @param value The value of 'targetGroup'.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder setTargetGroup(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.targetGroup = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'targetGroup' field has been set.
      * @return True if the 'targetGroup' field has been set, false otherwise.
      */
    public boolean hasTargetGroup() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'targetGroup' field.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder clearTargetGroup() {
      targetGroup = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'promotionMessage' field.
      * @return The value.
      */
    public java.lang.CharSequence getPromotionMessage() {
      return promotionMessage;
    }


    /**
      * Sets the value of the 'promotionMessage' field.
      * @param value The value of 'promotionMessage'.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder setPromotionMessage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.promotionMessage = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'promotionMessage' field has been set.
      * @return True if the 'promotionMessage' field has been set, false otherwise.
      */
    public boolean hasPromotionMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'promotionMessage' field.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder clearPromotionMessage() {
      promotionMessage = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'imageUrls' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getImageUrls() {
      return imageUrls;
    }


    /**
      * Sets the value of the 'imageUrls' field.
      * @param value The value of 'imageUrls'.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder setImageUrls(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.imageUrls = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'imageUrls' field has been set.
      * @return True if the 'imageUrls' field has been set, false otherwise.
      */
    public boolean hasImageUrls() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'imageUrls' field.
      * @return This builder.
      */
    public com.product.information.avro.model.Promotion.Builder clearImageUrls() {
      imageUrls = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Promotion build() {
      try {
        Promotion record = new Promotion();
        record.promotionId = fieldSetFlags()[0] ? this.promotionId : (java.lang.Long) defaultValue(fields()[0]);
        record.productList = fieldSetFlags()[1] ? this.productList : (java.util.List<com.product.information.avro.model.Product>) defaultValue(fields()[1]);
        record.targetGroup = fieldSetFlags()[2] ? this.targetGroup : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.promotionMessage = fieldSetFlags()[3] ? this.promotionMessage : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.imageUrls = fieldSetFlags()[4] ? this.imageUrls : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Promotion>
    WRITER$ = (org.apache.avro.io.DatumWriter<Promotion>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Promotion>
    READER$ = (org.apache.avro.io.DatumReader<Promotion>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.promotionId);

    long size0 = this.productList.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.product.information.avro.model.Product e0: this.productList) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeString(this.targetGroup);

    out.writeString(this.promotionMessage);

    long size1 = this.imageUrls.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (java.lang.CharSequence e1: this.imageUrls) {
      actualSize1++;
      out.startItem();
      out.writeString(e1);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.promotionId = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<com.product.information.avro.model.Product> a0 = this.productList;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.product.information.avro.model.Product>((int)size0, SCHEMA$.getField("productList").schema());
        this.productList = a0;
      } else a0.clear();
      SpecificData.Array<com.product.information.avro.model.Product> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.product.information.avro.model.Product>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.product.information.avro.model.Product e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.product.information.avro.model.Product();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      this.targetGroup = in.readString(this.targetGroup instanceof Utf8 ? (Utf8)this.targetGroup : null);

      this.promotionMessage = in.readString(this.promotionMessage instanceof Utf8 ? (Utf8)this.promotionMessage : null);

      long size1 = in.readArrayStart();
      java.util.List<java.lang.CharSequence> a1 = this.imageUrls;
      if (a1 == null) {
        a1 = new SpecificData.Array<java.lang.CharSequence>((int)size1, SCHEMA$.getField("imageUrls").schema());
        this.imageUrls = a1;
      } else a1.clear();
      SpecificData.Array<java.lang.CharSequence> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          java.lang.CharSequence e1 = (ga1 != null ? ga1.peek() : null);
          e1 = in.readString(e1 instanceof Utf8 ? (Utf8)e1 : null);
          a1.add(e1);
        }
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.promotionId = in.readLong();
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<com.product.information.avro.model.Product> a0 = this.productList;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.product.information.avro.model.Product>((int)size0, SCHEMA$.getField("productList").schema());
            this.productList = a0;
          } else a0.clear();
          SpecificData.Array<com.product.information.avro.model.Product> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.product.information.avro.model.Product>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.product.information.avro.model.Product e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.product.information.avro.model.Product();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 2:
          this.targetGroup = in.readString(this.targetGroup instanceof Utf8 ? (Utf8)this.targetGroup : null);
          break;

        case 3:
          this.promotionMessage = in.readString(this.promotionMessage instanceof Utf8 ? (Utf8)this.promotionMessage : null);
          break;

        case 4:
          long size1 = in.readArrayStart();
          java.util.List<java.lang.CharSequence> a1 = this.imageUrls;
          if (a1 == null) {
            a1 = new SpecificData.Array<java.lang.CharSequence>((int)size1, SCHEMA$.getField("imageUrls").schema());
            this.imageUrls = a1;
          } else a1.clear();
          SpecificData.Array<java.lang.CharSequence> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              java.lang.CharSequence e1 = (ga1 != null ? ga1.peek() : null);
              e1 = in.readString(e1 instanceof Utf8 ? (Utf8)e1 : null);
              a1.add(e1);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










