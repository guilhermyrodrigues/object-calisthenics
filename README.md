## ✅ Etapa 1: Análise Inicial – Violações dos Princípios de Object Calisthenics

Abaixo estão listadas as violações encontradas no código original da classe `Venda`, com base nos 9 princípios de **Object Calisthenics**:

---

### 1. Only One Level of Indentation per Method *(Apenas um nível de indentação por método)*

*  O método `calcDesc()` possui múltiplos níveis aninhados (`if` dentro de `if`).
*  O método `genRpt()` mistura laço `for` com chamadas de métodos e concatenação.

---

### 2. Don't Use the ELSE Keyword *(Não use a palavra-chave ELSE)*

*  O `else` é utilizado no método `calcDesc()`, o que pode ser evitado com retornos antecipados.

---

### 3. Wrap All Primitives and Strings *(Encapsule todos os primitivos e Strings)*

*  Os atributos `double valTot`, `boolean conf`, `String cli` e `List<String> itns` são tipos primitivos ou Strings diretos.

---

### 4. First Class Collections *(Coleções como objetos de primeira classe)*

*  A coleção `List<String> itns` deveria estar encapsulada em uma classe como `ItensVenda` para conter a lógica associada.

---

### 5. One Dot per Line *(Um ponto por linha)*

*  O acesso `not.send(...)` mostra acoplamento direto com métodos internos de um objeto composto.

---

### 6. Don't Abbreviate *(Não abrevie)*

*  Abreviações excessivas como `valTot`, `cli`, `conf`, `itns`, `not`, `itm` comprometem a clareza do código.

---

### 7. Keep All Entities Small *(Mantenha todas as classes pequenas)*

*  A classe `Venda` tem muitas responsabilidades: adiciona itens, calcula desconto, gera relatório, confirma venda e envia notificação.

---

### 8. No Classes with More Than Two Instance Variables *(No máximo duas variáveis por classe)*

*  A classe `Venda` possui **cinco atributos**, ultrapassando o limite recomendado.

---

### 9. Use Getters/Setters with Caution *(Use getters/setters com cautela)*

*  Getter e setter diretos para `conf`. Além disso, o setter possui lógica acoplada (`not.send(...)`).

---

Essas violações comprometem a manutenção, reutilização e clareza do código. A próxima etapa é aplicar os princípios para realizar uma refatoração completa e aderente a boas práticas de projeto orientado a objetos.

---

## ✅ Etapa 2: Refatoração com base nos 9 Princípios de Object Calisthenics

### 1. Only One Level of Indentation per Method

**Como foi resolvido:**

* Todos os métodos foram reestruturados para conter apenas um nível de indentação, utilizando retornos antecipados em vez de estruturas aninhadas.

### 2. Don't Use the ELSE Keyword

**Como foi resolvido:**

* O uso de `else` foi eliminado. Em seu lugar, retornos diretos e lógica linear foram aplicados.

### 3. Wrap All Primitives and Strings

**Como foi resolvido:**

* Criadas classes como `Cliente`, `ValorTotal`, `ItemVenda` e `Confirmacao` para encapsular tipos primitivos e Strings.

### 4. First Class Collections

**Como foi resolvido:**

* Criada a classe `ItensVenda`, que encapsula a lista de itens e suas operações, como `adicionar()` e `quantidade()`.

### 5. One Dot per Line

**Como foi resolvido:**

* Minimizado o acesso em cadeia com encapsulamento. Ex: ao invés de `not.send(...)`, o envio de notificação ocorre dentro de um método específico da venda.

### 6. Don't Abbreviate

**Como foi resolvido:**

* Todos os nomes de variáveis e classes foram renomeados para nomes descritivos, como `cliente`, `valorTotal`, `notificacao`, `confirmacao`, etc.

### 7. Keep All Entities Small

**Como foi resolvido:**

* A classe `Venda` foi dividida em múltiplas responsabilidades: `Venda`, `DetalhesVenda`, `RelatorioVenda`, etc., cada uma com uma responsabilidade clara.

### 8. No Classes with More Than Two Instance Variables

**Como foi resolvido:**

* A nova classe `Venda` possui apenas dois atributos: `cliente` e `detalhes`. As demais responsabilidades foram distribuídas entre novas classes.

### 9. Use Getters/Setters with Caution

**Como foi resolvido:**

* Setters foram eliminados e a lógica de confirmação foi movida para métodos que encapsulam comportamento (ex: `confirmarVenda()`).

---

A refatoração torna o sistema mais coeso, legível e aderente a boas práticas orientadas a objetos, facilitando manutenção e extensão futuras.
