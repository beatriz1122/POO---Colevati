/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Imposto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculadoraImpostoServlet", urlPatterns = "/calcular")
public class CalculadoraImpostoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Receber parâmetros do formulário
        String cidade = request.getParameter("cidade");
        double areaTotal = Double.parseDouble(request.getParameter("areaTotal"));
        int numeroComodos = Integer.parseInt(request.getParameter("numeroComodos"));
        int numeroQuartos = Integer.parseInt(request.getParameter("numeroQuartos"));
        double areaGaragem = Double.parseDouble(request.getParameter("areaGaragem"));
        int idadeImovel = Integer.parseInt(request.getParameter("idadeImovel"));

        // Calcular o imposto
        double imposto = Imposto.calcularImposto(cidade, areaTotal, numeroComodos, numeroQuartos, areaGaragem, idadeImovel);

        // Enviar resultado para o JSP
        request.setAttribute("imposto", imposto);
        request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
    }
}
