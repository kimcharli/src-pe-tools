package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/SAEException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class SAEException extends org.omg.CORBA.UserException
{
  public String message = null;

  public SAEException ()
  {
    super(SAEExceptionHelper.id());
  } // ctor

  public SAEException (String _message)
  {
    super(SAEExceptionHelper.id());
    message = _message;
  } // ctor


  public SAEException (String $reason, String _message)
  {
    super(SAEExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class SAEException
