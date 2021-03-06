package net.juniper.smgt.sae.sae;


/**
* net/juniper/smgt/sae/sae/ScriptProcessorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from saescript.idl
* Sunday, February 1, 2009 10:24:23 PM EST
*/

public interface ScriptProcessorOperations  extends net.juniper.smgt.sae.sae.SAEFeatureOperations
{

  /**
     * Install and compile a script without executing it.
     *
     * @param[in] scriptName the name under which the script is installed.
     *
     * @param[in] script the source code of the script.
     *
     * @param[in] force if set to true, overwrite the script if it
     * already exists.
     *
     * @throws ScriptSyntaxError if the script could not be compiled
     * @throws OperationFailed if the script could not be installed
     */
  void install (String scriptName, String script, boolean force) throws net.juniper.smgt.sae.sae.ScriptSyntaxError, net.juniper.smgt.sae.sae.OperationFailed;

  /**
     * execute a previously installed script.
     *
     * @param[in] scriptName the name of the script
     * @param[in] args a list of arguments passed to the script
     * @return a string returned from the script
     *
     * @throws ScriptExecutionError if the execution of the script failed.
     * @throws OperationFailed if the script could not be executed.
     */
  String execute (String scriptName, String[] args) throws net.juniper.smgt.sae.sae.ScriptExecutionError, net.juniper.smgt.sae.sae.OperationFailed;

  /**
     * Execute a script without installing it.
     *
     * \note the operation is optional. If a particular ScriptProcessor does
     * not support single execution, an OperationFailed exception
     * will be raised.
     *
     * @param[in] script the source code of the script.
     * @param[in] args a list of arguments passed to the script
     * @return a string returned from the script
     *
     * @throws ScriptExecutionError if the execution of the script failed.
     * @throws OperationFailed if the script could not be executed.
     */
  String execOne (String script, String[] args) throws net.juniper.smgt.sae.sae.ScriptSyntaxError, net.juniper.smgt.sae.sae.ScriptExecutionError, net.juniper.smgt.sae.sae.OperationFailed;

  /**
     * Remove a previously installed script.
     *
     * @param[in] scriptName the name of the script
     * @throws OperationFailed if the script could not be removed.
     */
  void uninstall (String scriptName) throws net.juniper.smgt.sae.sae.OperationFailed;

  /**
     * list currently installed scripts
     *
     * @return list of installed script names.
     */
  String[] listInstalledScripts ();
} // interface ScriptProcessorOperations
