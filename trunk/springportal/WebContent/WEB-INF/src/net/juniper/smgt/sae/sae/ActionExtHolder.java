package net.juniper.smgt.sae.sae;

/**
* net/juniper/smgt/sae/sae/ActionExtHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class ActionExtHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.ActionExt value = null;

  public ActionExtHolder ()
  {
  }

  public ActionExtHolder (net.juniper.smgt.sae.sae.ActionExt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.ActionExtHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.ActionExtHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.ActionExtHelper.type ();
  }

}
