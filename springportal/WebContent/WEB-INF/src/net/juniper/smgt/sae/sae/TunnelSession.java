package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/TunnelSession.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class TunnelSession implements org.omg.CORBA.portable.IDLEntity
{
  public int tunnelId = (int)0;

  ///< The L2TP tunnel ID
  public int tunnelSessionId = (int)0;

  ///< The L2TP session ID in the specified tunnel
  public String vrName = null;

  public TunnelSession ()
  {
  } // ctor

  public TunnelSession (int _tunnelId, int _tunnelSessionId, String _vrName)
  {
    tunnelId = _tunnelId;
    tunnelSessionId = _tunnelSessionId;
    vrName = _vrName;
  } // ctor

} // class TunnelSession
