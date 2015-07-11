<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<html>
<head>
<title>Information Form </title>
<s:head/>
</head>
<body>
<h2 style="color: gray;"> Struts2+Hibernate Integration Application </h2>
<hr/>
<s:actionerror/>
<s:form action="addinfoprocess" >
<s:textfield name="firstname" label="First Name">
</s:textfield>
<s:textfield name="lastname" label="Last Name"/>
<s:textfield name="age" label="Age"/>
<s:select list="{'Male','Female'}" label="Gender" headerValue="Select Gender" headerKey="" name="gender"/>
<s:textarea name="address" label="Address"/>
<s:submit></s:submit>
</s:form>
<table border="1">
<caption style="color: green;">Information Added by user</caption>
<tr><th>First Name</th>
<th>Last Name</th>
<th> Gender</th>
<th>Age</th>
<th>Address</th>
<th>Delete</th>
</tr>
<s:iterator value="infoList" var="obAddInfo" >
<tr>
<td><s:property value="firstname"/> </td>
<td><s:property value="lastname"/></td>
<td><s:property value="gender"/></td>
<td><s:property value="age"/></td>
<td><s:property value="address"/></td>
<td><a href="editprocess?id1=<s:property value='id'/>">Edit</a></td>

<td><a href="deleteInfo?id1=<s:property value='id'/>">Delete</a></td>
</tr>
</s:iterator>
</table>
</body>
</html>