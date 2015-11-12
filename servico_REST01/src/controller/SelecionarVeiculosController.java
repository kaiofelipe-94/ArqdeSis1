package controller;

import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Seletor;
import model.Veiculo;

/**
 * Servlet implementation class SelecionarCervejasController
 */
@WebServlet("/selecao.do")
public class SelecionarVeiculosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/***
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String cidade = request.getParameter("cidade");
		String url = "";
		Seletor sel = new Seletor(url);
		ArrayList<Veiculo> lista = sel.listarModelos(cidade);
		request.setAttribute("listaDeMarcas", lista);

		RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
		view.forward(request, response);

	}
}