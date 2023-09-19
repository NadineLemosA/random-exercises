# Git

## Sobre os EXERCICIOS

A coisa mais importante é entender o conteúdo. Então para atingir esse objetivo faça o seguinte:

- Tente refazer os exercicios sempre sem olhar nada. **ATENÇÃO**: Tudo dever ocorrer exatamente conforme o exercicio se algo aconteceu diferente algo errado foi feito
- A cada novo exercicio REFAZER todos os anteriores. Quanto mais tu precisar ler a explicação para atingir deternada situação, menos tu tem isso fixado.
- Depois que todos esse exercicios forem feitos e devidamente entendidos tentar fazer os exercicios do [learngitbranching](https://learngitbranching.js.org/?locale=pt_BR). O site possui conteúdo a mais mas vale a pena saber e entender todos 😀

> **ATENÇÃO**: Isso se aplica apenas aos exercicios e não deve ser feito novamente os passo da explicação

## Índice

<details>
  <summary>Convenções</summary>

&emsp;&emsp;[Nomenclatura de branch](#nomenclatura-de-branch)\
&emsp;&emsp;[Mensagens de commits](#mensagens-de-commits)

</details>

<details>
  <summary>Branch</summary>

&emsp;&emsp;[Explicação](#branch)\
&emsp;&emsp;[Exercicio](#exercicio)

</details>

<details>
  <summary>Merge</summary>

&emsp;&emsp;[Explicação](#merge)\
&emsp;&emsp;[Exercicio](#exercicio-1)

</details>

<details>
  <summary>Conflitos</summary>

&emsp;&emsp;[Explicação](#conflitos)\
&emsp;&emsp;[Exercicio](#exercicio-2)

</details>

<details>
  <summary>Rebase</summary>

&emsp;&emsp;[Explicação](#rebase)\
&emsp;&emsp;[Exercicio](#exercicio-3)

</details>

<details>
  <summary>Cherry-pick</summary>
</details>

<details>
  <summary>Squash</summary>
</details>

## Convenções

Convenções são padrões comuns utlizados por desenvolvedores em seus projetos para melhor padronizar os projetos, podendo também serem utilizadas para automatizar processos relacionados ao repositório, como por exemplo, mergiar automaticamente duas branch se determinado critério for atingido. Alguns projetos possuem convenções próprias, por isso sempre que iniciar em um projeto procure saber quais são as convenções utilizadas nele

### Nomenclatura de branch

Convenções muito comuns utilizadas em projetos são as de nomenclatura de branchs. Normalmente os desenvolvedores buscam nomear as branchs dos projeto com nomes curtos e objetivos, utilizando kebab-case no nome(exemplo-de-kebab-case), com algum tipo de identificador da tarefa e um tipo de prefixo para dar uma ideia do que o branch se trata. Por exemplo, **hotfix** para corrigir rapidamente problemas críticos, geralmente com uma solução temporária, **bugfix** para corrigir um bug ou **feature** para adicionar, remover ou modificar um recurso. Leia essas [dicas](https://tilburgsciencehub.com/building-blocks/collaborate-and-share-your-work/use-github/naming-git-branches/) para ver mais exemplos

### Mensagens de commits

As convenções para commits são um pouco mais polêmicas e não muito conhecidas/utilizadas, porém também são muito uteis. Seja para padronizar as mensagens como para facilitar o o entendimento do objetivo do commit. Uma das principais vantagens da utilização de uma convenção de commits é na automação do versionamento do projeto. Utilizando a especificação do [conventional commits](https://www.conventionalcommits.org/pt-br/v1.0.0/) é muito mais fácil para o time automatizar o versionamento do código utilizando a especificação [semver](https://semver.org/lang/pt-BR/), utilizado para definir qual a versão 1.0.0 ou 1.0.1...

## Branch

Pensa no git como uma linha do tempo. A main(_principal_) é a linha do tempo que como o próprio nome diz é a principal e a partir dessa linha do tempo principal tu pode contruir diferentes histórias(_códigos_). Porém para não afetar a linha do tempo principal tu cria uma branch(_ramificação_) e isso faz com que tudo que aconteça nessa linha do tempo alternativa(_a branch criada_) não afete a linha do tempo principal.

Nessa branch(_exercicios-de-branch_) nós iremos avacalhar a história para que tu entenda como funciona isso e como ser uma viajante no tempo(_poder alternar entre essa branch e a main_)

O que fazer nessa branch:

- Excluir todo os arquivos, exceto o README.md
- Criar um arquivo de texto chamado TEXTO.md
- Escrever no TEXTO.md _"# Primeira Linha do tempo"_
- Fazer o commit com a mensagem _"Primeira linha do tempo"_

Nesse momento essa linha do tempo ja esta bem diferente da principal e agora tu vai ver

- Dar o comando _"git log"_. Esse comando vai mostar o histórico de commits desde o inicio do projeto, para navegar ele tu utiliza as setinha do teclado e não o scroll do mouse e para sair tu aperta 'q'
- Sair do git log com o _"q"_
- Alternar para a branch main

Agora tu vai perceber que todo o teu código voltou e isso acontece porque tudo que aconteceu na branch alternativa existiu apenas naquela branch e não afeta a branch principal

- Dar o comando _"git log"_. Vai ver que o commit _"Primeira linha do tempo"_ não existe
- Sair do git log
- Verificar os arquivos na IDE que irão ter aparecido novamente
- Voltar para a branch _"exercicios-de-branch"_
- Dar o comando _"git log"_. Vai ver que o commit _"Primeira linha do tempo"_ apareceu novamente
- Sair do git log
- Verificar os arquivos na IDE que sumiram novamente porque foi excluído naquele commit

> **NOTA**: O commit representa um ponto importante na história onde algo aconteceu. IMPORTANTE ter em mente que quando tu altera os aquivos e não commita eles não importam na linha to tempo não sendo enviador para o GitHub e ainda podem até não te deixar mudar de branch por não terem sido commitados(_salvos_). Nesse caso tu tem que decidir se tu abandona as alterações ou se tu as commita para criar esse ponto importante na história

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"segunda-linha-do-tempo"_ a partir da _"exercicios-de-branch"_
- Alterar o titulo do TEXTO.md _"# Primeira Linha do tempo"_ para _"# Segunda Linha do tempo"_
- Fazer o commit com a mensagem _"Segunda linha do tempo"_
- Dar o comando _"git log"_. Vai ver que tem o commit _"Primeira Linha do tempo"_. Sabe o por quê?
- Alterar para a branch _"exercicios-de-branch"_
- Dar o comando _"git log"_
- Excluir a branch _"segunda-linha-do-tempo"_

> **IMPORTANTE**: Se tu não fez o git push, que não pedi para tu fazer em nenhum momento. Tu vai ver que os arquivos ainda existem no GitHub e isso se dá porque tu não atualizou o GitHub. Não esquece que existem dois ambientes o local(_Git_) e o remoto(_GitHub_). E as coisas que neles só são atualizadas se tu as atualizar manualmente. _"git push"_ para enviar tuas alterações para o ambiente remoto e _"git pull"_ para buscar as alterações do ambiente remoto

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

## Merge

O merge é o evento em que tu mistura as linhas do tempo. Por exemplo, digamos que tinha a linha do tempo A e criou a B. Na linha do tempo B tu começou a escrever uma nova história e tu decidiu que gostou de todas aquela decisões tomadas na linha do tempo B. Nesse caso tu mesclar(_mergiar_) as duas

Vamos criar uma nova linha do tempo(_meu-primeiro-merge_) fazer alterações e então mergiar com _"exercicios-de-branch"_

- Na branch _"exercicios-de-branch"_ execute _"git log"_ para verificar qual o ultimo commit existente
- Criar a branch _"meu-primeiro-merge"_ a partir da _"exercicios-de-branch"_ e ir para ela
- Alterar o texto do arquivo _"TEXTO.md"_ para _"Meu primeiro merge"_ e commitar
- Alternar para a branch _"exercicios-de-branch"_

> **ATENÇÃO**: Antes de executar o próximo passo tenha certeza que esta na branch _"exercicios-de-branch"_

- Mergiar a branch _"exercicios-de-branch"_ com a _"meu-primeiro-merge"_. O comando é _"git merge &lt;nome-da-branch&gt; --no-ff"_. Por exemplo, _"git merge meu-primeiro-merge --no-ff"_. Ao usar o comando _"git merge &lt;nome-da-branch&gt; --no-ff"_ o Git sempre irá cria um commit para registar o evento. O comando _"git merge &lt;nome-da-branch&gt;"_ apenas gera o commit automático em algumas situações para evitar isso usa-se a opção _"--no-ff"_
- _"git log"_ e tu ira ver que o commit que tu criou na branch _"meu-primeiro-merge"_ agora esta na branch _"exercicios-de-branch"_ juntamente com o commit criado pelo merge
- _"git branch -D meu-primeiro-merge"_ para excluir a branch

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"exercicio-merge-1"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"PRIMEIRABRANCH.md"_ com o texto _"Essa é a primeira branch"_ e commita-lo
- Criar uma branch _"exercicio-merge-2"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"SEGUNDABRANCH.md"_ com o texto _"Essa é a segunda branch"_ e commita-lo
- Ir para a branch _"exercicio-merge-1"_ e fazer o merge da _"exercicio-merge-2"_ com ela
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicios-de-branch"_
- Excluir as branchs _"exercicio-merge-1"_ e _"exercicio-merge-2"_

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

## Conflitos

O conflito acontece quando as linhas do tempo interagiram de formas diferentes com a mesma coisa. Nesse caso, no momento em que é mergiada as linhas do tempo o Git dirá que há conflitos e você deve ajustar a história para que ambas a linhas do tempo façam sentido

- Criar um arquivo _"CONFLITO.md"_ com o texto "Primeira linha adicionada" e comita-lo com a mensagem "Primeira linha adicionada"
- Criar uma branch _"meu-primeiro-conflito-1"_ a partir de _"exercicios-de-branch"_
- Adicionar uma nova linha no arquivo _"CONFLITO.md"_ com o texto "Segunda linha adicionada" e comita-lo com a mensagem "Segunda linha adicionada"
- Criar uma branch _"meu-primeiro-conflito-2"_ a partir de _"meu-primeiro-conflito-1"_
- Adicionar uma nova linha no arquivo _"CONFLITO.md"_ com o texto "Terceira linha adicionada" e comita-lo com a mensagem "Terceira linha adicionada"
- Ir para a branch _"meu-primeiro-conflito-1"_
- Adicionar uma nova linha no arquivo _"CONFLITO.md"_ com o texto "Quarta linha adicionada" e comita-lo com a mensagem "Quarta linha adicionada"

> **ATENÇÃO**: Nesse momento, na linha 3 do arquivo _"CONFLITO.md_" exitem 2 informações diferentes em branchs diferentes(_"meu-primeiro-conflito-1"_ e _"meu-primeiro-conflito-2"_). Utilize o _"git checkout &lt;nome-da-branch&gt;"_ para alternar entre as branchs e ver

- Da branch _"meu-primeiro-conflito-1"_ faça o merge com _"meu-primeiro-conflito-2"_. Nesse momento o git irá avisar que ocorreu um erro ao mergiar porque existe um conflito no arquivo _"CONFLITO.md"_ e que você deve corrigir e então comitar a correção

![Conflict image](../assets/conflict/conflict-1.png)

- Utilizando o comando _"git status"_ será possível ver qual é o arquivo que esta com o conflito

![Conflict image](../assets/conflict/conflict-2.png)

> **ATENÇÃO**: O Git irá sugerir o comando _"git merge --abort"_ para abortar o merge. Deve ser usado caso algum problema seja identificado no conflito. Como, por exemplo, 2 funcionalidades que não funcionam juntas

- Ao abrir o arquivo com conflito será posssivel distinguir pela IDE quais são os conflitos identificados pelo Git. o código na area chamada de **HEAD(Current change)** é o código que atualmente esta na branch atual e o código na area chama de **meu-primeiro-conflito-2(Incoming change)** é o código que esta vindo da branch mergiada

![Conflict image](../assets/conflict/conflict-3.png)

> **ATENÇÃO**: Diferentes IDEs vão mostrar o conflito no arquivo de formas diferentes, porém semelhantes

- Para corrigir o conflito basta simplesmente ajustar o código apagando as linhas _&lt;&lt;&lt;&lt;HEAD""_, _"===="_ e _"&gt;&gt;&gt;&gt;meu-primeiro-conflito-2"_ e reoganizando o código de maneira que ele volte a fazer sentido

> **ATENÇÃO**: No caso do VSCode é possivel simplesmente clicar em uma das opções _"Accept Current Change | Accept Inconming Change | Accept Both Changes | Compare Changes"_ e a IDE irá ajustar conforme selecionado. Seja utlizando só o que esta na area de _"HEAD"_ e discartando o resto ao clicar em _"Accept Current Change"_. Seja utlizando só o que esta na area de _"meu-primeiro-conflito-2"_ e discartando o resto ao clicar em _"Accept Inconming Change"_. Seja mesclando as duas alterações ao clicar em _"Accept Both Changes"_. _"Compare Changes"_ irá apenas comparar as alterações

- Após corrigir o conflito basta simplesmente dar um _"git add git/CONFLITO.md"_ no arquivo corrigido e então comita-los
- Ir para a branch _"exercicios-de-branch"_ e mergiar com "meu-primeiro-conflito-1"
- Excluir o arquivo _"CONFLITO.md"_ e commitar
- Excluir as branchs "meu-primeiro-conflito-1" e "meu-primeiro-conflito-2"
- Atualizar o GitHub

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"A"_ a partir de _"exercicios-de-branch"_
- Criar um arquivo _"CONFLITO.md"_ com o texto _"Primeira linha adicionada"_ e comita-lo com a mensagem _"Primeira linha adicionada"_
- Criar uma branch _"B"_ a partir de _"A"_
- Adicionar uma nova linha no arquivo _"CONFLITO.md"_ com o texto "Segunda linha adicionada" e comita-lo com a mensagem _"Segunda linha adicionada"_
- Ir para a branch _"A"_
- Adicionar uma nova linha no arquivo _"CONFLITO.md"_ com o texto "Terceira linha adicionada" e comita-lo com a mensagem _"Terceira linha adicionada"_
- Fazer o merge com _"B"_
- Corrigir o conflito e commitar
- Ir para a branch _"exercicios-de-branch"_
- Excluir _"A"_ e _"B"_

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

## Rebase

O rebase também é um evento em que tu mistura as linhas do tempo. Porém ele não cria um commit e **_altera o ponto inicial da história_**. Por exemplo, digamos que tinha a linha do tempo A e tu criou a B baseado no commit A01 da linha do tempo A \
![Rebase image](../assets/rebase/rebase-1.png)

Na linha do tempo B tu começou a escrever uma nova história e tu decidiu que gostou de todas aquela decisões tomadas na linha do tempo B criando um commit \
![Rebase image](../assets/rebase/rebase-2.png)

Nesse caso tu iria mergiar A com B \
![Rebase image](../assets/rebase/rebase-3.png)

Porém alguém alterou a linha do tempo A. Agora o commit mais atualizado da branch é o A03 e é recomendado mergiar A com B para garantir que as alterações de B ainda funcionam como esperado \
![Rebase image](../assets/rebase/rebase-4.png)

> _NOTA_: A parte que esta em vermelho demonstra o que aconteceria se simplesmente fosse feito o _"git merge &lt;nome-da-branch&gt; --no-ff"_ de A com B

Agora, para garantir que as alterações de B ainda fazem sentido com o A atualizado, iremos redefinir o commit base de B para A03 com _"git rebase &lt;nome-da-branch&gt;"_ evitando um commit de merge, e então, podendo validar as alterações de B \
![Rebase image](../assets/rebase/rebase-5.png)

> _IMPORTANTE_: Observe que o código foi mergiado utilizando o rebase. Agora o ponto inicial de B não é A01 e sim A03. Isso porque nós **_alteramos o commit base_**, alteramos o ponto inicial da história, por isso _"RE BASE"_ \

Agora com B atualizado podemos fazer o merge de A com B sem medo \
![Rebase image](../assets/rebase/rebase-6.png)

Como o rebase é um evento que redefine o ponto inicial da linha do tempo. O que faremos é alternar a história para uma diferente linha do tempo no evento EV01. Construir uma história que gostamos, a EV02, nessa nova linha do tempo e então iremos mesclar essa linha do tempo com a principal que agora esta em um evento posterior ao evento EV01, o evento EV03. Porém para garantir que o evento que vivemos(EV02) na linha do tempo alternativa ainda é possivel de acontecer. Iremos alternar o ponto inicial dessa nova linha do tempo para o EV03 e então misturar a nova linha do tempo com a principal

- Criar a branch _"meu-primeiro-rebase"_ a partir da _"exercicios-de-branch"_ e ir para ela
- Criar um arquivo de texto _"MEUPRIMEIROREBASE.md"_ com o texto _"Meu primeiro rebase"_ e commitar
- _"git log"_ e tu ira ver que o commit que o commit _"Meu primeiro rebase"_ agora consta no histórico
- Alternar para a branch _"exercicios-de-branch"_
- Renomear o arquivo _"TEXTO.md"_ para _"MEUPRIMEIROMERGE.md"_ com o texto _"Meu primeiro merge"_ e commitar
- _"git log"_ e tu ira ver que o commit que o commit _"Meu primeiro merge"_ agora consta no histórico.
- Alternar para a branch _"meu-primeiro-rebase"_
- Alterar o commit base da branch _"meu-primeiro-rebase"_ para o ultimo commit da branch _"exercicios-de-branch"_ com o commando _"git rebase exercicios-de-branch"_
- _"git log"_ e tu ira ver que o commit que o commit _"Meu primeiro merge"_ agora consta no histórico. Como se ele sempre estivesse lá
- Alterar para a branch _"exercicios-de-branch"_
- _"git merge meu-primeiro-rebase --no-ff"_
- _"git log"_ e tu ira ver que o commit que o commit _"Meu primeiro rebase"_ agora consta no histórico juntamente com o commit do merge
- _"git branch -D meu-primeiro-rebase"_ para excluir a branch

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"exercicio-rebase-1"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"PRIMEIRO.md"_ com o texto _"Primeiro"_ e commita-lo
- Verificar os registros dos commits _"git log"_
- Criar uma branch _"exercicio-rebase-2"_ a partir da _"exercicio-rebase-1"_
- Criar um arquivo de texto _"SEGUNDO.md"_ com o texto _"Segundo"_ e commita-lo
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicio-rebase-1"_
- Criar um arquivo de texto _"TERCEIRO.md"_ com o texto _"Terceiro"_ e commita-lo
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicio-rebase-2"_
- Altera o ponto inicial para o ultimo de _"exercicio-rebase-1"_
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicio-rebase-1"_ e fazer o merge da _"exercicio-rebase-2"_ com ela
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicios-de-branch"_
- Excluir as branchs _"exercicio-rebase-1"_ e _"exercicio-rebase-2"_

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>
