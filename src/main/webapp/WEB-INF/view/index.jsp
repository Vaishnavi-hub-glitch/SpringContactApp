<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- context relative path url --%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%-- uses spring form tags to create forms  --%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%-- Uses JSTL conditionally display the error message --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login - Contact Application </title>
        <s:url var="url_css" value="/static/css/style.css"/>
        <link href="${url_css}" rel="stylesheet" type="text/css"/>
    </head>
    <s:url var="url_bg" value="/static/images/bg.jpg"/>
    <body background="${url_bg}">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="80px">
                    <jsp:include page="include/header.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <jsp:include page="include/menu.jsp"/>
                </td>
            </tr>
            <tr>
                <td height="350px" valign="top">
                    <h3>User Login</h3>
                    <c:if test="${not empty err}">
                        <p class="error">${err}</p>
                    </c:if>
                    <c:if test="${param.act eq 'lo'}">
                        <p class="success">Logout Successfully! Thanks for using contact application.</p>
                    </c:if>
                    <c:if test="${param.act eq 'reg'}">
                        <p class="success">User Registered Successfully. Please login</p>
                    </c:if>

                    <%-- --------------Use absolute path for login --%>
                    <f:form action="/SpringContactApp/login" modelAttribute="command">
                        <table border="1">
                            <tr>
                                <td>Username</td>
                                <td><f:input path="loginName" /> </td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><f:password path="password" /> </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="right">
                                    <button type="submit">Login</button> <br/>
                                    <a href="<s:url value='/reg_form'/>">New User Registration</a>
                                </td>
                            </tr>
                        </table>
                    </f:form>
                </td>
            </tr>
            <tr>
                <td height="25px">
                    <jsp:include page="include/footer.jsp"/>
                </td>
            </tr>
        </table>
    </body>
</html>