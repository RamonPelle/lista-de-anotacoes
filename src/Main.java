import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnotacoesApp app = new AnotacoesApp();
        List<Anotacao> anotacoes;
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        Boolean menu = true;
        Integer opcao;
        Integer opRemover;
        Integer opEditar;
        Integer i;
        Anotacao template;
        while(menu){
            System.out.println("O que você quer fazer?\n1: Adicionar uma anotação\n2: Remover uma anotação" +
                    "\n3: Editar uma anotação\n4: Ver as anotacoes\n5: Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    template = new Anotacao();
                    System.out.println("Titulo: ");
                    sc.nextLine();
                    template.setTitulo(sc.nextLine());
                    System.out.println("Conteudo: ");
                    template.setAnotacao(sc.nextLine());
                    template.setData(calendar.getTime());
                    app.addAnotacao(template);
                    calendar = Calendar.getInstance();
                    break;
                case 2:
                    System.out.println("Qual anotação você quer remover?");
                    anotacoes = app.getAnotacoes();
                    i = 0;
                    for(Anotacao anotacao : anotacoes){
                        i++;
                        System.out.println(i + ": " + anotacao.getTitulo());
                    }
                    opRemover = sc.nextInt();
                    try{
                        app.removeAnotacao(opRemover-1);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Primeiro adicione uma anotação..");
                    }

                    break;
                case 3:
                    System.out.println("Qual anotação você quer editar?");
                    anotacoes = app.getAnotacoes();
                    i = 0;
                    for(Anotacao anotacao : anotacoes){
                        i++;
                        System.out.println(i + ": " + anotacao.getTitulo());
                    }
                    opEditar = sc.nextInt();
                    template = anotacoes.get(opEditar-1);
                    try{
                        app.removeAnotacao(opEditar-1);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("Primeiro adicione uma anotação..");
                    }
                    System.out.println("Novo titulo: ");
                    sc.nextLine();
                    template.setTitulo(sc.nextLine());
                    System.out.println("Novo conteudo: ");
                    template.setAnotacao(sc.nextLine());
                    template.setData(calendar.getTime());
                    app.addAnotacao(template);
                    calendar = Calendar.getInstance();


                    break;
                case 4:
                    System.out.println(app);
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("Entre com um valor válido");
                    break;
            }

        }
    }
}
