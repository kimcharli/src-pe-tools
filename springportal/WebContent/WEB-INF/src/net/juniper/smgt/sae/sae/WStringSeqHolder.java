package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/WStringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/// Sequence of wide strings (unicode).
public final class WStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public WStringSeqHolder ()
  {
  }

  public WStringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.WStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.WStringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.WStringSeqHelper.type ();
  }

}
