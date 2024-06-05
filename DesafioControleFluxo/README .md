# Contador

Este é um projeto simples em Java que solicita ao usuário dois números inteiros e imprime uma contagem a partir do primeiro número até o segundo. Se o segundo número for menor ou igual ao primeiro, uma exceção personalizada `ParametrosInvalidosException` é lançada.

## Estrutura do Projeto

### Classes

- **Contador**
  - Classe principal que contém o método `main` e a lógica para contar entre os números fornecidos pelo usuário.
  
- **ParametrosInvalidosException**
  - Uma exceção personalizada que estende `IllegalArgumentException` e é usada para indicar que os parâmetros fornecidos são inválidos.

## Como Usar

### Requisitos

- Java Development Kit (JDK) instalado
- Um ambiente de desenvolvimento ou terminal com acesso ao comando `javac` e `java`

### Passos para Execução

1. Clone este repositório ou copie os arquivos `Contador.java` e `ParametrosInvalidosException.java` para seu ambiente local.
2. Compile os arquivos Java:

    ```sh
    javac Contador.java
    ```

3. Execute o programa:

    ```sh
    java Contador
    ```

4. Siga as instruções no terminal para fornecer os dois parâmetros inteiros.

### Exemplo de Uso

```sh
Digite o primeiro parametro
3
Digite o segundo parametro
7
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

Se o segundo parâmetro for menor ou igual ao primeiro, a seguinte mensagem de erro será exibida:

```sh
Digite o primeiro parametro
5
Digite o segundo parametro
3
ParametrosInvalidosException: O segundo parâmetro deve ser maior que o primeiro
```

## Código

### Contador.java

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = teclado.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            int a = i + 1;
            System.out.println("Imprimindo o número " + a);
        }
    }
}
```

### ParametrosInvalidosException.java

```java
public class ParametrosInvalidosException extends IllegalArgumentException {
    public ParametrosInvalidosException() {
        super("Parâmetro Inválido");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
```

## Contribuições

Sinta-se à vontade para abrir issues ou enviar pull requests com melhorias e correções.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

