package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/selecao.json")
public class SelecionarVeiculosJSon extends HttpServlet {
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
		response.setContentType("application/json");   
		response.setCharacterEncoding("UTF-8");
		
		String url = request.getRequestURL().toString();   
		url = url.substring(0, url.lastIndexOf('/')) + "/img/";
		
		String cidade = request.getParameter("cidade");
		Seletor sel = new Seletor(url);
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		lista = sel.listarModelos(cidade);
		PrintWriter out = response.getWriter(); 		
		/*for(Veiculo veiculo:lista)
		{   
			veiculo.setImagem(url+"/img/"+veiculo.getImagem()+".jpg");
		} */  
		out.println(JSonFacade.listToJSon(lista)); 

	}
}