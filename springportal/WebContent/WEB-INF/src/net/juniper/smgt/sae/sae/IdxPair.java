package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/IdxPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class IdxPair implements org.omg.CORBA.portable.IDLEntity
{
  public int subIdx = (int)0;

  ///<A subscription index.
  public int svcIdx = (int)0;

  public IdxPair ()
  {
  } // ctor

  public IdxPair (int _subIdx, int _svcIdx)
  {
    subIdx = _subIdx;
    svcIdx = _svcIdx;
  } // ctor

} // class IdxPair
