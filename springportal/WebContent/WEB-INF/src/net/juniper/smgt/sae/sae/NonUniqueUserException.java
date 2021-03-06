package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/NonUniqueUserException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class NonUniqueUserException extends org.omg.CORBA.UserException
{
  public String userId = null;
  public String message = null;

  public NonUniqueUserException ()
  {
    super(NonUniqueUserExceptionHelper.id());
  } // ctor

  public NonUniqueUserException (String _userId, String _message)
  {
    super(NonUniqueUserExceptionHelper.id());
    userId = _userId;
    message = _message;
  } // ctor


  public NonUniqueUserException (String $reason, String _userId, String _message)
  {
    super(NonUniqueUserExceptionHelper.id() + "  " + $reason);
    userId = _userId;
    message = _message;
  } // ctor

} // class NonUniqueUserException
