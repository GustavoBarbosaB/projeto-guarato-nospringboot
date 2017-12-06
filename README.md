# Projeto de serviço RESTFULL sem o uso de SpringBoot

### Segue abaixo a descrição do projeto:

* _* Criar Pedido *_

_Entrada:_ 
Comprador (Somente 1)<br/>
  Nome<br/>
  CPF<br/>
Endereço: logradouro, número, complemento, bairro, cidade, estado<br/> 
Vendedor (Somente 1)<br/>
  Razão Social <br/>
  CNPJ<br/>
Itens (1 ou mais)<br/>
  Descrição<br/>
  Quantidade<br/>
Valor unitário<br/>
_Saída: identificador, data e status do pedido_<br/>

* _* Atualizar Pedido *_
 
 Entrada: identificador do pedido e novo status
 Saída: identificador, data e status do pedido

Status: Iniciado -> Pendente
Pendente -> Cancelado
Pendente -> Finalizado
Cancelado -> Não pode ser alterado
Finalizado -> Não pode ser alterado
Iniciado -> Não pode ser alterado


* _*Consultar Pedido*_
 _Entrada: identificador do pedido_
 _Saída:_
 dados do cliente
 dados do pedido

### Softwares usados:

* Apache Tomcat 8.5
* Intellij IDE
* Java OpenJDK 8
* MySQL  5.7.20-0ubuntu0.16.04.1 
