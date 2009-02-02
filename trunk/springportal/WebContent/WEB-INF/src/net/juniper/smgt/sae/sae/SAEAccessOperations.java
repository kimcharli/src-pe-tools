package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/SAEAccessOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saeaccess.idl
* Sunday, February 1, 2009 10:24:16 PM EST
*/


/**
   * Interface to access the SAE core API.
   *
   * Descendant of sae.SAEFeature. 
   * Accessible through the ServiceActivationEngine interface
   * SAEFeature.getFeature.
   */
public interface SAEAccessOperations  extends net.juniper.smgt.sae.sae.SAEFeatureOperations
{

  /**
     * The getSubscriber() method retrieves a single subscriber object
     * by matching the specified attributes.
     *
     * @param[in] sid ID of the subscriber session.
     *
     * @return Single subscriber object.
     *
     * @throws UnknownUserException Raised if the subscriber is not
     * logged in to a subscriber session.
     *
     * @throws NonUniqueUserException Raised if there is more than one
     * active subscriber session for the specified subscriber ID.
     */
  net.juniper.smgt.sae.sae.Subscriber getSubscriber (net.juniper.smgt.sae.sae.SubscriberId sid) throws net.juniper.smgt.sae.sae.UnknownUserException, net.juniper.smgt.sae.sae.NonUniqueUserException;

  /**
     * The getSubscriberSet() method retrieves 0 or more subscriber
     * objects by using the subscriber ID.
     * 
     * The method takes the  same arguments as the getSubscriber() method, plus the
     * number of objects that the method should  return. If no subscriber is found,
     * the returned sequence can be empty.
     *
     * @param[in] sid ID of the subscriber session.
     *
     * @param[in] how_many Maximum number of session objects returned.
     *
     * @param[out] iter Iterator to retrieve the remaining sessions, if more
     * session than the specified number are returned. If the total number of sessions
     * is less than or equal to how_many, no iter is returned.
     *
     * @param[out] total Number of selected subscriber sessions.
     *
     * @return List of subscriber sessions.
     *
     */
  net.juniper.smgt.sae.sae.Subscriber[] getSubscriberSet (net.juniper.smgt.sae.sae.SubscriberId sid, int how_many, net.juniper.smgt.sae.sae.SubscriberIteratorHolder iter, org.omg.CORBA.IntHolder total);

  /**
     * The findSubscriber() method identifies one or more subscribers by using
     * an LDAP filter. It returns the same items as  getSubscriberSet().
     * 
     * Although similar to the getSubscriberSet()
     * method,  it uses an LDAP filter rather than a subscriber ID and takes
     * as an argument the number of  objects that the method should return. 
     *
     * \b NOTE: Use this method only when necessary, because it searches
     * all active subscriber
     * sessions and takes a  significant amount of time to complete.
     *
     * @param[in] filter Simplified LDAP search filter that can access
     * attributes of the subscriber session. For more information about
     * simplified LDAP filters, see the documentation for the Select() method.
     *
     * @param[in] how_many Maximum number of session objects returned.
     *
     * @param[out] iter Iterator to retrieve the remaining
     * sessions, if more sessions than the specified number are returned. If the
     * total number of sessions is less than or equal to how_many, no iter is
     * returned.
     *
     * @param[out] total Number of specified subscriber sessions.
     *
     * @return List of subscriber sessions.
     *
     * @throws SAEException Raised if the filter cannot be parsed.
     */
  net.juniper.smgt.sae.sae.Subscriber[] findSubscriber (String filter, int how_many, net.juniper.smgt.sae.sae.SubscriberIteratorHolder iter, org.omg.CORBA.IntHolder total) throws net.juniper.smgt.sae.sae.SAEException;

  /**
     * The getSubscriberFilter() method retrieves references to all subscriber sessions
     * that match a specified subscriber ID and the search-filter criteria.
     * 
     * The method first selects the objects that match the subscriber ID,
     * and then filters these objects to obtain the result.
     *
     * The getSubscriberFilter() method  is a combination of the getSubscriberSet()
     * and findSubscriber() methods. The method returns the same items as
     * getSubscriberSet().
     *
     * @param[in] sid ID of the subscriber sessions.
     *
     * @param[in] filter Simplified LDAP search filter that can access
     * attributes of the subscriber session. For more information about
     * simplified LDAP filters, see the documentation for the Select() method.
     * 
     * @param[in] how_many Maximum number of session objects returned.
     *
     * @param[in] iter Iterator to retrieve the remaining
     * sessions if more sessions than the specified number 
     * are returned. If the total number of sessions is less than or
     * equal how_many, no iter is returned.
     *
     * @param[in] total Number of selected subscriber sessions.
     *
     * @return List of subscriber sessions.
     *
     * @throws SAEException Raised if the filter cannot be parsed.
     */
  net.juniper.smgt.sae.sae.Subscriber[] getSubscriberFilter (net.juniper.smgt.sae.sae.SubscriberId sid, String filter, int how_many, net.juniper.smgt.sae.sae.SubscriberIteratorHolder iter, org.omg.CORBA.IntHolder total) throws net.juniper.smgt.sae.sae.SAEException;

  /**
     * The registerLogin() method creates login registration objects
     * in the directory for subscribers who use DHCP. 
     *
     * The SAE authenticates the specified loginName and password, and loads
     * the associated user profile. The name of this profile is stored in the
     * directory with the MAC address as the key. The next time the client device
     * connects to the router, the SAE loads the registered user profile.
     * Another authentication is not required.
     *
     * The creation of a subscriber session when the client device is activated
     * takes effect the next time that the client device requests
     * an IP address. 
     *
     * @param[in] macAddress		MAC address of the client device.
     *
     * @param[in] loginDescription	Description of the subscriber session.
     *     
     * @param[in] loginName		Subscriber's login name.
     *
     * @param[in] password		Subscriber's password associated with the login name.
     * 
     * @param[in] vrName		Name of the virtual router that manages
     *  the subscriber associated with the client device.
     *
     * @param[in] interfaceName	Name of the managed interface
     * that handles the subscriber associated with the client device.       
     *
     * @throws LoginException	Raised if a subscriber login to a subscriber session fails.
     *
     * @throws SAEException	Raised if there is an unspecified error condition
     * within the SAE.
     */
  void registerLogin (String macAddress, String loginDescription, String loginName, String password, String vrName, String interfaceName) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The registerLoginCredentials() method passes the MAC address of the client
     * device, the subscriber's login name, and the associated password to the 
     * SAE to identify the client device that is connecting to the network
     * using DHCP.
     * 
     * The SAE stores the specified loginName and password in the directory
     * with the MAC address as the key. The next time that the client device
     * connects to the router, the SAE uses the loginName and password
     * to log in the subscriber and authenticate a user session.
     *
     * The creation of a subscriber session when the client device is activated
     * takes effect the next time that the client device requests an
     * IP address. 
     *
     * @param[in] macAddress			MAC address of the client device.
     * 
     * @param[in] loginDescription		Description of the subscriber session.
     * 
     * @param[in] loginName			Subscriber's login name.
     * 
     * @param[in] password			Subscriber's password associated with
     * the login name.
     * 
     * @param[in] vrName			Name of the virtual router that manages
     * the subscriber associated with the client device. 
     *
     * @param[in] interfaceName	Name of the managed interface
     * that handles the subscriber associated with the client device.       
     *
     * @throws LoginException		Raised if a subscriber login to a subscriber session.
     * fails
     *
     * @throws SAEException		Raised if there is an unspecified error.
     * condition within the SAE
     */
  void registerLoginCredentials (String macAddress, String loginDescription, String loginName, String password, String vrName, String interfaceName) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The registerNextLogin() method creates temporary login registration
     * objects in memory for subscribers who use DHCP.
     * The SDX software removes the temporary object either the next time
     *  the subscriber logs
     * in or after a certain time elapses, depending on which event occurs first.
     *
     * The method passes credentials for subscribers to the
     * SAE. These credentials are used to obtain an authenticated IP address only
     * for the next subscriber session. 
     *
     * @param[in] macAddress		MAC address of the client device.
     * 
     * @param[in] loginDescription  Description of the subscriber session.
     * 
     * @param[in] loginName		Subscriber's login name.
     *
     * @param[in] password		Subscriber's password associated with the login name.
     *  
     * @param[in] vrName		Name of the virtual router that manages
     * the subscriber associated with the client device.
     *
     * @param[in] interfaceName	Managed interface
     * that handles the subscriber associated with the client device.       
     *
     * @throws LoginException  Raised if a subscriber login to a subscriber session fails.
     *
     * @throws SAEException      Raised if there is an unspecified error condition
     * within the SAE.
     */
  void registerNextLogin (String macAddress, String loginDescription, String loginName, String password, String vrName, String interfaceName) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The unregisterLogin() method deletes registration objects
     * from the directory.
     *
     * The method passes to the SAE the MAC address of the
     * client device and the subscriber's login name and password.
     * The SAE removes registration information from the directory for
     * subscribers who connect using DHCP and have
     * registered their client device.
     *
     * @param[in] macAddress	MAC address of the client device.
     * 
     * @param[in] loginName	Subscriber's login name.
     *
     * @param[in] password	Subscriber's password associated with the login name. 
     *
     * @throws LoginException Raised if a subscriber login to a subscriber session fails.	
     *
     * @throws SAEException  	Raised if there is an unspecified error condition
     * within the SAE.
     */
  void unregisterLogin (String macAddress, String loginName, String password) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The registerEquipment() method creates an entry in the directory for
     * permanent IP addresses assigned to DHCP connections. The information
     * stored in the directory is
     * used to obtain an authenticated IP address.
     * 
     * \n \b NOTE: The registerEquipment() method can be used
     * only with JUNOSe routers. 
     *
     * @param[in] macAddress			MAC address of the client device.
     *
     * @param[in] equipmentDescription	Description of the client device.
     *
     * @param[in] loginName			Subscriber's login name.
     *  
     * @param[in] password			Subscriber's password associated with
     * the login name.
     * 
     * @param[in] vrName			Name of the virtual router that manages
     * the subscriber associated with the client device.
     *
     * @param[in] interfaceName		Name of the managed interface
     * that handles the subscriber associated with the client device.       
     *
     * @throws SAEException	Raised if there is an unspecified error condition
     * within the SAE.
     */
  void registerEquipment (String macAddress, String equipmentDescription, String loginName, String password, String vrName, String interfaceName) throws net.juniper.smgt.sae.sae.SAEException;

  /**
     * The registerEquipmentAttr() method creates an entry in the directory for
     * permanent IP addresses assigned to DHCP connections. The
     * information stored in the directory is
     * used to obtain an authenticated IP address. The registerEquipmentAttr() method 
     * uses DHCP attributes for device registration in addition to the attributes
     * used by the registerEquipment() method.
     *
     * The registerEquipmentAttr() method can be used only with JUNOSe routers.
     *
     * @param[in] macAddress			MAC address of the client device.
     * 
     * @param[in] equipmentDescription	Description of the client device.
     *
     * @param[in] loginName			Subscriber's login name.
     *  
     * @param[in] password			Subscriber's password associated with
     * the login name. 
     *
     * @param[in] vrName			Name of the virtual router that manages
     * the subscriber associated with the client device.
     *
     * @param[in] interfaceName	Name of the managed interface
     * that handles the subscriber associated with the client device. 
     *      
     * @param[in] attr              Value of string name for Attr.			
     *
     * @throws SAEException		Raised if there is an unspecified error
     * condition within the SAE.
     */
  void registerEquipmentAttr (String macAddress, String equipmentDescription, String loginName, String password, String vrName, String interfaceName, net.juniper.smgt.sae.sae.DhcpAttribute[] attr) throws net.juniper.smgt.sae.sae.SAEException;

  /**
     * The unregisterEquipment() method removes entries from the directory
     * for permanent IP addresses that are assigned to DHCP connections. 
     * The method disables client device registration
     * for subscribers who have registered their client device and who use a DHCP 
     * connection.
     *
     * The unregisterEquipment() method can be used only with JUNIOSe routers.
     *
     * @param[in] macAddress		MAC address of a client device.
     *
     * @param[in] loginName		Subscriber's login name.
     *  
     * @param[in] password		Subscriber's password associated with the login name. 
     *
     * @throws SAEException         Raised if there is an unspecified error
     * condition within the SAE.
     */
  void unregisterEquipment (String macAddress, String loginName, String password) throws net.juniper.smgt.sae.sae.SAEException;

  /**
     * The loginUser() method creates an interface subscriber session
     * for subscribers who log in using static IP addresses.
     *
     * For subscribers who use a different method to log in, use the login()
     * method of the Subscriber interface. 
     *
     * @param[in] userIp	Subscriber's static IP address.
     *
     * @param[in] loginName   Subscriber's login name. 
     * 
     * @param[in] password    Subscriber's password associated with the login name. 
     *
     * @return false
     *
     * @throws LoginException  Raised if a subscriber login to a subscriber
     * session fails.
     * 
     * @throws SAEException    Raised if there is an unspecified error
     * condition within the SAE.
     */
  boolean loginUser (String userIp, String loginName, String password) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The getRegisteredLogins() method retrieves from the directory 
     * a list of all the registered logins that use the specified login name.
     *
     * A registered login allows subscribers
     * who use DHCP to have a subscriber session automatically created when their
     * client devices connect to the network using DHCP.  
     *
     * @param[in] login               Subscriber's login name.  
     *      
     * @param[in] password            Subscriber's password associated with the
     * login name. 
     *
     * @return List of objects for registered logins that
     * use the specified login name. 
     *
     * @throws LoginException 	Raised if a subscriber login to a subscriber
     * session fails.
     *
     * @throws SAEException     	Raised if there is an unspecified error
     * condition within the SAE.
     */
  net.juniper.smgt.sae.sae.Registration[] getRegisteredLogins (String login, String password) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;

  /**
     * The getRegisteredEquipment() method retrieves a list of a 
     * subscriber's client devices that use a DHCP connection and are
     * registered to automatically obtain an authenticated IP address. 
     *
     * @param[in] login       Subscriber's login name.  	
     *
     * @param[in] password    Subscriber's password associated
     * with the login name.
     *
     * @return List of registration objects.  
     *
     * @throws LoginException Raised if a subscriber login to a subscriber
     * session fails.
     * 
     * @throws SAEException  Raised if there is an unspecified
     * error condition within the SAE.
     */
  net.juniper.smgt.sae.sae.Registration[] getRegisteredEquipment (String login, String password) throws net.juniper.smgt.sae.sae.LoginException, net.juniper.smgt.sae.sae.SAEException;
} // interface SAEAccessOperations
