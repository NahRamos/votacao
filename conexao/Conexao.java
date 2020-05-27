package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.RemoverCategoria;
import telas.RemoverCandidato;
import telas.AdicionarCandidato;
import telas.VisualizarVotos;
import nomes.Candidato;
import nomes.Categoria;
import telas.TelaCandidato;
import telas.TelaEleitor;

public class Conexao {
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private String consulta;
    private String nomeCategoria;
    private String nomeCandidato;
    public static ArrayList<Categoria> listaCategorias;
    private TelaEleitor telaEleitor;
    
    
    public void iniciarConexao(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/votacao?useTimezone=true&serverTimezone=UTC";
            String usuario = "root";
            String senha = "";
            
            connection = (Connection)DriverManager.getConnection(url, usuario, senha);
                    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void encerrarConexao(){
        try {
            if(resultSet != null){
                resultSet.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if(connection != null){
                connection.close();
            }
        
        }catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
    
    
    //MÉTODO CHAMADO NAS CLASSES 'VisualizarVotos' e 'VisualizarEleitores'.
    public ResultSet consultarInformacoes(String consulta) {

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(consulta);

        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }

        return resultSet;
    }
    
    
    //MÉTODO PARA ADICIONAR NOVAS CATEGORIAS AO BANCO DE DADOS.
    public boolean adicionarCategoria(Categoria categoria){
        
        try {
            consulta = "INSERT INTO categoria VALUES (?, ?)";
            
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, categoria.getNome());
            preparedStatement.setString(2, categoria.getDescricao());
            preparedStatement.execute(); 
            
            return true;
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }
    
    
    //MÉTODO PARA ADICIONAR NOVOS CANDIDATOS AO BANCO DE DADOS.
    public boolean adicionarCandidato(Candidato candidato){
        
        iniciarConexao();
        
        try {
            consulta = "INSERT INTO candidatos VALUES (?,?,?,?)";
            
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, candidato.getNome());
            preparedStatement.setString(3, candidato.getCategoria());
            preparedStatement.setInt(4, 0);
            preparedStatement.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'RemoverCategoria'.
    public void preencher_ComboBox_Categorias_RemoverCategoria(){
        
        iniciarConexao();
        
        try {
            consulta = "SELECT * FROM categoria";
            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCategoria = resultSet.getString("nome");
                RemoverCategoria.listaCategorias.addItem(nomeCategoria); 
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'VisualizarVotos'.
    public void preencher_ComboBox_Categorias_VisualizarVotos(){
        
        iniciarConexao();
        
        try {
            consulta = "SELECT * FROM categoria";
            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCategoria = resultSet.getString("nome");
                VisualizarVotos.getListaCategorias().addItem(nomeCategoria);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'RemoverCandidato'.
    public void preencher_ComboBox_Categorias_RemoverCandidatos(){
        iniciarConexao();
        
        try {
            consulta = "SELECT * FROM categoria";
            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCategoria = resultSet.getString("nome");
                RemoverCandidato.listaCategorias.addItem(nomeCategoria);           
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'AdicionarCandidatos'.
    public void preencher_ComboBox_Categorias_AdicionarCandidatos(){
        iniciarConexao();
        
        try {
            consulta = "SELECT nome FROM categoria";
            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCategoria = resultSet.getString("nome");
                AdicionarCandidato.listaCategorias.addItem(nomeCategoria);  
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'RemoverCandidato'.
    public void preencher_ComboBox_Candidatos_RemoverCandidato(String categoria){
        
        iniciarConexao();
        
        try {
            consulta = "SELECT * FROM candidatos WHERE nome_cat='" + categoria + "'";
            preparedStatement = connection.prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCandidato = resultSet.getString("nome");
                RemoverCandidato.listaCandidatos.addItem(nomeCandidato);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'TelaCandidato'.
    public void preencher_ComboBox_Candidatos_TelaCandidato(String categoria){
        
        try {
            consulta = "SELECT * FROM candidatos WHERE nome_cat='" + categoria + "'";
            preparedStatement = connection.prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCandidato = resultSet.getString("nome");
                TelaCandidato.listaCandidatos.addItem(nomeCandidato);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    //MÉTODO PARA EXCLUIR CATEGORIAS DO BANCO DE DADOS.
    public boolean excluirCategoria(String categoria){
        iniciarConexao();
        
        try {
            consulta = "DELETE FROM categoria WHERE nome=?";
            preparedStatement = connection.prepareStatement(consulta);
            
            preparedStatement.setString(1, categoria);
            preparedStatement.execute();
                        
            return true;
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        encerrarConexao();
        return false;
    }
   
    
    //MÉTODO PARA EXCLUIR CANDIDATOS DO BANCO DE DADOS.
    public boolean excluirCandidato(String candidato){
        iniciarConexao();
        
        try {
            consulta = "DELETE FROM candidatos WHERE nome=?";
            preparedStatement = connection.prepareStatement(consulta);
            
            preparedStatement.setString(1, candidato);
            preparedStatement.execute();
            
            return true;
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return false;
    }

    
    //MÉTODO QUE BUSCA AS INFORMAÇÕES DE LOGIN DO ADMINISTRADOR.
    public boolean consultarLoginSenhaAdministrador(String login, String senha) {

        try {
            consulta = "SELECT login, senha FROM administrador WHERE login = ? AND senha = ?";

            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, senha);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'TelaEleitor' QUE RETORNA AS INFORMAÇÕES DO ELEITOR ESCOLHIDO E AS EXIBE NA TELA.
    public boolean consultarEleitor(int id){
        iniciarConexao();
    
        try {
            consulta = "SELECT id,nome FROM eleitores WHERE id=?";
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()){
                
                TelaEleitor.ID.setText(resultSet.getString("id"));
                TelaEleitor.nome.setText(resultSet.getString("nome"));
                
                return true;
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'TelaCandidato' QUE RETORNA AS INFORMAÇÕES DO CANDIDATO ESCOLHIDO E AS EXIBE NA TELA.
    public boolean consultarCandidato(String nome){
        iniciarConexao();
    
        try {
            consulta = "SELECT * FROM candidatos WHERE nome=?";
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setString(1, nome);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()){
                
                TelaCandidato.labelCandidato.setText(resultSet.getString("nome"));
                TelaCandidato.labelID.setText(resultSet.getString("id"));
                TelaCandidato.labelCategoria.setText(resultSet.getString("nome_cat"));
                
                return true;
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    
    //INCREMENTA O NÚMERO DE VOTOS PARA O CANDIDATO ESCOLHIDO.
    public void computarVoto(String nome){
        iniciarConexao();
        
        try {
            consulta = "UPDATE candidatos SET numeroVotos = numeroVotos+1 WHERE nome = '" + nome + "'";
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //MUDA O CAMPO 'jaVotou' NO BANCO DE DADOS DE FALSO PARA VERDADEIRO.
    public void mudarStatusEleitor(int id){
        iniciarConexao();
        
        try {
            consulta = "UPDATE eleitores SET jaVotou = TRUE WHERE id = ?";
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //MÉTODO QUE IMPEDE QUE ALGUÉM QUE JÁ VOTOU VOTE NOVAMENTE.
    public boolean verificarVoto(int jaVotou){
            iniciarConexao();
            
        try {
            consulta = "SELECT jaVotou FROM eleitores WHERE id = ?";
            preparedStatement = connection.prepareStatement(consulta);
            preparedStatement.setInt(1, jaVotou);
            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                if(resultSet.getBoolean("jaVotou") == true){
                    JOptionPane.showMessageDialog(telaEleitor, "Esse eleitor já votou.", "Voto não permitido", 0);
                    TelaEleitor.campoID.requestFocus();
                }else{
                   return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
    //REÚNE AS CATEGORIAS EXISTENTES NO BANCO DE DADOS EM UM ARRAYLIST.
    public List<Categoria> juntarTodasAsCategorias(){
        
        listaCategorias = new ArrayList<>();
        Categoria categoria;
        iniciarConexao();
        
        try {
            consulta = "SELECT nome FROM categoria";
            statement = connection.prepareStatement(consulta);
            resultSet = statement.executeQuery(consulta);

            while(resultSet.next()){

                nomeCategoria = resultSet.getString("nome");
                categoria = new Categoria(nomeCategoria);
                listaCategorias.add(categoria);
            }

        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return listaCategorias;
}
    
    
    //MÉTODO QUE FAZ O LOOP DE CATEGORIAS DE ACORDO COM O ARRAYLIST GERADO NO MÉTODO ACIMA.
    public void rodarCategorias(int indice){
        
        //limpa o combobox dos candidatos antes de chamar a próxima categoria.
        remover_ComboBox_Candidatos_TelaCandidato(juntarTodasAsCategorias().get(indice-1).getNome());
        
        TelaCandidato.campoCategoria.setText(juntarTodasAsCategorias().get(indice).getNome());
        preencher_ComboBox_Candidatos_TelaCandidato(listaCategorias.get(indice).toString());
        
        //adiciona a possibilidade do voto nulo.
        TelaCandidato.listaCandidatos.addItem("Nulo");
    }
    
    
    //MÉTODO CHAMADO NA CLASSE 'TelaCandidato'.
    public void remover_ComboBox_Candidatos_TelaCandidato(String categoria){
        
        try {
            consulta = "SELECT * FROM candidatos WHERE nome_cat='" + categoria + "'";
            preparedStatement = connection.prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery(consulta);
            
            while(resultSet.next()){
                
                nomeCandidato = resultSet.getString("nome");
                TelaCandidato.listaCandidatos.removeItem(nomeCandidato);
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}