Pré-requisitos

1. Java Development Kit (JDK) 11 ou superior
2. Apache Maven 3.6 ou superior
3. Banco de dados MySQL

Baixar as dependências do projeto do pom.xml (qualquer ide moderna pra java possui uma função pra isso, basta ir no arquivo pom .xml e vai ter alguma opção lá)

Crie um banco de dados no seu MySQL chamado "maratonap1"

A string de conexão do banco pode ser alterada no arquivo application.properties que está na pasta resources (só alterar caso a porta do seu sql não seja 3306), no mesmo arquivo você irá colocar o seu user e password do MySql.

Rode a aplicação pela primeira vez e faça os seguintes inserts no banco para realizar os testes:

Por padrão a api fica na porta 8080

INSERT INTO user (name, email, username, password) VALUES ('John Doe', 'john.doe@example.com', 'john', '$2a$10$E8B5dKo5LBR/a93kO.WOQO4l1mBb.LFUpHTBnJriKZ63R1QKbngbq'); -- senha: password
INSERT INTO genre (title) VALUES ('Action');
INSERT INTO genre (title) VALUES ('Comedy');
INSERT INTO artist (name, birthday, biography) VALUES ('Tom Hanks', '1956-07-09', 'An American actor and filmmaker.');	
INSERT INTO movie (genre_id, title, synopsis, duration_Minutes, release_Date, poster_Url, trailer_Url) VALUES (1, 'Action Movie', 'An action movie.', 120, '2024-01-01', 'url_to_poster', 'url_to_trailer');
INSERT INTO movie (genre_id, title, synopsis, duration_Minutes, release_Date, poster_Url, trailer_Url) VALUES (2, 'Comedy Movie', 'A comedy movie.', 90, '2024-02-01', 'url_to_poster', 'url_to_trailer');



