<%@ page import="java.util.*"%>
<%@page import="model.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/imagens.css">
<link rel="stylesheet" href="./css/main.css">
<title>Guia de Veículos</title>
</head>
<body>
	<a href="index.html">Voltar</a>
	<h2>Veículos Disponíveis</h2>
	<%
	ArrayList<Veiculo> lista = (ArrayList<Veiculo>) request
				.getAttribute("listaDeMarcas");

	out.println("<form id=\"form1\" method=\"post\" action=\"adicionar.do\">");
		for (Veiculo veiculo : lista) {

			/*  out.println("<div class=\"img\">");*/
			out.println("<div class=\"modelo\">" + veiculo.getModelo()
					+ "</div>");
			out.println("<img src=\"./img/" + veiculo.getImagem()
					+ "\" alt=\"" + veiculo.getModelo()
					+ "\" width=\"310\" height=\"210\">");
			out.println("<div class=\"desc\">Marca: "
					+ veiculo.getMarca() + "</div>");
			out.println("<div class=\"desc\">Tarifa KM Livre: " + veiculo.getTarKmLivre()
					+ "</div>");
			out.println("<div class=\"desc\">Tarifa KM Controlado: " + veiculo.getTarKmControlado()
					+ "</div>");
			out.println("<div class=\"desc\">Classe: " + veiculo.getClasse()
					+ "</div>");
			out.println("<div class=\"desc\">Placa: " + veiculo.getPlaca()
					+ "</div>");
			out.println("<div class=\"desc\">Kilometragem: " + veiculo.getKm()
					+ "</div>");
			out.println("<div class=\"desc\">Qtd: <input type=\"number\" name=\""+veiculo.getId()+"\" size=\"3\" value=\"\"></div>");
			out.println("<div class=\"desc\"><input type=\"submit\" value=\"Adicionar\"></div>");
			out.println("</div>");
		}
		out.println("</form>");
	%>
</body>
</html>