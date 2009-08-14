package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/ServiceActivationEngineHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sae.idl
* Sunday, February 1, 2009 10:24:12 PM EST
*/


/**
   * The interface to the interface module manager of SAE.
   */
abstract public class ServiceActivationEngineHelper
{
  private static String  _id = "IDL:smgt.juniper.net/sae/ServiceActivationEngine:1.0";

  public static void insert (org.omg.CORBA.Any a, net.juniper.smgt.sae.sae.ServiceActivationEngine that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static net.juniper.smgt.sae.sae.ServiceActivationEngine extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (net.juniper.smgt.sae.sae.ServiceActivationEngineHelper.id (), "ServiceActivationEngine");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static net.juniper.smgt.sae.sae.ServiceActivationEngine read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServiceActivationEngineStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, net.juniper.smgt.sae.sae.ServiceActivationEngine value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static net.juniper.smgt.sae.sae.ServiceActivationEngine narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof net.juniper.smgt.sae.sae.ServiceActivationEngine)
      return (net.juniper.smgt.sae.sae.ServiceActivationEngine)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      net.juniper.smgt.sae.sae._ServiceActivationEngineStub stub = new net.juniper.smgt.sae.sae._ServiceActivationEngineStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static net.juniper.smgt.sae.sae.ServiceActivationEngine unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof net.juniper.smgt.sae.sae.ServiceActivationEngine)
      return (net.juniper.smgt.sae.sae.ServiceActivationEngine)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      net.juniper.smgt.sae.sae._ServiceActivationEngineStub stub = new net.juniper.smgt.sae.sae._ServiceActivationEngineStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}