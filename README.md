# Projeto de serviço RESTFULL sem o uso de SpringBoot

### Segue abaixo a descrição do projeto:

_*Criar Pedido*_

_Entrada:_ 
	Comprador (Somente 1)
 		Nome *
 		CPF *
 		Endereço: logradouro *, número *, complemento, bairro *, cidade *, estado *
 	Vendedor (Somente 1)
 		Razão Social *
 		CNPJ *
 	Itens (1 ou mais)
 		Descrição *
 		Quantidade *
 		Valor unitário *
 _Saída: identificador, data e status do pedido_

 _*Atualizar Pedido*_
 _Entrada: identificador do pedido e novo status_
  _Saída: identificador, data e status do pedido_

	Status: Iniciado -> Pendente
 	Pendente -> Cancelado
 	Pendente -> Finalizado
 	Cancelado -> Não pode ser alterado
 	Finalizado -> Não pode ser alterado
 	Iniciado -> Não pode ser alterado


 _*Consultar Pedido*_
 	_Entrada: identificador do pedido_
 	_Saída:_
 		dados do cliente
 		dados do pedido

### Softwares usados:

* Apache Tomcat 8.5
* Intellij IDE
* Java OpenJDK 8
* MySQL  5.7.20-0ubuntu0.16.04.1 
