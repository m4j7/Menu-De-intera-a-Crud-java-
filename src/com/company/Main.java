package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Cadastro.txt", true);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);
        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Cadastro.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);

        List<Cachorro> listC2 = new ArrayList<Cachorro>();
        CadastrosDosGatos ListG = new CadastrosDosGatos();
        CadastroDosCachorros ListC = new CadastroDosCachorros();

        Scanner leitor = new Scanner(System.in).useDelimiter("\n");


        int opcao = 4;

        do {

            do {

                opcao= menu(leitor,opcao);


            } while (opcao == 6);

            switch (opcao) {
                case 1:
                    String especieC;
                    String corC;
                    int pesoC;

                    String especieG;
                    String corG;
                    int pesoG;

                    System.out.println(" Digite a Especie do cachorro");
                    especieC = leitor.next();
                    System.out.println(" Digite a Cor do cachorro");
                    corC = leitor.next();
                    System.out.println(" Digite o peso do cachorro");
                    pesoC = leitor.nextInt();

                    Cachorro dog1 = new Cachorro(corC, especieC, pesoC);

                    gravaArq.println(dog1);

                    System.out.println("Concluido!");
                    System.out.println("PRESSIONE 4 PARA RETORNAR");
                    opcao = leitor.nextInt();

                    gravaArq.flush();
                    arquivoTxt.close();
                    gravaArq.close();

                    break;

                case 2:

                    mostraProd(listC2);

                    System.out.println("Qual Produto voce deseja alterar");
                    int opProduto = leitor.nextInt();


                    System.out.println(listC2.get(opProduto - 1));

                    System.out.println("------------------------------------");
                    System.out.println("- Qual atributo voce deseja alterar-");
                    System.out.println("-           1- Especie             -");
                    System.out.println("-           2- Cor                 -");
                    System.out.println("-           3- Tamanho             -");
                    System.out.println("------------------------------------");

                    int OpAtributo;

                    OpAtributo = leitor.nextInt();

                    switch (OpAtributo) {

                        case 1:
                            listC2.get(opProduto - 1).setEspecie(leitor.next());
                            break;
                        case 2:
                            listC2.get(opProduto - 1).setCor(leitor.next());
                            break;
                        case 3:
                            listC2.get(opProduto - 1).setPeso(leitor.nextInt());
                            break;

                    }

                    arquivoTxt = new FileWriter("C:\\Users\\maria\\Cadastro.txt", false);
                    gravaArq = new PrintWriter(arquivoTxt);

                    for (int list = 0; list < listC2.size(); list++) {
                        gravaArq.println(listC2.get(list));
                    }

                    gravaArq.flush();
                    arquivoTxt.close();
                    gravaArq.close();

                    System.out.println("PRESSIONE 4 PARA RETORNAR");
                    opcao = leitor.nextInt();
                    break;

                case 3:

                    mostraProd(listC2);

                    System.out.println(" Qual arquivo você deseja deletar ?");
                    int opRemove = leitor.nextInt();

                    listC2.remove(opRemove - 1);

                    arquivoTxt = new FileWriter("C:\\Users\\maria\\Cadastro.txt", false);
                    gravaArq = new PrintWriter(arquivoTxt);


                    for(int c = 0; c < listC2.size(); c++){
                        gravaArq.println(listC2.get(c));
                    }

                    gravaArq.flush();
                    arquivoTxt.close();
                    gravaArq.close();


                    System.out.println("PRESSIONE 4 PARA RETORNAR");
                    opcao = leitor.nextInt();

                    break;

                case 4:
                    arquivoTxt = new FileWriter("C:\\Users\\maria\\Cadastro.txt", false);
                    gravaArq = new PrintWriter(arquivoTxt);

                    String linha = "";

                    while ((linha = lerArq.readLine()) != null) {
                        if (linha != null) {
                            System.out.println(linha);
                        } }

                    System.out.println("PRESSIONE 4 PARA RETORNAR");
                    opcao = leitor.nextInt();


                    gravaArq.flush();
                    arquivoTxt.close();
                    gravaArq.close();

                    break;


                default:
                    System.out.println("isso é um teste");
                    System.out.println("4 - voltar");
                    break;
            }

        } while (opcao != 0);

    }

    public static int menu (Scanner leitor,int opcao ){

        System.out.println("Escolha uma das opçoes abaixo");
        System.out.println("1 - Cadastrar Animais");
        System.out.println("2 - Editar Animais ");
        System.out.println("3 - Remover Animais ");
        System.out.println("4 - Ver animais Cadastrados ");
        System.out.println("----------------------------");
        opcao = leitor.nextInt();

        return(opcao);

    }

    public static void mostraProd(List listC2) throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\Cadastro.txt", true);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);
        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\Cadastro.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);

        String linha = "";
        List<String> result = new ArrayList();

        arquivoTxt1 = new FileReader("C:\\Users\\maria\\Cadastro.txt");
        lerArq = new BufferedReader(arquivoTxt1);


        while ((linha = lerArq.readLine()) != null) {
            if (linha != null) {
                result.add(linha);
                System.out.println(linha);
            }
        }

        arquivoTxt.close();
        gravaArq.close();

        for (String i : result) {
            String[] prod = i.split(";");
            Cachorro cachorro2 = new Cachorro();

            // retornar a variável ao tipo inicial
            cachorro2.setCor(prod[0]);
            cachorro2.setEspecie(prod[1]);
            cachorro2.setPeso(Integer.valueOf(prod[2]));

            listC2.add(cachorro2);
        }

    }

}







