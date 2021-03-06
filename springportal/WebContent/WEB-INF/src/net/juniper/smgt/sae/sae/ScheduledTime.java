package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/ScheduledTime.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class ScheduledTime implements org.omg.CORBA.portable.IDLEntity
{

  /**
     * First time specification. You can specify the time to include the
     * year, month, day of the week, day of the month, hour, minute, and
     * time zone for an associated action to occur.
     */
  public net.juniper.smgt.sae.sae.TimeSpec firstTimeSpec = null;

  /**
     * Second time specification. You can specify the time to include the
     * year, month, day of the week, day of the month, hour, minute, and
     * time zone for an associated action to occur.
     */
  public net.juniper.smgt.sae.sae.TimeSpec secondTimeSpec = null;

  public ScheduledTime ()
  {
  } // ctor

  public ScheduledTime (net.juniper.smgt.sae.sae.TimeSpec _firstTimeSpec, net.juniper.smgt.sae.sae.TimeSpec _secondTimeSpec)
  {
    firstTimeSpec = _firstTimeSpec;
    secondTimeSpec = _secondTimeSpec;
  } // ctor

} // class ScheduledTime
