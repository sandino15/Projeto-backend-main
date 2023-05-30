# Projeto-backend
Projeto Back-End Kotlin - Faculdade UNINASSAU

# Grupo Gym Fit

# Sandino Lourenço -Matricula- 01544309
# Bruno Gomes Matricula- 01292933	
# Caio Felipe Matricula- 
# Eduardo Matricula- 01526636         
# Thais Júlia Matricula- 01551266

LEVANTAMENTO DE REQUISITOS DA APLICAÇÃO MOBLIE E BACK-END.

Aplicção de App de Academia.
Documento de Requisitos: requisitos solicitados pelo cliente, Daivid Leal.

# Requisitos funcionais

Documentação do Gym fit 


Funções do Produto 



O sistema é um app de treinos de academia, o qual tem as funções de cadastrar o usuário, 

cadastro da ficha de treinamento. O cadastro de usuário é extremamente importante para 

todas as outras funções do software, pois o usuário é a principal entidade do projeto. 








<h4>1. Cadastrar usuário </h4>


 Fluxo principal:


      1 . usuário seleciona a opção de cadastro do aluno
      2.  usuário solicita as seguintes informações:
      3.  nome do usuario
          Genero do usuário
	  Altura do usuário
	  Peso atual do usuário
	  Email do usuario
	  E uma senha para cadastro
    
      




Fluxo secundário:


      1 . Informação obrigatória faltando ou dado  preenchido de forma
          incorreta
      2.  No passo o sistema detecta que as  informações não
          foram fornecidas de maneira correta e procede da 
	  seguinte maneira:
	  O sistema avisa que alguma informação obrigatorio
	  esta faltando.
	  O sistema informa que alguma informação fornecida
	   
      
      
  
  



 <h4>2. editar usuario </h4>




<p>Fluxo principal:</p> 


      1. usuário seleciona a opção de editar a ficha de treinamento
      2.  usuário seleciona a opção de editar os dias de treinamento
      3. usuário seleciona a opção de editar a senha e o email
      4. O sistema valida as informação fornecidas 
      5. O sistema efetiva a modificação mo cadastro do usuario
      
    
      
      
      
  

<p>Fluxo secundário:</p> 

 
      6. senha e nome do usuario invalido o sistema verifica que não
         tem nemhum registo do nome do usuario e da senha cadastrada 
	 procede de seguinte maneira:
	 
	 Informa que não consta nenhum nome ou senha infomada.
	 
	 Informação fornecida de maneira incorreta e o sistema
	 identifica que alguma informação foi preenchida de
	 maneira incorreta e procede da sequinte maneira 
	 informa que alguma informação foi preechida de 
	 maneira incorreta
	   


 <h4>3.perfil do  usuário **</h4>

 <p>Fluxo principal:</p>


 
      1 . O usuario vai ter opcão de consultar a ficha de treinamento
      2.  usuário vai ter como acompanhar suas estaticas de treino
      3.   usuário  vai poder acompanhar sua evolução
      
   

  <h4>4.Login do  usuario **</h4>

  <p>Fluxo principal:</p>

  
  
      1 . permite que usuario acesse a autenticação de sua crendenciais
          do email do usuario e senha adquiridos atraves de um cadastro.
	  
	  
  


   <p>Fluxo secundário:</p> 


   ```
   
	  
      2. senha e nome do usuario validoo sistema verifica e manda 
         informações para outra tela
      3. senha e nome do usuario valido o sistema verifica que não
          tem nenhum registro do usuario e da senha cadastrada.
      
  ```
  
  <h4>5. treino do usuario **</h4>
   
   
  <p>Fluxo principal:</p>
  
  ```

  
     
     
     
      1 . O usuário vai ter opcão de selecionar qual tipo de exercio
          exemplo: usuário escolher a parte do corpo como abdome e
      3.  permas e o sistema vai montar uma ficha de treino com detalhes
          vídeos sobre o treino


  ```
  
  <p>Fluxo secundário:</p> 
  
  
   ```
  
  
      1. Se o usuário não desejar mais aquele tipo de treino selecionado, 
        ele pode clicar na funcionalidade de voltar para a tela principal
	
	
   
   
 ```
 
 
 
 <h4> 6. perfil do usuario **</h4>
 
 
 <p>Fluxo principal:</p>
 
 ```
 


    1. O  usuário vai ter a opção de consultar a ficha de treinamento
    2. O  usuário  vai ter como acompanhar suas estatísticas de treino 
    3. O usuário vai poder acompanhar  sua evolução

      
 ```     




# Imagens do projeto - Figma
1 Tela inicial / tela de cadastro

 ![image](https://user-images.githubusercontent.com/105602423/232133876-48bf026e-e30c-4bd6-8e71-0cff9af750a1.png)
 
 
 2 telas de informações
 
![image](https://user-images.githubusercontent.com/105602423/232343042-f190847a-b462-4b2d-9321-e80b790ccd4e.png)


 3 tela principal / tela de treino 

 ![image](https://user-images.githubusercontent.com/105602423/232142735-867a4368-5b02-4932-a1b6-9561658625e7.png)
 
 4 telas detalhe do treino
 
 ![image](https://user-images.githubusercontent.com/105602423/232356631-07fbe29e-51be-42fd-bc7e-b4ee7ec9eeb8.png)

 
 
 
 







# UML do Mobile
![UML](https://user-images.githubusercontent.com/115112186/232347411-1af69264-70a6-478e-815e-6a8699e1ddaa.jpeg)
<div align="center">
<img src="" width="500px"/>
</div>

# UML do BackEnd
![UML](https://user-images.githubusercontent.com/115112186/232347411-1af69264-70a6-478e-815e-6a8699e1ddaa.jpeg)
<div align="center">
<img src=/>
</div>


# Contrato com o JSON



Post/Login

esse endpoint é responsável por fazer o Login do usuario   
e receberá como parâmetro email e senha.

Post

```
{ "Id:1
  "Email:brunosantos@gmail.com"
  "Password:"26342523"
}  


Retorna:
Status cod :404


{"toke:" usuario Não encontrato" }

```


Post/User

esse endpoint é responsável por fazer cadastro do usuario <br/>
e recebera como parâmetro nome, email e senha.

post

```


{ "Id:1
  "name:"bruno santos "
  "Email:brunosantos@gmail.com
  "Password:"26342523"
}  

Retorna:


{ "toke:"Email foi utilizado " }


Retorna:


{"toke:"Erro no email e na senha "}

```


Get/ficha de treino

esse enpoint é responsável pela ficha de treino do usuario <br/>
e recebera como parâmetro: genero ,  objetivo do usuario exemplo<br/>
se e  ganho de massa ou emagrecer, peso do usuario ,<br/>
 e altura e 
 
 

 Get 

 ```
 { "Id:"1"
   "genero:"masculino"
   "Objetivo do treino:"emagrecer"
   "altura:"1,75"
   "peso:"82 kg " 
   "
  }
  

```
