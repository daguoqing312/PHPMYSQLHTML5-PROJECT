<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"   
      xmlns:h="http://java.sun.com/jsf/html"
      xmlns:f="http://java.sun.com/jsf/core"
      >
 
    <h:body>
 
    	<h1>JSF 2 message + messages example</h1>
 
	<h:form>
 
	  <h:messages style="color:red;margin:8px;" />
 
	  <br />
 
	  <h:panelGrid columns="3">
 
		Enter your username :
 
		<h:inputText id="username" value="#{user.username}" size="20" required="true" label="UserName" >
			<f:validateLength minimum="5" maximum="10" />
		</h:inputText>
 
		<h:message for="username" style="color:red" />
 
		Enter your age :
		<h:inputText id="age" value="#{user.age}" 
			size="20" required="true"
			label="Age" >
			<f:validateLongRange minimum="1" maximum="200" />
		</h:inputText>
 
		<h:message for="age" style="color:red" />
 
	  </h:panelGrid>
 
	  <h:commandButton value="Submit" action="result"/>
 
      </h:form>
 
    </h:body>
</html>