package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/SubscriberIdType.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/// Types of subscriber IDs.
public class SubscriberIdType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 9;
  private static net.juniper.smgt.sae.sae.SubscriberIdType[] __array = new net.juniper.smgt.sae.sae.SubscriberIdType [__size];

  public static final int _SIT_ADDRESS = 0;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_ADDRESS = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_ADDRESS);
  public static final int _SIT_DN = 1;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_DN = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_DN);
  public static final int _SIT_LOGIN_NAME = 2;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_LOGIN_NAME = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_LOGIN_NAME);
  public static final int _SIT_IF_NAME = 3;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_IF_NAME = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_IF_NAME);
  public static final int _SIT_IF_INDEX = 4;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_IF_INDEX = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_IF_INDEX);
  public static final int _SIT_PRIMARY_USER_NAME = 5;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_PRIMARY_USER_NAME = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_PRIMARY_USER_NAME);
  public static final int _SIT_ADDR_IF_NAME = 6;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_ADDR_IF_NAME = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_ADDR_IF_NAME);
  public static final int _SIT_TUNNEL_SESSION = 7;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_TUNNEL_SESSION = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_TUNNEL_SESSION);
  public static final int _SIT_SESSIONID = 8;
  public static final net.juniper.smgt.sae.sae.SubscriberIdType SIT_SESSIONID = new net.juniper.smgt.sae.sae.SubscriberIdType(_SIT_SESSIONID);

  public int value ()
  {
    return __value;
  }

  public static net.juniper.smgt.sae.sae.SubscriberIdType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected SubscriberIdType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class SubscriberIdType
