package batalha_naval;

public class EmpresaA extends Industria {

	
	public EmpresaA(String nome) {
		super(nome);
	}

	//Met�do abstrato sendo SobreEscrito
	@Override
	public void texto_especial() {
		System.out.println("Voc� reconhece que o rio pr�ximo est� com uma apar�ncia duvidosa e cheio de espumas...\n "
							+ "A f�brica com o nome " +super.getNome()+ " est� jogando os restos de res�duos dos produtos no rio ao lado,\n"
							+ "sem nenhum tratamento, denunciada com sucesso!");
		
	}
}
