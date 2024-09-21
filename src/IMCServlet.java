import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular-imc")
public class IMCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Definir o tipo de conteúdo da resposta
        response.setContentType("text/html;charset=UTF-8");

        // Recuperar os dados do formulário
        String pesoStr = request.getParameter("weight");
        String alturaStr = request.getParameter("height");

        // Validar os valores
        try {
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);

            // Calcular o IMC
            double imc = peso / (altura * altura);
            String descricao;

            // Classificação do IMC
            if (imc < 18.5) {
                descricao = "Abaixo do peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                descricao = "Peso normal";
            } else if (imc >= 25 && imc < 29.9) {
                descricao = "Sobrepeso";
            } else {
                descricao = "Obesidade";
            }

            // Enviar resposta de volta
            PrintWriter out = response.getWriter();
            out.println("<div id='result'>");
            out.println("<p>Seu IMC: " + String.format("%.2f", imc) + "</p>");
            out.println("<p>Classificação: " + descricao + "</p>");
            out.println("</div>");

        } catch (NumberFormatException e) {
            // Caso ocorra erro na conversão
            PrintWriter out = response.getWriter();
            out.println("<div id='result'>");
            out.println("<p>Erro ao processar os dados. Verifique os valores inseridos.</p>");
            out.println("</div>");
        }
    }
}