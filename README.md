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

<p align="right"><a href="#índice">voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"segunda-linha-do-tempo"_ a partir da _"exercicios-de-branch"_
- Alterar o titulo do TEXTO.md _"# Primeira Linha do tempo"_ para _"# Segunda Linha do tempo"_
- Fazer o commit com a mensagem _"Segunda linha do tempo"_
- Dar o comando _"git log"_. Vai ver que tem o commit _"Primeira Linha do tempo"_. Sabe o por quê?
- Alterar para a branch _"exercicios-de-branch"_
- Dar o comando _"git log"_
- Excluir a branch _"segunda-linha-do-tempo"_

> **IMPORTANTE**: Se tu não fez o git push, que não pedi para tu fazer em nenhum momento. Tu vai ver que os arquivos ainda existem no GitHub e isso se dá porque tu não atualizou o GitHub. Não esquece que existem dois ambientes o local(_Git_) e o remoto(_GitHub_). E as coisas que neles só são atualizadas se tu as atualizar manualmente. _"git push"_ para enviar tuas alterações para o ambiente remoto e _"git pull"_ para buscar as alterações do ambiente remoto

<p align="right"><a href="#índice">voltar ao índice ⬆️ </a></p>

## Merge

O merge é o evento em que tu mistura as linhas do tempo. Por exemplo, digamos que tinha a linha do tempo A e criou a B. Na linha do tempo B tu começou a escrever uma nova história e tu decidiu que gostou de todas aquela decisões tomadas na linha do tempo B. Nesse caso tu mescla as duas

Vamos criar uma nova linha do tempo(_meu_-primeiro-merge) fazer alterações e então mesclar(_mergiar_) com _"exercicios-de-branch"_

- Na branch _"exercicios-de-branch"_ execute _"git log"_ para verificar qual o ultimo commit existente
- Criar a branch _"meu-primeiro-merge"_ a partir da _"exercicios-de-branch"_
- Alterar o texto do arquivo _"TEXTO.md"_ para _"Meu primeiro merge"_ e commitar
- Alternar para a branch _"exercicios-de-branch"_. CUIDADO: Antes de executar o próximo passo tenha certeza que esta na branch _"exercicios-de-branch"_
- Mergiar a branch _"exercicios-de-branch"_ com a _"meu-primeiro-merge"_. O comando é _"git merge <nome-da-branch> --no-ff"_. Por exemplo, _"git merge meu-primeiro-merge --no-ff"_. Ao usar o comando _"git merge <nome-da-branch> --no-ff"_ o Git sempre irá cria um commit para registar o evento. O comando _"git merge <nome-da-branch>"_ apenas gera o commit automático em algumas situações para evitar isso usa-se a opção _"--no-ff"_
- _"git log"_ e tu ira ver que o commit que tu criou na branch _"meu-primeiro-merge"_ agora esta na branch _"exercicios-de-branch"_ juntamente com o commit criado pelo merge
- _"git branch -D meu-primeiro-merge"_ para excluir a branch

<p align="right"><a href="#índice">voltar ao índice ⬆️ </a></p>

#### Exercicio

- Criar uma branch _"exercicio-merge-1"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"PRIMEIRABRANCH.md"_ com o texto _"Essa é a primeira branch"_ e commita-lo
- Criar uma branch _"exercicio-merge-2"_ a partir da _"exercicios-de-branch"_
- Criar um arquivo de texto _"SEGUNDABRANCH.md"_ com o texto _"Essa é a segunda branch"_ e commita-lo
- Ir para a branch _"exercicio-merge-1"_ e fazer o merge da _"exercicio-merge-2"_ com ela
- Verificar os registros dos commits _"git log"_
- Ir para a branch _"exercicios-de-branch"_
- Excluir as branchs _"exercicio-merge-1" e _"exercicio-merge-2"

<p align="right"><a href="#índice">voltar ao índice ⬆️ </a></p>
