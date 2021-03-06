<%--
  Service Activate Tile.
  
  Input Form asking for service authentication credentials

  FormBean:
    ActivateForm
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!-- Begin service login page -->
<table width="100%" border="0" cellpadding="0" cellspacing="1" class="tableoutline">
  <tr><td>
    <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
      <tr>
        <td><img src="images/onepx/transp-pixel.gif" alt="" width="10" border="0"></td>
        <td>

        <logic:notEmpty name="message">
          <p class="welcome">Service Activation Failed<p>
          <p class="rightpaneltext"><bean:write name="message" />
        </logic:notEmpty>

        <logic:empty name="message">
          <p class="rightpaneltext">The service you want to activate requires a service-specific username
        and password.
        </logic:empty>
        <br>
        <!-- Begin form -->
        <html:form action="activate" focus="userName">
          <html:hidden property="category" />
          <html:hidden property="subscription" />
          <html:hidden property="serviceType" />
          
          <!-- ------------------------------Start tab outline table------------------------------------ -->
          <table border=0 cellpadding=1 cellspacing=0 class="tableoutline">
            <tr><td>
              <!-- -------------------------Start tab table------------------------------ -->
              <table border=0 cellpadding=0 cellspacing=0>
                <tr>
                  <td height=20><img height=20 src="images/onepx/transp-pixel.gif" alt="" width=1></td>
                  <td class="tabselected" height=20>Service&nbsp;Authentication</td>
                  <td><img height=20 src="images/onepx/transp-pixel.gif" alt="" width=1></td>
                </tr>
              </table>
              <!-- ---------------------------------End Tab table---------------------------- --> 
            </td></tr>
          </table>
          <!-- ---------------------------------End Tab Outline table---------------------------- -->
            
          <!-- Begin border only table table -->
          <table border=0 cellpadding=1 cellspacing=0 class="tableoutline">
            <tr> 
              <td> 
                <!-- Begin login form table -->
                <table width="100%" border=0 cellpadding=0 cellspacing=0>
                  <tr> 
                    <td colspan="2"  bgcolor="#FFFFFF"> 
                      <p class="dialogh1">Please enter your username and password
                      for the service "<%= request.getParameter("subscription") %>":&nbsp;</p>
                    </td>
                  </tr>
                  <tr>
                    <td><img src="images/onepx/transp-pixel.gif" alt="" width="1" height="1"></td>
                  </tr>
                  <tr class="logtablerow"><td colspan="2">&nbsp;</td></tr>
                  <!-- table row for entering username -->
                  <tr class="logtablerow"> 
                    <td class="tablecell"> 
                      <p>Username:
                    </td>
                    <td class="tablecell"> 
                      <html:text property="userName" size="30"/>
                    </td>
                  </tr>
          
                  <!-- table row for entering password -->
                  <tr class="logtablerow"> 
                   <td class="tablecell"> 
                      <p>Password:
                    </td>
                    <td class="tablecell">
                      <html:password property="password" size="30"/>
                    </td>
                  </tr>
                  <tr class="logtablerow"><td colspan="2">&nbsp;</td></tr>
                  <!-- table row for buttons -->
                  <tr class="logtablerow">
                    <td colspan="3">
                      <div align="center"> 
                        <html:submit value="Activate" />
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <html:submit property="cancel" value="Cancel" />
                      </div>
                     </td>
                  </tr>
                  <tr class="logtablerow"><td colspan="2">&nbsp;</td></tr>
                </table>
                <!-- End login form table -->
                  
              </td>
            </tr>
          </table>
          <!-- End border only table -->
        </html:form>
        <!-- End form -->
        <br /></td>
		
        <td><div align="right"><img src="images/pane/service-login.jpg" alt="" width="218" height="207"></div></td>
      </tr>
    </table>
  </td></tr>
</table>

<!-- End service login page -->

<%-- Local Variables: --%>
<%-- mode: html --%>
<%-- End: --%>

