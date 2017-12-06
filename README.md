# Projeto de serviço RESTFULL sem o uso de SpringBoot

### Segue abaixo a descrição do projeto:

> - Criar Pedido
> 	Entrada: 
> 		Comprador (Somente 1)
> 			Nome *
> 			CPF *
> 			Endereço: logradouro *, número *, complemento, bairro *, cidade *, estado *
> 		Cendedor (Somente 1)
> 			Razão Social *
> 			CNPJ *
> 		Itens (1 ou mais)
> 			Descrição *
> 			Quantidade *
> 			Valor unitário *
> 
> 	Saída: identificador, data e status do pedido
> 
> - Atualizar Pedido
> 	Entrada: identificador do pedido e novo status
> 	Saída: identificador, data e status do pedido
> 	
> 	Status: Iniciado -> Pendente
> 		Pendente -> Cancelado
> 		Pendente -> Finalizado
> 		Cancelado -> Não pode ser alterado
> 		Finalizado -> Não pode ser alterado
> 		Iniciado -> Não pode ser alterado
> 
> 
> - Consultar Pedido
> 	Entrada: identificador do pedido
> 	Saída: 
> 		dados do cliente
> 		dados do pedido

### Softwares usados:

* Apache Tomcat 8.5
* Intellij IDE
* Java OpenJDK 8
* MySQL  5.7.20-0ubuntu0.16.04.1 
