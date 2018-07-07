# Exercicio2-Bravis

 Todos os arquivos de configuração do Eclipse foram "commitados", basta dar Git Clone e abrir caso queira usar este IDE.
 Este exercício foi feito com Spring Data e um banco de dados em memória principal, executando o main da Classe principal
não é necessária nenhuma configuração.

 Para criar e rodar a imagem do Docker siga :
 
 docker build -t alvarowm/spring-boot-docker-app .
 docker run -it -p 8080:8080 alvarowm/spring-boot-docker-app
 
 O Dockerfile já está configurado, assim como o Maven, e espera o exercicio1-0.0.1-SNAPSHOT.jar na pasta target para a criação da imagem.
