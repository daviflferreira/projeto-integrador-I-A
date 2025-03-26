import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcao;
        boolean sair = false;

        Scanner ler = new Scanner(System.in);
            while (!sair) {
            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
            System.out.println("Perguntas Frequentes");
            System.out.println("\n");
            System.out.println("1 - Duvidas sobre pedidos?");
            System.out.println("2 - Duvidas sobre rastreio?");
            System.out.println("3 - Duvidas sobre garantia ou arrependimento?");
            System.out.println("4 - Sair.");
            System.out.println("------------------------------------------------------------------------------------");
            opcao = ler.nextInt();

            if (opcao == 1) {
                boolean voltar = false;
                while (!voltar) {
                    System.out.println("================================== DÚVIDAS SOBRE PEDIDOS ===================================");
                    System.out.println("1 - Quais são os processos que meu pedido irá passar?");
                    System.out.println("2 - Como trocar o endereço de entrega de um pedido?");
                    System.out.println("3 - Quanto tempo leva para a constatação do pagamento por boleto?");
                    System.out.println("4 - Quanto tempo leva para a contatação do pagamento por cartão de crédito?");
                    System.out.println("5 - O boleto venceu, tem como prolongar o prazo para pagamento?");
                    System.out.println("6 - Qual o prazo de envio do meu pedido?");
                    System.out.println("7 - A Hardware Disk entrega para todo o Brasil?");
                    System.out.println("8 - Como cancelar meu pedido?");
                    System.out.println("9 - Voltar ao menu anterior.");
                    System.out.println("============================================================================================");
                    opcao = ler.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Na Hardware Disk um pedido de compra tem as seguintes fases: \n");
                            System.out.println("|Pendente / Análise| Significa que foi gerado um pedido de comprano site, porém ainda não foi detectado o pagamento. Essa etapa leva 48h úteis, tanto para compras por boleto quanto por cartão de crédito. Para compras por boleto, significa que a transação está em processamento pelo banco. Para compras por cartão de crédito, significa que a Seguradora contratada pela Hardware Disk está fazendo a análise do seu pagamento e garantindo que não haja fraudes para proteção dos clientes.\n");
                            System.out.println("|Aprovado| É quando foi identificado seu pagamento pelo sistema.\n");
                            System.out.println("|Produção| Significa que seu pedido já foi impresso e está sendo separado. No caso de computadores a fase de produção seria (Separação, Montagem, Instalação do Sistema, Testes, e Análise final de qualidade, este processo pode levar até 3 dias úteis, podendo aumentar em períodos de alta demanda).\n");
                            System.out.println("|Expedição| É quando seu computador ou peça está sendo embalado, emitido a nota fiscal e aguardando coleta pela transportadora.\n");
                            System.out.println("|Enviado| O envio é a fase final da sua compra, quando sua compra deixou a Hardware Disk e já está com a Transportadora/Correios.\n");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Para troca de endereço de um pedido em PRODUÇÃO fase após ser APROVADO, é necessário entrar em contato pelo sac@hardware disk.com.br ou gerar um ticket com sua solicitação informando o motivo da troca e o endereço correto conforme o modelo a seguir:\n");
                            System.out.println("Rua: ");
                            System.out.println("Bairro: ");
                            System.out.println("Número: ");
                            System.out.println("Complemento: ");
                            System.out.println("Cidade: Estado: CEP: ");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 3:
                        System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("A constatação de um pagamento via boleto pode levar até 48 horas úteis para ser compensado. Após o pagamento ser detectado, o pedido entrará em fase de PRODUÇÃO.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 4:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("A constatação de um pagamento via cartão de crédito pode levar até 48 horas úteis para ser compensado. Após o pagamento ser detectado, o pedido entrará em fase de PRODUÇÃO.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 5:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Infelizmente não é possível. O boleto deve ser pago até a data do vencimento, caso não seja pago, o sistema efetuará o cancelamento automaticamente. Caso passe a data do vencimento, será necessário gerar um novo pedido.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 6:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Se o pedido for um computador montado, o prazo de montagem é de 03 dias úteis para a finalização da separação, mais o prazo de transporte contratado no momento da finalização da compra.\n");
                            System.out.println("Caso seu pedido seja peças, enviamos em até 03 dias úteis após entrar em produção.\n");
                            System.out.println("O prazo de entrega é contabilizado após o envio do produto.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 7:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Sim. Hardware Disk entrega para todos os Estados do Brasil, sem exceção. Para consultar o frete e o prazo, basta adicionar o CEP no carrinho ao realizar o pedido.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 8:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Pedido em rota de entrega: Não é possível cancelar pedidos que já estão em rota de entrega. A única opção é recusar a entrega.\n");
                            System.out.println("Pedido aguardando aprovação do cartão de crédito: A Hardware Disk tenta aprovar o pedido com a administradora do cartão por até 48 horas. Se não houver aprovação, o pedido será cancelado automaticamente sem novas tentativas.\n");
                            System.out.println("Pedido vendido e entregue por uma loja parceira:\n");
                            System.out.println("1 - Clique aqui.");
                            System.out.println("2 - Selecione o pedido e clique em 'Ver detalhes'.");
                            System.out.println("3 - Escolha 'Iniciar conversa com o Vendedor' ou 'Ver mensagem' para acompanhar.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 9:
                            voltar = true;
                            break;
                        default:
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Opção Invalida.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                    }
                }
            }
            else if (opcao == 2) {
                boolean voltar = false;
                while (!voltar) {
                    System.out.println("================================== DÚVIDAS SOBRE RASTREIO ===================================");
                    System.out.println("1 - Como fazer rastreio nas transportadoras?");
                    System.out.println("2 - Por que não estou conseguindo rastrear meu pedido?");
                    System.out.println("3 - Voltar ao menu anterior.");
                    System.out.println("=============================================================================================");
                    opcao = ler.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Após o envio é notificado em seu e-mail informando sobre o envio e nele contém por qual transportadora foi enviada, ao lado o número dessa nota contendo sempre 6 números XXXXXX. Sempre lembrando que o rastreamento poderá não estar atualizado, em média a atualização ocorre em 48 horas úteis.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("A atualização do rastreio pode levar até 48 horas após constar como enviado, tempo que é de a transportadora dar entrada no produto e cadastrar no sistema, caso precise rastrear e não consegue após o prazo de 48 horas entre em contato com o sac@hardwaredisk.com.br que podemos lhe auxiliar. Para rastreio sempre coloque o CNPJ da Empresa xxxxxxxxxxxxxx e a NF de sua compra, o número é sempre enviado ao e-mail após a saída da mercadoria da empresa.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 3:
                            voltar = true;
                            break;
                        default:
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Opção Invalida.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                    }
                }
            }
            else if (opcao == 3) {
                boolean voltar = false;
                while (!voltar) {
                    System.out.println("================================== DÚVIDAS SOBRE GARANTIA E ARREPENDIMENTO ===================================");
                    System.out.println("1 - Qual o Windows instalado nas máquinas?");
                    System.out.println("2 - Como acionar a garantia da minha compra?");
                    System.out.println("3 - Como acionar o Direito de Arrependimento?");
                    System.out.println("4 - Voltar ao menu anterior.");
                    System.out.println("==============================================================================================================");
                    opcao = ler.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                                System.out.println("A linha de computadores Mancer, que são enviados montados,acompanham com a instalação de uma versão de avaliação do Windows (10 Pro). Após expirar o período de teste, indica que é necessário adquirir uma licença. Esse anúncio não interfere na utilização do computador, apenas ficará sem plano de fundo naárea de trabalho e uma marca d'água.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Para acionar a garantia da sua peça pode entrar em contato no email do rma@hardwaredisk.com.br.\n");
                            System.out.println("Já para o computador o contato é feito diretamente com ofornecedor, no caso de computadores da linha Mancer\n");
                            System.out.println("O cliente deverá abrir um chamado através do link https://www.mancer.com.br/suporte ou encaminhar um e-mail para garantia@mancer.com.br contendo o número de seu pedido, nota fiscal e um breve resumo do ocorrido, através desse chamado serão analisadas as informações para iniciar o processo de garantia do produto.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("---------------------------------- HARDWARE DISK -----------------------------------");
                            System.out.println("Você pode solicitar o arrependimento apenas após receber acompra, dentro de um prazo de até 7 dias corridos.\n");
                            System.out.println("Para pedidos vendidos e entregues pelo Hardware Disk:\n");
                            System.out.println("Siga os passos abaixo:\n");
                            System.out.println("1 - Clique aqui.");
                            System.out.println("2 - Selecione o pedido e clique em Ver Detalhes.");
                            System.out.println("3 - Encontre o produto para o qual deseja solicitar o arrependimento e selecione 'Arrependimento', depois clique em'Continuar'.");
                            System.out.println("4 - Escolha a etiqueta/número de série do produto e clique em 'Arrependimento'.");
                            System.out.println("5 - Preencha o formulário e conclua a solicitação.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        case 4:
                            voltar = true;
                            break;
                        default:
                            System.out.println("------------------------------------------------------------------------------------");
                            System.out.println("Opção Invalida.");
                            System.out.println("------------------------------------------------------------------------------------");
                            break;
                        }
                    }
                }
                else if (opcao == 4) {
                    sair = true;
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Obrigado por usar o chatbot da Hardware Disk!");
                    System.out.println("------------------------------------------------------------------------------------");
                } else {
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Opção Invalida. Tente novamente.");
                    System.out.println("------------------------------------------------------------------------------------");
                } 
            } 
            ler.close(); 
        } 
    }  