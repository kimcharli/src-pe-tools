package net.juniper.smgt.sae.sae;

/**
* net/juniper/smgt/sae/sae/FeatureNotInstalledHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sae.idl
* Sunday, February 1, 2009 10:24:12 PM EST
*/

public final class FeatureNotInstalledHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.FeatureNotInstalled value = null;

  public FeatureNotInstalledHolder ()
  {
  }

  public FeatureNotInstalledHolder (net.juniper.smgt.sae.sae.FeatureNotInstalled initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.FeatureNotInstalledHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.FeatureNotInstalledHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.FeatureNotInstalledHelper.type ();
  }

}