package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/IdxPairSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/// Sequence of indexes for subscriptions paired with services.
abstract public class IdxPairSeqHelper
{
  private static String  _id = "IDL:smgt.juniper.net/sae/IdxPairSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, net.juniper.smgt.sae.sae.IdxPair[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static net.juniper.smgt.sae.sae.IdxPair[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = net.juniper.smgt.sae.sae.IdxPairHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (net.juniper.smgt.sae.sae.IdxPairSeqHelper.id (), "IdxPairSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static net.juniper.smgt.sae.sae.IdxPair[] read (org.omg.CORBA.portable.InputStream istream)
  {
    net.juniper.smgt.sae.sae.IdxPair value[] = null;
    int _len0 = istream.read_long ();
    value = new net.juniper.smgt.sae.sae.IdxPair[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = net.juniper.smgt.sae.sae.IdxPairHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, net.juniper.smgt.sae.sae.IdxPair[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      net.juniper.smgt.sae.sae.IdxPairHelper.write (ostream, value[_i0]);
  }

}
