package com.spring.cdblog.utils;

import com.spring.cdblog.entities.Post;
import com.spring.cdblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    PostRepository postRepository;

   // @PostConstruct
    public void savaPosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAuthor("Cairo Noleto");
        post1.setDate(LocalDate.now());
        post1.setTitle("JWT(JSON Web Tokens): o que é e como usar na prática?");
        post1.setText("O JWT (Json Web Token) é um padrão para autenticação e compartilhamento de informações. Baseado no formato JSON, é fundamental para qualquer desenvolvedor ou desenvolvedora que queria se destacar na área.");

        Post post2 = new Post();
        post2.setAuthor("Erika Nishida");
        post2.setDate(LocalDate.now());
        post2.setTitle("Microsoft identifica malware usado em ataques cibernéticos à Ucrânia");
        post2.setText("A Microsoft afirma ter descoberto um “malware destrutivo” utilizado em ataques cibernéticos que têm como alvo organizações da Ucrânia. Na publicação em seu blog, o Microsoft Threat Intelligence Center (MSTIC) detalha que o malware foi desenvolvido para parecer um ataque ransomware, mas não apresenta mecanismos de recuperação de arquivos.");

        Post post3 = new Post();
        post3.setAuthor("Vinicius Martins");
        post3.setDate(LocalDate.now());
        post3.setTitle("Struct em C: O que é, para que serve e como usar na prática?");
        post3.setText("Struct é uma abreviação para Structure, que significa estrutura em português. Na linguagem de programação C (e em muitas outras) é uma estrutura de dados composto que define fisicamente uma lista de variáveis agrupadas sob um nome em um bloco de memória, logo, todas as variáveis conseguem ser acessadas por meio de um único ponteiro ou pelo que é declarado na estrutura que retorna o mesmo endereço.");


        postList.add(post1);
        postList.add(post2);
        postList.add(post3);

        for (Post post : postList) {
            Post postSave = postRepository.save(post);
            System.out.println(postSave.getId());
        }
    }
}
