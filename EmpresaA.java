package batalha_naval;

public class EmpresaA extends Industria {

	
	public EmpresaA(String nome) {
		super(nome);
	}

	//Metódo abstrato sendo SobreEscrito
	@Override
	public void texto_especial() {
		System.out.println("Você reconhece que o rio próximo está com uma aparência duvidosa e cheio de espumas...\n "
							+ "A fábrica com o nome " +super.getNome()+ " está jogando os restos de resíduos dos produtos no rio ao lado,\n"
							+ "sem nenhum tratamento, denunciada com sucesso!");
		
	}
}
