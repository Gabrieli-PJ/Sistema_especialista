# O problema
Este é um trabalho da matéria de Inteligência Artificial, onde precisamos fazer um sistema especialista para o seguinte problema:
> Benjamin é um empresário do ramo automobilístico que comercializa diferentes marcas de carros, procurou a Universidade para o desenvolvimento de um projeto que consiste na implementação de um sistema de autoatendimento em sua Concessionária. 
> A aplicação serve para auxiliar na tomada de decisão de qual carro um cliente deve adquirir conforme o seu perfil e as suas possibilidades.   A turma de alunos da 7ª fase do curso de Ciência da Computação irá desenvolver a solução para este problema.

# Diretório do trabalho
> [!NOTE]
> O diretório pode mudar dependendo do progresso da aplicação.

📦 src/  
├── 📁 app/  
│   └── Main.java                     *→ Classe principal que inicia o app*  
│  
├── 📁 ui/                            *→ Interface gráfica*  
│   ├── MainWindow.java               *→ Tela inicial com menu/formulário*  
│   ├── ClientForm.java               *→ Formulário para capturar o perfil do cliente*  
│   └── Result.java                   *→ Tela de resultado com os dados dos carros recomendados*  
│  
├── 📁 model/                         *→ Entidades principais  *
│   ├── Client.java                   *→ Representa o cliente (usuário)*  
│   └── Car.java                      *→ Representa os carros disponíveis  *
│  
├── 📁 especialista/                  *→ Núcleo do sistema especialista*  
│   ├── Fact.java                     *→ Perfil do cliente (fatos)*  
│   ├── Rule.java                     *→ Regras que avaliam os carros*  
│   ├── Motor.java                    *→ Motor de inferência que aplica regras e retorna recomendações*  
│   └── BC.java                       *→ Base de conhecimento (carrega carros e regras do arquivo)*  
│  
├── 📁 util/                          *→ Utilitários*  
│   ├── FormValidation.java            *→ Classe auxiliar para validar entrada do cliente*  
│   └── Theme.java                     *→ Classe auxiliar para salvar o tema  *
│  
└── 📁 Data/                          *→ Dados externos*  
    └── Carros.txt                   *→ Arquivo contendo os dados dos carros (Nome;Preço;Prioridade;Uso;Combustível;Porte)*  

# Rodando a aplicação
Quando a aplicação estiver finalizada vou disponibilizar um executável, mas por enquanto o programa vai estar apenas no código mesmo
