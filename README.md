<div align="center">
  <h1>Challenge Register Game</h1>
  <p>
	Challenge Register Game é uma teste proporcionado pela Uol HOST para vaga de BackEnd, o teste consiste em montar uma aplicação Java capaz de recuperar informações de um arquivo XML e de um arquivo JSON, persistir um cadastro em um banco de dados em memória ou em arquivo e listar os cadastros em uma interface simples. Sendo um sistema de cadastro de jogadores do UOL precisa de uma nova cara! Isso porque a área de lazer da empresa definiu que todo jogador deverá ter um codinome. A proposta foi um sucesso e muitos candidatos se inscreveram, por isso a área de lazer acabou restringindo os codinomes em duas listas distintas: "Os Vingadores" e "A Liga da Justiça". Para o seu desenvolvimento foi utilizado o framework Spring, Thymeleaf para o front e o banco H2 Database para persistência dos dados em memoria.
	</p>
  <img src="./referencias/arquitetura.png" alt="Logo" width="800">
</div>

# 📒 Índice
* [Descrição](#descrição)
* [Requisitos Funcionais](#requisitos)
* [Tecnologias](#tecnologias)
* [Endpoints](#endpoints)
* [Design](#design)
  * [Cores](#cores)
  * [Fontes](#fontes)
* [Instalação](#instalação)
* [Licença](#licença)

# 📃 <span id="descrição">Descrição</span>
Challenge Register Game é uma teste proporcionado pela Uol HOST para vaga de BackEnd, o teste consiste em montar uma aplicação Java capaz de recuperar informações de um arquivo XML e de um arquivo JSON, persistir um cadastro em um banco de dados em memória ou em arquivo e listar os cadastros em uma interface simples. Sendo um sistema de cadastro de jogadores do UOL precisa de uma nova cara! Isso porque a área de lazer da empresa definiu que todo jogador deverá ter um codinome. A proposta foi um sucesso e muitos candidatos se inscreveram, por isso a área de lazer acabou restringindo os codinomes em duas listas distintas: "Os Vingadores" e "A Liga da Justiça".
Para o seu desenvolvimento a foi utilizado o framework [**Spring**](https://spring.io/), [**Spring Web**](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html), [**Spring Data JPA**](https://spring.io/projects/spring-data-jpa) para manipulação dos dados do banco, [**Thymeleaf**](https://www.thymeleaf.org/) como template engine assim possibilitando o ambiente do front da aplicação, [**Lombok**](https://projectlombok.org/) e [**H2 Database**](https://www.h2database.com/html/main.html) como banco para persistência dos dados em memoria.

# 📌 <span id="requisitos">Requisitos Funcionais</span>
- [x] Permitir o cadastro de jogadores de acordo com os codinomes contidos nos links de referência vingadores.json e liga_da_justica.xml
- [x] Apresentar um cadastro contendo nome, e-mail e telefone do jogador (sendo que nome e e-mail são obrigatórios)
- [x] Persistir a informação cadastrada em um banco de dados em memória
- [x] Obter, a qualquer momento, a lista de todos os jogadores cadastrados com seus respectivos codinomes e também a informação de qual lista o codinome foi extraído
- [x] Obrigatoriamente, ler a informação do codinome em arquivos na internet (links de referencia abaixo)

## Links dos arquivos de referência
[**Liga da Justiça**](./referencias/liga_da_justica.xml)
<br>
[**Vingadores**](./referencias/vingadores.json)

# 💻 <span id="tecnologias">Tecnologias</span>
- **Java**
- **Spring**
- **Spring Web**
- **Spring Data JPA**
- **Thymeleaf**
- **Lombok**
- **H2 Database**
- **HTML**
- **CSS**
- **JavaScript**
- **JQuery**
- **BootStrap**

# 📍 <span id="endpoints">Endpoints</span>
| Endpoint               | Resumo                                          
|----------------------|-----------------------------------------------------
| <kbd>GET / </kbd>     | Responsável por exibir o formulário para cadastro do usuário
| <kbd>POST / </kbd>     | Responsável por cadastrar o usuário e a lista dos codinomes

# 🎨 <span id="design">Design</span>
- <span id="cores">Cores<br></span>
  * #444<br>
  * #99e6e3<br>
  * #555<br>
  * #fff<br>
  * #007bff<br>
  * #0056b3<br>
  * #333<br>
  * #dddddd<br>
  * #f2f2f2<br>

- <span id="fontes">Fontes<br></span>
  * Arial, sans-serif

# 🚀 <span id="instalação">Instalação</span>
```bash
  # Clone este repositório:
  $ git clone https://github.com/CleilsonAndrade/challenge-register-game.git
  $ cd ./challenge-register-game
```

# 📝 <span id="licença">Licença</span>
Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<p align="center">
  Feito com 💜 by CleilsonAndrade
</p>
