# Funcionamento do Git

## REFAÇA OS EXERCICIOS 3x

A coisa mais importante é tu entender o conteúdo. Se tu não tiver dúvidas tu segue o seguinte plano:

- Faz ele lendo e entendendo até o fim
- Refaz ele tentando lembrar o que foi feito na primeira vez e vendo se REALMENTE entendeu da primeira vez e se caso não conseguir olhe a explicão novamente
- Refaça sem olhar nada

> Isso se aplica apenas ao exercicio e não a explicação

### Branch

Pensa no git como uma linha do tempo. A main(principal) é a linha do tempo que como o próprio nome diz é a principal e a partir dessa linha do tempo principal tu pode contruir diferentes histórias(códigos). Porém para não afetar a linha do tempo principal tu cria uma branch(ramificação) e isso faz com que tudo que aconteça nessa linha do tempo alternativa(a branch criada) não afete a linha do tempo principal.

Nessa branch(exercicios-de-branch) nós iremos avacalhar a história para que tu entenda como funciona isso e como ser uma viajante no tempo(poder alternar entre essa branch e a main)

O que fazer nessa branch:

- Excluir todo os arquivos, exceto o README.md
- Criar um arquivo de texto chamado TEXTO.md
- Escrever no TEXTO.md "# Primeira Linha do tempo"
- Fazer o commit com a mensagem "Primeira linha do tempo"

Nesse momento essa linha do tempo ja esta bem diferente da principal e agora tu vai ver

- Dar o comando "git log". Esse comando vai mostar o histórico de commits desde o inicio do projeto, para navegar ele tu utiliza as setinha do teclado e não o scroll do mouse e para sair tu aperta 'q'
- Sair do git log com o "q"
- Alternar para a branch main

Agora tu vai perceber que todo o teu código voltou e isso acontece porque tudo que aconteceu na branch alternativa existiu apenas naquela branch e não afeta a branch principal

- Dar o comando "git log". Vai ver que o commit "Primeira linha do tempo" não existe
- Sair do git log
- Verificar os arquivos na IDE que irão ter aparecido novamente
- Voltar para a branch "exercicios-de-branch"
- Dar o comando "git log". Vai ver que o commit "Primeira linha do tempo" apareceu novamente
- Sair do git log
- Verificar os arquivos na IDE que sumiram novamente porque foi excluído naquele commit

> O commit representa um ponto importante na história onde algo aconteceu. IMPORTANTE ter em mente que quando tu altera os aquivos e não commita eles não importam na linha to tempo não sendo enviador para o GitHub e ainda podem até não te deixar mudar de branch por não terem sido commitados(salvos). Nesse caso tu tem que decidir se tu abandona as alterações ou se tu as commita para criar esse ponto importante na história

#### Exercicio branch

- Criar uma branch "segunda-linha-do-tempo" a partir da "exercicios-de-branch"
- Alterar o titulo do TEXTO.md "# Primeira Linha do tempo" para "# Segunda Linha do tempo"
- Fazer o commit com a mensagem "Segunda linha do tempo"
- Dar o comando "git log". Vai ver que tem o commit "Primeira Linha do tempo". Sabe o por quê?
- Alterar para a branch "exercicios-de-branch"
- Dar o comando "git log"
- Excluir a branch "segunda-linha-do-tempo"

> IMPORTANTE: Se tu não fez o git push, que não pedi para tu fazer em nenhum momento. Tu vai ver que os arquivos ainda existem no GitHub e isso se dá porque tu não atualizou o GitHub. Não esquece que existem dois ambientes o local(git) e o remoto(GitHub). E as coisas que neles só são atualizadas se tu as atualizar manualmente. "git push" para enviar tuas alterações para o ambiente remoto e "git pull" para buscar as alterações do ambiente remoto

### Merge

O merge é o evento em que tu mistura as linhas do tempo. Por exemplo, digamos que tinha a linha do tempo A e criou a B. Na linha do tempo B tu começou a escrever uma nova história e tu decidiu que gostou de todas aquela decisões tomadas na linha do tempo B. Nesse caso tu mescla as duas

Vamos criar uma nova linha do tempo(meu-primeiro-merge) fazer alterações e então mesclar(mergiar) com "exercicios-de-branch"

- Na branch "exercicios-de-branch" execute "git log" para verificar qual o ultimo commit existente
- Criar a branch "meu-primeiro-merge" a partir da "exercicios-de-branch"
- Alterar o texto do arquivo "TEXTO.md" para "Meu primeiro merge" e commitar
- Alternar para a branch "exercicios-de-branch". CUIDADO: Antes de executar o próximo passo tenha certeza que esta na branch "exercicios-de-branch"
- Mergiar a branch "exercicios-de-branch" com a "meu-primeiro-merge". O comando é "git merge <nome-da-branch>". Por exemplo, "git merge meu-primeiro-merge". Ao usar o comando "git merge" irá abrir um arquivo de texto pois ao utilizar esse comando o Git cria um commit para registar o evento. Sempre deixar a mensagem padrão
- "git log" e tu ira ver que o commit que tu criou na branch "meu-primeiro-merge" agora esta na branch "exercicios-de-branch" juntamente com o commit criado pelo merge
- "git branch -D meu-primeiro-merge" para excluir a branch

#### Exercicio merge

- Criar uma branch "exercicio-merge-1" a partir da "exercicios-de-branch"
- Criar um arquivo de texto "PRIMEIRABRANCH.md" com o texto "Essa é a primeira branch" e commita-lo
- Criar uma branch "exercicio-merge-2" a partir da "exercicios-de-branch"
- Criar um arquivo de texto "SEGUNDABRANCH.md" com o texto "Essa é a segunda branch" e commita-lo
- Ir para a branch "exercicio-merge-1" e fazer o merge da "exercicio-merge-2" com ela
- Verificar os registros dos commits "git log"
- Ir para a branch "exercicios-de-branch"
- Excluir as branchs "exercicio-merge-1" e "exercicio-merge-2"
