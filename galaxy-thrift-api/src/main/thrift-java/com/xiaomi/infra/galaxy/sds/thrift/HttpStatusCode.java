/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * HTTP状态码列表，用于传输层，签名错误等
 */
public enum HttpStatusCode implements libthrift091.TEnum {
  /**
   * 请求格式错误，常见原因为请求参数错误导致服务端反序列化失败
   */
  BAD_REQUEST(400),
  /**
   * 无效的认证信息，一般为签名错误
   */
  INVALID_AUTH(401),
  /**
   * 客户端时钟不同步，服务端拒绝(为防止签名的重放攻击)
   */
  CLOCK_TOO_SKEWED(412),
  /**
   * HTTP请求过大
   */
  REQUEST_TOO_LARGE(413),
  /**
   * 内部错误
   */
  INTERNAL_ERROR(500);

  private final int value;

  private HttpStatusCode(int value) {
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
  public static HttpStatusCode findByValue(int value) { 
    switch (value) {
      case 400:
        return BAD_REQUEST;
      case 401:
        return INVALID_AUTH;
      case 412:
        return CLOCK_TOO_SKEWED;
      case 413:
        return REQUEST_TOO_LARGE;
      case 500:
        return INTERNAL_ERROR;
      default:
        return null;
    }
  }
}
