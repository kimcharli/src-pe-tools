package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/SubscriberId.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class SubscriberId implements org.omg.CORBA.portable.IDLEntity
{
  private net.juniper.smgt.sae.sae.TimedAddress ___address;
  private String ___dn;
  private String ___login_name;
  private net.juniper.smgt.sae.sae.InterfaceName ___if_name;
  private net.juniper.smgt.sae.sae.InterfaceIndex ___if_index;
  private String ___primary_user_name;
  private net.juniper.smgt.sae.sae.AddrInterfaceName ___addr_if_name;
  private net.juniper.smgt.sae.sae.TunnelSession ___tunnel_session;
  private String ___sessionId;
  private net.juniper.smgt.sae.sae.SubscriberIdType __discriminator;
  private boolean __uninitialized = true;

  public SubscriberId ()
  {
  }

  public net.juniper.smgt.sae.sae.SubscriberIdType discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public net.juniper.smgt.sae.sae.TimedAddress address ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyaddress (__discriminator);
    return ___address;
  }

  public void address (net.juniper.smgt.sae.sae.TimedAddress value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_ADDRESS;
    ___address = value;
    __uninitialized = false;
  }

  public void address (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, net.juniper.smgt.sae.sae.TimedAddress value)
  {
    verifyaddress (discriminator);
    __discriminator = discriminator;
    ___address = value;
    __uninitialized = false;
  }

  private void verifyaddress (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_ADDRESS)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public String dn ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifydn (__discriminator);
    return ___dn;
  }

  public void dn (String value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_DN;
    ___dn = value;
    __uninitialized = false;
  }

  public void dn (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, String value)
  {
    verifydn (discriminator);
    __discriminator = discriminator;
    ___dn = value;
    __uninitialized = false;
  }

  private void verifydn (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_DN)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public String login_name ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifylogin_name (__discriminator);
    return ___login_name;
  }

  public void login_name (String value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_LOGIN_NAME;
    ___login_name = value;
    __uninitialized = false;
  }

  public void login_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, String value)
  {
    verifylogin_name (discriminator);
    __discriminator = discriminator;
    ___login_name = value;
    __uninitialized = false;
  }

  private void verifylogin_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_LOGIN_NAME)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public net.juniper.smgt.sae.sae.InterfaceName if_name ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyif_name (__discriminator);
    return ___if_name;
  }

  public void if_name (net.juniper.smgt.sae.sae.InterfaceName value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_IF_NAME;
    ___if_name = value;
    __uninitialized = false;
  }

  public void if_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, net.juniper.smgt.sae.sae.InterfaceName value)
  {
    verifyif_name (discriminator);
    __discriminator = discriminator;
    ___if_name = value;
    __uninitialized = false;
  }

  private void verifyif_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_IF_NAME)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public net.juniper.smgt.sae.sae.InterfaceIndex if_index ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyif_index (__discriminator);
    return ___if_index;
  }

  public void if_index (net.juniper.smgt.sae.sae.InterfaceIndex value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_IF_INDEX;
    ___if_index = value;
    __uninitialized = false;
  }

  public void if_index (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, net.juniper.smgt.sae.sae.InterfaceIndex value)
  {
    verifyif_index (discriminator);
    __discriminator = discriminator;
    ___if_index = value;
    __uninitialized = false;
  }

  private void verifyif_index (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_IF_INDEX)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public String primary_user_name ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyprimary_user_name (__discriminator);
    return ___primary_user_name;
  }

  public void primary_user_name (String value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_PRIMARY_USER_NAME;
    ___primary_user_name = value;
    __uninitialized = false;
  }

  public void primary_user_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, String value)
  {
    verifyprimary_user_name (discriminator);
    __discriminator = discriminator;
    ___primary_user_name = value;
    __uninitialized = false;
  }

  private void verifyprimary_user_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_PRIMARY_USER_NAME)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public net.juniper.smgt.sae.sae.AddrInterfaceName addr_if_name ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyaddr_if_name (__discriminator);
    return ___addr_if_name;
  }

  public void addr_if_name (net.juniper.smgt.sae.sae.AddrInterfaceName value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_ADDR_IF_NAME;
    ___addr_if_name = value;
    __uninitialized = false;
  }

  public void addr_if_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, net.juniper.smgt.sae.sae.AddrInterfaceName value)
  {
    verifyaddr_if_name (discriminator);
    __discriminator = discriminator;
    ___addr_if_name = value;
    __uninitialized = false;
  }

  private void verifyaddr_if_name (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_ADDR_IF_NAME)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public net.juniper.smgt.sae.sae.TunnelSession tunnel_session ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifytunnel_session (__discriminator);
    return ___tunnel_session;
  }

  public void tunnel_session (net.juniper.smgt.sae.sae.TunnelSession value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_TUNNEL_SESSION;
    ___tunnel_session = value;
    __uninitialized = false;
  }

  public void tunnel_session (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, net.juniper.smgt.sae.sae.TunnelSession value)
  {
    verifytunnel_session (discriminator);
    __discriminator = discriminator;
    ___tunnel_session = value;
    __uninitialized = false;
  }

  private void verifytunnel_session (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_TUNNEL_SESSION)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public String sessionId ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifysessionId (__discriminator);
    return ___sessionId;
  }

  public void sessionId (String value)
  {
    __discriminator = net.juniper.smgt.sae.sae.SubscriberIdType.SIT_SESSIONID;
    ___sessionId = value;
    __uninitialized = false;
  }

  public void sessionId (net.juniper.smgt.sae.sae.SubscriberIdType discriminator, String value)
  {
    verifysessionId (discriminator);
    __discriminator = discriminator;
    ___sessionId = value;
    __uninitialized = false;
  }

  private void verifysessionId (net.juniper.smgt.sae.sae.SubscriberIdType discriminator)
  {
    if (discriminator != net.juniper.smgt.sae.sae.SubscriberIdType.SIT_SESSIONID)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

} // class SubscriberId
