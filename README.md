# Projeto: Funções Limpas — Clean Code

Este projeto demonstra boas práticas de desenvolvimento em Java aplicadas à construção de funções limpas, coesas e legíveis. A classe  foi criada com base nos princípios do Clean Code, priorizando clareza, responsabilidade única e ausência de efeitos colaterais.

## 📄 Arquivo principal

- : contém exemplos de funções refatoradas para seguir os princípios de Clean Code, com foco em nomeação adequada, separação de responsabilidades e reutilização de lógica.

## 🎯 Princípios aplicados

- ✅ **Funções com responsabilidade única**  
  Cada função realiza apenas uma tarefa específica, como  e .

- ✅ **Um nível de abstração por função**  
  Métodos como  delegam corretamente ao serviço, sem misturar camadas.

- ✅ **Número mínimo de argumentos**  
  Funções evitam excesso de parâmetros, mantendo a simplicidade e legibilidade.

- ✅ **Sem efeitos colaterais ocultos**  
  Métodos como  não alteram o estado do objeto fora do escopo.

- ✅ **Evita duplicação de lógica**  
  Trechos repetidos foram extraídos para métodos auxiliares como .

## 📁 Estrutura

```
0x00/function/
├── Functions.java
└── README.md
```

## 📚 Referências

- Clean Code — Robert C. Martin
- Convenções de nomenclatura e estruturação de funções em Java
- Princípios SOLID e refatoração orientada a propósito

## 📌 Observações

Este projeto faz parte do repositório [bradesco-hbtn-clean_code](https://github.com/seu-usuario/bradesco-hbtn-clean_code) e serve como base para estudos sobre legibilidade, clareza e boas práticas na construção de funções em Java.

