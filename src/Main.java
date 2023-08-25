import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnotacoesApp app = new AnotacoesApp();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        Anotacao template;
        for(Integer i = 0; i < 5; i++){
            template = new Anotacao();
            System.out.println("Titulo: ");
            template.setTitulo(sc.nextLine());
            System.out.println("Conteudo: ");
            template.setAnotacao(sc.nextLine());
            template.setData(calendar.getTime());
            app.addAnotacao(template);
        }

        System.out.println(app);
    }
}
