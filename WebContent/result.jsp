<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://displaytag.sf.net" prefix="display"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="loadvalue">
	<display:table id="oblist" name="oblist" pagesize="4"
		requestURI="/loadvalue" export="true" cellpadding="5">
		<display:column property="roll_no" title="Roll Number">
		</display:column>
		<display:column property="s_name" title="StudentName">
		</display:column>
		<display:column property="address">
		</display:column>
		<display:setProperty name="paging.banner.placement" value="bottom" />
	</display:table>
</s:form>
</body>
</html>