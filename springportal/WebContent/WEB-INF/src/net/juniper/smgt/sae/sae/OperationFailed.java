package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/OperationFailed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saescript.idl
* Sunday, February 1, 2009 10:24:23 PM EST
*/

public final class OperationFailed extends org.omg.CORBA.UserException
{
  public String message = null;

  public OperationFailed ()
  {
    super(OperationFailedHelper.id());
  } // ctor

  public OperationFailed (String _message)
  {
    super(OperationFailedHelper.id());
    message = _message;
  } // ctor


  public OperationFailed (String $reason, String _message)
  {
    super(OperationFailedHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class OperationFailed