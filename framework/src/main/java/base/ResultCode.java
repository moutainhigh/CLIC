/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package base;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-09-24")
public enum ResultCode implements org.apache.thrift.TEnum {
  SUCCESS(0),
  PARAMETER_ERROR(1),
  EXCEPTION(2);

  private final int value;

  private ResultCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static ResultCode findByValue(int value) { 
    switch (value) {
      case 0:
        return SUCCESS;
      case 1:
        return PARAMETER_ERROR;
      case 2:
        return EXCEPTION;
      default:
        return null;
    }
  }
}
