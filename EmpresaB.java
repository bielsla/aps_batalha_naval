package batalha_naval;

public class EmpresaB extends Industria {

	public EmpresaB(String nome) {
		super(nome);
	}

	//Met�do abstrato sendo SobreEscrito
	@Override
	public void texto_especial() {
		System.out.println("Voc� encontrou uma empresa chamada " + super.getNome() + " e ela n�o utilizava filtros para os vapores t�xicos que eram liberados para a atmosfera,\n"
							+ " ela estava destruindo o len�ol fre�tico, denunciada com sucesso!");
		
	}
}
