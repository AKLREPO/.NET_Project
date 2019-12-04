<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
		<title>Student Registration Form</title>
	</head>

	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br />
			Last Name: <form:input path="lastName"/>
			<br />
			
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			
			
			<br />
			Favourite Language: 
			Java <form:radiobutton path="favouriteLanguage" value="Java" />
			C# <form:radiobutton path="favouriteLanguage" value="C#" />
			C++ <form:radiobutton path="favouriteLanguage" value="C++" />
			Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" />
			
			
			
			<br />
			
			Operating System: 
			
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			MacOS <form:checkbox path="operatingSystems" value="MacOSX" />
			Windows <form:checkbox path="operatingSystems" value="Windows" />
			<br/>
			
			<input type="submit" value="Submit"/>
			
		</form:form>
		
		
		
	</body>


</html>