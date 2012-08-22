<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
<%-- 	<h:outputLabel value="#{person.name}"></h:outputLabel> --%>
<%-- 	<h:outputLabel value="#{person.deceased}"></h:outputLabel> --%>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Test Person</title>
	</head>
	
    <body>
    	<f:view>
    		<h:form>
    			Name: <h:outputLabel value="#{person.name}"></h:outputLabel><br/>
        		Deceased? <h:outputLabel value="#{person.deceased}"></h:outputLabel><br/>
    			<br/>
    			Enter a name: <h:inputText value="#{person.name}"/><br/>
            	Choose an option:
				            	<h:selectOneListbox value="#{person.deceased}">
				            		<f:selectItem itemValue="false" itemLabel="Alive"/>
				            		<f:selectItem itemValue="true" itemLabel="Dead"/>            	
				            	</h:selectOneListbox>					
            						
            	<h:commandButton value="Test the Bean"></h:commandButton>					
            						
    		</h:form>        	
    	</f:view>
    </body>
    
</html>
