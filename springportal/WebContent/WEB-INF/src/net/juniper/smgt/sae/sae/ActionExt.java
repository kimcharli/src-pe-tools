package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/ActionExt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class ActionExt implements org.omg.CORBA.portable.IDLEntity
{

  /// An action to be taken.
  public int operation = (int)0;

  /// Name of the service to be scheduled.
  public String serviceName = null;

  /// Sequence of attributes.
  public net.juniper.smgt.sae.sae.Attr attributes[] = null;

  public ActionExt ()
  {
  } // ctor

  public ActionExt (int _operation, String _serviceName, net.juniper.smgt.sae.sae.Attr[] _attributes)
  {
    operation = _operation;
    serviceName = _serviceName;
    attributes = _attributes;
  } // ctor

} // class ActionExt
