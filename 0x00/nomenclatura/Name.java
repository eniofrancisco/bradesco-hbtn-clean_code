import java.util.Date;
import java.util.List;
import java.net.URL;

public class Name {

    // variáveis que falam por si só
    //A
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        // implementação fictícia
        return null;
    }

    // Declarações corretas
    //A
    public List<Account> AccountList;

    // Sem Prefixos
    //A
    public void deleteUser(Name.User pUser) {
        // implementação fictícia
    }

    // Evite mapa mental
    //A
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    //A
    public class TableRepresent {}
    public void saveCar() {}

    // Uma palavra por conceito
    //A
    public void saveUser() {}
    public void saveAccount() {}
    public void saveContract() {}

    // Use constants, enums instead of magic numbers, abbreviations
    //B    
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
	
    // Classe interna fictícia para exemplo
    public static class User {}
    public static class Testcase {}
    public static class Account {}
}
