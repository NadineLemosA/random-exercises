# Git

## Sobre os EXERCICIOS

A coisa mais importante é entender o conteúdo. Então para atingir esse objetivo faça o seguinte:

- Tente refazer os exercicios sempre sem olhar nada. **ATENÇÃO**: Tudo dever ocorrer exatamente conforme o exercicio se algo aconteceu diferente algo errado foi feito
- A cada novo exercicio REFAZER todos os anteriores. Quanto mais tu precisar ler a explicação para atingir deternada situação, menos tu tem isso fixado.

> **ATENÇÃO**: Isso se aplica apenas aos exercicios e não deve ser feito novamente os passo da explicação

## Índice

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
  <summary>Rebase</summary>

&emsp;&emsp;[Explicação](#rebase)\
&emsp;&emsp;[Exercicio](#exercicio-2)

</details>

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
- Criar a branch _"meu-primeiro-merge"_ a partir da _"exercicios-de-branch"_
- Alterar o texto do arquivo _"TEXTO.md"_ para _"Meu primeiro merge"_ e commitar
- Alternar para a branch _"exercicios-de-branch"_. CUIDADO: Antes de executar o próximo passo tenha certeza que esta na branch _"exercicios-de-branch"_
- Mergiar a branch _"exercicios-de-branch"_ com a _"meu-primeiro-merge"_. O comando é _"git merge <nome-da-branch> --no-ff"_. Por exemplo, _"git merge meu-primeiro-merge --no-ff"_. Ao usar o comando _"git merge <nome-da-branch> --no-ff"_ o Git sempre irá cria um commit para registar o evento. O comando _"git merge <nome-da-branch>"_ apenas gera o commit automático em algumas situações para evitar isso usa-se a opção _"--no-ff"_
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

## Rebase

O rebase também é um evento em que tu mistura as linhas do tempo. Porém ele não cria um commit e **_altera o ponto inicial da história_**. Por exemplo, digamos que tinha a linha do tempo A e tu criou a B baseado no commit A01 da linha do tempo A \
![Passo 1 rebase](./assets/rebase-1.png)

Na linha do tempo B tu começou a escrever uma nova história e tu decidiu que gostou de todas aquela decisões tomadas na linha do tempo B criando um commit \
![Passo 2 rebase](./assets/rebase-2.png)

Nesse caso tu iria mergiar A com B \
![Passo 3 rebase](./assets/rebase-3.png)

Porém alguém alterou a linha do tempo A. Agora o commit mais atualizado da branch é o A03 e não é possivel mergiar A com B devido a esse novo commit \
![Passo 4 rebase](./assets/rebase-4.png)

> _NOTA_: A parte que esta em vermelho não é permitido pelo Git

Agora antes de tu mergiar A com B tu precisa mergiar B com A pois B esta desatualizada em relação a A e podem haver conflitos \
![Passo 5 rebase](./assets/rebase-5.png)

> _NOTA_: Para fazer o merge de B com A foi utilizado o já conhecido comando _"git merge <nome-da-branch> --no-ff"_

Embora tu pudesse mergiar utilizando o _"git merge"_ nesse caso é mais indicado o _"git rebase <nome-da-branch>"_ pois ele irá mergiar B com A sem criar um commit em B e então tu podera mergiar A com B sabendo que esta tudo certo \
![Passo 6 rebase](./assets/rebase-6.png)

> _IMPORTANTE_: Observe que o código for mergiado de forma diferente. Agora o ponto inicial de B não é A01 e sim A03. Isso porque nós alteramos o commit base, alteramos o ponto inicial da história, por isso _"RE BASE"_ \

Vamos criar uma nova linha do tempo(_meu-primeiro-rebase_) fazer alterações e então mergiar com _"exercicios-de-branch"_

-

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"exercicio-rebase-1"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"PRIMEIRABRANCH.md"_ com o texto _"Essa é a primeira branch"_ e commita-lo
- Criar uma branch _"exercicio-merge-2"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"SEGUNDABRANCH.md"_ com o texto _"Essa é a segunda branch"_ e commita-lo
- Ir para a branch _"exercicio-merge-1"_ e fazer o merge da _"exercicio-merge-2"_ com ela
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicios-de-branch"_
- Excluir as branchs _"exercicio-merge-1"_ e _"exercicio-merge-2"_

<p align="right"><a href="#índice">Voltar ao índice ⬆️ </a></p>
