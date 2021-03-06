package net.juniper.smgt.sae.sae;

/**
* net/juniper/smgt/sae/sae/SAEAccessHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/**
   * Interface to access the SAE core API.
   *
   * Descendant of sae.SAEFeature. 
   * Accessible through the ServiceActivationEngine interface
   * SAEFeature.getFeature.
   */
public final class SAEAccessHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.SAEAccess value = null;

  public SAEAccessHolder ()
  {
  }

  public SAEAccessHolder (net.juniper.smgt.sae.sae.SAEAccess initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.SAEAccessHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.SAEAccessHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.SAEAccessHelper.type ();
  }

}
