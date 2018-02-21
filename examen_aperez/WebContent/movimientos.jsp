<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,beans.Movimiento"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movimientos</title>
</head>
<body>
<%List<Movimiento> movimientos = (List<Movimiento>)request.getAttribute("movimientos");
double saldoanterior=(double)request.getAttribute("saldo");
 
if (movimientos==null || movimientos.size()==0){%>
	<center>
	<table border=1>	
		<tr><td>No hay movimientos</td></tr>
	</table>	
<%}%>
<center>
<table border=1>
<tr>
<th>Fecha</th><th>Operación</th><th>Cantidad</th>
</tr>
	<% for(int i=movimientos.size()-1;i>=0;i--){%>
		 <tr><td><%=movimientos.get(i).getFecha() %></td><td><%=movimientos.get(i).getOperacion() %>
		 </td><td><%=movimientos.get(i).getCantidad() %></td>
		 <td> <%=saldoanterior %><% saldoanterior=(movimientos.get(i).getOperacion().equals("ingreso")?(saldoanterior - movimientos.get(i).getCantidad()):(saldoanterior + movimientos.get(i).getCantidad())); %>
		      
		</td>
		 </tr>
	<%}%>
	<tr><td>Saldo actual:<%=request.getAttribute("saldo") %></td></tr>
</table>
<a href="Controller?op=toOperacion" >Volver Operaciones</a>
<a href="Controller?op=toLogin" >Volver Login</a>
</center>


</body>
</html>