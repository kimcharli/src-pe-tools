package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/AttrSeqSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/// List of attribute lists.
public final class AttrSeqSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.Attr value[][] = null;

  public AttrSeqSeqHolder ()
  {
  }

  public AttrSeqSeqHolder (net.juniper.smgt.sae.sae.Attr[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.AttrSeqSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.AttrSeqSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.AttrSeqSeqHelper.type ();
  }

}
