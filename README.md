# 🔌 Padrão Estrutural Adapter – Relatório Financeiro

O **Adapter** é um padrão estrutural que permite que **interfaces incompatíveis colaborem**, convertendo a interface de uma classe para outra esperada pelo cliente.  
É ideal para integrar sistemas legados, padronizar formatos e evitar alterações em código já existente.

---

## 📘 Visão Geral

O Adapter funciona como um **tradutor**


O cliente usa uma interface única e padronizada, enquanto o Adapter ajusta a comunicação com o objeto que possui uma interface diferente.

---

## 🧱 Aplicação no Projeto de Relatório Financeiro

No projeto, utilizamos o Adapter para converter uma **avaliação financeira numérica** (ex.: saldo monetário) em uma **avaliação conceitual**, como:

- SUPERÁVIT  
- DÉFICIT  
- EQUILIBRADO  

O objetivo é manter a interface simples do cliente (`IAvaliacaoFinanceira`) enquanto reutilizamos uma classe legada (`AvaliacaoFinanceiraConceito`).

---

## 🧪 Testes Implementados
✔ Verificação de conceitos convertidos corretamente

- saldo > 0 → SUPERÁVIT
- saldo < 0 → DÉFICIT
- saldo == 0 → EQUILIBRADO

✔ O cliente usa apenas a interface alvo

---

## ⭐ Benefícios do Adapter

- Permite reutilizar código existente sem modificar classes originais.
- Desacopla completamente o cliente da implementação concreta.
- Facilita integração com diferentes sistemas e formatos de dados.
- Mantém o sistema flexível e extensível.
- Reduz impacto de mudanças de arquitetura ou versões.

---

## 🧠 Quando usar?

- Quando uma classe tem interface incompatível com o que o cliente espera.
- Quando você precisa padronizar o acesso a diferentes fontes de dados.
- Quando integra sistemas legados ou bibliotecas externas.
- Quando precisa traduzir formatos (numérico → conceitual, XML → JSON etc.).

