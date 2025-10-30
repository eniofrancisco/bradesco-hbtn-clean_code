import org.springframework.web.bind.annotation.PostMapping;
import java.util.Date;

public class Functions {

    // ✅ Faça somente 1 coisa — separando responsabilidades
    public void saveIncome(Income income) {
        inRepo.save(income);
    }

    public void saveExpense(Expense expense) {
        outRepo.save(expense);
    }

    // ✅ Somente 1 nível de abstração — delega ao serviço
    @PostMapping("/user")
    public User saveUser(User user) {
        return userService.save(user);
    }

    // ✅ Arguments — manter número mínimo e significado claro
    public void saveUser(User user) {
        // implementação fictícia
    }

    // ✅ No side effects — separa efeitos colaterais em métodos distintos
    //A
    public User saveUser(User user){
      if(user.isAdmin){
      user.setRole(user);
    }
      return userRepository.save(user);
    }
	
    // ✅ Evite duplicados — extrai lógica comum para método privado
    public Environment getEnvironment() {
        return environmentService.getEnvironment(getVersion());
    }

    public Release getRelease() {
        return releaseService.getRelease(getVersion());
    }

    private String getVersion() {
        return versionService.getVersion();
    }

    // Dependências fictícias para compilação
    private IncomeRepository inRepo;
    private ExpenseRepository outRepo;
    private UserService userService;
    private UserRepository userRepository;
    private VersionService versionService;
    private EnvironmentService environmentService;
    private ReleaseService releaseService;

    // Classes fictícias
    public static class Income {}
    public static class Expense {}
    public static class User {
        public boolean isAdmin;
        public void setRole(User user) {}
    }
    public static class Environment {}
    public static class Release {}
    public static class IncomeRepository {
        public void save(Income income) {}
    }
    public static class ExpenseRepository {
        public void save(Expense expense) {}
    }
    public static class UserService {
        public User save(User user) { return user; }
        public UserRepository userRepository;
    }
    public static class UserRepository {
        public User save(User user) { return user; }
    }
    public static class VersionService {
        public String getVersion() { return "1.0"; }
    }
    public static class EnvironmentService {
        public Environment getEnvironment(String version) { return new Environment(); }
    }
    public static class ReleaseService {
        public Release getRelease(String version) { return new Release(); }
    }
}
