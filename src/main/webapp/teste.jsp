<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" language="javascript"
	src="//code.jquery.com/jquery-1.12.4.js">
	
</script>

<script type="text/javascript" language="javascript"
	src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js">
	
</script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">

<script type="text/javascript" class="init">
	$(document).ready(function() {
		$('#example').DataTable({
			"processing" : true,
			"serverSide" : true,
			"ajax" : "getAll",
			"columns" : [ {
				"data" : "nome"
			} ]
		});
	});
</script>
</head>
<body>
	<table id="example" class="display" cellspacing="0" width="100%">
		<thead>
			<tr>
				<th>nome</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th>nome</th>
			</tr>
		</tfoot>
	</table>
</body>
</html>