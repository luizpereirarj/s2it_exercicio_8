package s2it.exercicio8;

public class Numero {

	private char[] primeiro;
	private char[] segundo;

	public char[] getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(char[] primeiro) {
		this.primeiro = primeiro;
	}

	public char[] getSegundo() {
		return segundo;
	}

	public void setSegundo(char[] segundo) {
		this.segundo = segundo;
	}

	public Long aplicaRegras() {

		StringBuffer resultado = new StringBuffer();

		int index = 0;
		while (index < primeiro.length || index < segundo.length) {
			if (index < primeiro.length) {
				resultado.append(primeiro[index]);
			}
			if (index < segundo.length) {
				resultado.append(segundo[index]);
			}
			index++;
		}
		
		return validaNumero(resultado.toString());

	}
	
	private Long validaNumero(String resultado) {
		try {
	        Long numero=Long.parseLong(resultado);
	        if (numero>1000000) {
	        	return new Long(-1);	
	        }else {
	        	return numero;
	        }
        }catch (NumberFormatException e) {
        	System.out.println("Por favor, verifique o número informado e tente novamente.");
		}
		return null;
	}

}
