package net.juniper.smgt.sae.sae;

/**
* net/juniper/smgt/sae/sae/ServiceActivationEngineHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sae.idl
* Sunday, February 1, 2009 10:24:12 PM EST
*/


/**
   * The interface to the interface module manager of SAE.
   */
public final class ServiceActivationEngineHolder implements org.omg.CORBA.portable.Streamable
{
  public net.juniper.smgt.sae.sae.ServiceActivationEngine value = null;

  public ServiceActivationEngineHolder ()
  {
  }

  public ServiceActivationEngineHolder (net.juniper.smgt.sae.sae.ServiceActivationEngine initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = net.juniper.smgt.sae.sae.ServiceActivationEngineHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    net.juniper.smgt.sae.sae.ServiceActivationEngineHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return net.juniper.smgt.sae.sae.ServiceActivationEngineHelper.type ();
  }

}
