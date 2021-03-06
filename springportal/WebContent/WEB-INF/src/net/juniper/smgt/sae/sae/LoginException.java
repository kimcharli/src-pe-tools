package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/LoginException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/

public final class LoginException extends org.omg.CORBA.UserException
{
  public String currentIp = null;
  public String loginName = null;
  public String message = null;

  public LoginException ()
  {
    super(LoginExceptionHelper.id());
  } // ctor

  public LoginException (String _currentIp, String _loginName, String _message)
  {
    super(LoginExceptionHelper.id());
    currentIp = _currentIp;
    loginName = _loginName;
    message = _message;
  } // ctor


  public LoginException (String $reason, String _currentIp, String _loginName, String _message)
  {
    super(LoginExceptionHelper.id() + "  " + $reason);
    currentIp = _currentIp;
    loginName = _loginName;
    message = _message;
  } // ctor

} // class LoginException
