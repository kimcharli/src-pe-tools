package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/ActionExtSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/**
   * List of actions to be scheduled.
   * @since 4.1
   */
public final class ActionExtSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.ActionExt value[] = null;

  public ActionExtSeqHolder ()
  {
  }

  public ActionExtSeqHolder (net.juniper.smgt.sae.sae.ActionExt[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.ActionExtSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.ActionExtSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.ActionExtSeqHelper.type ();
  }

}