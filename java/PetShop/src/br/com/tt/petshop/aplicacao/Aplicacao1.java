package br.com.tt.petshop.aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

import br.com.tt.petshop.dao.AnimalDAOImpl;
import br.com.tt.petshop.dao.ClienteDAOImpl;
import br.com.tt.petshop.dao.UnidadeDAOImpl;
import br.com.tt.petshop.exception.CpfException;
import br.com.tt.petshop.exception.ValidacaoException;
import br.com.tt.petshop.model.Animal;
import br.com.tt.petshop.model.Cliente;
import br.com.tt.petshop.model.Mamifero;
import br.com.tt.petshop.model.Peixe;
import br.com.tt.petshop.model.Produto;
import br.com.tt.petshop.model.Reptil;
import br.com.tt.petshop.model.Unidade;
import br.com.tt.petshop.tipos.TipoAnimal;
import br.com.tt.petshop.tipos.TipoCliente;
import br.com.tt.petshop.tipos.TipoProduto;

public class Aplicacao1 {
	
	private static final UnidadeDAOImpl unidadeDAO;
	private static final ClienteDAOImpl clienteDAO;
	private static final AnimalDAOImpl animalDAO;
	static{
		unidadeDAO = new UnidadeDAOImpl();
		clienteDAO = new ClienteDAOImpl();
		animalDAO = new AnimalDAOImpl();		
	}
	// para crair interfaces para desktop - usar netbeans/ fx/ frame em html como spotify, steam..
	public static void menu(){		
		JMenuBar menu = new JMenuBar();
		
		//menu para unidades
		JMenuItem criaUnidade = new JMenuItem("Cria unidade");
		criaUnidade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					criaUnidade();
				} catch (ValidacaoException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		menu.add(criaUnidade);
		
		//menu para lista unidades
		JMenuItem listaUnidades = new JMenuItem("Lista unidades");
		listaUnidades.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			listaUnidade();
			}});
		menu.add(listaUnidades);
		
		//menu para clientes
		JMenuItem criaCliente = new JMenuItem("Cria cliente");
		criaCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				criarCliente();
			} catch (ValidacaoException | CpfException | SQLException e1) {
				e1.printStackTrace();
			}
			}});
		menu.add(criaCliente);
		
		//menu para lista clientes
		JMenuItem listaCliente = new JMenuItem("Lista clientes");
		listaCliente.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			listaClientes();
			}});
		menu.add(listaCliente);
		
		JToolBar toolbar = new JToolBar();
		toolbar.add(menu);
		
		JPanel panel = new JPanel();
		panel.add(toolbar);
		
		JOptionPane.showMessageDialog(null, panel);
	}
		
	public static void listaUnidade(){
		
		try {
			List<Unidade> unidades = unidadeDAO.listarTodos();
			JList<String> lista = new JList<String>(new ListModel<String>(){

				@Override
				public int getSize() {
					return unidades.size();
				}

				@Override
				public String getElementAt(int index) {
					return "Unidade: "+unidades.get(index).getNome() + " // Endereço: " 
							+ unidades.get(index).getEndereco();
				}

				@Override
				public void addListDataListener(ListDataListener l) {
				}

				@Override
				public void removeListDataListener(ListDataListener l) {
				}});		
			JOptionPane.showMessageDialog(null, lista);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	public static void listaClientes(){
		
		try {
			List<Cliente> clientes = clienteDAO.listarTodos();
			JList<String> lista = new JList<String>(new ListModel<String>(){

				@Override
				public int getSize() {
					return clientes.size();
				}

				@Override
				public String getElementAt(int index) {
					return "Clientes: "+clientes.get(index).getNome() + " // CPF: " 
							+ clientes.get(index).getCpf();
				}

				@Override
				public void addListDataListener(ListDataListener l) {
				}

				@Override
				public void removeListDataListener(ListDataListener l) {
				}});		
			JOptionPane.showMessageDialog(null, lista);
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	
	public static void main(String[] args) {
		
		menu();
		
		/*
		try{					
		Unidade novaUnidade = criaUnidade();		
		Cliente novoCliente = criarCliente(novaUnidade);		
		Animal novoAnimal = criarAnimal(novoCliente, novaUnidade);		
		Produto novoProduto = criarProduto();
		
		} catch (CpfException exception1){
			JOptionPane.showMessageDialog(null, "O formato do CPF é inválido!");
		} catch (ValidacaoException exception1){
			JOptionPane.showMessageDialog(null, exception1.getMessage());
		} catch (Exception exception1){
			exception1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro não esperado. Consulta seu suporte!");
		} finally{
			//sempre cai aqui.
			JOptionPane.showMessageDialog(null, "Encerrando...");
		}
		*/
		
		
		//Trava a execução até dar enter no console
		//new Scanner(System.in).nextLine();
	}

	private static Produto criarProduto() {
		//Le
		String descricao = JOptionPane.showInputDialog("Informe a descrição do produto");
		String valorString = JOptionPane.showInputDialog("Informe o valor");
		String tipo = JOptionPane.showInputDialog(
				"Informe o tipo (MEDICAMENTO,ALIMENTO,ESTETICO,BRINQUEDO)");

		//Seta no produto
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setValor(Float.parseFloat(valorString));
		produto.setTipo(TipoProduto.valueOf(tipo.toUpperCase()));
		
		//Mostrar a mensagem de cadastrado
		JOptionPane.showMessageDialog(null, produto + " criado!");
		
		return produto;
	}

	private static Animal criarAnimal(Cliente novoCliente, Unidade novaUnidade) throws Exception{

		if(novoCliente == null || novaUnidade == null ){
			throw new IllegalArgumentException("Informe o cliente ou unidade!");
			//podia por IAE - abreviacoes funcionam no eclipse
			//essa exceção é para o desenvolvedor - pq nao podia passar aqueles set como nulos
			//é como uma verificação dupla.
			//IAE é filha de runtimeException - assim burla o Exception e passa por cima. nao precisa
			//por no throws na chamada do método.
		}
		
		String tipo = JOptionPane.showInputDialog("Informe o tipo do animal: "
				+ "Mamifero, Peixe ou Reptil.");
		
		TipoAnimal tipoEnum = TipoAnimal.valueOf(tipo.toUpperCase());
		Animal animal = null;
		
		switch(tipoEnum){
		case MAMIFERO:
			animal = new Mamifero();
			break;
		case PEIXE:
			animal = new Peixe();
			break;
		case REPTIL:			
			animal = new Reptil();
		}		

		animal.setCliente(novoCliente);
		animal.setUnidade(novaUnidade);

		JOptionPane.showMessageDialog(null, animal + " criado!");

		return animal;
	}

	private static Cliente criarCliente() throws ValidacaoException, CpfException, SQLException {
		
		Cliente cliente = new Cliente();
		String nome = JOptionPane.showInputDialog("Informe o nome do cliente");
		cliente.setNome(nome);
		String cpf = JOptionPane.showInputDialog("Informe o CPF do Cliente (Formato xxx.xxx.xxx.-xx).");
		cliente.setCpf(cpf);
		String tipo = JOptionPane.showInputDialog(
				"Informe o tipo do cliente (fisica, juridica)");


		if(tipo.equalsIgnoreCase("fisica")){
			cliente.setTipo(TipoCliente.PESSOA_FISICA);
		}else{
			cliente.setTipo(TipoCliente.PESSOA_JURIDICA);
		}
		
		List<Unidade> unidades = new ArrayList<Unidade>();
		unidades.add(selecionaUnidade());
		cliente.setUnidades(unidades);
		
		clienteDAO.salvar(cliente);
		
		JOptionPane.showMessageDialog(null, cliente + " criado!");
		
		return cliente;
	}

	private static Unidade selecionaUnidade() throws SQLException {
		List<Unidade> listaUnidades = unidadeDAO.listarTodos();
		return (Unidade) JOptionPane.showInputDialog(null, "Selecione uma unidade:", "Unidades", 
				JOptionPane.INFORMATION_MESSAGE, null, listaUnidades.toArray(), null);
		
	}

	private static Unidade criaUnidade() throws ValidacaoException, SQLException{
		
		String nome = JOptionPane.showInputDialog("Informe o nome da Unidade");
		
		Unidade unidade = new Unidade();
		unidade.setNome(nome);
		
		/*
		exemplo 1:
		try{
			unidade.setNome(nome);
		}catch(Exception excecao1){
			JOptionPane.showMessageDialog(null, "Nome da Unidade inválido!");
		}
		
		exemplo2: (caso a message seja algo nao intuitivo, ruim para o usuario.. aí pode passar acima
		e ainda mudar a mensagem enviada:
		try{
			unidade.setNome(nome);
		}catch(Exception excecao1){
			if(excecao1.getMessage()equals("COD123")){
			throw new Exception ("Nome da unidade invalido!");
			}else{
			throw excecao1; 
			}
			
		}
		
		exemplo 3: puxar com throw até o main, aonde try catch na msg.
		*/	
		

		String endereco = JOptionPane.showInputDialog("Informe o Endereço da Unidade");
		unidade.setEndereco(endereco);
		
		//DAO
		unidadeDAO.salvar(unidade);
		
		JOptionPane.showMessageDialog(null, unidade + " criada!");

		return unidade;
	}
}
